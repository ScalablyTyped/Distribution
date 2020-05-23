package typings.backlogJs.mod.Option.Project

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
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], typeId = typeId.asInstanceOf[js.Any])
    if (!js.isUndefined(allowAddItem)) __obj.updateDynamic("allowAddItem")(allowAddItem.get.asInstanceOf[js.Any])
    if (!js.isUndefined(allowInput)) __obj.updateDynamic("allowInput")(allowInput.get.asInstanceOf[js.Any])
    if (applicableIssueTypes != null) __obj.updateDynamic("applicableIssueTypes")(applicableIssueTypes.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostCustomFieldWithListParams]
  }
}

