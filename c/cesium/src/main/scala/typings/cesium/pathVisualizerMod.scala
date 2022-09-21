package typings.cesium

import typings.cesium.mod.EntityCollection
import typings.cesium.mod.PathVisualizer
import typings.cesium.mod.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pathVisualizerMod {
  
  @JSImport("cesium/Source/DataSources/PathVisualizer", JSImport.Default)
  @js.native
  open class default protected () extends PathVisualizer {
    def this(scene: Scene, entityCollection: EntityCollection) = this()
  }
}
