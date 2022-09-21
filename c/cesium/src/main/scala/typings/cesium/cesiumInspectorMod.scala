package typings.cesium

import typings.cesium.mod.CesiumInspector
import typings.cesium.mod.Scene
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cesiumInspectorMod {
  
  @JSImport("cesium/Source/Widgets/CesiumInspector/CesiumInspector", JSImport.Default)
  @js.native
  open class default protected () extends CesiumInspector {
    def this(container: String, scene: Scene) = this()
    def this(container: Element, scene: Scene) = this()
  }
}
