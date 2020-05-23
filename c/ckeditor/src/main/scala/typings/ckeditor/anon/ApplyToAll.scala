package typings.ckeditor.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApplyToAll extends js.Object {
  var applyToAll: js.UndefOr[Boolean] = js.undefined
  var priority: js.UndefOr[Double] = js.undefined
}

object ApplyToAll {
  @scala.inline
  def apply(applyToAll: js.UndefOr[Boolean] = js.undefined, priority: js.UndefOr[Double] = js.undefined): ApplyToAll = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(applyToAll)) __obj.updateDynamic("applyToAll")(applyToAll.get.asInstanceOf[js.Any])
    if (!js.isUndefined(priority)) __obj.updateDynamic("priority")(priority.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplyToAll]
  }
}

