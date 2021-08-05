package typings.awsSdk.s3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListStorageLensConfigurationsRequest extends StObject {
  
  /**
    * The account ID of the requester.
    */
  var AccountId: typings.awsSdk.s3controlMod.AccountId
  
  /**
    * A pagination token to request the next page of results.
    */
  var NextToken: js.UndefOr[ContinuationToken] = js.undefined
}
object ListStorageLensConfigurationsRequest {
  
  inline def apply(AccountId: AccountId): ListStorageLensConfigurationsRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListStorageLensConfigurationsRequest]
  }
  
  extension [Self <: ListStorageLensConfigurationsRequest](x: Self) {
    
    inline def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    inline def setNextToken(value: ContinuationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
