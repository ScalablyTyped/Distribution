package typings.backlogDashJs.backlogDashJsMod.Option.Project

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PatchProjectParams extends js.Object {
  var archived: js.UndefOr[Boolean] = js.undefined
  var chartEnabled: js.UndefOr[Boolean] = js.undefined
  var key: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var projectLeaderCanEditProjectLeader: js.UndefOr[Boolean] = js.undefined
  var subtaskingEnabled: js.UndefOr[Boolean] = js.undefined
  var textFormattingRule: js.UndefOr[TextFormattingRule] = js.undefined
}

object PatchProjectParams {
  @scala.inline
  def apply(
    archived: js.UndefOr[Boolean] = js.undefined,
    chartEnabled: js.UndefOr[Boolean] = js.undefined,
    key: String = null,
    name: String = null,
    projectLeaderCanEditProjectLeader: js.UndefOr[Boolean] = js.undefined,
    subtaskingEnabled: js.UndefOr[Boolean] = js.undefined,
    textFormattingRule: TextFormattingRule = null
  ): PatchProjectParams = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(archived)) __obj.updateDynamic("archived")(archived.asInstanceOf[js.Any])
    if (!js.isUndefined(chartEnabled)) __obj.updateDynamic("chartEnabled")(chartEnabled.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(projectLeaderCanEditProjectLeader)) __obj.updateDynamic("projectLeaderCanEditProjectLeader")(projectLeaderCanEditProjectLeader.asInstanceOf[js.Any])
    if (!js.isUndefined(subtaskingEnabled)) __obj.updateDynamic("subtaskingEnabled")(subtaskingEnabled.asInstanceOf[js.Any])
    if (textFormattingRule != null) __obj.updateDynamic("textFormattingRule")(textFormattingRule.asInstanceOf[js.Any])
    __obj.asInstanceOf[PatchProjectParams]
  }
}

