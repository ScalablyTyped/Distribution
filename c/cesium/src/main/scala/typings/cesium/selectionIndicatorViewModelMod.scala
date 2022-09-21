package typings.cesium

import typings.cesium.mod.Scene
import typings.cesium.mod.SelectionIndicatorViewModel
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object selectionIndicatorViewModelMod {
  
  @JSImport("cesium/Source/Widgets/SelectionIndicator/SelectionIndicatorViewModel", JSImport.Default)
  @js.native
  open class default protected () extends SelectionIndicatorViewModel {
    def this(scene: Scene, selectionIndicatorElement: Element, container: Element) = this()
  }
}
