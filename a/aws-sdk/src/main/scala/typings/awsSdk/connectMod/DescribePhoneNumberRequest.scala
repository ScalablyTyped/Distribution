package typings.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribePhoneNumberRequest extends StObject {
  
  /**
    * A unique identifier for the phone number.
    */
  var PhoneNumberId: typings.awsSdk.connectMod.PhoneNumberId
}
object DescribePhoneNumberRequest {
  
  inline def apply(PhoneNumberId: PhoneNumberId): DescribePhoneNumberRequest = {
    val __obj = js.Dynamic.literal(PhoneNumberId = PhoneNumberId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribePhoneNumberRequest]
  }
  
  extension [Self <: DescribePhoneNumberRequest](x: Self) {
    
    inline def setPhoneNumberId(value: PhoneNumberId): Self = StObject.set(x, "PhoneNumberId", value.asInstanceOf[js.Any])
  }
}
