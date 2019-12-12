package typings.baseui.tabsMod

import typings.baseui.baseuiStrings.horizontal
import typings.baseui.baseuiStrings.vertical
import typings.react.reactMod.Key
import typings.react.reactMod.ReactNode
import typings.std.Event
import typings.std.KeyboardEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TabProps extends js.Object {
  @JSName("$orientation")
  var $orientation: js.UndefOr[horizontal | vertical] = js.native
  var active: js.UndefOr[Boolean] = js.native
  var children: js.UndefOr[ReactNode] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var id: js.UndefOr[String] = js.native
  var key: js.UndefOr[Key] = js.native
  var onClick: js.UndefOr[js.Function1[/* e */ Event, _]] = js.native
  var onKeyDown: js.UndefOr[js.Function1[/* e */ KeyboardEvent, _]] = js.native
  var onSelect: js.UndefOr[js.Function0[_]] = js.native
  var overrides: js.UndefOr[TabOverrides[SharedProps]] = js.native
  var title: js.UndefOr[ReactNode] = js.native
}

