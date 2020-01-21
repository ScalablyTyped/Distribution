package typings.awsSdk.datasyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AgentListEntry extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the agent.
    */
  var AgentArn: js.UndefOr[typings.awsSdk.datasyncMod.AgentArn] = js.native
  /**
    * The name of the agent.
    */
  var Name: js.UndefOr[TagValue] = js.native
  /**
    * The status of the agent.
    */
  var Status: js.UndefOr[AgentStatus] = js.native
}

object AgentListEntry {
  @scala.inline
  def apply(AgentArn: AgentArn = null, Name: TagValue = null, Status: AgentStatus = null): AgentListEntry = {
    val __obj = js.Dynamic.literal()
    if (AgentArn != null) __obj.updateDynamic("AgentArn")(AgentArn.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[AgentListEntry]
  }
}

