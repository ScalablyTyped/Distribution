package typings.awsSdk.sesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListVerifiedEmailAddressesResponse extends StObject {
  
  /**
    * A list of email addresses that have been verified.
    */
  var VerifiedEmailAddresses: js.UndefOr[AddressList] = js.undefined
}
object ListVerifiedEmailAddressesResponse {
  
  inline def apply(): ListVerifiedEmailAddressesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListVerifiedEmailAddressesResponse]
  }
  
  extension [Self <: ListVerifiedEmailAddressesResponse](x: Self) {
    
    inline def setVerifiedEmailAddresses(value: AddressList): Self = StObject.set(x, "VerifiedEmailAddresses", value.asInstanceOf[js.Any])
    
    inline def setVerifiedEmailAddressesUndefined: Self = StObject.set(x, "VerifiedEmailAddresses", js.undefined)
    
    inline def setVerifiedEmailAddressesVarargs(value: Address*): Self = StObject.set(x, "VerifiedEmailAddresses", js.Array(value :_*))
  }
}
