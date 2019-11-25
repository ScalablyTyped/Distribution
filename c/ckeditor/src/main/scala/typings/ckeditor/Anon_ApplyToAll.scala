package typings.ckeditor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ApplyToAll extends js.Object {
  var applyToAll: js.UndefOr[Boolean] = js.undefined
  var priority: js.UndefOr[Double] = js.undefined
}

object Anon_ApplyToAll {
  @scala.inline
  def apply(applyToAll: js.UndefOr[Boolean] = js.undefined, priority: Int | Double = null): Anon_ApplyToAll = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(applyToAll)) __obj.updateDynamic("applyToAll")(applyToAll.asInstanceOf[js.Any])
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ApplyToAll]
  }
}

