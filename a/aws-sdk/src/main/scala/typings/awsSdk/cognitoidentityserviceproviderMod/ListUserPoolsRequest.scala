package typings.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListUserPoolsRequest extends StObject {
  
  /**
    * The maximum number of results you want the request to return when listing the user pools.
    */
  var MaxResults: PoolQueryLimitType = js.native
  
  /**
    * An identifier that was returned from the previous call to this operation, which can be used to return the next set of items in the list.
    */
  var NextToken: js.UndefOr[PaginationKeyType] = js.native
}
object ListUserPoolsRequest {
  
  @scala.inline
  def apply(MaxResults: PoolQueryLimitType): ListUserPoolsRequest = {
    val __obj = js.Dynamic.literal(MaxResults = MaxResults.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListUserPoolsRequest]
  }
  
  @scala.inline
  implicit class ListUserPoolsRequestMutableBuilder[Self <: ListUserPoolsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxResults(value: PoolQueryLimitType): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextToken(value: PaginationKeyType): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
