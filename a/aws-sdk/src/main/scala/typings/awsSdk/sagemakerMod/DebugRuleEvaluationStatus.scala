package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DebugRuleEvaluationStatus extends js.Object {
  /**
    * Timestamp when the rule evaluation status was last modified.
    */
  var LastModifiedTime: js.UndefOr[Timestamp] = js.native
  /**
    * The name of the rule configuration
    */
  var RuleConfigurationName: js.UndefOr[typings.awsSdk.sagemakerMod.RuleConfigurationName] = js.native
  /**
    * The Amazon Resource Name (ARN) of the rule evaluation job.
    */
  var RuleEvaluationJobArn: js.UndefOr[ProcessingJobArn] = js.native
  /**
    * Status of the rule evaluation.
    */
  var RuleEvaluationStatus: js.UndefOr[typings.awsSdk.sagemakerMod.RuleEvaluationStatus] = js.native
  /**
    * Details from the rule evaluation.
    */
  var StatusDetails: js.UndefOr[typings.awsSdk.sagemakerMod.StatusDetails] = js.native
}

object DebugRuleEvaluationStatus {
  @scala.inline
  def apply(): DebugRuleEvaluationStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DebugRuleEvaluationStatus]
  }
  @scala.inline
  implicit class DebugRuleEvaluationStatusOps[Self <: DebugRuleEvaluationStatus] (val x: Self) extends AnyVal {
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
    def setLastModifiedTime(value: Timestamp): Self = this.set("LastModifiedTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastModifiedTime: Self = this.set("LastModifiedTime", js.undefined)
    @scala.inline
    def setRuleConfigurationName(value: RuleConfigurationName): Self = this.set("RuleConfigurationName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRuleConfigurationName: Self = this.set("RuleConfigurationName", js.undefined)
    @scala.inline
    def setRuleEvaluationJobArn(value: ProcessingJobArn): Self = this.set("RuleEvaluationJobArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRuleEvaluationJobArn: Self = this.set("RuleEvaluationJobArn", js.undefined)
    @scala.inline
    def setRuleEvaluationStatus(value: RuleEvaluationStatus): Self = this.set("RuleEvaluationStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRuleEvaluationStatus: Self = this.set("RuleEvaluationStatus", js.undefined)
    @scala.inline
    def setStatusDetails(value: StatusDetails): Self = this.set("StatusDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatusDetails: Self = this.set("StatusDetails", js.undefined)
  }
  
}

