package typings.cesium

import typings.cesium.mod.Scene
import typings.cesium.mod.SceneModePicker
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sceneModePickerMod {
  
  @JSImport("cesium/Source/Widgets/SceneModePicker/SceneModePicker", JSImport.Default)
  @js.native
  open class default protected () extends SceneModePicker {
    def this(container: String, scene: Scene) = this()
    def this(container: Element, scene: Scene) = this()
    def this(container: String, scene: Scene, duration: Double) = this()
    def this(container: Element, scene: Scene, duration: Double) = this()
  }
}
