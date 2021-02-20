package typings.awsSdk.inspectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssessmentRunAgent extends StObject {
  
  /**
    * The current health state of the agent.
    */
  var agentHealth: AgentHealth = js.native
  
  /**
    * The detailed health state of the agent.
    */
  var agentHealthCode: AgentHealthCode = js.native
  
  /**
    * The description for the agent health code.
    */
  var agentHealthDetails: js.UndefOr[Message] = js.native
  
  /**
    * The AWS account of the EC2 instance where the agent is installed.
    */
  var agentId: AgentId = js.native
  
  /**
    * The ARN of the assessment run that is associated with the agent.
    */
  var assessmentRunArn: Arn = js.native
  
  /**
    * The Auto Scaling group of the EC2 instance that is specified by the agent ID.
    */
  var autoScalingGroup: js.UndefOr[AutoScalingGroup] = js.native
  
  /**
    * The Amazon Inspector application data metrics that are collected by the agent.
    */
  var telemetryMetadata: TelemetryMetadataList = js.native
}
object AssessmentRunAgent {
  
  @scala.inline
  def apply(
    agentHealth: AgentHealth,
    agentHealthCode: AgentHealthCode,
    agentId: AgentId,
    assessmentRunArn: Arn,
    telemetryMetadata: TelemetryMetadataList
  ): AssessmentRunAgent = {
    val __obj = js.Dynamic.literal(agentHealth = agentHealth.asInstanceOf[js.Any], agentHealthCode = agentHealthCode.asInstanceOf[js.Any], agentId = agentId.asInstanceOf[js.Any], assessmentRunArn = assessmentRunArn.asInstanceOf[js.Any], telemetryMetadata = telemetryMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssessmentRunAgent]
  }
  
  @scala.inline
  implicit class AssessmentRunAgentMutableBuilder[Self <: AssessmentRunAgent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAgentHealth(value: AgentHealth): Self = StObject.set(x, "agentHealth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAgentHealthCode(value: AgentHealthCode): Self = StObject.set(x, "agentHealthCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAgentHealthDetails(value: Message): Self = StObject.set(x, "agentHealthDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAgentHealthDetailsUndefined: Self = StObject.set(x, "agentHealthDetails", js.undefined)
    
    @scala.inline
    def setAgentId(value: AgentId): Self = StObject.set(x, "agentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssessmentRunArn(value: Arn): Self = StObject.set(x, "assessmentRunArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoScalingGroup(value: AutoScalingGroup): Self = StObject.set(x, "autoScalingGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoScalingGroupUndefined: Self = StObject.set(x, "autoScalingGroup", js.undefined)
    
    @scala.inline
    def setTelemetryMetadata(value: TelemetryMetadataList): Self = StObject.set(x, "telemetryMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTelemetryMetadataVarargs(value: TelemetryMetadata*): Self = StObject.set(x, "telemetryMetadata", js.Array(value :_*))
  }
}
