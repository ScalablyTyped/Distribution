package typings.awsSdk.snowballMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeAddressRequest extends StObject {
  
  /**
    * The automatically generated ID for a specific address.
    */
  var AddressId: typings.awsSdk.snowballMod.AddressId = js.native
}
object DescribeAddressRequest {
  
  @scala.inline
  def apply(AddressId: AddressId): DescribeAddressRequest = {
    val __obj = js.Dynamic.literal(AddressId = AddressId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAddressRequest]
  }
  
  @scala.inline
  implicit class DescribeAddressRequestMutableBuilder[Self <: DescribeAddressRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddressId(value: AddressId): Self = StObject.set(x, "AddressId", value.asInstanceOf[js.Any])
  }
}
