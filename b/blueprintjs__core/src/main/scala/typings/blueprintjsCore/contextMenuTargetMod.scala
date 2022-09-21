package typings.blueprintjsCore

import typings.blueprintjsCore.anon.Instantiable
import typings.blueprintjsCore.constructorMod.IConstructor
import typings.react.mod.Component
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object contextMenuTargetMod {
  
  @JSImport("@blueprintjs/core/lib/esm/components/context-menu/contextMenuTarget", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ContextMenuTarget[T /* <: IConstructor[IContextMenuTargetComponent] */](WrappedComponent: T): Instantiable & T = ^.asInstanceOf[js.Dynamic].applyDynamic("ContextMenuTarget")(WrappedComponent.asInstanceOf[js.Any]).asInstanceOf[Instantiable & T]
  
  @js.native
  trait IContextMenuTargetComponent
    extends Component[js.Object, js.Object, Any] {
    
    var onContextMenuClose: js.UndefOr[js.Function0[Unit]] = js.native
    
    def renderContextMenu(e: MouseEvent[HTMLElement, NativeMouseEvent]): js.UndefOr[Element] = js.native
  }
}
