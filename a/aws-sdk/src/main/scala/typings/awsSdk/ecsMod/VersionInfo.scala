package typings.awsSdk.ecsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VersionInfo extends StObject {
  
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
  implicit class VersionInfoMutableBuilder[Self <: VersionInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAgentHash(value: String): Self = StObject.set(x, "agentHash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAgentHashUndefined: Self = StObject.set(x, "agentHash", js.undefined)
    
    @scala.inline
    def setAgentVersion(value: String): Self = StObject.set(x, "agentVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAgentVersionUndefined: Self = StObject.set(x, "agentVersion", js.undefined)
    
    @scala.inline
    def setDockerVersion(value: String): Self = StObject.set(x, "dockerVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDockerVersionUndefined: Self = StObject.set(x, "dockerVersion", js.undefined)
  }
}
