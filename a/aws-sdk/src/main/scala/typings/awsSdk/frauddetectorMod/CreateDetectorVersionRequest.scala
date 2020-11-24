package typings.awsSdk.frauddetectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateDetectorVersionRequest extends js.Object {
  
  /**
    * The description of the detector version.
    */
  var description: js.UndefOr[typings.awsSdk.frauddetectorMod.description] = js.native
  
  /**
    * The ID of the detector under which you want to create a new version.
    */
  var detectorId: identifier = js.native
  
  /**
    * The Amazon Sagemaker model endpoints to include in the detector version.
    */
  var externalModelEndpoints: js.UndefOr[ListOfStrings] = js.native
  
  /**
    * The model versions to include in the detector version.
    */
  var modelVersions: js.UndefOr[ListOfModelVersions] = js.native
  
  /**
    * The rule execution mode for the rules included in the detector version. You can define and edit the rule mode at the detector version level, when it is in draft status. If you specify FIRST_MATCHED, Amazon Fraud Detector evaluates rules sequentially, first to last, stopping at the first matched rule. Amazon Fraud dectector then provides the outcomes for that single rule. If you specifiy ALL_MATCHED, Amazon Fraud Detector evaluates all rules and returns the outcomes for all matched rules.  The default behavior is FIRST_MATCHED.
    */
  var ruleExecutionMode: js.UndefOr[RuleExecutionMode] = js.native
  
  /**
    * The rules to include in the detector version.
    */
  var rules: RuleList = js.native
  
  /**
    * A collection of key and value pairs.
    */
  var tags: js.UndefOr[tagList] = js.native
}
object CreateDetectorVersionRequest {
  
  @scala.inline
  def apply(detectorId: identifier, rules: RuleList): CreateDetectorVersionRequest = {
    val __obj = js.Dynamic.literal(detectorId = detectorId.asInstanceOf[js.Any], rules = rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDetectorVersionRequest]
  }
  
  @scala.inline
  implicit class CreateDetectorVersionRequestOps[Self <: CreateDetectorVersionRequest] (val x: Self) extends AnyVal {
    
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
    def setRulesVarargs(value: Rule*): Self = this.set("rules", js.Array(value :_*))
    
    @scala.inline
    def setRules(value: RuleList): Self = this.set("rules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: description): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setExternalModelEndpointsVarargs(value: String*): Self = this.set("externalModelEndpoints", js.Array(value :_*))
    
    @scala.inline
    def setExternalModelEndpoints(value: ListOfStrings): Self = this.set("externalModelEndpoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExternalModelEndpoints: Self = this.set("externalModelEndpoints", js.undefined)
    
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
    def setTagsVarargs(value: Tag*): Self = this.set("tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: tagList): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}
