package typings.awsSdk.sesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListVerifiedEmailAddressesResponse extends StObject {
  
  /**
    * A list of email addresses that have been verified.
    */
  var VerifiedEmailAddresses: js.UndefOr[AddressList] = js.native
}
object ListVerifiedEmailAddressesResponse {
  
  @scala.inline
  def apply(): ListVerifiedEmailAddressesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListVerifiedEmailAddressesResponse]
  }
  
  @scala.inline
  implicit class ListVerifiedEmailAddressesResponseMutableBuilder[Self <: ListVerifiedEmailAddressesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVerifiedEmailAddresses(value: AddressList): Self = StObject.set(x, "VerifiedEmailAddresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerifiedEmailAddressesUndefined: Self = StObject.set(x, "VerifiedEmailAddresses", js.undefined)
    
    @scala.inline
    def setVerifiedEmailAddressesVarargs(value: Address*): Self = StObject.set(x, "VerifiedEmailAddresses", js.Array(value :_*))
  }
}
