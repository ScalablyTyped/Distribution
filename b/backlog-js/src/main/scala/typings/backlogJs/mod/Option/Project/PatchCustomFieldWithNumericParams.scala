package typings.backlogJs.mod.Option.Project

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PatchCustomFieldWithNumericParams extends PatchCustomFieldParams {
  var initialValue: js.UndefOr[Double] = js.undefined
  var max: js.UndefOr[Double] = js.undefined
  var min: js.UndefOr[Double] = js.undefined
  var unit: js.UndefOr[String] = js.undefined
}

object PatchCustomFieldWithNumericParams {
  @scala.inline
  def apply(
    applicableIssueTypes: js.Array[Double] = null,
    description: String = null,
    initialValue: Int | Double = null,
    max: Int | Double = null,
    min: Int | Double = null,
    name: String = null,
    required: js.UndefOr[Boolean] = js.undefined,
    unit: String = null
  ): PatchCustomFieldWithNumericParams = {
    val __obj = js.Dynamic.literal()
    if (applicableIssueTypes != null) __obj.updateDynamic("applicableIssueTypes")(applicableIssueTypes.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (initialValue != null) __obj.updateDynamic("initialValue")(initialValue.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required.asInstanceOf[js.Any])
    if (unit != null) __obj.updateDynamic("unit")(unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[PatchCustomFieldWithNumericParams]
  }
}

