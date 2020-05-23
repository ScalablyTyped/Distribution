package typings.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListMembersResponse extends js.Object {
  /**
    * A list of members.
    */
  var Members: js.UndefOr[typings.awsSdk.guarddutyMod.Members] = js.native
  /**
    * The pagination parameter to be used on the next list operation to retrieve more items.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object ListMembersResponse {
  @scala.inline
  def apply(Members: Members = null, NextToken: String = null): ListMembersResponse = {
    val __obj = js.Dynamic.literal()
    if (Members != null) __obj.updateDynamic("Members")(Members.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListMembersResponse]
  }
}

