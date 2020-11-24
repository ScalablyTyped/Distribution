package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TopicRulePayload extends js.Object {
  
  /**
    * The actions associated with the rule.
    */
  var actions: ActionList = js.native
  
  /**
    * The version of the SQL rules engine to use when evaluating the rule.
    */
  var awsIotSqlVersion: js.UndefOr[AwsIotSqlVersion] = js.native
  
  /**
    * The description of the rule.
    */
  var description: js.UndefOr[Description] = js.native
  
  /**
    * The action to take when an error occurs.
    */
  var errorAction: js.UndefOr[Action] = js.native
  
  /**
    * Specifies whether the rule is disabled.
    */
  var ruleDisabled: js.UndefOr[IsDisabled] = js.native
  
  /**
    * The SQL statement used to query the topic. For more information, see AWS IoT SQL Reference in the AWS IoT Developer Guide.
    */
  var sql: SQL = js.native
}
object TopicRulePayload {
  
  @scala.inline
  def apply(actions: ActionList, sql: SQL): TopicRulePayload = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], sql = sql.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopicRulePayload]
  }
  
  @scala.inline
  implicit class TopicRulePayloadOps[Self <: TopicRulePayload] (val x: Self) extends AnyVal {
    
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
    def setActionsVarargs(value: Action*): Self = this.set("actions", js.Array(value :_*))
    
    @scala.inline
    def setActions(value: ActionList): Self = this.set("actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSql(value: SQL): Self = this.set("sql", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAwsIotSqlVersion(value: AwsIotSqlVersion): Self = this.set("awsIotSqlVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAwsIotSqlVersion: Self = this.set("awsIotSqlVersion", js.undefined)
    
    @scala.inline
    def setDescription(value: Description): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setErrorAction(value: Action): Self = this.set("errorAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorAction: Self = this.set("errorAction", js.undefined)
    
    @scala.inline
    def setRuleDisabled(value: IsDisabled): Self = this.set("ruleDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRuleDisabled: Self = this.set("ruleDisabled", js.undefined)
  }
}
