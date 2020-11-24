package typings.awsSdk.discoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AgentConfigurationStatus extends js.Object {
  
  /**
    * The agent/connector ID.
    */
  var agentId: js.UndefOr[String] = js.native
  
  /**
    * A description of the operation performed.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * Information about the status of the StartDataCollection and StopDataCollection operations. The system has recorded the data collection operation. The agent/connector receives this command the next time it polls for a new command. 
    */
  var operationSucceeded: js.UndefOr[Boolean] = js.native
}
object AgentConfigurationStatus {
  
  @scala.inline
  def apply(): AgentConfigurationStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AgentConfigurationStatus]
  }
  
  @scala.inline
  implicit class AgentConfigurationStatusOps[Self <: AgentConfigurationStatus] (val x: Self) extends AnyVal {
    
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
    def setAgentId(value: String): Self = this.set("agentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAgentId: Self = this.set("agentId", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setOperationSucceeded(value: Boolean): Self = this.set("operationSucceeded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOperationSucceeded: Self = this.set("operationSucceeded", js.undefined)
  }
}
