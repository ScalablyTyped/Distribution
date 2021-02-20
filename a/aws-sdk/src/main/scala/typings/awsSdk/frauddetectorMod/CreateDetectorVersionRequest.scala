package typings.awsSdk.frauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateDetectorVersionRequest extends StObject {
  
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
  implicit class CreateDetectorVersionRequestMutableBuilder[Self <: CreateDetectorVersionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setDetectorId(value: identifier): Self = StObject.set(x, "detectorId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternalModelEndpoints(value: ListOfStrings): Self = StObject.set(x, "externalModelEndpoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternalModelEndpointsUndefined: Self = StObject.set(x, "externalModelEndpoints", js.undefined)
    
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
    
    @scala.inline
    def setTags(value: tagList): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value :_*))
  }
}
