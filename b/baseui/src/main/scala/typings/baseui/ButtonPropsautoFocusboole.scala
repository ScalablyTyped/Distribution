package typings.baseui

import typings.baseui.baseuiStrings.button
import typings.baseui.baseuiStrings.compact
import typings.baseui.baseuiStrings.default_
import typings.baseui.baseuiStrings.large_
import typings.baseui.baseuiStrings.mini
import typings.baseui.baseuiStrings.minimal
import typings.baseui.baseuiStrings.pill
import typings.baseui.baseuiStrings.primary
import typings.baseui.baseuiStrings.reset
import typings.baseui.baseuiStrings.round
import typings.baseui.baseuiStrings.secondary
import typings.baseui.baseuiStrings.square
import typings.baseui.baseuiStrings.submit
import typings.baseui.baseuiStrings.tertiary
import typings.baseui.buttonMod.ButtonOverrides
import typings.baseui.buttonMod.ButtonProps
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.std.HTMLButtonElement
import typings.styletronReact.mod.StyleProp
import typings.styletronReact.mod.StyletronBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined baseui.baseui/button.ButtonProps & {  autoFocus ? :boolean} */
@js.native
trait ButtonPropsautoFocusboole extends js.Object {
  @JSName("$as")
  var $as: js.UndefOr[StyletronBase] = js.native
  @JSName("$style")
  var $style: js.UndefOr[StyleProp[ButtonProps]] = js.native
  var autoFocus: js.UndefOr[Boolean] = js.native
  var children: js.UndefOr[ReactNode] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var endEnhancer: js.UndefOr[ReactNode] = js.native
  var href: js.UndefOr[String] = js.native
  var isLoading: js.UndefOr[Boolean] = js.native
  var isSelected: js.UndefOr[Boolean] = js.native
  var kind: js.UndefOr[primary | secondary | tertiary | minimal] = js.native
  var onClick: js.UndefOr[js.Function1[/* event */ MouseEvent[HTMLButtonElement, NativeMouseEvent], _]] = js.native
  var overrides: js.UndefOr[ButtonOverrides] = js.native
  var shape: js.UndefOr[default_ | pill | round | square] = js.native
  var size: js.UndefOr[compact | default_ | large_ | mini] = js.native
  var startEnhancer: js.UndefOr[ReactNode] = js.native
  var target: js.UndefOr[String] = js.native
  var `type`: js.UndefOr[submit | reset | button] = js.native
}

