package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(
    actions: ActionList,
    sql: SQL,
    awsIotSqlVersion: AwsIotSqlVersion = null,
    description: Description = null,
    errorAction: Action = null,
    ruleDisabled: js.UndefOr[IsDisabled] = js.undefined
  ): TopicRulePayload = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], sql = sql.asInstanceOf[js.Any])
    if (awsIotSqlVersion != null) __obj.updateDynamic("awsIotSqlVersion")(awsIotSqlVersion.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (errorAction != null) __obj.updateDynamic("errorAction")(errorAction.asInstanceOf[js.Any])
    if (!js.isUndefined(ruleDisabled)) __obj.updateDynamic("ruleDisabled")(ruleDisabled.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopicRulePayload]
  }
}

