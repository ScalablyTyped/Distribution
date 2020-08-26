package typings.awsSdk.workmailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListGroupMembersResponse extends js.Object {
  /**
    * The members associated to the group.
    */
  var Members: js.UndefOr[typings.awsSdk.workmailMod.Members] = js.native
  /**
    * The token to use to retrieve the next page of results. The first call does not contain any tokens.
    */
  var NextToken: js.UndefOr[typings.awsSdk.workmailMod.NextToken] = js.native
}

object ListGroupMembersResponse {
  @scala.inline
  def apply(): ListGroupMembersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListGroupMembersResponse]
  }
  @scala.inline
  implicit class ListGroupMembersResponseOps[Self <: ListGroupMembersResponse] (val x: Self) extends AnyVal {
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
    def setMembersVarargs(value: Member*): Self = this.set("Members", js.Array(value :_*))
    @scala.inline
    def setMembers(value: Members): Self = this.set("Members", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMembers: Self = this.set("Members", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

