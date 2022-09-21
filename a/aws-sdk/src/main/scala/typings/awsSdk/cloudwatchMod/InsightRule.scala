package typings.awsSdk.cloudwatchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InsightRule extends StObject {
  
  /**
    * The definition of the rule, as a JSON object. The definition contains the keywords used to define contributors, the value to aggregate on if this rule returns a sum instead of a count, and the filters. For details on the valid syntax, see Contributor Insights Rule Syntax.
    */
  var Definition: InsightRuleDefinition
  
  /**
    *  An optional built-in rule that Amazon Web Services manages. 
    */
  var ManagedRule: js.UndefOr[InsightRuleIsManaged] = js.undefined
  
  /**
    * The name of the rule.
    */
  var Name: InsightRuleName
  
  /**
    * For rules that you create, this is always {"Name": "CloudWatchLogRule", "Version": 1}. For managed rules, this is {"Name": "ServiceLogRule", "Version": 1} 
    */
  var Schema: InsightRuleSchema
  
  /**
    * Indicates whether the rule is enabled or disabled.
    */
  var State: InsightRuleState
}
object InsightRule {
  
  inline def apply(
    Definition: InsightRuleDefinition,
    Name: InsightRuleName,
    Schema: InsightRuleSchema,
    State: InsightRuleState
  ): InsightRule = {
    val __obj = js.Dynamic.literal(Definition = Definition.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Schema = Schema.asInstanceOf[js.Any], State = State.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsightRule]
  }
  
  extension [Self <: InsightRule](x: Self) {
    
    inline def setDefinition(value: InsightRuleDefinition): Self = StObject.set(x, "Definition", value.asInstanceOf[js.Any])
    
    inline def setManagedRule(value: InsightRuleIsManaged): Self = StObject.set(x, "ManagedRule", value.asInstanceOf[js.Any])
    
    inline def setManagedRuleUndefined: Self = StObject.set(x, "ManagedRule", js.undefined)
    
    inline def setName(value: InsightRuleName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setSchema(value: InsightRuleSchema): Self = StObject.set(x, "Schema", value.asInstanceOf[js.Any])
    
    inline def setState(value: InsightRuleState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
  }
}
