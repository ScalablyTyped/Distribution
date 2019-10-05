package typings.backlogDashJs.backlogDashJsMod.Option.Project

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PostCustomFieldWithListParams extends PostCustomFieldParams {
  var allowAddItem: js.UndefOr[Boolean] = js.undefined
  var allowInput: js.UndefOr[Boolean] = js.undefined
  var items: js.UndefOr[js.Array[String]] = js.undefined
}

object PostCustomFieldWithListParams {
  @scala.inline
  def apply(
    name: String,
    typeId: FieldType,
    allowAddItem: js.UndefOr[Boolean] = js.undefined,
    allowInput: js.UndefOr[Boolean] = js.undefined,
    applicableIssueTypes: js.Array[Double] = null,
    description: String = null,
    items: js.Array[String] = null,
    required: js.UndefOr[Boolean] = js.undefined
  ): PostCustomFieldWithListParams = {
    val __obj = js.Dynamic.literal(name = name, typeId = typeId)
    if (!js.isUndefined(allowAddItem)) __obj.updateDynamic("allowAddItem")(allowAddItem)
    if (!js.isUndefined(allowInput)) __obj.updateDynamic("allowInput")(allowInput)
    if (applicableIssueTypes != null) __obj.updateDynamic("applicableIssueTypes")(applicableIssueTypes)
    if (description != null) __obj.updateDynamic("description")(description)
    if (items != null) __obj.updateDynamic("items")(items)
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required)
    __obj.asInstanceOf[PostCustomFieldWithListParams]
  }
}

