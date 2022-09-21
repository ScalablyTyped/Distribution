package typings.cesium

import typings.cesium.mod.EntityCollection
import typings.cesium.mod.ModelVisualizer
import typings.cesium.mod.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modelVisualizerMod {
  
  @JSImport("cesium/Source/DataSources/ModelVisualizer", JSImport.Default)
  @js.native
  open class default protected () extends ModelVisualizer {
    def this(scene: Scene, entityCollection: EntityCollection) = this()
  }
}
