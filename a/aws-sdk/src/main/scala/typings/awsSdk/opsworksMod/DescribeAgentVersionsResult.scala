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
  def apply(): DescribeAgentVersionsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAgentVersionsResult]
  }
  @scala.inline
  implicit class DescribeAgentVersionsResultOps[Self <: DescribeAgentVersionsResult] (val x: Self) extends AnyVal {
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
    def setAgentVersionsVarargs(value: AgentVersion*): Self = this.set("AgentVersions", js.Array(value :_*))
    @scala.inline
    def setAgentVersions(value: AgentVersions): Self = this.set("AgentVersions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAgentVersions: Self = this.set("AgentVersions", js.undefined)
  }
  
}

