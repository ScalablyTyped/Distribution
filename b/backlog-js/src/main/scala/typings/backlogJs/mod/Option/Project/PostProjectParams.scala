package typings.backlogJs.mod.Option.Project

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PostProjectParams extends js.Object {
  var chartEnabled: Boolean
  var key: String
  var name: String
  var projectLeaderCanEditProjectLeader: js.UndefOr[Boolean] = js.undefined
  var subtaskingEnabled: Boolean
  var textFormattingRule: TextFormattingRule
}

object PostProjectParams {
  @scala.inline
  def apply(
    chartEnabled: Boolean,
    key: String,
    name: String,
    subtaskingEnabled: Boolean,
    textFormattingRule: TextFormattingRule,
    projectLeaderCanEditProjectLeader: js.UndefOr[Boolean] = js.undefined
  ): PostProjectParams = {
    val __obj = js.Dynamic.literal(chartEnabled = chartEnabled.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], subtaskingEnabled = subtaskingEnabled.asInstanceOf[js.Any], textFormattingRule = textFormattingRule.asInstanceOf[js.Any])
    if (!js.isUndefined(projectLeaderCanEditProjectLeader)) __obj.updateDynamic("projectLeaderCanEditProjectLeader")(projectLeaderCanEditProjectLeader.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostProjectParams]
  }
}

