package typings.awsSdk.shieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssociateProactiveEngagementDetailsRequest extends js.Object {
  /**
    * A list of email addresses and phone numbers that the DDoS Response Team (DRT) can use to contact you for escalations to the DRT and to initiate proactive customer support.  To enable proactive engagement, the contact list must include at least one phone number.  The contacts that you provide here replace any contacts that were already defined. If you already have contacts defined and want to use them, retrieve the list using DescribeEmergencyContactSettings and then provide it here.  
    */
  var EmergencyContactList: typings.awsSdk.shieldMod.EmergencyContactList = js.native
}

object AssociateProactiveEngagementDetailsRequest {
  @scala.inline
  def apply(EmergencyContactList: EmergencyContactList): AssociateProactiveEngagementDetailsRequest = {
    val __obj = js.Dynamic.literal(EmergencyContactList = EmergencyContactList.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateProactiveEngagementDetailsRequest]
  }
  @scala.inline
  implicit class AssociateProactiveEngagementDetailsRequestOps[Self <: AssociateProactiveEngagementDetailsRequest] (val x: Self) extends AnyVal {
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
    def setEmergencyContactListVarargs(value: EmergencyContact*): Self = this.set("EmergencyContactList", js.Array(value :_*))
    @scala.inline
    def setEmergencyContactList(value: EmergencyContactList): Self = this.set("EmergencyContactList", value.asInstanceOf[js.Any])
  }
  
}

