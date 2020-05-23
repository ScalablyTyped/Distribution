package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListCommandInvocationsRequest extends js.Object {
  /**
    * (Optional) The invocations for a specific command ID.
    */
  var CommandId: js.UndefOr[typings.awsSdk.ssmMod.CommandId] = js.native
  /**
    * (Optional) If set this returns the response of the command executions and any command output. By default this is set to False. 
    */
  var Details: js.UndefOr[Boolean] = js.native
  /**
    * (Optional) One or more filters. Use a filter to return a more specific list of results.
    */
  var Filters: js.UndefOr[CommandFilterList] = js.native
  /**
    * (Optional) The command execution details for a specific instance ID.
    */
  var InstanceId: js.UndefOr[typings.awsSdk.ssmMod.InstanceId] = js.native
  /**
    * (Optional) The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results.
    */
  var MaxResults: js.UndefOr[CommandMaxResults] = js.native
  /**
    * (Optional) The token for the next set of items to return. (You received this token from a previous call.)
    */
  var NextToken: js.UndefOr[typings.awsSdk.ssmMod.NextToken] = js.native
}

object ListCommandInvocationsRequest {
  @scala.inline
  def apply(
    CommandId: CommandId = null,
    Details: js.UndefOr[Boolean] = js.undefined,
    Filters: CommandFilterList = null,
    InstanceId: InstanceId = null,
    MaxResults: js.UndefOr[CommandMaxResults] = js.undefined,
    NextToken: NextToken = null
  ): ListCommandInvocationsRequest = {
    val __obj = js.Dynamic.literal()
    if (CommandId != null) __obj.updateDynamic("CommandId")(CommandId.asInstanceOf[js.Any])
    if (!js.isUndefined(Details)) __obj.updateDynamic("Details")(Details.get.asInstanceOf[js.Any])
    if (Filters != null) __obj.updateDynamic("Filters")(Filters.asInstanceOf[js.Any])
    if (InstanceId != null) __obj.updateDynamic("InstanceId")(InstanceId.asInstanceOf[js.Any])
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults.get.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListCommandInvocationsRequest]
  }
}

