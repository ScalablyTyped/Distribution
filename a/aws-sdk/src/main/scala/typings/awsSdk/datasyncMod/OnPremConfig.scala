package typings.awsSdk.datasyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnPremConfig extends StObject {
  
  /**
    * ARNs of the agents to use for an NFS location.
    */
  var AgentArns: AgentArnList = js.native
}
object OnPremConfig {
  
  @scala.inline
  def apply(AgentArns: AgentArnList): OnPremConfig = {
    val __obj = js.Dynamic.literal(AgentArns = AgentArns.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnPremConfig]
  }
  
  @scala.inline
  implicit class OnPremConfigMutableBuilder[Self <: OnPremConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAgentArns(value: AgentArnList): Self = StObject.set(x, "AgentArns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAgentArnsVarargs(value: AgentArn*): Self = StObject.set(x, "AgentArns", js.Array(value :_*))
  }
}
