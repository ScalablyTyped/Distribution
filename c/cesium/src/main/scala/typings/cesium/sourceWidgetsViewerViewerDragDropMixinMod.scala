package typings.cesium

import typings.cesium.anon.ClearOnDrop
import typings.cesium.mod.Viewer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceWidgetsViewerViewerDragDropMixinMod {
  
  @JSImport("cesium/Source/Widgets/Viewer/viewerDragDropMixin", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(viewer: Viewer): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(viewer.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def default(viewer: Viewer, options: ClearOnDrop): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(viewer.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
