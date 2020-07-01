package typings.awsSdk.shieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeEmergencyContactSettingsResponse extends js.Object {
  /**
    * A list of email addresses and phone numbers that the DDoS Response Team (DRT) can use to contact you if you have proactive engagement enabled, for escalations to the DRT and to initiate proactive customer support.
    */
  var EmergencyContactList: js.UndefOr[typings.awsSdk.shieldMod.EmergencyContactList] = js.native
}

object DescribeEmergencyContactSettingsResponse {
  @scala.inline
  def apply(EmergencyContactList: EmergencyContactList = null): DescribeEmergencyContactSettingsResponse = {
    val __obj = js.Dynamic.literal()
    if (EmergencyContactList != null) __obj.updateDynamic("EmergencyContactList")(EmergencyContactList.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeEmergencyContactSettingsResponse]
  }
}

