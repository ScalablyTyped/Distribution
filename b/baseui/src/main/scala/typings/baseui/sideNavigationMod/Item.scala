package typings.baseui.sideNavigationMod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Item extends js.Object {
  var itemId: js.UndefOr[String] = js.undefined
  var subNav: js.UndefOr[js.Array[Item]] = js.undefined
  var title: ReactNode
}

object Item {
  @scala.inline
  def apply(itemId: String = null, subNav: js.Array[Item] = null, title: ReactNode = null): Item = {
    val __obj = js.Dynamic.literal()
    if (itemId != null) __obj.updateDynamic("itemId")(itemId.asInstanceOf[js.Any])
    if (subNav != null) __obj.updateDynamic("subNav")(subNav.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Item]
  }
}

