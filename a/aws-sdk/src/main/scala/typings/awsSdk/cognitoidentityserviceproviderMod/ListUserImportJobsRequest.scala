package typings.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListUserImportJobsRequest extends StObject {
  
  /**
    * The maximum number of import jobs you want the request to return.
    */
  var MaxResults: PoolQueryLimitType = js.native
  
  /**
    * An identifier that was returned from the previous call to ListUserImportJobs, which can be used to return the next set of import jobs in the list.
    */
  var PaginationToken: js.UndefOr[PaginationKeyType] = js.native
  
  /**
    * The user pool ID for the user pool that the users are being imported into.
    */
  var UserPoolId: UserPoolIdType = js.native
}
object ListUserImportJobsRequest {
  
  @scala.inline
  def apply(MaxResults: PoolQueryLimitType, UserPoolId: UserPoolIdType): ListUserImportJobsRequest = {
    val __obj = js.Dynamic.literal(MaxResults = MaxResults.asInstanceOf[js.Any], UserPoolId = UserPoolId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListUserImportJobsRequest]
  }
  
  @scala.inline
  implicit class ListUserImportJobsRequestMutableBuilder[Self <: ListUserImportJobsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxResults(value: PoolQueryLimitType): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaginationToken(value: PaginationKeyType): Self = StObject.set(x, "PaginationToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaginationTokenUndefined: Self = StObject.set(x, "PaginationToken", js.undefined)
    
    @scala.inline
    def setUserPoolId(value: UserPoolIdType): Self = StObject.set(x, "UserPoolId", value.asInstanceOf[js.Any])
  }
}
