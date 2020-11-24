package typings.awsSdk.ecsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VersionInfo extends js.Object {
  
  /**
    * The Git commit hash for the Amazon ECS container agent build on the amazon-ecs-agent  GitHub repository.
    */
  var agentHash: js.UndefOr[String] = js.native
  
  /**
    * The version number of the Amazon ECS container agent.
    */
  var agentVersion: js.UndefOr[String] = js.native
  
  /**
    * The Docker version running on the container instance.
    */
  var dockerVersion: js.UndefOr[String] = js.native
}
object VersionInfo {
  
  @scala.inline
  def apply(): VersionInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VersionInfo]
  }
  
  @scala.inline
  implicit class VersionInfoOps[Self <: VersionInfo] (val x: Self) extends AnyVal {
    
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
    def setAgentHash(value: String): Self = this.set("agentHash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAgentHash: Self = this.set("agentHash", js.undefined)
    
    @scala.inline
    def setAgentVersion(value: String): Self = this.set("agentVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAgentVersion: Self = this.set("agentVersion", js.undefined)
    
    @scala.inline
    def setDockerVersion(value: String): Self = this.set("dockerVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDockerVersion: Self = this.set("dockerVersion", js.undefined)
  }
}
