package typings.awsSdk.s3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListStorageLensConfigurationsRequest extends StObject {
  
  /**
    * The account ID of the requester.
    */
  var AccountId: typings.awsSdk.s3controlMod.AccountId = js.native
  
  /**
    * A pagination token to request the next page of results.
    */
  var NextToken: js.UndefOr[ContinuationToken] = js.native
}
object ListStorageLensConfigurationsRequest {
  
  @scala.inline
  def apply(AccountId: AccountId): ListStorageLensConfigurationsRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListStorageLensConfigurationsRequest]
  }
  
  @scala.inline
  implicit class ListStorageLensConfigurationsRequestMutableBuilder[Self <: ListStorageLensConfigurationsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextToken(value: ContinuationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
