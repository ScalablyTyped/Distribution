package typings.backlogDashJs.backlogDashJsMod.Option.Project

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PostCustomFieldParams extends js.Object {
  var applicableIssueTypes: js.UndefOr[js.Array[Double]] = js.undefined
  var description: js.UndefOr[String] = js.undefined
  var name: String
  var required: js.UndefOr[Boolean] = js.undefined
  var typeId: FieldType
}

object PostCustomFieldParams {
  @scala.inline
  def apply(
    name: String,
    typeId: FieldType,
    applicableIssueTypes: js.Array[Double] = null,
    description: String = null,
    required: js.UndefOr[Boolean] = js.undefined
  ): PostCustomFieldParams = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], typeId = typeId.asInstanceOf[js.Any])
    if (applicableIssueTypes != null) __obj.updateDynamic("applicableIssueTypes")(applicableIssueTypes.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostCustomFieldParams]
  }
}

