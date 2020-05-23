package typings.backlogJs.mod.Option.Project

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PostCustomFieldWithDateParams extends PostCustomFieldParams {
  var initialDate: js.UndefOr[String] = js.undefined
  var initialShift: js.UndefOr[Double] = js.undefined
  var initialValueType: js.UndefOr[Double] = js.undefined
  var max: js.UndefOr[String] = js.undefined
  var min: js.UndefOr[String] = js.undefined
}

object PostCustomFieldWithDateParams {
  @scala.inline
  def apply(
    name: String,
    typeId: FieldType,
    applicableIssueTypes: js.Array[Double] = null,
    description: String = null,
    initialDate: String = null,
    initialShift: js.UndefOr[Double] = js.undefined,
    initialValueType: js.UndefOr[Double] = js.undefined,
    max: String = null,
    min: String = null,
    required: js.UndefOr[Boolean] = js.undefined
  ): PostCustomFieldWithDateParams = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], typeId = typeId.asInstanceOf[js.Any])
    if (applicableIssueTypes != null) __obj.updateDynamic("applicableIssueTypes")(applicableIssueTypes.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (initialDate != null) __obj.updateDynamic("initialDate")(initialDate.asInstanceOf[js.Any])
    if (!js.isUndefined(initialShift)) __obj.updateDynamic("initialShift")(initialShift.get.asInstanceOf[js.Any])
    if (!js.isUndefined(initialValueType)) __obj.updateDynamic("initialValueType")(initialValueType.get.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostCustomFieldWithDateParams]
  }
}

