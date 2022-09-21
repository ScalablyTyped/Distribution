package typings.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAgentStatusRequest extends StObject {
  
  /**
    * The identifier for the agent status.
    */
  var AgentStatusId: typings.awsSdk.connectMod.AgentStatusId
  
  /**
    * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
    */
  var InstanceId: typings.awsSdk.connectMod.InstanceId
}
object DescribeAgentStatusRequest {
  
  inline def apply(AgentStatusId: AgentStatusId, InstanceId: InstanceId): DescribeAgentStatusRequest = {
    val __obj = js.Dynamic.literal(AgentStatusId = AgentStatusId.asInstanceOf[js.Any], InstanceId = InstanceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAgentStatusRequest]
  }
  
  extension [Self <: DescribeAgentStatusRequest](x: Self) {
    
    inline def setAgentStatusId(value: AgentStatusId): Self = StObject.set(x, "AgentStatusId", value.asInstanceOf[js.Any])
    
    inline def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
  }
}
