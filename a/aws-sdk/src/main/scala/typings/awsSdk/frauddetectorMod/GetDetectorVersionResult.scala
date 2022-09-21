package typings.awsSdk.frauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDetectorVersionResult extends StObject {
  
  /**
    * The detector version ARN.
    */
  var arn: js.UndefOr[fraudDetectorArn] = js.undefined
  
  /**
    * The timestamp when the detector version was created. 
    */
  var createdTime: js.UndefOr[time] = js.undefined
  
  /**
    * The detector version description.
    */
  var description: js.UndefOr[typings.awsSdk.frauddetectorMod.description] = js.undefined
  
  /**
    * The detector ID.
    */
  var detectorId: js.UndefOr[identifier] = js.undefined
  
  /**
    * The detector version ID.
    */
  var detectorVersionId: js.UndefOr[wholeNumberVersionString] = js.undefined
  
  /**
    * The Amazon SageMaker model endpoints included in the detector version.
    */
  var externalModelEndpoints: js.UndefOr[ListOfStrings] = js.undefined
  
  /**
    * The timestamp when the detector version was last updated. 
    */
  var lastUpdatedTime: js.UndefOr[time] = js.undefined
  
  /**
    * The model versions included in the detector version. 
    */
  var modelVersions: js.UndefOr[ListOfModelVersions] = js.undefined
  
  /**
    * The execution mode of the rule in the dectector  FIRST_MATCHED indicates that Amazon Fraud Detector evaluates rules sequentially, first to last, stopping at the first matched rule. Amazon Fraud dectector then provides the outcomes for that single rule.  ALL_MATCHED indicates that Amazon Fraud Detector evaluates all rules and returns the outcomes for all matched rules. You can define and edit the rule mode at the detector version level, when it is in draft status.
    */
  var ruleExecutionMode: js.UndefOr[RuleExecutionMode] = js.undefined
  
  /**
    * The rules included in the detector version.
    */
  var rules: js.UndefOr[RuleList] = js.undefined
  
  /**
    * The status of the detector version.
    */
  var status: js.UndefOr[DetectorVersionStatus] = js.undefined
}
object GetDetectorVersionResult {
  
  inline def apply(): GetDetectorVersionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDetectorVersionResult]
  }
  
  extension [Self <: GetDetectorVersionResult](x: Self) {
    
    inline def setArn(value: fraudDetectorArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setCreatedTime(value: time): Self = StObject.set(x, "createdTime", value.asInstanceOf[js.Any])
    
    inline def setCreatedTimeUndefined: Self = StObject.set(x, "createdTime", js.undefined)
    
    inline def setDescription(value: description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDetectorId(value: identifier): Self = StObject.set(x, "detectorId", value.asInstanceOf[js.Any])
    
    inline def setDetectorIdUndefined: Self = StObject.set(x, "detectorId", js.undefined)
    
    inline def setDetectorVersionId(value: wholeNumberVersionString): Self = StObject.set(x, "detectorVersionId", value.asInstanceOf[js.Any])
    
    inline def setDetectorVersionIdUndefined: Self = StObject.set(x, "detectorVersionId", js.undefined)
    
    inline def setExternalModelEndpoints(value: ListOfStrings): Self = StObject.set(x, "externalModelEndpoints", value.asInstanceOf[js.Any])
    
    inline def setExternalModelEndpointsUndefined: Self = StObject.set(x, "externalModelEndpoints", js.undefined)
    
    inline def setExternalModelEndpointsVarargs(value: String*): Self = StObject.set(x, "externalModelEndpoints", js.Array(value*))
    
    inline def setLastUpdatedTime(value: time): Self = StObject.set(x, "lastUpdatedTime", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedTimeUndefined: Self = StObject.set(x, "lastUpdatedTime", js.undefined)
    
    inline def setModelVersions(value: ListOfModelVersions): Self = StObject.set(x, "modelVersions", value.asInstanceOf[js.Any])
    
    inline def setModelVersionsUndefined: Self = StObject.set(x, "modelVersions", js.undefined)
    
    inline def setModelVersionsVarargs(value: ModelVersion*): Self = StObject.set(x, "modelVersions", js.Array(value*))
    
    inline def setRuleExecutionMode(value: RuleExecutionMode): Self = StObject.set(x, "ruleExecutionMode", value.asInstanceOf[js.Any])
    
    inline def setRuleExecutionModeUndefined: Self = StObject.set(x, "ruleExecutionMode", js.undefined)
    
    inline def setRules(value: RuleList): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
    
    inline def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
    
    inline def setRulesVarargs(value: Rule*): Self = StObject.set(x, "rules", js.Array(value*))
    
    inline def setStatus(value: DetectorVersionStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
