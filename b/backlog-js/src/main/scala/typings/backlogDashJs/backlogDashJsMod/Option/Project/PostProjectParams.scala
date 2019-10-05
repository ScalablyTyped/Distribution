package typings.backlogDashJs.backlogDashJsMod.Option.Project

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
    val __obj = js.Dynamic.literal(chartEnabled = chartEnabled, key = key, name = name, subtaskingEnabled = subtaskingEnabled, textFormattingRule = textFormattingRule)
    if (!js.isUndefined(projectLeaderCanEditProjectLeader)) __obj.updateDynamic("projectLeaderCanEditProjectLeader")(projectLeaderCanEditProjectLeader)
    __obj.asInstanceOf[PostProjectParams]
  }
}

