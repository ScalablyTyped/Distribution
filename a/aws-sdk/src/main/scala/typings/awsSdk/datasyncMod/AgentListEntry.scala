package typings.awsSdk.datasyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(): AgentListEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AgentListEntry]
  }
  
  @scala.inline
  implicit class AgentListEntryOps[Self <: AgentListEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAgentArn(value: AgentArn): Self = this.set("AgentArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAgentArn: Self = this.set("AgentArn", js.undefined)
    
    @scala.inline
    def setName(value: TagValue): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    
    @scala.inline
    def setStatus(value: AgentStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
  }
}
