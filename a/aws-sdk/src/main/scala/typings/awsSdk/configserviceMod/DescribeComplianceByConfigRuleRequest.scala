package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeComplianceByConfigRuleRequest extends js.Object {
  
  /**
    * Filters the results by compliance. The allowed values are COMPLIANT and NON_COMPLIANT.
    */
  var ComplianceTypes: js.UndefOr[typings.awsSdk.configserviceMod.ComplianceTypes] = js.native
  
  /**
    * Specify one or more AWS Config rule names to filter the results by rule.
    */
  var ConfigRuleNames: js.UndefOr[typings.awsSdk.configserviceMod.ConfigRuleNames] = js.native
  
  /**
    * The nextToken string returned on a previous page that you use to get the next page of results in a paginated response.
    */
  var NextToken: js.UndefOr[String] = js.native
}
object DescribeComplianceByConfigRuleRequest {
  
  @scala.inline
  def apply(): DescribeComplianceByConfigRuleRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeComplianceByConfigRuleRequest]
  }
  
  @scala.inline
  implicit class DescribeComplianceByConfigRuleRequestOps[Self <: DescribeComplianceByConfigRuleRequest] (val x: Self) extends AnyVal {
    
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
    def setComplianceTypesVarargs(value: ComplianceType*): Self = this.set("ComplianceTypes", js.Array(value :_*))
    
    @scala.inline
    def setComplianceTypes(value: ComplianceTypes): Self = this.set("ComplianceTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComplianceTypes: Self = this.set("ComplianceTypes", js.undefined)
    
    @scala.inline
    def setConfigRuleNamesVarargs(value: ConfigRuleName*): Self = this.set("ConfigRuleNames", js.Array(value :_*))
    
    @scala.inline
    def setConfigRuleNames(value: ConfigRuleNames): Self = this.set("ConfigRuleNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfigRuleNames: Self = this.set("ConfigRuleNames", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
