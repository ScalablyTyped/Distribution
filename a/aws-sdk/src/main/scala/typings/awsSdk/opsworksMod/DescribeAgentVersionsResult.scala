package typings.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeAgentVersionsResult extends js.Object {
  /**
    * The agent versions for the specified stack or configuration manager. Note that this value is the complete version number, not the abbreviated number used by the console.
    */
  var AgentVersions: js.UndefOr[typings.awsSdk.opsworksMod.AgentVersions] = js.native
}

object DescribeAgentVersionsResult {
  @scala.inline
  def apply(AgentVersions: AgentVersions = null): DescribeAgentVersionsResult = {
    val __obj = js.Dynamic.literal()
    if (AgentVersions != null) __obj.updateDynamic("AgentVersions")(AgentVersions.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAgentVersionsResult]
  }
}

