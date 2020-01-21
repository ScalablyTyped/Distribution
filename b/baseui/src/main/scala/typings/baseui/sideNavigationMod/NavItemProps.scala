package typings.baseui.sideNavigationMod

import typings.baseui.AnonEventItemAnyKeyboardEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavItemProps extends js.Object {
  @JSName("$active")
  var $active: js.UndefOr[Boolean] = js.native
  @JSName("$level")
  var $level: js.UndefOr[Double] = js.native
  @JSName("$selectable")
  var $selectable: js.UndefOr[Boolean] = js.native
  var item: Item = js.native
  var onSelect: js.UndefOr[js.Function1[/* args */ AnonEventItemAnyKeyboardEvent, _]] = js.native
  var overrides: js.UndefOr[NavItemOverrides] = js.native
}

