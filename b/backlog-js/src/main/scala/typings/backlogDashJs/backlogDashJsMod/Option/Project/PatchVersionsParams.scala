package typings.backlogDashJs.backlogDashJsMod.Option.Project

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PatchVersionsParams extends js.Object {
  var archived: js.UndefOr[Boolean] = js.undefined
  var description: js.UndefOr[String] = js.undefined
  var name: String
  var releaseDueDate: js.UndefOr[String] = js.undefined
  var startDate: js.UndefOr[String] = js.undefined
}

object PatchVersionsParams {
  @scala.inline
  def apply(
    name: String,
    archived: js.UndefOr[Boolean] = js.undefined,
    description: String = null,
    releaseDueDate: String = null,
    startDate: String = null
  ): PatchVersionsParams = {
    val __obj = js.Dynamic.literal(name = name)
    if (!js.isUndefined(archived)) __obj.updateDynamic("archived")(archived)
    if (description != null) __obj.updateDynamic("description")(description)
    if (releaseDueDate != null) __obj.updateDynamic("releaseDueDate")(releaseDueDate)
    if (startDate != null) __obj.updateDynamic("startDate")(startDate)
    __obj.asInstanceOf[PatchVersionsParams]
  }
}

