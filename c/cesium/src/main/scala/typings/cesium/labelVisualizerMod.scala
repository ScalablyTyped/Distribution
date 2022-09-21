package typings.cesium

import typings.cesium.mod.EntityCluster
import typings.cesium.mod.EntityCollection
import typings.cesium.mod.LabelVisualizer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object labelVisualizerMod {
  
  @JSImport("cesium/Source/DataSources/LabelVisualizer", JSImport.Default)
  @js.native
  open class default protected () extends LabelVisualizer {
    def this(entityCluster: EntityCluster, entityCollection: EntityCollection) = this()
  }
}
