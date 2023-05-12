package typings.awsSdk.clientsVpclatticeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RuleSummary extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the rule.
    */
  var arn: js.UndefOr[RuleArn] = js.undefined
  
  /**
    * The date and time that the listener rule was created, specified in ISO-8601 format.
    */
  var createdAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The ID of the rule.
    */
  var id: js.UndefOr[RuleId] = js.undefined
  
  /**
    * Indicates whether this is the default rule. Listener rules are created when you create a listener. Each listener has a default rule for checking connection requests. 
    */
  var isDefault: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The date and time that the listener rule was last updated, specified in ISO-8601 format.
    */
  var lastUpdatedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The name of the rule.
    */
  var name: js.UndefOr[RuleName] = js.undefined
  
  /**
    *  The priority of the rule. 
    */
  var priority: js.UndefOr[RulePriority] = js.undefined
}
object RuleSummary {
  
  inline def apply(): RuleSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RuleSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RuleSummary] (val x: Self) extends AnyVal {
    
    inline def setArn(value: RuleArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    inline def setId(value: RuleId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setIsDefault(value: Boolean): Self = StObject.set(x, "isDefault", value.asInstanceOf[js.Any])
    
    inline def setIsDefaultUndefined: Self = StObject.set(x, "isDefault", js.undefined)
    
    inline def setLastUpdatedAt(value: js.Date): Self = StObject.set(x, "lastUpdatedAt", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedAtUndefined: Self = StObject.set(x, "lastUpdatedAt", js.undefined)
    
    inline def setName(value: RuleName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPriority(value: RulePriority): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
  }
}
