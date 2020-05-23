package typings.blueprintjsCore

import typings.blueprintjsCore.anon.Instantiable
import typings.blueprintjsCore.constructorMod.IConstructor
import typings.react.mod.Component
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/core/lib/esm/components/context-menu/contextMenuTarget", JSImport.Namespace)
@js.native
object contextMenuTargetMod extends js.Object {
  @js.native
  trait IContextMenuTargetComponent
    extends Component[js.Object, js.Object, js.Any] {
    var onContextMenuClose: js.UndefOr[js.Function0[Unit]] = js.native
    def renderContextMenu(e: MouseEvent[HTMLElement, NativeMouseEvent]): js.UndefOr[Element] = js.native
  }
  
  def ContextMenuTarget[T /* <: IConstructor[IContextMenuTargetComponent] */](WrappedComponent: T): Instantiable with T = js.native
}

