package typings
package baseuiLib.sideDashNavigationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Item extends js.Object {
  var itemId: js.UndefOr[java.lang.String] = js.undefined
  var subNav: js.UndefOr[js.Array[Item]] = js.undefined
  var title: reactLib.reactMod.ReactNode
}

object Item {
  @scala.inline
  def apply(title: reactLib.reactMod.ReactNode, itemId: java.lang.String = null, subNav: js.Array[Item] = null): Item = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    if (itemId != null) __obj.updateDynamic("itemId")(itemId)
    if (subNav != null) __obj.updateDynamic("subNav")(subNav)
    __obj.asInstanceOf[Item]
  }
}

