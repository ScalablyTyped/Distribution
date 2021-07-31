package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TopicRulePayload extends StObject {
  
  /**
    * The actions associated with the rule.
    */
  var actions: ActionList
  
  /**
    * The version of the SQL rules engine to use when evaluating the rule.
    */
  var awsIotSqlVersion: js.UndefOr[AwsIotSqlVersion] = js.undefined
  
  /**
    * The description of the rule.
    */
  var description: js.UndefOr[Description] = js.undefined
  
  /**
    * The action to take when an error occurs.
    */
  var errorAction: js.UndefOr[Action] = js.undefined
  
  /**
    * Specifies whether the rule is disabled.
    */
  var ruleDisabled: js.UndefOr[IsDisabled] = js.undefined
  
  /**
    * The SQL statement used to query the topic. For more information, see AWS IoT SQL Reference in the AWS IoT Developer Guide.
    */
  var sql: SQL
}
object TopicRulePayload {
  
  @scala.inline
  def apply(actions: ActionList, sql: SQL): TopicRulePayload = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], sql = sql.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopicRulePayload]
  }
  
  @scala.inline
  implicit class TopicRulePayloadMutableBuilder[Self <: TopicRulePayload] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActions(value: ActionList): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionsVarargs(value: Action*): Self = StObject.set(x, "actions", js.Array(value :_*))
    
    @scala.inline
    def setAwsIotSqlVersion(value: AwsIotSqlVersion): Self = StObject.set(x, "awsIotSqlVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAwsIotSqlVersionUndefined: Self = StObject.set(x, "awsIotSqlVersion", js.undefined)
    
    @scala.inline
    def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setErrorAction(value: Action): Self = StObject.set(x, "errorAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorActionUndefined: Self = StObject.set(x, "errorAction", js.undefined)
    
    @scala.inline
    def setRuleDisabled(value: IsDisabled): Self = StObject.set(x, "ruleDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleDisabledUndefined: Self = StObject.set(x, "ruleDisabled", js.undefined)
    
    @scala.inline
    def setSql(value: SQL): Self = StObject.set(x, "sql", value.asInstanceOf[js.Any])
  }
}
