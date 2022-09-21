package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TopicRule extends StObject {
  
  /**
    * The actions associated with the rule.
    */
  var actions: js.UndefOr[ActionList] = js.undefined
  
  /**
    * The version of the SQL rules engine to use when evaluating the rule.
    */
  var awsIotSqlVersion: js.UndefOr[AwsIotSqlVersion] = js.undefined
  
  /**
    * The date and time the rule was created.
    */
  var createdAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The description of the rule.
    */
  var description: js.UndefOr[Description] = js.undefined
  
  /**
    * The action to perform when an error occurs.
    */
  var errorAction: js.UndefOr[Action] = js.undefined
  
  /**
    * Specifies whether the rule is disabled.
    */
  var ruleDisabled: js.UndefOr[IsDisabled] = js.undefined
  
  /**
    * The name of the rule.
    */
  var ruleName: js.UndefOr[RuleName] = js.undefined
  
  /**
    * The SQL statement used to query the topic. When using a SQL query with multiple lines, be sure to escape the newline characters.
    */
  var sql: js.UndefOr[SQL] = js.undefined
}
object TopicRule {
  
  inline def apply(): TopicRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TopicRule]
  }
  
  extension [Self <: TopicRule](x: Self) {
    
    inline def setActions(value: ActionList): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
    
    inline def setActionsVarargs(value: Action*): Self = StObject.set(x, "actions", js.Array(value*))
    
    inline def setAwsIotSqlVersion(value: AwsIotSqlVersion): Self = StObject.set(x, "awsIotSqlVersion", value.asInstanceOf[js.Any])
    
    inline def setAwsIotSqlVersionUndefined: Self = StObject.set(x, "awsIotSqlVersion", js.undefined)
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    inline def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setErrorAction(value: Action): Self = StObject.set(x, "errorAction", value.asInstanceOf[js.Any])
    
    inline def setErrorActionUndefined: Self = StObject.set(x, "errorAction", js.undefined)
    
    inline def setRuleDisabled(value: IsDisabled): Self = StObject.set(x, "ruleDisabled", value.asInstanceOf[js.Any])
    
    inline def setRuleDisabledUndefined: Self = StObject.set(x, "ruleDisabled", js.undefined)
    
    inline def setRuleName(value: RuleName): Self = StObject.set(x, "ruleName", value.asInstanceOf[js.Any])
    
    inline def setRuleNameUndefined: Self = StObject.set(x, "ruleName", js.undefined)
    
    inline def setSql(value: SQL): Self = StObject.set(x, "sql", value.asInstanceOf[js.Any])
    
    inline def setSqlUndefined: Self = StObject.set(x, "sql", js.undefined)
  }
}
