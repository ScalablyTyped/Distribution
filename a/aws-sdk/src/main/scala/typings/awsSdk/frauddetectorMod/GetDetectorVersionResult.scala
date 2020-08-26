package typings.awsSdk.frauddetectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDetectorVersionResult extends js.Object {
  /**
    * The detector version ARN.
    */
  var arn: js.UndefOr[fraudDetectorArn] = js.native
  /**
    * The timestamp when the detector version was created. 
    */
  var createdTime: js.UndefOr[time] = js.native
  /**
    * The detector version description.
    */
  var description: js.UndefOr[typings.awsSdk.frauddetectorMod.description] = js.native
  /**
    * The detector ID.
    */
  var detectorId: js.UndefOr[identifier] = js.native
  /**
    * The detector version ID.
    */
  var detectorVersionId: js.UndefOr[wholeNumberVersionString] = js.native
  /**
    * The Amazon SageMaker model endpoints included in the detector version.
    */
  var externalModelEndpoints: js.UndefOr[ListOfStrings] = js.native
  /**
    * The timestamp when the detector version was last updated. 
    */
  var lastUpdatedTime: js.UndefOr[time] = js.native
  /**
    * The model versions included in the detector version. 
    */
  var modelVersions: js.UndefOr[ListOfModelVersions] = js.native
  /**
    * The execution mode of the rule in the dectector  FIRST_MATCHED indicates that Amazon Fraud Detector evaluates rules sequentially, first to last, stopping at the first matched rule. Amazon Fraud dectector then provides the outcomes for that single rule.  ALL_MATCHED indicates that Amazon Fraud Detector evaluates all rules and returns the outcomes for all matched rules. You can define and edit the rule mode at the detector version level, when it is in draft status.
    */
  var ruleExecutionMode: js.UndefOr[RuleExecutionMode] = js.native
  /**
    * The rules included in the detector version.
    */
  var rules: js.UndefOr[RuleList] = js.native
  /**
    * The status of the detector version.
    */
  var status: js.UndefOr[DetectorVersionStatus] = js.native
}

object GetDetectorVersionResult {
  @scala.inline
  def apply(): GetDetectorVersionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDetectorVersionResult]
  }
  @scala.inline
  implicit class GetDetectorVersionResultOps[Self <: GetDetectorVersionResult] (val x: Self) extends AnyVal {
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
    def setArn(value: fraudDetectorArn): Self = this.set("arn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    @scala.inline
    def setCreatedTime(value: time): Self = this.set("createdTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreatedTime: Self = this.set("createdTime", js.undefined)
    @scala.inline
    def setDescription(value: description): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setDetectorId(value: identifier): Self = this.set("detectorId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDetectorId: Self = this.set("detectorId", js.undefined)
    @scala.inline
    def setDetectorVersionId(value: wholeNumberVersionString): Self = this.set("detectorVersionId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDetectorVersionId: Self = this.set("detectorVersionId", js.undefined)
    @scala.inline
    def setExternalModelEndpointsVarargs(value: String*): Self = this.set("externalModelEndpoints", js.Array(value :_*))
    @scala.inline
    def setExternalModelEndpoints(value: ListOfStrings): Self = this.set("externalModelEndpoints", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExternalModelEndpoints: Self = this.set("externalModelEndpoints", js.undefined)
    @scala.inline
    def setLastUpdatedTime(value: time): Self = this.set("lastUpdatedTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastUpdatedTime: Self = this.set("lastUpdatedTime", js.undefined)
    @scala.inline
    def setModelVersionsVarargs(value: ModelVersion*): Self = this.set("modelVersions", js.Array(value :_*))
    @scala.inline
    def setModelVersions(value: ListOfModelVersions): Self = this.set("modelVersions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModelVersions: Self = this.set("modelVersions", js.undefined)
    @scala.inline
    def setRuleExecutionMode(value: RuleExecutionMode): Self = this.set("ruleExecutionMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRuleExecutionMode: Self = this.set("ruleExecutionMode", js.undefined)
    @scala.inline
    def setRulesVarargs(value: Rule*): Self = this.set("rules", js.Array(value :_*))
    @scala.inline
    def setRules(value: RuleList): Self = this.set("rules", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRules: Self = this.set("rules", js.undefined)
    @scala.inline
    def setStatus(value: DetectorVersionStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
  
}

