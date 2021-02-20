package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeAddressesResult extends StObject {
  
  /**
    * Information about the Elastic IP addresses.
    */
  var Addresses: js.UndefOr[AddressList] = js.native
}
object DescribeAddressesResult {
  
  @scala.inline
  def apply(): DescribeAddressesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAddressesResult]
  }
  
  @scala.inline
  implicit class DescribeAddressesResultMutableBuilder[Self <: DescribeAddressesResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddresses(value: AddressList): Self = StObject.set(x, "Addresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressesUndefined: Self = StObject.set(x, "Addresses", js.undefined)
    
    @scala.inline
    def setAddressesVarargs(value: Address*): Self = StObject.set(x, "Addresses", js.Array(value :_*))
  }
}
