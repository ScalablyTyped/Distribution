package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListUserImportJobsResponse extends js.Object {
  
  /**
    * An identifier that can be used to return the next set of user import jobs in the list.
    */
  var PaginationToken: js.UndefOr[PaginationKeyType] = js.native
  
  /**
    * The user import jobs.
    */
  var UserImportJobs: js.UndefOr[UserImportJobsListType] = js.native
}
object ListUserImportJobsResponse {
  
  @scala.inline
  def apply(): ListUserImportJobsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListUserImportJobsResponse]
  }
  
  @scala.inline
  implicit class ListUserImportJobsResponseOps[Self <: ListUserImportJobsResponse] (val x: Self) extends AnyVal {
    
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
    def setPaginationToken(value: PaginationKeyType): Self = this.set("PaginationToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaginationToken: Self = this.set("PaginationToken", js.undefined)
    
    @scala.inline
    def setUserImportJobsVarargs(value: UserImportJobType*): Self = this.set("UserImportJobs", js.Array(value :_*))
    
    @scala.inline
    def setUserImportJobs(value: UserImportJobsListType): Self = this.set("UserImportJobs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserImportJobs: Self = this.set("UserImportJobs", js.undefined)
  }
}
