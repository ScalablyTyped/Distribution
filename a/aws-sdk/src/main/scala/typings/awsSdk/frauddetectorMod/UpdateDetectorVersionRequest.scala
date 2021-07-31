package typings.awsSdk.frauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateDetectorVersionRequest extends StObject {
  
  /**
    * The detector version description. 
    */
  var description: js.UndefOr[typings.awsSdk.frauddetectorMod.description] = js.undefined
  
  /**
    * The parent detector ID for the detector version you want to update.
    */
  var detectorId: identifier
  
  /**
    * The detector version ID. 
    */
  var detectorVersionId: wholeNumberVersionString
  
  /**
    * The Amazon SageMaker model endpoints to include in the detector version.
    */
  var externalModelEndpoints: ListOfStrings
  
  /**
    * The model versions to include in the detector version.
    */
  var modelVersions: js.UndefOr[ListOfModelVersions] = js.undefined
  
  /**
    * The rule execution mode to add to the detector. If you specify FIRST_MATCHED, Amazon Fraud Detector evaluates rules sequentially, first to last, stopping at the first matched rule. Amazon Fraud dectector then provides the outcomes for that single rule. If you specifiy ALL_MATCHED, Amazon Fraud Detector evaluates all rules and returns the outcomes for all matched rules. You can define and edit the rule mode at the detector version level, when it is in draft status. The default behavior is FIRST_MATCHED.
    */
  var ruleExecutionMode: js.UndefOr[RuleExecutionMode] = js.undefined
  
  /**
    * The rules to include in the detector version.
    */
  var rules: RuleList
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
  implicit class UpdateDetectorVersionRequestMutableBuilder[Self <: UpdateDetectorVersionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setDetectorId(value: identifier): Self = StObject.set(x, "detectorId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetectorVersionId(value: wholeNumberVersionString): Self = StObject.set(x, "detectorVersionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternalModelEndpoints(value: ListOfStrings): Self = StObject.set(x, "externalModelEndpoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternalModelEndpointsVarargs(value: String*): Self = StObject.set(x, "externalModelEndpoints", js.Array(value :_*))
    
    @scala.inline
    def setModelVersions(value: ListOfModelVersions): Self = StObject.set(x, "modelVersions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelVersionsUndefined: Self = StObject.set(x, "modelVersions", js.undefined)
    
    @scala.inline
    def setModelVersionsVarargs(value: ModelVersion*): Self = StObject.set(x, "modelVersions", js.Array(value :_*))
    
    @scala.inline
    def setRuleExecutionMode(value: RuleExecutionMode): Self = StObject.set(x, "ruleExecutionMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleExecutionModeUndefined: Self = StObject.set(x, "ruleExecutionMode", js.undefined)
    
    @scala.inline
    def setRules(value: RuleList): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRulesVarargs(value: Rule*): Self = StObject.set(x, "rules", js.Array(value :_*))
  }
}
