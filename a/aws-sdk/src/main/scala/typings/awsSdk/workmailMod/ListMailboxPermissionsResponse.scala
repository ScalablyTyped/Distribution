package typings.awsSdk.workmailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListMailboxPermissionsResponse extends js.Object {
  /**
    * The token to use to retrieve the next page of results. The value is "null" when there are no more results to return.
    */
  var NextToken: js.UndefOr[typings.awsSdk.workmailMod.NextToken] = js.native
  /**
    * One page of the user, group, or resource mailbox permissions.
    */
  var Permissions: js.UndefOr[typings.awsSdk.workmailMod.Permissions] = js.native
}

object ListMailboxPermissionsResponse {
  @scala.inline
  def apply(): ListMailboxPermissionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListMailboxPermissionsResponse]
  }
  @scala.inline
  implicit class ListMailboxPermissionsResponseOps[Self <: ListMailboxPermissionsResponse] (val x: Self) extends AnyVal {
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
    def setPermissionsVarargs(value: Permission*): Self = this.set("Permissions", js.Array(value :_*))
    @scala.inline
    def setPermissions(value: Permissions): Self = this.set("Permissions", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePermissions: Self = this.set("Permissions", js.undefined)
  }
  
}

