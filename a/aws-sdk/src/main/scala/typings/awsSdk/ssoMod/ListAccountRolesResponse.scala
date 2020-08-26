package typings.awsSdk.ssoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListAccountRolesResponse extends js.Object {
  /**
    * The page token client that is used to retrieve the list of accounts.
    */
  var nextToken: js.UndefOr[NextTokenType] = js.native
  /**
    * A paginated response with the list of roles and the next token if more results are available.
    */
  var roleList: js.UndefOr[RoleListType] = js.native
}

object ListAccountRolesResponse {
  @scala.inline
  def apply(): ListAccountRolesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAccountRolesResponse]
  }
  @scala.inline
  implicit class ListAccountRolesResponseOps[Self <: ListAccountRolesResponse] (val x: Self) extends AnyVal {
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
    def setNextToken(value: NextTokenType): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
    @scala.inline
    def setRoleListVarargs(value: RoleInfo*): Self = this.set("roleList", js.Array(value :_*))
    @scala.inline
    def setRoleList(value: RoleListType): Self = this.set("roleList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoleList: Self = this.set("roleList", js.undefined)
  }
  
}

