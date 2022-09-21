package typings.awsSdk.shieldMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeEmergencyContactSettingsResponse extends StObject {
  
  /**
    * A list of email addresses and phone numbers that the Shield Response Team (SRT) can use to contact you if you have proactive engagement enabled, for escalations to the SRT and to initiate proactive customer support.
    */
  var EmergencyContactList: js.UndefOr[typings.awsSdk.shieldMod.EmergencyContactList] = js.undefined
}
object DescribeEmergencyContactSettingsResponse {
  
  inline def apply(): DescribeEmergencyContactSettingsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeEmergencyContactSettingsResponse]
  }
  
  extension [Self <: DescribeEmergencyContactSettingsResponse](x: Self) {
    
    inline def setEmergencyContactList(value: EmergencyContactList): Self = StObject.set(x, "EmergencyContactList", value.asInstanceOf[js.Any])
    
    inline def setEmergencyContactListUndefined: Self = StObject.set(x, "EmergencyContactList", js.undefined)
    
    inline def setEmergencyContactListVarargs(value: EmergencyContact*): Self = StObject.set(x, "EmergencyContactList", js.Array(value*))
  }
}
