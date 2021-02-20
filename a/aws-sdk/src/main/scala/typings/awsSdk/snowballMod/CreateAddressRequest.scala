package typings.awsSdk.snowballMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateAddressRequest extends StObject {
  
  /**
    * The address that you want the Snow device shipped to.
    */
  var Address: typings.awsSdk.snowballMod.Address = js.native
}
object CreateAddressRequest {
  
  @scala.inline
  def apply(Address: Address): CreateAddressRequest = {
    val __obj = js.Dynamic.literal(Address = Address.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAddressRequest]
  }
  
  @scala.inline
  implicit class CreateAddressRequestMutableBuilder[Self <: CreateAddressRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddress(value: Address): Self = StObject.set(x, "Address", value.asInstanceOf[js.Any])
  }
}
