package typings.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListUserImportJobsResponse extends StObject {
  
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
  implicit class ListUserImportJobsResponseMutableBuilder[Self <: ListUserImportJobsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPaginationToken(value: PaginationKeyType): Self = StObject.set(x, "PaginationToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaginationTokenUndefined: Self = StObject.set(x, "PaginationToken", js.undefined)
    
    @scala.inline
    def setUserImportJobs(value: UserImportJobsListType): Self = StObject.set(x, "UserImportJobs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserImportJobsUndefined: Self = StObject.set(x, "UserImportJobs", js.undefined)
    
    @scala.inline
    def setUserImportJobsVarargs(value: UserImportJobType*): Self = StObject.set(x, "UserImportJobs", js.Array(value :_*))
  }
}
