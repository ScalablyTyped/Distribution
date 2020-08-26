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
    telemetryMetadata: TelemetryMetadataList
  ): AssessmentRunAgent = {
    val __obj = js.Dynamic.literal(agentHealth = agentHealth.asInstanceOf[js.Any], agentHealthCode = agentHealthCode.asInstanceOf[js.Any], agentId = agentId.asInstanceOf[js.Any], assessmentRunArn = assessmentRunArn.asInstanceOf[js.Any], telemetryMetadata = telemetryMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssessmentRunAgent]
  }
  @scala.inline
  implicit class AssessmentRunAgentOps[Self <: AssessmentRunAgent] (val x: Self) extends AnyVal {
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
    def setAgentHealth(value: AgentHealth): Self = this.set("agentHealth", value.asInstanceOf[js.Any])
    @scala.inline
    def setAgentHealthCode(value: AgentHealthCode): Self = this.set("agentHealthCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setAgentId(value: AgentId): Self = this.set("agentId", value.asInstanceOf[js.Any])
    @scala.inline
    def setAssessmentRunArn(value: Arn): Self = this.set("assessmentRunArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setTelemetryMetadataVarargs(value: TelemetryMetadata*): Self = this.set("telemetryMetadata", js.Array(value :_*))
    @scala.inline
    def setTelemetryMetadata(value: TelemetryMetadataList): Self = this.set("telemetryMetadata", value.asInstanceOf[js.Any])
    @scala.inline
    def setAgentHealthDetails(value: Message): Self = this.set("agentHealthDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAgentHealthDetails: Self = this.set("agentHealthDetails", js.undefined)
    @scala.inline
    def setAutoScalingGroup(value: AutoScalingGroup): Self = this.set("autoScalingGroup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoScalingGroup: Self = this.set("autoScalingGroup", js.undefined)
  }
  
}

