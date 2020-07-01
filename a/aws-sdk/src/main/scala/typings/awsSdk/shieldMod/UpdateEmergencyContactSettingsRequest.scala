package typings.awsSdk.shieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateEmergencyContactSettingsRequest extends js.Object {
  /**
    * A list of email addresses and phone numbers that the DDoS Response Team (DRT) can use to contact you if you have proactive engagement enabled, for escalations to the DRT and to initiate proactive customer support. If you have proactive engagement enabled, the contact list must include at least one phone number.
    */
  var EmergencyContactList: js.UndefOr[typings.awsSdk.shieldMod.EmergencyContactList] = js.native
}

object UpdateEmergencyContactSettingsRequest {
  @scala.inline
  def apply(EmergencyContactList: EmergencyContactList = null): UpdateEmergencyContactSettingsRequest = {
    val __obj = js.Dynamic.literal()
    if (EmergencyContactList != null) __obj.updateDynamic("EmergencyContactList")(EmergencyContactList.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateEmergencyContactSettingsRequest]
  }
}

