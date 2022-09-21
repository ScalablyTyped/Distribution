package typings.cesium

import typings.cesium.mod.EntityCollection
import typings.cesium.mod.PolylineVisualizer
import typings.cesium.mod.PrimitiveCollection
import typings.cesium.mod.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object polylineVisualizerMod {
  
  @JSImport("cesium/Source/DataSources/PolylineVisualizer", JSImport.Default)
  @js.native
  open class default protected () extends PolylineVisualizer {
    def this(scene: Scene, entityCollection: EntityCollection) = this()
    def this(scene: Scene, entityCollection: EntityCollection, primitives: PrimitiveCollection) = this()
    def this(
      scene: Scene,
      entityCollection: EntityCollection,
      primitives: Unit,
      groundPrimitives: PrimitiveCollection
    ) = this()
    def this(
      scene: Scene,
      entityCollection: EntityCollection,
      primitives: PrimitiveCollection,
      groundPrimitives: PrimitiveCollection
    ) = this()
  }
}
