package typings.awsSdk.codestarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListUserProfilesResult extends js.Object {
  /**
    * The continuation token to use when requesting the next set of results, if there are more results to be returned.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
  /**
    * All the user profiles configured in AWS CodeStar for an AWS account.
    */
  var userProfiles: UserProfilesList = js.native
}

object ListUserProfilesResult {
  @scala.inline
  def apply(userProfiles: UserProfilesList): ListUserProfilesResult = {
    val __obj = js.Dynamic.literal(userProfiles = userProfiles.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListUserProfilesResult]
  }
  @scala.inline
  implicit class ListUserProfilesResultOps[Self <: ListUserProfilesResult] (val x: Self) extends AnyVal {
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
    def setUserProfilesVarargs(value: UserProfileSummary*): Self = this.set("userProfiles", js.Array(value :_*))
    @scala.inline
    def setUserProfiles(value: UserProfilesList): Self = this.set("userProfiles", value.asInstanceOf[js.Any])
    @scala.inline
    def setNextToken(value: PaginationToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
  
}

