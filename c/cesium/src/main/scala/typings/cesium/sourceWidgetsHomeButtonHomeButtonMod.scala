package typings.cesium

import typings.cesium.mod.HomeButton
import typings.cesium.mod.Scene
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceWidgetsHomeButtonHomeButtonMod {
  
  @JSImport("cesium/Source/Widgets/HomeButton/HomeButton", JSImport.Default)
  @js.native
  open class default protected () extends HomeButton {
    def this(container: String, scene: Scene) = this()
    def this(container: Element, scene: Scene) = this()
    def this(container: String, scene: Scene, duration: Double) = this()
    def this(container: Element, scene: Scene, duration: Double) = this()
  }
}
