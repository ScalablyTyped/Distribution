package typings.awsSdk.shieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateEmergencyContactSettingsRequest extends js.Object {
  
  /**
    * A list of email addresses and phone numbers that the DDoS Response Team (DRT) can use to contact you if you have proactive engagement enabled, for escalations to the DRT and to initiate proactive customer support. If you have proactive engagement enabled, the contact list must include at least one phone number.
    */
  var EmergencyContactList: js.UndefOr[typings.awsSdk.shieldMod.EmergencyContactList] = js.native
}
object UpdateEmergencyContactSettingsRequest {
  
  @scala.inline
  def apply(): UpdateEmergencyContactSettingsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateEmergencyContactSettingsRequest]
  }
  
  @scala.inline
  implicit class UpdateEmergencyContactSettingsRequestOps[Self <: UpdateEmergencyContactSettingsRequest] (val x: Self) extends AnyVal {
    
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
    
    @scala.inline
    def deleteEmergencyContactList: Self = this.set("EmergencyContactList", js.undefined)
  }
}
