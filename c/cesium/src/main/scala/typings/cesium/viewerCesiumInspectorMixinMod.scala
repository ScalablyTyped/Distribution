package typings.cesium

import typings.cesium.mod.Viewer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object viewerCesiumInspectorMixinMod {
  
  @JSImport("cesium/Source/Widgets/Viewer/viewerCesiumInspectorMixin", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(viewer: Viewer): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(viewer.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
