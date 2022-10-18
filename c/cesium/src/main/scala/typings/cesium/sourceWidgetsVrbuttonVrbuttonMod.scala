package typings.cesium

import typings.cesium.mod.Scene
import typings.cesium.mod.VRButton
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceWidgetsVrbuttonVrbuttonMod {
  
  @JSImport("cesium/Source/Widgets/VRButton/VRButton", JSImport.Default)
  @js.native
  open class default protected () extends VRButton {
    def this(container: String, scene: Scene) = this()
    def this(container: Element, scene: Scene) = this()
    def this(container: String, scene: Scene, vrElement: String) = this()
    def this(container: String, scene: Scene, vrElement: Element) = this()
    def this(container: Element, scene: Scene, vrElement: String) = this()
    def this(container: Element, scene: Scene, vrElement: Element) = this()
  }
}
