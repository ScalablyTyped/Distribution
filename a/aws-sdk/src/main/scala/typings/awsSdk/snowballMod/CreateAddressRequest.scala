package typings.awsSdk.snowballMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateAddressRequest extends StObject {
  
  /**
    * The address that you want the Snow device shipped to.
    */
  var Address: typings.awsSdk.snowballMod.Address
}
object CreateAddressRequest {
  
  inline def apply(Address: Address): CreateAddressRequest = {
    val __obj = js.Dynamic.literal(Address = Address.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAddressRequest]
  }
  
  extension [Self <: CreateAddressRequest](x: Self) {
    
    inline def setAddress(value: Address): Self = StObject.set(x, "Address", value.asInstanceOf[js.Any])
  }
}
