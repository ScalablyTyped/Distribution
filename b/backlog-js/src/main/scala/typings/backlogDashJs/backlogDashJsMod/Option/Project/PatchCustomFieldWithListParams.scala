package typings.backlogDashJs.backlogDashJsMod.Option.Project

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PatchCustomFieldWithListParams extends PatchCustomFieldParams {
  var allowAddItem: js.UndefOr[Boolean] = js.undefined
  var allowInput: js.UndefOr[Boolean] = js.undefined
  var items: js.UndefOr[js.Array[String]] = js.undefined
}

object PatchCustomFieldWithListParams {
  @scala.inline
  def apply(
    allowAddItem: js.UndefOr[Boolean] = js.undefined,
    allowInput: js.UndefOr[Boolean] = js.undefined,
    applicableIssueTypes: js.Array[Double] = null,
    description: String = null,
    items: js.Array[String] = null,
    name: String = null,
    required: js.UndefOr[Boolean] = js.undefined
  ): PatchCustomFieldWithListParams = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowAddItem)) __obj.updateDynamic("allowAddItem")(allowAddItem)
    if (!js.isUndefined(allowInput)) __obj.updateDynamic("allowInput")(allowInput)
    if (applicableIssueTypes != null) __obj.updateDynamic("applicableIssueTypes")(applicableIssueTypes)
    if (description != null) __obj.updateDynamic("description")(description)
    if (items != null) __obj.updateDynamic("items")(items)
    if (name != null) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required)
    __obj.asInstanceOf[PatchCustomFieldWithListParams]
  }
}

