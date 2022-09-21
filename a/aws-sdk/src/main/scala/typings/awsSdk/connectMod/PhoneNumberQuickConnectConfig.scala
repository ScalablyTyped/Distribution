package typings.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PhoneNumberQuickConnectConfig extends StObject {
  
  /**
    * The phone number in E.164 format.
    */
  var PhoneNumber: typings.awsSdk.connectMod.PhoneNumber
}
object PhoneNumberQuickConnectConfig {
  
  inline def apply(PhoneNumber: PhoneNumber): PhoneNumberQuickConnectConfig = {
    val __obj = js.Dynamic.literal(PhoneNumber = PhoneNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhoneNumberQuickConnectConfig]
  }
  
  extension [Self <: PhoneNumberQuickConnectConfig](x: Self) {
    
    inline def setPhoneNumber(value: PhoneNumber): Self = StObject.set(x, "PhoneNumber", value.asInstanceOf[js.Any])
  }
}
