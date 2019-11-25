package typings.backlogDashJs.backlogDashJsMod.Option.Project

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PatchCustomFieldParams extends js.Object {
  var applicableIssueTypes: js.UndefOr[js.Array[Double]] = js.undefined
  var description: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var required: js.UndefOr[Boolean] = js.undefined
}

object PatchCustomFieldParams {
  @scala.inline
  def apply(
    applicableIssueTypes: js.Array[Double] = null,
    description: String = null,
    name: String = null,
    required: js.UndefOr[Boolean] = js.undefined
  ): PatchCustomFieldParams = {
    val __obj = js.Dynamic.literal()
    if (applicableIssueTypes != null) __obj.updateDynamic("applicableIssueTypes")(applicableIssueTypes.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required.asInstanceOf[js.Any])
    __obj.asInstanceOf[PatchCustomFieldParams]
  }
}

