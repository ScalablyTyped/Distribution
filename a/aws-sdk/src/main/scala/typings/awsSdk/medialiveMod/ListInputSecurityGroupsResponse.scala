package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListInputSecurityGroupsResponse extends js.Object {
  /**
    * List of input security groups
    */
  var InputSecurityGroups: js.UndefOr[listOfInputSecurityGroup] = js.native
  var NextToken: js.UndefOr[string] = js.native
}

object ListInputSecurityGroupsResponse {
  @scala.inline
  def apply(InputSecurityGroups: listOfInputSecurityGroup = null, NextToken: string = null): ListInputSecurityGroupsResponse = {
    val __obj = js.Dynamic.literal()
    if (InputSecurityGroups != null) __obj.updateDynamic("InputSecurityGroups")(InputSecurityGroups.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListInputSecurityGroupsResponse]
  }
}

