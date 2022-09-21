package typings.awsSdk.mediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HlsGroupSettings extends StObject {
  
  /**
    * Choose one or more ad marker types to decorate your Apple HLS manifest. This setting does not determine whether SCTE-35 markers appear in the outputs themselves.
    */
  var AdMarkers: js.UndefOr[listOfHlsAdMarkers] = js.undefined
  
  /**
    * By default, the service creates one top-level .m3u8 HLS manifest for each HLS output group in your job. This default manifest references every output in the output group. To create additional top-level manifests that reference a subset of the outputs in the output group, specify a list of them here.
    */
  var AdditionalManifests: js.UndefOr[listOfHlsAdditionalManifest] = js.undefined
  
  /**
    * Ignore this setting unless you are using FairPlay DRM with Verimatrix and you encounter playback issues. Keep the default value, Include (INCLUDE), to output audio-only headers. Choose Exclude (EXCLUDE) to remove the audio-only headers from your audio segments.
    */
  var AudioOnlyHeader: js.UndefOr[HlsAudioOnlyHeader] = js.undefined
  
  /**
    * A partial URI prefix that will be prepended to each output in the media .m3u8 file. Can be used if base manifest is delivered from a different URL than the main .m3u8 file.
    */
  var BaseUrl: js.UndefOr[string] = js.undefined
  
  /**
    * Language to be used on Caption outputs
    */
  var CaptionLanguageMappings: js.UndefOr[listOfHlsCaptionLanguageMapping] = js.undefined
  
  /**
    * Applies only to 608 Embedded output captions. Insert: Include CLOSED-CAPTIONS lines in the manifest. Specify at least one language in the CC1 Language Code field. One CLOSED-CAPTION line is added for each Language Code you specify. Make sure to specify the languages in the order in which they appear in the original source (if the source is embedded format) or the order of the caption selectors (if the source is other than embedded). Otherwise, languages in the manifest will not match up properly with the output captions. None: Include CLOSED-CAPTIONS=NONE line in the manifest. Omit: Omit any CLOSED-CAPTIONS line from the manifest.
    */
  var CaptionLanguageSetting: js.UndefOr[HlsCaptionLanguageSetting] = js.undefined
  
  /**
    * Set Caption segment length control (CaptionSegmentLengthControl) to Match video (MATCH_VIDEO) to create caption segments that align with the video segments from the first video output in this output group. For example, if the video segments are 2 seconds long, your WebVTT segments will also be 2 seconds long. Keep the default setting, Large segments (LARGE_SEGMENTS) to create caption segments that are 300 seconds long.
    */
  var CaptionSegmentLengthControl: js.UndefOr[HlsCaptionSegmentLengthControl] = js.undefined
  
  /**
    * Disable this setting only when your workflow requires the #EXT-X-ALLOW-CACHE:no tag. Otherwise, keep the default value Enabled (ENABLED) and control caching in your video distribution set up. For example, use the Cache-Control http header.
    */
  var ClientCache: js.UndefOr[HlsClientCache] = js.undefined
  
  /**
    * Specification to use (RFC-6381 or the default RFC-4281) during m3u8 playlist generation.
    */
  var CodecSpecification: js.UndefOr[HlsCodecSpecification] = js.undefined
  
  /**
    * Use Destination (Destination) to specify the S3 output location and the output filename base. Destination accepts format identifiers. If you do not specify the base filename in the URI, the service will use the filename of the input file. If your job has multiple inputs, the service uses the filename of the first input file.
    */
  var Destination: js.UndefOr[stringPatternS3] = js.undefined
  
  /**
    * Settings associated with the destination. Will vary based on the type of destination
    */
  var DestinationSettings: js.UndefOr[typings.awsSdk.mediaconvertMod.DestinationSettings] = js.undefined
  
  /**
    * Indicates whether segments should be placed in subdirectories.
    */
  var DirectoryStructure: js.UndefOr[HlsDirectoryStructure] = js.undefined
  
  /**
    * DRM settings.
    */
  var Encryption: js.UndefOr[HlsEncryptionSettings] = js.undefined
  
  /**
    * Specify whether MediaConvert generates images for trick play. Keep the default value, None (NONE), to not generate any images. Choose Thumbnail (THUMBNAIL) to generate tiled thumbnails. Choose Thumbnail and full frame (THUMBNAIL_AND_FULLFRAME) to generate tiled thumbnails and full-resolution images of single frames. MediaConvert creates a child manifest for each set of images that you generate and adds corresponding entries to the parent manifest. A common application for these images is Roku trick mode. The thumbnails and full-frame images that MediaConvert creates with this feature are compatible with this Roku specification: https://developer.roku.com/docs/developer-program/media-playback/trick-mode/hls-and-dash.md
    */
  var ImageBasedTrickPlay: js.UndefOr[HlsImageBasedTrickPlay] = js.undefined
  
  /**
    * Tile and thumbnail settings applicable when imageBasedTrickPlay is ADVANCED
    */
  var ImageBasedTrickPlaySettings: js.UndefOr[HlsImageBasedTrickPlaySettings] = js.undefined
  
  /**
    * When set to GZIP, compresses HLS playlist.
    */
  var ManifestCompression: js.UndefOr[HlsManifestCompression] = js.undefined
  
  /**
    * Indicates whether the output manifest should use floating point values for segment duration.
    */
  var ManifestDurationFormat: js.UndefOr[HlsManifestDurationFormat] = js.undefined
  
  /**
    * Keep this setting at the default value of 0, unless you are troubleshooting a problem with how devices play back the end of your video asset. If you know that player devices are hanging on the final segment of your video because the length of your final segment is too short, use this setting to specify a minimum final segment length, in seconds. Choose a value that is greater than or equal to 1 and less than your segment length. When you specify a value for this setting, the encoder will combine any final segment that is shorter than the length that you specify with the previous segment. For example, your segment length is 3 seconds and your final segment is .5 seconds without a minimum final segment length; when you set the minimum final segment length to 1, your final segment is 3.5 seconds.
    */
  var MinFinalSegmentLength: js.UndefOr[doubleMin0Max2147483647] = js.undefined
  
  /**
    * When set, Minimum Segment Size is enforced by looking ahead and back within the specified range for a nearby avail and extending the segment size if needed.
    */
  var MinSegmentLength: js.UndefOr[integerMin0Max2147483647] = js.undefined
  
  /**
    * Indicates whether the .m3u8 manifest file should be generated for this HLS output group.
    */
  var OutputSelection: js.UndefOr[HlsOutputSelection] = js.undefined
  
  /**
    * Includes or excludes EXT-X-PROGRAM-DATE-TIME tag in .m3u8 manifest files. The value is calculated as follows: either the program date and time are initialized using the input timecode source, or the time is initialized using the input timecode source and the date is initialized using the timestamp_offset.
    */
  var ProgramDateTime: js.UndefOr[HlsProgramDateTime] = js.undefined
  
  /**
    * Period of insertion of EXT-X-PROGRAM-DATE-TIME entry, in seconds.
    */
  var ProgramDateTimePeriod: js.UndefOr[integerMin0Max3600] = js.undefined
  
  /**
    * When set to SINGLE_FILE, emits program as a single media resource (.ts) file, uses #EXT-X-BYTERANGE tags to index segment for playback.
    */
  var SegmentControl: js.UndefOr[HlsSegmentControl] = js.undefined
  
  /**
    * Specify the length, in whole seconds, of each segment. When you don't specify a value, MediaConvert defaults to 10. Related settings: Use Segment length control (SegmentLengthControl) to specify whether the encoder enforces this value strictly. Use Segment control (HlsSegmentControl) to specify whether MediaConvert creates separate segment files or one content file that has metadata to mark the segment boundaries.
    */
  var SegmentLength: js.UndefOr[integerMin1Max2147483647] = js.undefined
  
  /**
    * Specify how you want MediaConvert to determine the segment length. Choose Exact (EXACT) to have the encoder use the exact length that you specify with the setting Segment length (SegmentLength). This might result in extra I-frames. Choose Multiple of GOP (GOP_MULTIPLE) to have the encoder round up the segment lengths to match the next GOP boundary.
    */
  var SegmentLengthControl: js.UndefOr[HlsSegmentLengthControl] = js.undefined
  
  /**
    * Number of segments to write to a subdirectory before starting a new one. directoryStructure must be SINGLE_DIRECTORY for this setting to have an effect.
    */
  var SegmentsPerSubdirectory: js.UndefOr[integerMin1Max2147483647] = js.undefined
  
  /**
    * Include or exclude RESOLUTION attribute for video in EXT-X-STREAM-INF tag of variant manifest.
    */
  var StreamInfResolution: js.UndefOr[HlsStreamInfResolution] = js.undefined
  
  /**
    * When set to LEGACY, the segment target duration is always rounded up to the nearest integer value above its current value in seconds. When set to SPEC\\_COMPLIANT, the segment target duration is rounded up to the nearest integer value if fraction seconds are greater than or equal to 0.5 (>= 0.5) and rounded down if less than 0.5 (< 0.5). You may need to use LEGACY if your client needs to ensure that the target duration is always longer than the actual duration of the segment. Some older players may experience interrupted playback when the actual duration of a track in a segment is longer than the target duration.
    */
  var TargetDurationCompatibilityMode: js.UndefOr[HlsTargetDurationCompatibilityMode] = js.undefined
  
  /**
    * Specify the type of the ID3 frame (timedMetadataId3Frame) to use for ID3 timestamps (timedMetadataId3Period) in your output. To include ID3 timestamps: Specify PRIV (PRIV) or TDRL (TDRL) and set ID3 metadata (timedMetadata) to Passthrough (PASSTHROUGH). To exclude ID3 timestamps: Set ID3 timestamp frame type to None (NONE).
    */
  var TimedMetadataId3Frame: js.UndefOr[HlsTimedMetadataId3Frame] = js.undefined
  
  /**
    * Specify the interval in seconds to write ID3 timestamps in your output. The first timestamp starts at the output timecode and date, and increases incrementally with each ID3 timestamp. To use the default interval of 10 seconds: Leave blank. To include this metadata in your output: Set ID3 timestamp frame type (timedMetadataId3Frame) to PRIV (PRIV) or TDRL (TDRL), and set ID3 metadata (timedMetadata) to Passthrough (PASSTHROUGH).
    */
  var TimedMetadataId3Period: js.UndefOr[integerMinNegative2147483648Max2147483647] = js.undefined
  
  /**
    * Provides an extra millisecond delta offset to fine tune the timestamps.
    */
  var TimestampDeltaMilliseconds: js.UndefOr[integerMinNegative2147483648Max2147483647] = js.undefined
}
object HlsGroupSettings {
  
  inline def apply(): HlsGroupSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HlsGroupSettings]
  }
  
  extension [Self <: HlsGroupSettings](x: Self) {
    
    inline def setAdMarkers(value: listOfHlsAdMarkers): Self = StObject.set(x, "AdMarkers", value.asInstanceOf[js.Any])
    
    inline def setAdMarkersUndefined: Self = StObject.set(x, "AdMarkers", js.undefined)
    
    inline def setAdMarkersVarargs(value: HlsAdMarkers*): Self = StObject.set(x, "AdMarkers", js.Array(value*))
    
    inline def setAdditionalManifests(value: listOfHlsAdditionalManifest): Self = StObject.set(x, "AdditionalManifests", value.asInstanceOf[js.Any])
    
    inline def setAdditionalManifestsUndefined: Self = StObject.set(x, "AdditionalManifests", js.undefined)
    
    inline def setAdditionalManifestsVarargs(value: HlsAdditionalManifest*): Self = StObject.set(x, "AdditionalManifests", js.Array(value*))
    
    inline def setAudioOnlyHeader(value: HlsAudioOnlyHeader): Self = StObject.set(x, "AudioOnlyHeader", value.asInstanceOf[js.Any])
    
    inline def setAudioOnlyHeaderUndefined: Self = StObject.set(x, "AudioOnlyHeader", js.undefined)
    
    inline def setBaseUrl(value: string): Self = StObject.set(x, "BaseUrl", value.asInstanceOf[js.Any])
    
    inline def setBaseUrlUndefined: Self = StObject.set(x, "BaseUrl", js.undefined)
    
    inline def setCaptionLanguageMappings(value: listOfHlsCaptionLanguageMapping): Self = StObject.set(x, "CaptionLanguageMappings", value.asInstanceOf[js.Any])
    
    inline def setCaptionLanguageMappingsUndefined: Self = StObject.set(x, "CaptionLanguageMappings", js.undefined)
    
    inline def setCaptionLanguageMappingsVarargs(value: HlsCaptionLanguageMapping*): Self = StObject.set(x, "CaptionLanguageMappings", js.Array(value*))
    
    inline def setCaptionLanguageSetting(value: HlsCaptionLanguageSetting): Self = StObject.set(x, "CaptionLanguageSetting", value.asInstanceOf[js.Any])
    
    inline def setCaptionLanguageSettingUndefined: Self = StObject.set(x, "CaptionLanguageSetting", js.undefined)
    
    inline def setCaptionSegmentLengthControl(value: HlsCaptionSegmentLengthControl): Self = StObject.set(x, "CaptionSegmentLengthControl", value.asInstanceOf[js.Any])
    
    inline def setCaptionSegmentLengthControlUndefined: Self = StObject.set(x, "CaptionSegmentLengthControl", js.undefined)
    
    inline def setClientCache(value: HlsClientCache): Self = StObject.set(x, "ClientCache", value.asInstanceOf[js.Any])
    
    inline def setClientCacheUndefined: Self = StObject.set(x, "ClientCache", js.undefined)
    
    inline def setCodecSpecification(value: HlsCodecSpecification): Self = StObject.set(x, "CodecSpecification", value.asInstanceOf[js.Any])
    
    inline def setCodecSpecificationUndefined: Self = StObject.set(x, "CodecSpecification", js.undefined)
    
    inline def setDestination(value: stringPatternS3): Self = StObject.set(x, "Destination", value.asInstanceOf[js.Any])
    
    inline def setDestinationSettings(value: DestinationSettings): Self = StObject.set(x, "DestinationSettings", value.asInstanceOf[js.Any])
    
    inline def setDestinationSettingsUndefined: Self = StObject.set(x, "DestinationSettings", js.undefined)
    
    inline def setDestinationUndefined: Self = StObject.set(x, "Destination", js.undefined)
    
    inline def setDirectoryStructure(value: HlsDirectoryStructure): Self = StObject.set(x, "DirectoryStructure", value.asInstanceOf[js.Any])
    
    inline def setDirectoryStructureUndefined: Self = StObject.set(x, "DirectoryStructure", js.undefined)
    
    inline def setEncryption(value: HlsEncryptionSettings): Self = StObject.set(x, "Encryption", value.asInstanceOf[js.Any])
    
    inline def setEncryptionUndefined: Self = StObject.set(x, "Encryption", js.undefined)
    
    inline def setImageBasedTrickPlay(value: HlsImageBasedTrickPlay): Self = StObject.set(x, "ImageBasedTrickPlay", value.asInstanceOf[js.Any])
    
    inline def setImageBasedTrickPlaySettings(value: HlsImageBasedTrickPlaySettings): Self = StObject.set(x, "ImageBasedTrickPlaySettings", value.asInstanceOf[js.Any])
    
    inline def setImageBasedTrickPlaySettingsUndefined: Self = StObject.set(x, "ImageBasedTrickPlaySettings", js.undefined)
    
    inline def setImageBasedTrickPlayUndefined: Self = StObject.set(x, "ImageBasedTrickPlay", js.undefined)
    
    inline def setManifestCompression(value: HlsManifestCompression): Self = StObject.set(x, "ManifestCompression", value.asInstanceOf[js.Any])
    
    inline def setManifestCompressionUndefined: Self = StObject.set(x, "ManifestCompression", js.undefined)
    
    inline def setManifestDurationFormat(value: HlsManifestDurationFormat): Self = StObject.set(x, "ManifestDurationFormat", value.asInstanceOf[js.Any])
    
    inline def setManifestDurationFormatUndefined: Self = StObject.set(x, "ManifestDurationFormat", js.undefined)
    
    inline def setMinFinalSegmentLength(value: doubleMin0Max2147483647): Self = StObject.set(x, "MinFinalSegmentLength", value.asInstanceOf[js.Any])
    
    inline def setMinFinalSegmentLengthUndefined: Self = StObject.set(x, "MinFinalSegmentLength", js.undefined)
    
    inline def setMinSegmentLength(value: integerMin0Max2147483647): Self = StObject.set(x, "MinSegmentLength", value.asInstanceOf[js.Any])
    
    inline def setMinSegmentLengthUndefined: Self = StObject.set(x, "MinSegmentLength", js.undefined)
    
    inline def setOutputSelection(value: HlsOutputSelection): Self = StObject.set(x, "OutputSelection", value.asInstanceOf[js.Any])
    
    inline def setOutputSelectionUndefined: Self = StObject.set(x, "OutputSelection", js.undefined)
    
    inline def setProgramDateTime(value: HlsProgramDateTime): Self = StObject.set(x, "ProgramDateTime", value.asInstanceOf[js.Any])
    
    inline def setProgramDateTimePeriod(value: integerMin0Max3600): Self = StObject.set(x, "ProgramDateTimePeriod", value.asInstanceOf[js.Any])
    
    inline def setProgramDateTimePeriodUndefined: Self = StObject.set(x, "ProgramDateTimePeriod", js.undefined)
    
    inline def setProgramDateTimeUndefined: Self = StObject.set(x, "ProgramDateTime", js.undefined)
    
    inline def setSegmentControl(value: HlsSegmentControl): Self = StObject.set(x, "SegmentControl", value.asInstanceOf[js.Any])
    
    inline def setSegmentControlUndefined: Self = StObject.set(x, "SegmentControl", js.undefined)
    
    inline def setSegmentLength(value: integerMin1Max2147483647): Self = StObject.set(x, "SegmentLength", value.asInstanceOf[js.Any])
    
    inline def setSegmentLengthControl(value: HlsSegmentLengthControl): Self = StObject.set(x, "SegmentLengthControl", value.asInstanceOf[js.Any])
    
    inline def setSegmentLengthControlUndefined: Self = StObject.set(x, "SegmentLengthControl", js.undefined)
    
    inline def setSegmentLengthUndefined: Self = StObject.set(x, "SegmentLength", js.undefined)
    
    inline def setSegmentsPerSubdirectory(value: integerMin1Max2147483647): Self = StObject.set(x, "SegmentsPerSubdirectory", value.asInstanceOf[js.Any])
    
    inline def setSegmentsPerSubdirectoryUndefined: Self = StObject.set(x, "SegmentsPerSubdirectory", js.undefined)
    
    inline def setStreamInfResolution(value: HlsStreamInfResolution): Self = StObject.set(x, "StreamInfResolution", value.asInstanceOf[js.Any])
    
    inline def setStreamInfResolutionUndefined: Self = StObject.set(x, "StreamInfResolution", js.undefined)
    
    inline def setTargetDurationCompatibilityMode(value: HlsTargetDurationCompatibilityMode): Self = StObject.set(x, "TargetDurationCompatibilityMode", value.asInstanceOf[js.Any])
    
    inline def setTargetDurationCompatibilityModeUndefined: Self = StObject.set(x, "TargetDurationCompatibilityMode", js.undefined)
    
    inline def setTimedMetadataId3Frame(value: HlsTimedMetadataId3Frame): Self = StObject.set(x, "TimedMetadataId3Frame", value.asInstanceOf[js.Any])
    
    inline def setTimedMetadataId3FrameUndefined: Self = StObject.set(x, "TimedMetadataId3Frame", js.undefined)
    
    inline def setTimedMetadataId3Period(value: integerMinNegative2147483648Max2147483647): Self = StObject.set(x, "TimedMetadataId3Period", value.asInstanceOf[js.Any])
    
    inline def setTimedMetadataId3PeriodUndefined: Self = StObject.set(x, "TimedMetadataId3Period", js.undefined)
    
    inline def setTimestampDeltaMilliseconds(value: integerMinNegative2147483648Max2147483647): Self = StObject.set(x, "TimestampDeltaMilliseconds", value.asInstanceOf[js.Any])
    
    inline def setTimestampDeltaMillisecondsUndefined: Self = StObject.set(x, "TimestampDeltaMilliseconds", js.undefined)
  }
}
