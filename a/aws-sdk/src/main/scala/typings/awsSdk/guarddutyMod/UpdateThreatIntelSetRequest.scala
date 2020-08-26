package typings.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateThreatIntelSetRequest extends js.Object {
  /**
    * The updated Boolean value that specifies whether the ThreateIntelSet is active or not.
    */
  var Activate: js.UndefOr[Boolean] = js.native
  /**
    * The detectorID that specifies the GuardDuty service whose ThreatIntelSet you want to update.
    */
  var DetectorId: typings.awsSdk.guarddutyMod.DetectorId = js.native
  /**
    * The updated URI of the file that contains the ThreateIntelSet. For example: https://s3.us-west-2.amazonaws.com/my-bucket/my-object-key.
    */
  var Location: js.UndefOr[typings.awsSdk.guarddutyMod.Location] = js.native
  /**
    * The unique ID that specifies the ThreatIntelSet that you want to update.
    */
  var Name: js.UndefOr[typings.awsSdk.guarddutyMod.Name] = js.native
  /**
    * The unique ID that specifies the ThreatIntelSet that you want to update.
    */
  var ThreatIntelSetId: String = js.native
}

object UpdateThreatIntelSetRequest {
  @scala.inline
  def apply(DetectorId: DetectorId, ThreatIntelSetId: String): UpdateThreatIntelSetRequest = {
    val __obj = js.Dynamic.literal(DetectorId = DetectorId.asInstanceOf[js.Any], ThreatIntelSetId = ThreatIntelSetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateThreatIntelSetRequest]
  }
  @scala.inline
  implicit class UpdateThreatIntelSetRequestOps[Self <: UpdateThreatIntelSetRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDetectorId(value: DetectorId): Self = this.set("DetectorId", value.asInstanceOf[js.Any])
    @scala.inline
    def setThreatIntelSetId(value: String): Self = this.set("ThreatIntelSetId", value.asInstanceOf[js.Any])
    @scala.inline
    def setActivate(value: Boolean): Self = this.set("Activate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActivate: Self = this.set("Activate", js.undefined)
    @scala.inline
    def setLocation(value: Location): Self = this.set("Location", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocation: Self = this.set("Location", js.undefined)
    @scala.inline
    def setName(value: Name): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
  }
  
}

