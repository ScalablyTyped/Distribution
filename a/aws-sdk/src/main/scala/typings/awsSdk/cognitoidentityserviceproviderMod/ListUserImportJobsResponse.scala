package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(PaginationToken: PaginationKeyType = null, UserImportJobs: UserImportJobsListType = null): ListUserImportJobsResponse = {
    val __obj = js.Dynamic.literal()
    if (PaginationToken != null) __obj.updateDynamic("PaginationToken")(PaginationToken.asInstanceOf[js.Any])
    if (UserImportJobs != null) __obj.updateDynamic("UserImportJobs")(UserImportJobs.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListUserImportJobsResponse]
  }
}

