package typings.atBlueprintjsCore.libEsmComponentsContextDashMenuContextMenuTargetMod

import typings.react.NativeMouseEvent
import typings.react.reactMod.Component
import typings.react.reactMod.Global.JSXNs.Element
import typings.react.reactMod.MouseEvent
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IContextMenuTargetComponent
  extends Component[js.Object, js.Object, js.Any] {
  var onContextMenuClose: js.UndefOr[js.Function0[Unit]] = js.native
  def renderContextMenu(e: MouseEvent[HTMLElement, NativeMouseEvent]): js.UndefOr[Element] = js.native
}

