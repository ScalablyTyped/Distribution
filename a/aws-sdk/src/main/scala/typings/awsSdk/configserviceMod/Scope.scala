package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Scope extends js.Object {
  
  /**
    * The ID of the only AWS resource that you want to trigger an evaluation for the rule. If you specify a resource ID, you must specify one resource type for ComplianceResourceTypes.
    */
  var ComplianceResourceId: js.UndefOr[BaseResourceId] = js.native
  
  /**
    * The resource types of only those AWS resources that you want to trigger an evaluation for the rule. You can only specify one type if you also specify a resource ID for ComplianceResourceId.
    */
  var ComplianceResourceTypes: js.UndefOr[typings.awsSdk.configserviceMod.ComplianceResourceTypes] = js.native
  
  /**
    * The tag key that is applied to only those AWS resources that you want to trigger an evaluation for the rule.
    */
  var TagKey: js.UndefOr[StringWithCharLimit128] = js.native
  
  /**
    * The tag value applied to only those AWS resources that you want to trigger an evaluation for the rule. If you specify a value for TagValue, you must also specify a value for TagKey.
    */
  var TagValue: js.UndefOr[StringWithCharLimit256] = js.native
}
object Scope {
  
  @scala.inline
  def apply(): Scope = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Scope]
  }
  
  @scala.inline
  implicit class ScopeOps[Self <: Scope] (val x: Self) extends AnyVal {
    
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
    def setComplianceResourceId(value: BaseResourceId): Self = this.set("ComplianceResourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComplianceResourceId: Self = this.set("ComplianceResourceId", js.undefined)
    
    @scala.inline
    def setComplianceResourceTypesVarargs(value: StringWithCharLimit256*): Self = this.set("ComplianceResourceTypes", js.Array(value :_*))
    
    @scala.inline
    def setComplianceResourceTypes(value: ComplianceResourceTypes): Self = this.set("ComplianceResourceTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComplianceResourceTypes: Self = this.set("ComplianceResourceTypes", js.undefined)
    
    @scala.inline
    def setTagKey(value: StringWithCharLimit128): Self = this.set("TagKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTagKey: Self = this.set("TagKey", js.undefined)
    
    @scala.inline
    def setTagValue(value: StringWithCharLimit256): Self = this.set("TagValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTagValue: Self = this.set("TagValue", js.undefined)
  }
}
