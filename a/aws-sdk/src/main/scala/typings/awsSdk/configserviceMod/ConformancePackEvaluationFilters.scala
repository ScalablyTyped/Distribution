package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConformancePackEvaluationFilters extends js.Object {
  
  /**
    * Filters the results by compliance. The allowed values are COMPLIANT and NON_COMPLIANT.
    */
  var ComplianceType: js.UndefOr[ConformancePackComplianceType] = js.native
  
  /**
    * Filters the results by AWS Config rule names.
    */
  var ConfigRuleNames: js.UndefOr[ConformancePackConfigRuleNames] = js.native
  
  /**
    * Filters the results by resource IDs.  This is valid only when you provide resource type. If there is no resource type, you will see an error. 
    */
  var ResourceIds: js.UndefOr[ConformancePackComplianceResourceIds] = js.native
  
  /**
    * Filters the results by the resource type (for example, "AWS::EC2::Instance"). 
    */
  var ResourceType: js.UndefOr[StringWithCharLimit256] = js.native
}
object ConformancePackEvaluationFilters {
  
  @scala.inline
  def apply(): ConformancePackEvaluationFilters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConformancePackEvaluationFilters]
  }
  
  @scala.inline
  implicit class ConformancePackEvaluationFiltersOps[Self <: ConformancePackEvaluationFilters] (val x: Self) extends AnyVal {
    
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
    def setComplianceType(value: ConformancePackComplianceType): Self = this.set("ComplianceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComplianceType: Self = this.set("ComplianceType", js.undefined)
    
    @scala.inline
    def setConfigRuleNamesVarargs(value: StringWithCharLimit64*): Self = this.set("ConfigRuleNames", js.Array(value :_*))
    
    @scala.inline
    def setConfigRuleNames(value: ConformancePackConfigRuleNames): Self = this.set("ConfigRuleNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfigRuleNames: Self = this.set("ConfigRuleNames", js.undefined)
    
    @scala.inline
    def setResourceIdsVarargs(value: StringWithCharLimit256*): Self = this.set("ResourceIds", js.Array(value :_*))
    
    @scala.inline
    def setResourceIds(value: ConformancePackComplianceResourceIds): Self = this.set("ResourceIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceIds: Self = this.set("ResourceIds", js.undefined)
    
    @scala.inline
    def setResourceType(value: StringWithCharLimit256): Self = this.set("ResourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceType: Self = this.set("ResourceType", js.undefined)
  }
}
