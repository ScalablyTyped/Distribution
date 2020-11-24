package typings.awsSdk.mediapackagevodMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(DashManifests: listOfDashManifest): DashPackage = {
    val __obj = js.Dynamic.literal(DashManifests = DashManifests.asInstanceOf[js.Any])
    __obj.asInstanceOf[DashPackage]
  }
  
  @scala.inline
  implicit class DashPackageOps[Self <: DashPackage] (val x: Self) extends AnyVal {
    
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
    def setDashManifestsVarargs(value: DashManifest*): Self = this.set("DashManifests", js.Array(value :_*))
    
    @scala.inline
    def setDashManifests(value: listOfDashManifest): Self = this.set("DashManifests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncryption(value: DashEncryption): Self = this.set("Encryption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncryption: Self = this.set("Encryption", js.undefined)
    
    @scala.inline
    def setPeriodTriggersVarargs(value: PeriodTriggersElement*): Self = this.set("PeriodTriggers", js.Array(value :_*))
    
    @scala.inline
    def setPeriodTriggers(value: listOfPeriodTriggersElement): Self = this.set("PeriodTriggers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePeriodTriggers: Self = this.set("PeriodTriggers", js.undefined)
    
    @scala.inline
    def setSegmentDurationSeconds(value: integer): Self = this.set("SegmentDurationSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSegmentDurationSeconds: Self = this.set("SegmentDurationSeconds", js.undefined)
    
    @scala.inline
    def setSegmentTemplateFormat(value: SegmentTemplateFormat): Self = this.set("SegmentTemplateFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSegmentTemplateFormat: Self = this.set("SegmentTemplateFormat", js.undefined)
  }
}
