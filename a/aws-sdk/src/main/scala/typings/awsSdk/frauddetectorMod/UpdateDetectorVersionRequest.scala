package typings.awsSdk.frauddetectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateDetectorVersionRequest extends js.Object {
  
  /**
    * The detector version description. 
    */
  var description: js.UndefOr[typings.awsSdk.frauddetectorMod.description] = js.native
  
  /**
    * The parent detector ID for the detector version you want to update.
    */
  var detectorId: identifier = js.native
  
  /**
    * The detector version ID. 
    */
  var detectorVersionId: wholeNumberVersionString = js.native
  
  /**
    * The Amazon SageMaker model endpoints to include in the detector version.
    */
  var externalModelEndpoints: ListOfStrings = js.native
  
  /**
    * The model versions to include in the detector version.
    */
  var modelVersions: js.UndefOr[ListOfModelVersions] = js.native
  
  /**
    * The rule execution mode to add to the detector. If you specify FIRST_MATCHED, Amazon Fraud Detector evaluates rules sequentially, first to last, stopping at the first matched rule. Amazon Fraud dectector then provides the outcomes for that single rule. If you specifiy ALL_MATCHED, Amazon Fraud Detector evaluates all rules and returns the outcomes for all matched rules. You can define and edit the rule mode at the detector version level, when it is in draft status. The default behavior is FIRST_MATCHED.
    */
  var ruleExecutionMode: js.UndefOr[RuleExecutionMode] = js.native
  
  /**
    * The rules to include in the detector version.
    */
  var rules: RuleList = js.native
}
object UpdateDetectorVersionRequest {
  
  @scala.inline
  def apply(
    detectorId: identifier,
    detectorVersionId: wholeNumberVersionString,
    externalModelEndpoints: ListOfStrings,
    rules: RuleList
  ): UpdateDetectorVersionRequest = {
    val __obj = js.Dynamic.literal(detectorId = detectorId.asInstanceOf[js.Any], detectorVersionId = detectorVersionId.asInstanceOf[js.Any], externalModelEndpoints = externalModelEndpoints.asInstanceOf[js.Any], rules = rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDetectorVersionRequest]
  }
  
  @scala.inline
  implicit class UpdateDetectorVersionRequestOps[Self <: UpdateDetectorVersionRequest] (val x: Self) extends AnyVal {
    
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
    def setDetectorId(value: identifier): Self = this.set("detectorId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetectorVersionId(value: wholeNumberVersionString): Self = this.set("detectorVersionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternalModelEndpointsVarargs(value: String*): Self = this.set("externalModelEndpoints", js.Array(value :_*))
    
    @scala.inline
    def setExternalModelEndpoints(value: ListOfStrings): Self = this.set("externalModelEndpoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRulesVarargs(value: Rule*): Self = this.set("rules", js.Array(value :_*))
    
    @scala.inline
    def setRules(value: RuleList): Self = this.set("rules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: description): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
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
  }
}
