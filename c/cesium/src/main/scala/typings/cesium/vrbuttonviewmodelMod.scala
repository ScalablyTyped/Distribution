package typings.cesium

import typings.cesium.mod.Scene
import typings.cesium.mod.VRButtonViewModel
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object vrbuttonviewmodelMod {
  
  @JSImport("cesium/Source/Widgets/VRButton/VRButtonViewModel", JSImport.Default)
  @js.native
  open class default protected () extends VRButtonViewModel {
    def this(scene: Scene) = this()
    def this(scene: Scene, vrElement: String) = this()
    def this(scene: Scene, vrElement: Element) = this()
  }
}
