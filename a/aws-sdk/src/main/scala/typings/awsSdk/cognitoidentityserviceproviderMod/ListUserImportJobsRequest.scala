package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListUserImportJobsRequest extends js.Object {
  
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
  implicit class ListUserImportJobsRequestOps[Self <: ListUserImportJobsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setMaxResults(value: PoolQueryLimitType): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserPoolId(value: UserPoolIdType): Self = this.set("UserPoolId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaginationToken(value: PaginationKeyType): Self = this.set("PaginationToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaginationToken: Self = this.set("PaginationToken", js.undefined)
  }
}
