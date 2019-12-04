package typings.atBlueprintjsCore

import typings.atBlueprintjsCore.libEsmCommonConstructorMod.IConstructor
import typings.atBlueprintjsCore.libEsmComponentsContextDashMenuContextMenuTargetMod.IContextMenuTargetComponent
import typings.react.reactMod.Component
import typings.react.reactMod.MouseEvent
import typings.react.reactMod.NativeMouseEvent
import typings.react.reactMod._Global_.JSX.Element
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/core/lib/esm/components/context-menu/contextMenuTarget", JSImport.Namespace)
@js.native
object libEsmComponentsContextDashMenuContextMenuTargetMod extends js.Object {
  @js.native
  trait IContextMenuTargetComponent
    extends Component[js.Object, js.Object, js.Any] {
    var onContextMenuClose: js.UndefOr[js.Function0[Unit]] = js.native
    def renderContextMenu(e: MouseEvent[HTMLElement, NativeMouseEvent]): js.UndefOr[Element] = js.native
  }
  
  def ContextMenuTarget[T /* <: IConstructor[IContextMenuTargetComponent] */](WrappedComponent: T): Anon_Args with T = js.native
}

