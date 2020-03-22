package typings.baseui

import typings.baseui.baseuiStrings.alertdialog
import typings.baseui.baseuiStrings.auto
import typings.baseui.baseuiStrings.default_
import typings.baseui.baseuiStrings.dialog
import typings.baseui.baseuiStrings.full
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined baseui.baseui/modal.SharedStylePropsArg & {  children  :react.react.ReactNode} */
@js.native
trait SharedStylePropsArgchildrAnimate extends js.Object {
  @JSName("$animate")
  var $animate: js.UndefOr[Boolean] = js.native
  @JSName("$closeable")
  var $closeable: js.UndefOr[Boolean] = js.native
  @JSName("$isOpen")
  var $isOpen: js.UndefOr[Boolean] = js.native
  @JSName("$isVisible")
  var $isVisible: js.UndefOr[Boolean] = js.native
  @JSName("$role")
  var $role: js.UndefOr[dialog | alertdialog] = js.native
  @JSName("$size")
  var $size: js.UndefOr[default_ | full | auto] = js.native
  @JSName("$unstable_ModalBackdropScroll")
  var $unstable_ModalBackdropScroll: js.UndefOr[Boolean] = js.native
  var children: js.UndefOr[ReactNode] = js.native
}

