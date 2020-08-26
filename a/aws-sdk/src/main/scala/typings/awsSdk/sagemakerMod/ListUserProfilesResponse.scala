package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListUserProfilesResponse extends js.Object {
  /**
    * If the previous response was truncated, you will receive this token. Use it in your next request to receive the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.sagemakerMod.NextToken] = js.native
  /**
    * The list of user profiles.
    */
  var UserProfiles: js.UndefOr[UserProfileList] = js.native
}

object ListUserProfilesResponse {
  @scala.inline
  def apply(): ListUserProfilesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListUserProfilesResponse]
  }
  @scala.inline
  implicit class ListUserProfilesResponseOps[Self <: ListUserProfilesResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setUserProfilesVarargs(value: UserProfileDetails*): Self = this.set("UserProfiles", js.Array(value :_*))
    @scala.inline
    def setUserProfiles(value: UserProfileList): Self = this.set("UserProfiles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserProfiles: Self = this.set("UserProfiles", js.undefined)
  }
  
}

