package typings.awsSdk.snowballMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAddressesResult extends StObject {
  
  /**
    * The Snow device shipping addresses that were created for this account.
    */
  var Addresses: js.UndefOr[AddressList] = js.undefined
  
  /**
    * HTTP requests are stateless. If you use the automatically generated NextToken value in your next DescribeAddresses call, your list of returned addresses will start from this point in the array.
    */
  var NextToken: js.UndefOr[String] = js.undefined
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
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
