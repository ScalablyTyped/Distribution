package typings.backlogDashJs.backlogDashJsMod.Option.Project

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetProjectsParams extends js.Object {
  var all: js.UndefOr[Boolean] = js.undefined
  var archived: js.UndefOr[Boolean] = js.undefined
}

object GetProjectsParams {
  @scala.inline
  def apply(all: js.UndefOr[Boolean] = js.undefined, archived: js.UndefOr[Boolean] = js.undefined): GetProjectsParams = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(all)) __obj.updateDynamic("all")(all)
    if (!js.isUndefined(archived)) __obj.updateDynamic("archived")(archived)
    __obj.asInstanceOf[GetProjectsParams]
  }
}

