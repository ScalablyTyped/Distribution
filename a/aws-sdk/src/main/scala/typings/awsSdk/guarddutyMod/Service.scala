package typings.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Service extends js.Object {
  /**
    * Information about the activity that is described in a finding.
    */
  var Action: js.UndefOr[typings.awsSdk.guarddutyMod.Action] = js.native
  /**
    * Indicates whether this finding is archived.
    */
  var Archived: js.UndefOr[Boolean] = js.native
  /**
    * The total count of the occurrences of this finding type.
    */
  var Count: js.UndefOr[Integer] = js.native
  /**
    * The detector ID for the GuardDuty service.
    */
  var DetectorId: js.UndefOr[typings.awsSdk.guarddutyMod.DetectorId] = js.native
  /**
    * The first-seen timestamp of the activity that prompted GuardDuty to generate this finding.
    */
  var EventFirstSeen: js.UndefOr[String] = js.native
  /**
    * The last-seen timestamp of the activity that prompted GuardDuty to generate this finding.
    */
  var EventLastSeen: js.UndefOr[String] = js.native
  /**
    * An evidence object associated with the service.
    */
  var Evidence: js.UndefOr[typings.awsSdk.guarddutyMod.Evidence] = js.native
  /**
    * The resource role information for this finding.
    */
  var ResourceRole: js.UndefOr[String] = js.native
  /**
    * The name of the AWS service (GuardDuty) that generated a finding.
    */
  var ServiceName: js.UndefOr[String] = js.native
  /**
    * Feedback that was submitted about the finding.
    */
  var UserFeedback: js.UndefOr[String] = js.native
}

object Service {
  @scala.inline
  def apply(): Service = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Service]
  }
  @scala.inline
  implicit class ServiceOps[Self <: Service] (val x: Self) extends AnyVal {
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
    def setAction(value: Action): Self = this.set("Action", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAction: Self = this.set("Action", js.undefined)
    @scala.inline
    def setArchived(value: Boolean): Self = this.set("Archived", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArchived: Self = this.set("Archived", js.undefined)
    @scala.inline
    def setCount(value: Integer): Self = this.set("Count", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCount: Self = this.set("Count", js.undefined)
    @scala.inline
    def setDetectorId(value: DetectorId): Self = this.set("DetectorId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDetectorId: Self = this.set("DetectorId", js.undefined)
    @scala.inline
    def setEventFirstSeen(value: String): Self = this.set("EventFirstSeen", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEventFirstSeen: Self = this.set("EventFirstSeen", js.undefined)
    @scala.inline
    def setEventLastSeen(value: String): Self = this.set("EventLastSeen", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEventLastSeen: Self = this.set("EventLastSeen", js.undefined)
    @scala.inline
    def setEvidence(value: Evidence): Self = this.set("Evidence", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEvidence: Self = this.set("Evidence", js.undefined)
    @scala.inline
    def setResourceRole(value: String): Self = this.set("ResourceRole", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceRole: Self = this.set("ResourceRole", js.undefined)
    @scala.inline
    def setServiceName(value: String): Self = this.set("ServiceName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServiceName: Self = this.set("ServiceName", js.undefined)
    @scala.inline
    def setUserFeedback(value: String): Self = this.set("UserFeedback", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserFeedback: Self = this.set("UserFeedback", js.undefined)
  }
  
}

