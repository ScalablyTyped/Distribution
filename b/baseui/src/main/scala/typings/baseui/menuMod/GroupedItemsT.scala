package typings.baseui.menuMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupedItemsT extends /* key */ StringDictionary[ArrayItemsT] {
  var __ungrouped: ArrayItemsT
}

object GroupedItemsT {
  @scala.inline
  def apply(__ungrouped: ArrayItemsT, StringDictionary: /* key */ StringDictionary[ArrayItemsT] = null): GroupedItemsT = {
    val __obj = js.Dynamic.literal(__ungrouped = __ungrouped.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[GroupedItemsT]
  }
}

