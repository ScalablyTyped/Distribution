package typings
package baseuiLib.ratingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RatingOverrides extends js.Object {
  var Item: js.UndefOr[baseuiLib.Override[_]] = js.undefined
  var Root: js.UndefOr[baseuiLib.Override[_]] = js.undefined
}

object RatingOverrides {
  @scala.inline
  def apply(Item: baseuiLib.Override[_] = null, Root: baseuiLib.Override[_] = null): RatingOverrides = {
    val __obj = js.Dynamic.literal()
    if (Item != null) __obj.updateDynamic("Item")(Item.asInstanceOf[js.Any])
    if (Root != null) __obj.updateDynamic("Root")(Root.asInstanceOf[js.Any])
    __obj.asInstanceOf[RatingOverrides]
  }
}

