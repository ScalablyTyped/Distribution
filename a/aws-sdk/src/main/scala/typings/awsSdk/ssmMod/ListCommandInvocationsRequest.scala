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
  def apply(): ListCommandInvocationsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCommandInvocationsRequest]
  }
  @scala.inline
  implicit class ListCommandInvocationsRequestOps[Self <: ListCommandInvocationsRequest] (val x: Self) extends AnyVal {
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
    def setCommandId(value: CommandId): Self = this.set("CommandId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCommandId: Self = this.set("CommandId", js.undefined)
    @scala.inline
    def setDetails(value: Boolean): Self = this.set("Details", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDetails: Self = this.set("Details", js.undefined)
    @scala.inline
    def setFiltersVarargs(value: CommandFilter*): Self = this.set("Filters", js.Array(value :_*))
    @scala.inline
    def setFilters(value: CommandFilterList): Self = this.set("Filters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilters: Self = this.set("Filters", js.undefined)
    @scala.inline
    def setInstanceId(value: InstanceId): Self = this.set("InstanceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceId: Self = this.set("InstanceId", js.undefined)
    @scala.inline
    def setMaxResults(value: CommandMaxResults): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

