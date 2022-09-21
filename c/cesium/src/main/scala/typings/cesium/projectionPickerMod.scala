package typings.cesium

import typings.cesium.mod.ProjectionPicker
import typings.cesium.mod.Scene
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object projectionPickerMod {
  
  @JSImport("cesium/Source/Widgets/ProjectionPicker/ProjectionPicker", JSImport.Default)
  @js.native
  open class default protected () extends ProjectionPicker {
    def this(container: String, scene: Scene) = this()
    def this(container: Element, scene: Scene) = this()
  }
}
