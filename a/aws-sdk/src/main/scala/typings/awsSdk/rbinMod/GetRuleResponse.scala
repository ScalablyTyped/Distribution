package typings.awsSdk.rbinMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetRuleResponse extends StObject {
  
  /**
    * The retention rule description.
    */
  var Description: js.UndefOr[typings.awsSdk.rbinMod.Description] = js.undefined
  
  /**
    * The unique ID of the retention rule.
    */
  var Identifier: js.UndefOr[RuleIdentifier] = js.undefined
  
  /**
    * Information about the resource tags used to identify resources that are retained by the retention rule.
    */
  var ResourceTags: js.UndefOr[typings.awsSdk.rbinMod.ResourceTags] = js.undefined
  
  /**
    * The resource type retained by the retention rule.
    */
  var ResourceType: js.UndefOr[typings.awsSdk.rbinMod.ResourceType] = js.undefined
  
  /**
    * Information about the retention period for which the retention rule is to retain resources.
    */
  var RetentionPeriod: js.UndefOr[typings.awsSdk.rbinMod.RetentionPeriod] = js.undefined
  
  /**
    * The state of the retention rule. Only retention rules that are in the available state retain resources.
    */
  var Status: js.UndefOr[RuleStatus] = js.undefined
}
object GetRuleResponse {
  
  inline def apply(): GetRuleResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetRuleResponse]
  }
  
  extension [Self <: GetRuleResponse](x: Self) {
    
    inline def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setIdentifier(value: RuleIdentifier): Self = StObject.set(x, "Identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "Identifier", js.undefined)
    
    inline def setResourceTags(value: ResourceTags): Self = StObject.set(x, "ResourceTags", value.asInstanceOf[js.Any])
    
    inline def setResourceTagsUndefined: Self = StObject.set(x, "ResourceTags", js.undefined)
    
    inline def setResourceTagsVarargs(value: ResourceTag*): Self = StObject.set(x, "ResourceTags", js.Array(value*))
    
    inline def setResourceType(value: ResourceType): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "ResourceType", js.undefined)
    
    inline def setRetentionPeriod(value: RetentionPeriod): Self = StObject.set(x, "RetentionPeriod", value.asInstanceOf[js.Any])
    
    inline def setRetentionPeriodUndefined: Self = StObject.set(x, "RetentionPeriod", js.undefined)
    
    inline def setStatus(value: RuleStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
