package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DebugRuleConfiguration extends js.Object {
  /**
    * The instance type to deploy for a training job.
    */
  var InstanceType: js.UndefOr[ProcessingInstanceType] = js.native
  /**
    * Path to local storage location for output of rules. Defaults to /opt/ml/processing/output/rule/.
    */
  var LocalPath: js.UndefOr[DirectoryPath] = js.native
  /**
    * The name of the rule configuration. It must be unique relative to other rule configuration names.
    */
  var RuleConfigurationName: typings.awsSdk.sagemakerMod.RuleConfigurationName = js.native
  /**
    * The Amazon Elastic Container (ECR) Image for the managed rule evaluation.
    */
  var RuleEvaluatorImage: AlgorithmImage = js.native
  /**
    *  Runtime configuration for rule container.
    */
  var RuleParameters: js.UndefOr[typings.awsSdk.sagemakerMod.RuleParameters] = js.native
  /**
    * Path to Amazon S3 storage location for rules.
    */
  var S3OutputPath: js.UndefOr[S3Uri] = js.native
  /**
    * The size, in GB, of the ML storage volume attached to the processing instance.
    */
  var VolumeSizeInGB: js.UndefOr[OptionalVolumeSizeInGB] = js.native
}

object DebugRuleConfiguration {
  @scala.inline
  def apply(RuleConfigurationName: RuleConfigurationName, RuleEvaluatorImage: AlgorithmImage): DebugRuleConfiguration = {
    val __obj = js.Dynamic.literal(RuleConfigurationName = RuleConfigurationName.asInstanceOf[js.Any], RuleEvaluatorImage = RuleEvaluatorImage.asInstanceOf[js.Any])
    __obj.asInstanceOf[DebugRuleConfiguration]
  }
  @scala.inline
  implicit class DebugRuleConfigurationOps[Self <: DebugRuleConfiguration] (val x: Self) extends AnyVal {
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
    def setRuleConfigurationName(value: RuleConfigurationName): Self = this.set("RuleConfigurationName", value.asInstanceOf[js.Any])
    @scala.inline
    def setRuleEvaluatorImage(value: AlgorithmImage): Self = this.set("RuleEvaluatorImage", value.asInstanceOf[js.Any])
    @scala.inline
    def setInstanceType(value: ProcessingInstanceType): Self = this.set("InstanceType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceType: Self = this.set("InstanceType", js.undefined)
    @scala.inline
    def setLocalPath(value: DirectoryPath): Self = this.set("LocalPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocalPath: Self = this.set("LocalPath", js.undefined)
    @scala.inline
    def setRuleParameters(value: RuleParameters): Self = this.set("RuleParameters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRuleParameters: Self = this.set("RuleParameters", js.undefined)
    @scala.inline
    def setS3OutputPath(value: S3Uri): Self = this.set("S3OutputPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteS3OutputPath: Self = this.set("S3OutputPath", js.undefined)
    @scala.inline
    def setVolumeSizeInGB(value: OptionalVolumeSizeInGB): Self = this.set("VolumeSizeInGB", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVolumeSizeInGB: Self = this.set("VolumeSizeInGB", js.undefined)
  }
  
}

