package typings.awsSdk.inspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssessmentRunAgent extends js.Object {
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
    telemetryMetadata: TelemetryMetadataList,
    agentHealthDetails: Message = null,
    autoScalingGroup: AutoScalingGroup = null
  ): AssessmentRunAgent = {
    val __obj = js.Dynamic.literal(agentHealth = agentHealth.asInstanceOf[js.Any], agentHealthCode = agentHealthCode.asInstanceOf[js.Any], agentId = agentId.asInstanceOf[js.Any], assessmentRunArn = assessmentRunArn.asInstanceOf[js.Any], telemetryMetadata = telemetryMetadata.asInstanceOf[js.Any])
    if (agentHealthDetails != null) __obj.updateDynamic("agentHealthDetails")(agentHealthDetails.asInstanceOf[js.Any])
    if (autoScalingGroup != null) __obj.updateDynamic("autoScalingGroup")(autoScalingGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssessmentRunAgent]
  }
}

