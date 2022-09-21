package typings.awsSdk.s3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeMultiRegionAccessPointOperationRequest extends StObject {
  
  /**
    * The Amazon Web Services account ID for the owner of the Multi-Region Access Point.
    */
  var AccountId: typings.awsSdk.s3controlMod.AccountId
  
  /**
    * The request token associated with the request you want to know about. This request token is returned as part of the response when you make an asynchronous request. You provide this token to query about the status of the asynchronous action.
    */
  var RequestTokenARN: AsyncRequestTokenARN
}
object DescribeMultiRegionAccessPointOperationRequest {
  
  inline def apply(AccountId: AccountId, RequestTokenARN: AsyncRequestTokenARN): DescribeMultiRegionAccessPointOperationRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], RequestTokenARN = RequestTokenARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeMultiRegionAccessPointOperationRequest]
  }
  
  extension [Self <: DescribeMultiRegionAccessPointOperationRequest](x: Self) {
    
    inline def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    inline def setRequestTokenARN(value: AsyncRequestTokenARN): Self = StObject.set(x, "RequestTokenARN", value.asInstanceOf[js.Any])
  }
}
