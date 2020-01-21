package typings.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HlsGroupSettings extends js.Object {
  /**
    * Choose one or more ad marker types to decorate your Apple HLS manifest. This setting does not determine whether SCTE-35 markers appear in the outputs themselves.
    */
  var AdMarkers: js.UndefOr[listOfHlsAdMarkers] = js.native
  /**
    * By default, the service creates one top-level .m3u8 HLS manifest for each HLS output group in your job. This default manifest references every output in the output group. To create additional top-level manifests that reference a subset of the outputs in the output group, specify a list of them here.
    */
  var AdditionalManifests: js.UndefOr[listOfHlsAdditionalManifest] = js.native
  /**
    * A partial URI prefix that will be prepended to each output in the media .m3u8 file. Can be used if base manifest is delivered from a different URL than the main .m3u8 file.
    */
  var BaseUrl: js.UndefOr[string] = js.native
  /**
    * Language to be used on Caption outputs
    */
  var CaptionLanguageMappings: js.UndefOr[listOfHlsCaptionLanguageMapping] = js.native
  /**
    * Applies only to 608 Embedded output captions. Insert: Include CLOSED-CAPTIONS lines in the manifest. Specify at least one language in the CC1 Language Code field. One CLOSED-CAPTION line is added for each Language Code you specify. Make sure to specify the languages in the order in which they appear in the original source (if the source is embedded format) or the order of the caption selectors (if the source is other than embedded). Otherwise, languages in the manifest will not match up properly with the output captions. None: Include CLOSED-CAPTIONS=NONE line in the manifest. Omit: Omit any CLOSED-CAPTIONS line from the manifest.
    */
  var CaptionLanguageSetting: js.UndefOr[HlsCaptionLanguageSetting] = js.native
  /**
    * When set to ENABLED, sets #EXT-X-ALLOW-CACHE:no tag, which prevents client from saving media segments for later replay.
    */
  var ClientCache: js.UndefOr[HlsClientCache] = js.native
  /**
    * Specification to use (RFC-6381 or the default RFC-4281) during m3u8 playlist generation.
    */
  var CodecSpecification: js.UndefOr[HlsCodecSpecification] = js.native
  /**
    * Use Destination (Destination) to specify the S3 output location and the output filename base. Destination accepts format identifiers. If you do not specify the base filename in the URI, the service will use the filename of the input file. If your job has multiple inputs, the service uses the filename of the first input file.
    */
  var Destination: js.UndefOr[stringPatternS3] = js.native
  /**
    * Settings associated with the destination. Will vary based on the type of destination
    */
  var DestinationSettings: js.UndefOr[typings.awsSdk.mediaconvertMod.DestinationSettings] = js.native
  /**
    * Indicates whether segments should be placed in subdirectories.
    */
  var DirectoryStructure: js.UndefOr[HlsDirectoryStructure] = js.native
  /**
    * DRM settings.
    */
  var Encryption: js.UndefOr[HlsEncryptionSettings] = js.native
  /**
    * When set to GZIP, compresses HLS playlist.
    */
  var ManifestCompression: js.UndefOr[HlsManifestCompression] = js.native
  /**
    * Indicates whether the output manifest should use floating point values for segment duration.
    */
  var ManifestDurationFormat: js.UndefOr[HlsManifestDurationFormat] = js.native
  /**
    * Keep this setting at the default value of 0, unless you are troubleshooting a problem with how devices play back the end of your video asset. If you know that player devices are hanging on the final segment of your video because the length of your final segment is too short, use this setting to specify a minimum final segment length, in seconds. Choose a value that is greater than or equal to 1 and less than your segment length. When you specify a value for this setting, the encoder will combine any final segment that is shorter than the length that you specify with the previous segment. For example, your segment length is 3 seconds and your final segment is .5 seconds without a minimum final segment length; when you set the minimum final segment length to 1, your final segment is 3.5 seconds.
    */
  var MinFinalSegmentLength: js.UndefOr[doubleMin0Max2147483647] = js.native
  /**
    * When set, Minimum Segment Size is enforced by looking ahead and back within the specified range for a nearby avail and extending the segment size if needed.
    */
  var MinSegmentLength: js.UndefOr[integerMin0Max2147483647] = js.native
  /**
    * Indicates whether the .m3u8 manifest file should be generated for this HLS output group.
    */
  var OutputSelection: js.UndefOr[HlsOutputSelection] = js.native
  /**
    * Includes or excludes EXT-X-PROGRAM-DATE-TIME tag in .m3u8 manifest files. The value is calculated as follows: either the program date and time are initialized using the input timecode source, or the time is initialized using the input timecode source and the date is initialized using the timestamp_offset.
    */
  var ProgramDateTime: js.UndefOr[HlsProgramDateTime] = js.native
  /**
    * Period of insertion of EXT-X-PROGRAM-DATE-TIME entry, in seconds.
    */
  var ProgramDateTimePeriod: js.UndefOr[integerMin0Max3600] = js.native
  /**
    * When set to SINGLE_FILE, emits program as a single media resource (.ts) file, uses #EXT-X-BYTERANGE tags to index segment for playback.
    */
  var SegmentControl: js.UndefOr[HlsSegmentControl] = js.native
  /**
    * Length of MPEG-2 Transport Stream segments to create (in seconds). Note that segments will end on the next keyframe after this number of seconds, so actual segment length may be longer.
    */
  var SegmentLength: js.UndefOr[integerMin1Max2147483647] = js.native
  /**
    * Number of segments to write to a subdirectory before starting a new one. directoryStructure must be SINGLE_DIRECTORY for this setting to have an effect.
    */
  var SegmentsPerSubdirectory: js.UndefOr[integerMin1Max2147483647] = js.native
  /**
    * Include or exclude RESOLUTION attribute for video in EXT-X-STREAM-INF tag of variant manifest.
    */
  var StreamInfResolution: js.UndefOr[HlsStreamInfResolution] = js.native
  /**
    * Indicates ID3 frame that has the timecode.
    */
  var TimedMetadataId3Frame: js.UndefOr[HlsTimedMetadataId3Frame] = js.native
  /**
    * Timed Metadata interval in seconds.
    */
  var TimedMetadataId3Period: js.UndefOr[integerMinNegative2147483648Max2147483647] = js.native
  /**
    * Provides an extra millisecond delta offset to fine tune the timestamps.
    */
  var TimestampDeltaMilliseconds: js.UndefOr[integerMinNegative2147483648Max2147483647] = js.native
}

object HlsGroupSettings {
  @scala.inline
  def apply(
    AdMarkers: listOfHlsAdMarkers = null,
    AdditionalManifests: listOfHlsAdditionalManifest = null,
    BaseUrl: string = null,
    CaptionLanguageMappings: listOfHlsCaptionLanguageMapping = null,
    CaptionLanguageSetting: HlsCaptionLanguageSetting = null,
    ClientCache: HlsClientCache = null,
    CodecSpecification: HlsCodecSpecification = null,
    Destination: stringPatternS3 = null,
    DestinationSettings: DestinationSettings = null,
    DirectoryStructure: HlsDirectoryStructure = null,
    Encryption: HlsEncryptionSettings = null,
    ManifestCompression: HlsManifestCompression = null,
    ManifestDurationFormat: HlsManifestDurationFormat = null,
    MinFinalSegmentLength: Int | Double = null,
    MinSegmentLength: Int | Double = null,
    OutputSelection: HlsOutputSelection = null,
    ProgramDateTime: HlsProgramDateTime = null,
    ProgramDateTimePeriod: Int | Double = null,
    SegmentControl: HlsSegmentControl = null,
    SegmentLength: Int | Double = null,
    SegmentsPerSubdirectory: Int | Double = null,
    StreamInfResolution: HlsStreamInfResolution = null,
    TimedMetadataId3Frame: HlsTimedMetadataId3Frame = null,
    TimedMetadataId3Period: Int | Double = null,
    TimestampDeltaMilliseconds: Int | Double = null
  ): HlsGroupSettings = {
    val __obj = js.Dynamic.literal()
    if (AdMarkers != null) __obj.updateDynamic("AdMarkers")(AdMarkers.asInstanceOf[js.Any])
    if (AdditionalManifests != null) __obj.updateDynamic("AdditionalManifests")(AdditionalManifests.asInstanceOf[js.Any])
    if (BaseUrl != null) __obj.updateDynamic("BaseUrl")(BaseUrl.asInstanceOf[js.Any])
    if (CaptionLanguageMappings != null) __obj.updateDynamic("CaptionLanguageMappings")(CaptionLanguageMappings.asInstanceOf[js.Any])
    if (CaptionLanguageSetting != null) __obj.updateDynamic("CaptionLanguageSetting")(CaptionLanguageSetting.asInstanceOf[js.Any])
    if (ClientCache != null) __obj.updateDynamic("ClientCache")(ClientCache.asInstanceOf[js.Any])
    if (CodecSpecification != null) __obj.updateDynamic("CodecSpecification")(CodecSpecification.asInstanceOf[js.Any])
    if (Destination != null) __obj.updateDynamic("Destination")(Destination.asInstanceOf[js.Any])
    if (DestinationSettings != null) __obj.updateDynamic("DestinationSettings")(DestinationSettings.asInstanceOf[js.Any])
    if (DirectoryStructure != null) __obj.updateDynamic("DirectoryStructure")(DirectoryStructure.asInstanceOf[js.Any])
    if (Encryption != null) __obj.updateDynamic("Encryption")(Encryption.asInstanceOf[js.Any])
    if (ManifestCompression != null) __obj.updateDynamic("ManifestCompression")(ManifestCompression.asInstanceOf[js.Any])
    if (ManifestDurationFormat != null) __obj.updateDynamic("ManifestDurationFormat")(ManifestDurationFormat.asInstanceOf[js.Any])
    if (MinFinalSegmentLength != null) __obj.updateDynamic("MinFinalSegmentLength")(MinFinalSegmentLength.asInstanceOf[js.Any])
    if (MinSegmentLength != null) __obj.updateDynamic("MinSegmentLength")(MinSegmentLength.asInstanceOf[js.Any])
    if (OutputSelection != null) __obj.updateDynamic("OutputSelection")(OutputSelection.asInstanceOf[js.Any])
    if (ProgramDateTime != null) __obj.updateDynamic("ProgramDateTime")(ProgramDateTime.asInstanceOf[js.Any])
    if (ProgramDateTimePeriod != null) __obj.updateDynamic("ProgramDateTimePeriod")(ProgramDateTimePeriod.asInstanceOf[js.Any])
    if (SegmentControl != null) __obj.updateDynamic("SegmentControl")(SegmentControl.asInstanceOf[js.Any])
    if (SegmentLength != null) __obj.updateDynamic("SegmentLength")(SegmentLength.asInstanceOf[js.Any])
    if (SegmentsPerSubdirectory != null) __obj.updateDynamic("SegmentsPerSubdirectory")(SegmentsPerSubdirectory.asInstanceOf[js.Any])
    if (StreamInfResolution != null) __obj.updateDynamic("StreamInfResolution")(StreamInfResolution.asInstanceOf[js.Any])
    if (TimedMetadataId3Frame != null) __obj.updateDynamic("TimedMetadataId3Frame")(TimedMetadataId3Frame.asInstanceOf[js.Any])
    if (TimedMetadataId3Period != null) __obj.updateDynamic("TimedMetadataId3Period")(TimedMetadataId3Period.asInstanceOf[js.Any])
    if (TimestampDeltaMilliseconds != null) __obj.updateDynamic("TimestampDeltaMilliseconds")(TimestampDeltaMilliseconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[HlsGroupSettings]
  }
}

