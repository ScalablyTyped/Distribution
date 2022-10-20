package typings.bullBoard

import typings.bullBoard.anon.Queues
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUiComponentsMenuMenuMod {
  
  @JSImport("bull-board/dist/ui/components/Menu/Menu", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Menu(hasQueuesSelectedStatuses: Queues): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Menu")(hasQueuesSelectedStatuses.asInstanceOf[js.Any]).asInstanceOf[Element]
}
