package typings.cesium

import typings.cesium.mod.BillboardVisualizer
import typings.cesium.mod.EntityCluster
import typings.cesium.mod.EntityCollection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object billboardVisualizerMod {
  
  @JSImport("cesium/Source/DataSources/BillboardVisualizer", JSImport.Default)
  @js.native
  open class default protected () extends BillboardVisualizer {
    def this(entityCluster: EntityCluster, entityCollection: EntityCollection) = this()
  }
}
