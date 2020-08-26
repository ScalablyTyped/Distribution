package typings.awsSdk.codepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActionExecutionInput extends js.Object {
  var actionTypeId: js.UndefOr[ActionTypeId] = js.native
  /**
    * Configuration data for an action execution.
    */
  var configuration: js.UndefOr[ActionConfigurationMap] = js.native
  /**
    * Details of input artifacts of the action that correspond to the action execution.
    */
  var inputArtifacts: js.UndefOr[ArtifactDetailList] = js.native
  /**
    * The variable namespace associated with the action. All variables produced as output by this action fall under this namespace.
    */
  var namespace: js.UndefOr[ActionNamespace] = js.native
  /**
    * The AWS Region for the action, such as us-east-1.
    */
  var region: js.UndefOr[AWSRegionName] = js.native
  /**
    * Configuration data for an action execution with all variable references replaced with their real values for the execution.
    */
  var resolvedConfiguration: js.UndefOr[ResolvedActionConfigurationMap] = js.native
  /**
    * The ARN of the IAM service role that performs the declared action. This is assumed through the roleArn for the pipeline. 
    */
  var roleArn: js.UndefOr[RoleArn] = js.native
}

object ActionExecutionInput {
  @scala.inline
  def apply(): ActionExecutionInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActionExecutionInput]
  }
  @scala.inline
  implicit class ActionExecutionInputOps[Self <: ActionExecutionInput] (val x: Self) extends AnyVal {
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
    def setActionTypeId(value: ActionTypeId): Self = this.set("actionTypeId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActionTypeId: Self = this.set("actionTypeId", js.undefined)
    @scala.inline
    def setConfiguration(value: ActionConfigurationMap): Self = this.set("configuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfiguration: Self = this.set("configuration", js.undefined)
    @scala.inline
    def setInputArtifactsVarargs(value: ArtifactDetail*): Self = this.set("inputArtifacts", js.Array(value :_*))
    @scala.inline
    def setInputArtifacts(value: ArtifactDetailList): Self = this.set("inputArtifacts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputArtifacts: Self = this.set("inputArtifacts", js.undefined)
    @scala.inline
    def setNamespace(value: ActionNamespace): Self = this.set("namespace", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNamespace: Self = this.set("namespace", js.undefined)
    @scala.inline
    def setRegion(value: AWSRegionName): Self = this.set("region", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegion: Self = this.set("region", js.undefined)
    @scala.inline
    def setResolvedConfiguration(value: ResolvedActionConfigurationMap): Self = this.set("resolvedConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResolvedConfiguration: Self = this.set("resolvedConfiguration", js.undefined)
    @scala.inline
    def setRoleArn(value: RoleArn): Self = this.set("roleArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoleArn: Self = this.set("roleArn", js.undefined)
  }
  
}

