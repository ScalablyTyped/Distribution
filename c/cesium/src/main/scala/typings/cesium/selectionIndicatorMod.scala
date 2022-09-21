package typings.cesium

import typings.cesium.mod.Scene
import typings.cesium.mod.SelectionIndicator
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object selectionIndicatorMod {
  
  @JSImport("cesium/Source/Widgets/SelectionIndicator/SelectionIndicator", JSImport.Default)
  @js.native
  open class default protected () extends SelectionIndicator {
    def this(container: String, scene: Scene) = this()
    def this(container: Element, scene: Scene) = this()
  }
}
