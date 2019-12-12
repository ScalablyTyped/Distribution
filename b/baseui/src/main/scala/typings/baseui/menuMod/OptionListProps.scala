package typings.baseui.menuMod

import typings.baseui.Anon_ListItem
import typings.baseui.baseuiStrings.compact
import typings.baseui.baseuiStrings.default_
import typings.react.reactMod.ReactNode
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptionListProps extends js.Object {
  @JSName("$isFocused")
  var $isFocused: js.UndefOr[Boolean] = js.native
  @JSName("$isHighlighted")
  var $isHighlighted: js.UndefOr[Boolean] = js.native
  var getChildMenu: js.UndefOr[js.Function1[/* item */ js.Any, ReactNode]] = js.native
  var item: js.Any = js.native
  var onMouseEnter: js.UndefOr[js.Function1[/* event */ MouseEvent, _]] = js.native
  var overrides: js.UndefOr[Anon_ListItem] = js.native
  var resetMenu: js.UndefOr[js.Function0[Unit]] = js.native
  var size: js.UndefOr[default_ | compact] = js.native
  def getItemLabel(item: js.Any): ReactNode = js.native
}

