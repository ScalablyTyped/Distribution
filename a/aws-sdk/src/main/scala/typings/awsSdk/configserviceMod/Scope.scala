package typings.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Scope extends StObject {
  
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
  implicit class ScopeMutableBuilder[Self <: Scope] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComplianceResourceId(value: BaseResourceId): Self = StObject.set(x, "ComplianceResourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComplianceResourceIdUndefined: Self = StObject.set(x, "ComplianceResourceId", js.undefined)
    
    @scala.inline
    def setComplianceResourceTypes(value: ComplianceResourceTypes): Self = StObject.set(x, "ComplianceResourceTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComplianceResourceTypesUndefined: Self = StObject.set(x, "ComplianceResourceTypes", js.undefined)
    
    @scala.inline
    def setComplianceResourceTypesVarargs(value: StringWithCharLimit256*): Self = StObject.set(x, "ComplianceResourceTypes", js.Array(value :_*))
    
    @scala.inline
    def setTagKey(value: StringWithCharLimit128): Self = StObject.set(x, "TagKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagKeyUndefined: Self = StObject.set(x, "TagKey", js.undefined)
    
    @scala.inline
    def setTagValue(value: StringWithCharLimit256): Self = StObject.set(x, "TagValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagValueUndefined: Self = StObject.set(x, "TagValue", js.undefined)
  }
}
