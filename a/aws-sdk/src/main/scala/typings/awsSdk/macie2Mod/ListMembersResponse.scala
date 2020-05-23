package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListMembersResponse extends js.Object {
  /**
    * An array of objects, one for each account that's associated with the master account and meets the criteria specified by the onlyAssociated request parameter.
    */
  var members: js.UndefOr[listOfMember] = js.native
  /**
    * The string to use in a subsequent request to get the next page of results in a paginated response. This value is null if there are no additional pages.
    */
  var nextToken: js.UndefOr[string] = js.native
}

object ListMembersResponse {
  @scala.inline
  def apply(members: listOfMember = null, nextToken: string = null): ListMembersResponse = {
    val __obj = js.Dynamic.literal()
    if (members != null) __obj.updateDynamic("members")(members.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListMembersResponse]
  }
}

