package typings.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeComplianceByConfigRuleRequest extends StObject {
  
  /**
    * Filters the results by compliance. The allowed values are COMPLIANT and NON_COMPLIANT.
    */
  var ComplianceTypes: js.UndefOr[typings.awsSdk.configserviceMod.ComplianceTypes] = js.undefined
  
  /**
    * Specify one or more AWS Config rule names to filter the results by rule.
    */
  var ConfigRuleNames: js.UndefOr[typings.awsSdk.configserviceMod.ConfigRuleNames] = js.undefined
  
  /**
    * The nextToken string returned on a previous page that you use to get the next page of results in a paginated response.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object DescribeComplianceByConfigRuleRequest {
  
  @scala.inline
  def apply(): DescribeComplianceByConfigRuleRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeComplianceByConfigRuleRequest]
  }
  
  @scala.inline
  implicit class DescribeComplianceByConfigRuleRequestMutableBuilder[Self <: DescribeComplianceByConfigRuleRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComplianceTypes(value: ComplianceTypes): Self = StObject.set(x, "ComplianceTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComplianceTypesUndefined: Self = StObject.set(x, "ComplianceTypes", js.undefined)
    
    @scala.inline
    def setComplianceTypesVarargs(value: ComplianceType*): Self = StObject.set(x, "ComplianceTypes", js.Array(value :_*))
    
    @scala.inline
    def setConfigRuleNames(value: ConfigRuleNames): Self = StObject.set(x, "ConfigRuleNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigRuleNamesUndefined: Self = StObject.set(x, "ConfigRuleNames", js.undefined)
    
    @scala.inline
    def setConfigRuleNamesVarargs(value: ConfigRuleName*): Self = StObject.set(x, "ConfigRuleNames", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
