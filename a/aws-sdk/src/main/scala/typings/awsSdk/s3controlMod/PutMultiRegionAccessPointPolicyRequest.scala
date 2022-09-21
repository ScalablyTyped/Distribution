package typings.awsSdk.s3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutMultiRegionAccessPointPolicyRequest extends StObject {
  
  /**
    * The Amazon Web Services account ID for the owner of the Multi-Region Access Point.
    */
  var AccountId: typings.awsSdk.s3controlMod.AccountId
  
  /**
    * An idempotency token used to identify the request and guarantee that requests are unique.
    */
  var ClientToken: MultiRegionAccessPointClientToken
  
  /**
    * A container element containing the details of the policy for the Multi-Region Access Point.
    */
  var Details: PutMultiRegionAccessPointPolicyInput
}
object PutMultiRegionAccessPointPolicyRequest {
  
  inline def apply(
    AccountId: AccountId,
    ClientToken: MultiRegionAccessPointClientToken,
    Details: PutMultiRegionAccessPointPolicyInput
  ): PutMultiRegionAccessPointPolicyRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], ClientToken = ClientToken.asInstanceOf[js.Any], Details = Details.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutMultiRegionAccessPointPolicyRequest]
  }
  
  extension [Self <: PutMultiRegionAccessPointPolicyRequest](x: Self) {
    
    inline def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    inline def setClientToken(value: MultiRegionAccessPointClientToken): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setDetails(value: PutMultiRegionAccessPointPolicyInput): Self = StObject.set(x, "Details", value.asInstanceOf[js.Any])
  }
}
