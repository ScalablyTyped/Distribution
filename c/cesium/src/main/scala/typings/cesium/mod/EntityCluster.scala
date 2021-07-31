package typings.cesium.mod

import typings.cesium.anon.ClusterBillboards
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "EntityCluster")
@js.native
class EntityCluster () extends StObject {
  def this(options: ClusterBillboards) = this()
  
  var clusterBillboards: Boolean = js.native
  
  var clusterEvent: Event[js.Array[js.Any]] = js.native
  
  var clusterLabels: Boolean = js.native
  
  var clusterPoints: Boolean = js.native
  
  def destroy(): Unit = js.native
  
  var enabled: Boolean = js.native
  
  var minimumClusterSize: Double = js.native
  
  var pixelRange: Double = js.native
}
