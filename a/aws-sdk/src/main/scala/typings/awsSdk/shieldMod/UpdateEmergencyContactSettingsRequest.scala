package typings.awsSdk.shieldMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateEmergencyContactSettingsRequest extends StObject {
  
  /**
    * A list of email addresses and phone numbers that the DDoS Response Team (DRT) can use to contact you if you have proactive engagement enabled, for escalations to the DRT and to initiate proactive customer support. If you have proactive engagement enabled, the contact list must include at least one phone number.
    */
  var EmergencyContactList: js.UndefOr[typings.awsSdk.shieldMod.EmergencyContactList] = js.undefined
}
object UpdateEmergencyContactSettingsRequest {
  
  inline def apply(): UpdateEmergencyContactSettingsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateEmergencyContactSettingsRequest]
  }
  
  extension [Self <: UpdateEmergencyContactSettingsRequest](x: Self) {
    
    inline def setEmergencyContactList(value: EmergencyContactList): Self = StObject.set(x, "EmergencyContactList", value.asInstanceOf[js.Any])
    
    inline def setEmergencyContactListUndefined: Self = StObject.set(x, "EmergencyContactList", js.undefined)
    
    inline def setEmergencyContactListVarargs(value: EmergencyContact*): Self = StObject.set(x, "EmergencyContactList", js.Array(value :_*))
  }
}
