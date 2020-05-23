package typings.awsSdk.mediapackagevodMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DashPackage extends js.Object {
  /**
    * A list of DASH manifest configurations.
    */
  var DashManifests: listOfDashManifest = js.native
  var Encryption: js.UndefOr[DashEncryption] = js.native
  /**
    * A list of triggers that controls when the outgoing Dynamic Adaptive Streaming over HTTP (DASH)
  Media Presentation Description (MPD) will be partitioned into multiple periods. If empty, the content will not
  be partitioned into more than one period. If the list contains "ADS", new periods will be created where
  the Asset contains SCTE-35 ad markers.
    */
  var PeriodTriggers: js.UndefOr[listOfPeriodTriggersElement] = js.native
  /**
    * Duration (in seconds) of each segment. Actual segments will be
  rounded to the nearest multiple of the source segment duration.
    */
  var SegmentDurationSeconds: js.UndefOr[integer] = js.native
  /**
    * Determines the type of SegmentTemplate included in the Media Presentation Description (MPD).  When set to NUMBER_WITH_TIMELINE, a full timeline is presented in each SegmentTemplate, with $Number$ media URLs.  When set to TIME_WITH_TIMELINE, a full timeline is presented in each SegmentTemplate, with $Time$ media URLs. When set to NUMBER_WITH_DURATION, only a duration is included in each SegmentTemplate, with $Number$ media URLs.
    */
  var SegmentTemplateFormat: js.UndefOr[typings.awsSdk.mediapackagevodMod.SegmentTemplateFormat] = js.native
}

object DashPackage {
  @scala.inline
  def apply(
    DashManifests: listOfDashManifest,
    Encryption: DashEncryption = null,
    PeriodTriggers: listOfPeriodTriggersElement = null,
    SegmentDurationSeconds: js.UndefOr[integer] = js.undefined,
    SegmentTemplateFormat: SegmentTemplateFormat = null
  ): DashPackage = {
    val __obj = js.Dynamic.literal(DashManifests = DashManifests.asInstanceOf[js.Any])
    if (Encryption != null) __obj.updateDynamic("Encryption")(Encryption.asInstanceOf[js.Any])
    if (PeriodTriggers != null) __obj.updateDynamic("PeriodTriggers")(PeriodTriggers.asInstanceOf[js.Any])
    if (!js.isUndefined(SegmentDurationSeconds)) __obj.updateDynamic("SegmentDurationSeconds")(SegmentDurationSeconds.get.asInstanceOf[js.Any])
    if (SegmentTemplateFormat != null) __obj.updateDynamic("SegmentTemplateFormat")(SegmentTemplateFormat.asInstanceOf[js.Any])
    __obj.asInstanceOf[DashPackage]
  }
}

