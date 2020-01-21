package typings.awsSdk.workmailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListGroupsResponse extends js.Object {
  /**
    * The overview of groups for an organization.
    */
  var Groups: js.UndefOr[typings.awsSdk.workmailMod.Groups] = js.native
  /**
    * The token to use to retrieve the next page of results. The value is "null" when there are no more results to return.
    */
  var NextToken: js.UndefOr[typings.awsSdk.workmailMod.NextToken] = js.native
}

object ListGroupsResponse {
  @scala.inline
  def apply(Groups: Groups = null, NextToken: NextToken = null): ListGroupsResponse = {
    val __obj = js.Dynamic.literal()
    if (Groups != null) __obj.updateDynamic("Groups")(Groups.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListGroupsResponse]
  }
}

