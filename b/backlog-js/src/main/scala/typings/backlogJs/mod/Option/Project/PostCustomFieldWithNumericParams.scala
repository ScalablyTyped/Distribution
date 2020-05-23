package typings.backlogJs.mod.Option.Project

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PostCustomFieldWithNumericParams extends PostCustomFieldParams {
  var initialValue: js.UndefOr[Double] = js.undefined
  var max: js.UndefOr[Double] = js.undefined
  var min: js.UndefOr[Double] = js.undefined
  var unit: js.UndefOr[String] = js.undefined
}

object PostCustomFieldWithNumericParams {
  @scala.inline
  def apply(
    name: String,
    typeId: FieldType,
    applicableIssueTypes: js.Array[Double] = null,
    description: String = null,
    initialValue: js.UndefOr[Double] = js.undefined,
    max: js.UndefOr[Double] = js.undefined,
    min: js.UndefOr[Double] = js.undefined,
    required: js.UndefOr[Boolean] = js.undefined,
    unit: String = null
  ): PostCustomFieldWithNumericParams = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], typeId = typeId.asInstanceOf[js.Any])
    if (applicableIssueTypes != null) __obj.updateDynamic("applicableIssueTypes")(applicableIssueTypes.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(initialValue)) __obj.updateDynamic("initialValue")(initialValue.get.asInstanceOf[js.Any])
    if (!js.isUndefined(max)) __obj.updateDynamic("max")(max.get.asInstanceOf[js.Any])
    if (!js.isUndefined(min)) __obj.updateDynamic("min")(min.get.asInstanceOf[js.Any])
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required.get.asInstanceOf[js.Any])
    if (unit != null) __obj.updateDynamic("unit")(unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostCustomFieldWithNumericParams]
  }
}

