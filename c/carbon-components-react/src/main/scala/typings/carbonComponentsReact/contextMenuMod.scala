package typings.carbonComponentsReact

import typings.carbonComponentsReact.useContextMenuMod.UseContextMenuResult
import typings.std.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object contextMenuMod {
  
  @JSImport("carbon-components-react/lib/components/ContextMenu", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useContextMenu(trigger: EventTarget): UseContextMenuResult = ^.asInstanceOf[js.Dynamic].applyDynamic("useContextMenu")(trigger.asInstanceOf[js.Any]).asInstanceOf[UseContextMenuResult]
}
