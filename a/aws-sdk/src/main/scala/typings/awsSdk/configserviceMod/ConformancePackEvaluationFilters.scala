package typings.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConformancePackEvaluationFilters extends StObject {
  
  /**
    * Filters the results by compliance. The allowed values are COMPLIANT and NON_COMPLIANT.
    */
  var ComplianceType: js.UndefOr[ConformancePackComplianceType] = js.undefined
  
  /**
    * Filters the results by AWS Config rule names.
    */
  var ConfigRuleNames: js.UndefOr[ConformancePackConfigRuleNames] = js.undefined
  
  /**
    * Filters the results by resource IDs.  This is valid only when you provide resource type. If there is no resource type, you will see an error. 
    */
  var ResourceIds: js.UndefOr[ConformancePackComplianceResourceIds] = js.undefined
  
  /**
    * Filters the results by the resource type (for example, "AWS::EC2::Instance"). 
    */
  var ResourceType: js.UndefOr[StringWithCharLimit256] = js.undefined
}
object ConformancePackEvaluationFilters {
  
  @scala.inline
  def apply(): ConformancePackEvaluationFilters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConformancePackEvaluationFilters]
  }
  
  @scala.inline
  implicit class ConformancePackEvaluationFiltersMutableBuilder[Self <: ConformancePackEvaluationFilters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComplianceType(value: ConformancePackComplianceType): Self = StObject.set(x, "ComplianceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComplianceTypeUndefined: Self = StObject.set(x, "ComplianceType", js.undefined)
    
    @scala.inline
    def setConfigRuleNames(value: ConformancePackConfigRuleNames): Self = StObject.set(x, "ConfigRuleNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigRuleNamesUndefined: Self = StObject.set(x, "ConfigRuleNames", js.undefined)
    
    @scala.inline
    def setConfigRuleNamesVarargs(value: StringWithCharLimit64*): Self = StObject.set(x, "ConfigRuleNames", js.Array(value :_*))
    
    @scala.inline
    def setResourceIds(value: ConformancePackComplianceResourceIds): Self = StObject.set(x, "ResourceIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceIdsUndefined: Self = StObject.set(x, "ResourceIds", js.undefined)
    
    @scala.inline
    def setResourceIdsVarargs(value: StringWithCharLimit256*): Self = StObject.set(x, "ResourceIds", js.Array(value :_*))
    
    @scala.inline
    def setResourceType(value: StringWithCharLimit256): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceTypeUndefined: Self = StObject.set(x, "ResourceType", js.undefined)
  }
}
