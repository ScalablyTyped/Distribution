package typings.awsSdk.mediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DashIsoGroupSettings extends StObject {
  
  /**
    * By default, the service creates one .mpd DASH manifest for each DASH ISO output group in your job. This default manifest references every output in the output group. To create additional DASH manifests that reference a subset of the outputs in the output group, specify a list of them here.
    */
  var AdditionalManifests: js.UndefOr[listOfDashAdditionalManifest] = js.undefined
  
  /**
    * A partial URI prefix that will be put in the manifest (.mpd) file at the top level BaseURL element. Can be used if streams are delivered from a different URL than the manifest file.
    */
  var BaseUrl: js.UndefOr[string] = js.undefined
  
  /**
    * Use Destination (Destination) to specify the S3 output location and the output filename base. Destination accepts format identifiers. If you do not specify the base filename in the URI, the service will use the filename of the input file. If your job has multiple inputs, the service uses the filename of the first input file.
    */
  var Destination: js.UndefOr[stringPatternS3] = js.undefined
  
  /**
    * Settings associated with the destination. Will vary based on the type of destination
    */
  var DestinationSettings: js.UndefOr[typings.awsSdk.mediaconvertMod.DestinationSettings] = js.undefined
  
  /**
    * DRM settings.
    */
  var Encryption: js.UndefOr[DashIsoEncryptionSettings] = js.undefined
  
  /**
    * Length of fragments to generate (in seconds). Fragment length must be compatible with GOP size and Framerate. Note that fragments will end on the next keyframe after this number of seconds, so actual fragment length may be longer. When Emit Single File is checked, the fragmentation is internal to a single output file and it does not cause the creation of many output files as in other output types.
    */
  var FragmentLength: js.UndefOr[integerMin1Max2147483647] = js.undefined
  
  /**
    * Supports HbbTV specification as indicated
    */
  var HbbtvCompliance: js.UndefOr[DashIsoHbbtvCompliance] = js.undefined
  
  /**
    * Minimum time of initially buffered media that is needed to ensure smooth playout.
    */
  var MinBufferTime: js.UndefOr[integerMin0Max2147483647] = js.undefined
  
  /**
    * Specify whether your DASH profile is on-demand or main. When you choose Main profile (MAIN_PROFILE), the service signals  urn:mpeg:dash:profile:isoff-main:2011 in your .mpd DASH manifest. When you choose On-demand (ON_DEMAND_PROFILE), the service signals urn:mpeg:dash:profile:isoff-on-demand:2011 in your .mpd. When you choose On-demand, you must also set the output group setting Segment control (SegmentControl) to Single file (SINGLE_FILE).
    */
  var MpdProfile: js.UndefOr[DashIsoMpdProfile] = js.undefined
  
  /**
    * When set to SINGLE_FILE, a single output file is generated, which is internally segmented using the Fragment Length and Segment Length. When set to SEGMENTED_FILES, separate segment files will be created.
    */
  var SegmentControl: js.UndefOr[DashIsoSegmentControl] = js.undefined
  
  /**
    * Length of mpd segments to create (in seconds). Note that segments will end on the next keyframe after this number of seconds, so actual segment length may be longer. When Emit Single File is checked, the segmentation is internal to a single output file and it does not cause the creation of many output files as in other output types.
    */
  var SegmentLength: js.UndefOr[integerMin1Max2147483647] = js.undefined
  
  /**
    * If you get an HTTP error in the 400 range when you play back your DASH output, enable this setting and run your transcoding job again. When you enable this setting, the service writes precise segment durations in the DASH manifest. The segment duration information appears inside the SegmentTimeline element, inside SegmentTemplate at the Representation level. When you don't enable this setting, the service writes approximate segment durations in your DASH manifest.
    */
  var WriteSegmentTimelineInRepresentation: js.UndefOr[DashIsoWriteSegmentTimelineInRepresentation] = js.undefined
}
object DashIsoGroupSettings {
  
  @scala.inline
  def apply(): DashIsoGroupSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DashIsoGroupSettings]
  }
  
  @scala.inline
  implicit class DashIsoGroupSettingsMutableBuilder[Self <: DashIsoGroupSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdditionalManifests(value: listOfDashAdditionalManifest): Self = StObject.set(x, "AdditionalManifests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdditionalManifestsUndefined: Self = StObject.set(x, "AdditionalManifests", js.undefined)
    
    @scala.inline
    def setAdditionalManifestsVarargs(value: DashAdditionalManifest*): Self = StObject.set(x, "AdditionalManifests", js.Array(value :_*))
    
    @scala.inline
    def setBaseUrl(value: string): Self = StObject.set(x, "BaseUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseUrlUndefined: Self = StObject.set(x, "BaseUrl", js.undefined)
    
    @scala.inline
    def setDestination(value: stringPatternS3): Self = StObject.set(x, "Destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationSettings(value: DestinationSettings): Self = StObject.set(x, "DestinationSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationSettingsUndefined: Self = StObject.set(x, "DestinationSettings", js.undefined)
    
    @scala.inline
    def setDestinationUndefined: Self = StObject.set(x, "Destination", js.undefined)
    
    @scala.inline
    def setEncryption(value: DashIsoEncryptionSettings): Self = StObject.set(x, "Encryption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncryptionUndefined: Self = StObject.set(x, "Encryption", js.undefined)
    
    @scala.inline
    def setFragmentLength(value: integerMin1Max2147483647): Self = StObject.set(x, "FragmentLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFragmentLengthUndefined: Self = StObject.set(x, "FragmentLength", js.undefined)
    
    @scala.inline
    def setHbbtvCompliance(value: DashIsoHbbtvCompliance): Self = StObject.set(x, "HbbtvCompliance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHbbtvComplianceUndefined: Self = StObject.set(x, "HbbtvCompliance", js.undefined)
    
    @scala.inline
    def setMinBufferTime(value: integerMin0Max2147483647): Self = StObject.set(x, "MinBufferTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinBufferTimeUndefined: Self = StObject.set(x, "MinBufferTime", js.undefined)
    
    @scala.inline
    def setMpdProfile(value: DashIsoMpdProfile): Self = StObject.set(x, "MpdProfile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMpdProfileUndefined: Self = StObject.set(x, "MpdProfile", js.undefined)
    
    @scala.inline
    def setSegmentControl(value: DashIsoSegmentControl): Self = StObject.set(x, "SegmentControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSegmentControlUndefined: Self = StObject.set(x, "SegmentControl", js.undefined)
    
    @scala.inline
    def setSegmentLength(value: integerMin1Max2147483647): Self = StObject.set(x, "SegmentLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSegmentLengthUndefined: Self = StObject.set(x, "SegmentLength", js.undefined)
    
    @scala.inline
    def setWriteSegmentTimelineInRepresentation(value: DashIsoWriteSegmentTimelineInRepresentation): Self = StObject.set(x, "WriteSegmentTimelineInRepresentation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWriteSegmentTimelineInRepresentationUndefined: Self = StObject.set(x, "WriteSegmentTimelineInRepresentation", js.undefined)
  }
}
