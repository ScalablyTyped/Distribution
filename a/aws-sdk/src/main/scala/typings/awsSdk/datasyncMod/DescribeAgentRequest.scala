package typings.awsSdk.datasyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAgentRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the agent to describe.
    */
  var AgentArn: typings.awsSdk.datasyncMod.AgentArn
}
object DescribeAgentRequest {
  
  @scala.inline
  def apply(AgentArn: AgentArn): DescribeAgentRequest = {
    val __obj = js.Dynamic.literal(AgentArn = AgentArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAgentRequest]
  }
  
  @scala.inline
  implicit class DescribeAgentRequestMutableBuilder[Self <: DescribeAgentRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAgentArn(value: AgentArn): Self = StObject.set(x, "AgentArn", value.asInstanceOf[js.Any])
  }
}
