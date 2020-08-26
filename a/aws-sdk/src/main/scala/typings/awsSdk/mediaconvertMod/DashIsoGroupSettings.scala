package typings.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DashIsoGroupSettings extends js.Object {
  /**
    * By default, the service creates one .mpd DASH manifest for each DASH ISO output group in your job. This default manifest references every output in the output group. To create additional DASH manifests that reference a subset of the outputs in the output group, specify a list of them here.
    */
  var AdditionalManifests: js.UndefOr[listOfDashAdditionalManifest] = js.native
  /**
    * A partial URI prefix that will be put in the manifest (.mpd) file at the top level BaseURL element. Can be used if streams are delivered from a different URL than the manifest file.
    */
  var BaseUrl: js.UndefOr[string] = js.native
  /**
    * Use Destination (Destination) to specify the S3 output location and the output filename base. Destination accepts format identifiers. If you do not specify the base filename in the URI, the service will use the filename of the input file. If your job has multiple inputs, the service uses the filename of the first input file.
    */
  var Destination: js.UndefOr[stringPatternS3] = js.native
  /**
    * Settings associated with the destination. Will vary based on the type of destination
    */
  var DestinationSettings: js.UndefOr[typings.awsSdk.mediaconvertMod.DestinationSettings] = js.native
  /**
    * DRM settings.
    */
  var Encryption: js.UndefOr[DashIsoEncryptionSettings] = js.native
  /**
    * Length of fragments to generate (in seconds). Fragment length must be compatible with GOP size and Framerate. Note that fragments will end on the next keyframe after this number of seconds, so actual fragment length may be longer. When Emit Single File is checked, the fragmentation is internal to a single output file and it does not cause the creation of many output files as in other output types.
    */
  var FragmentLength: js.UndefOr[integerMin1Max2147483647] = js.native
  /**
    * Supports HbbTV specification as indicated
    */
  var HbbtvCompliance: js.UndefOr[DashIsoHbbtvCompliance] = js.native
  /**
    * Minimum time of initially buffered media that is needed to ensure smooth playout.
    */
  var MinBufferTime: js.UndefOr[integerMin0Max2147483647] = js.native
  /**
    * Specify whether your DASH profile is on-demand or main. When you choose Main profile (MAIN_PROFILE), the service signals  urn:mpeg:dash:profile:isoff-main:2011 in your .mpd DASH manifest. When you choose On-demand (ON_DEMAND_PROFILE), the service signals urn:mpeg:dash:profile:isoff-on-demand:2011 in your .mpd. When you choose On-demand, you must also set the output group setting Segment control (SegmentControl) to Single file (SINGLE_FILE).
    */
  var MpdProfile: js.UndefOr[DashIsoMpdProfile] = js.native
  /**
    * When set to SINGLE_FILE, a single output file is generated, which is internally segmented using the Fragment Length and Segment Length. When set to SEGMENTED_FILES, separate segment files will be created.
    */
  var SegmentControl: js.UndefOr[DashIsoSegmentControl] = js.native
  /**
    * Length of mpd segments to create (in seconds). Note that segments will end on the next keyframe after this number of seconds, so actual segment length may be longer. When Emit Single File is checked, the segmentation is internal to a single output file and it does not cause the creation of many output files as in other output types.
    */
  var SegmentLength: js.UndefOr[integerMin1Max2147483647] = js.native
  /**
    * If you get an HTTP error in the 400 range when you play back your DASH output, enable this setting and run your transcoding job again. When you enable this setting, the service writes precise segment durations in the DASH manifest. The segment duration information appears inside the SegmentTimeline element, inside SegmentTemplate at the Representation level. When you don't enable this setting, the service writes approximate segment durations in your DASH manifest.
    */
  var WriteSegmentTimelineInRepresentation: js.UndefOr[DashIsoWriteSegmentTimelineInRepresentation] = js.native
}

object DashIsoGroupSettings {
  @scala.inline
  def apply(): DashIsoGroupSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DashIsoGroupSettings]
  }
  @scala.inline
  implicit class DashIsoGroupSettingsOps[Self <: DashIsoGroupSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAdditionalManifestsVarargs(value: DashAdditionalManifest*): Self = this.set("AdditionalManifests", js.Array(value :_*))
    @scala.inline
    def setAdditionalManifests(value: listOfDashAdditionalManifest): Self = this.set("AdditionalManifests", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdditionalManifests: Self = this.set("AdditionalManifests", js.undefined)
    @scala.inline
    def setBaseUrl(value: string): Self = this.set("BaseUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBaseUrl: Self = this.set("BaseUrl", js.undefined)
    @scala.inline
    def setDestination(value: stringPatternS3): Self = this.set("Destination", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDestination: Self = this.set("Destination", js.undefined)
    @scala.inline
    def setDestinationSettings(value: DestinationSettings): Self = this.set("DestinationSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDestinationSettings: Self = this.set("DestinationSettings", js.undefined)
    @scala.inline
    def setEncryption(value: DashIsoEncryptionSettings): Self = this.set("Encryption", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncryption: Self = this.set("Encryption", js.undefined)
    @scala.inline
    def setFragmentLength(value: integerMin1Max2147483647): Self = this.set("FragmentLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFragmentLength: Self = this.set("FragmentLength", js.undefined)
    @scala.inline
    def setHbbtvCompliance(value: DashIsoHbbtvCompliance): Self = this.set("HbbtvCompliance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHbbtvCompliance: Self = this.set("HbbtvCompliance", js.undefined)
    @scala.inline
    def setMinBufferTime(value: integerMin0Max2147483647): Self = this.set("MinBufferTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinBufferTime: Self = this.set("MinBufferTime", js.undefined)
    @scala.inline
    def setMpdProfile(value: DashIsoMpdProfile): Self = this.set("MpdProfile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMpdProfile: Self = this.set("MpdProfile", js.undefined)
    @scala.inline
    def setSegmentControl(value: DashIsoSegmentControl): Self = this.set("SegmentControl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSegmentControl: Self = this.set("SegmentControl", js.undefined)
    @scala.inline
    def setSegmentLength(value: integerMin1Max2147483647): Self = this.set("SegmentLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSegmentLength: Self = this.set("SegmentLength", js.undefined)
    @scala.inline
    def setWriteSegmentTimelineInRepresentation(value: DashIsoWriteSegmentTimelineInRepresentation): Self = this.set("WriteSegmentTimelineInRepresentation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWriteSegmentTimelineInRepresentation: Self = this.set("WriteSegmentTimelineInRepresentation", js.undefined)
  }
  
}

