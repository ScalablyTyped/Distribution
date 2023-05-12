package typings.blueprintjsPopover2

import typings.blueprintjsPopover2.anon.OmitContextMenu2PopoverPr
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmContextMenu2SingletonMod {
  
  @JSImport("@blueprintjs/popover2/lib/esm/contextMenu2Singleton", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def hideContextMenu(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("hideContextMenu")().asInstanceOf[Unit]
  
  inline def showContextMenu(props: OmitContextMenu2PopoverPr): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("showContextMenu")(props.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
