package typings.cesium

import typings.cesium.mod.EntityCluster
import typings.cesium.mod.EntityCollection
import typings.cesium.mod.PointVisualizer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pointVisualizerMod {
  
  @JSImport("cesium/Source/DataSources/PointVisualizer", JSImport.Default)
  @js.native
  open class default protected () extends PointVisualizer {
    def this(entityCluster: EntityCluster, entityCollection: EntityCollection) = this()
  }
}
