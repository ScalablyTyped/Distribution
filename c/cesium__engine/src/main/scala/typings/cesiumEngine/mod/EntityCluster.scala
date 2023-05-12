package typings.cesiumEngine.mod

import typings.cesiumEngine.anon.ClusterBillboards
import typings.cesiumEngine.mod.EntityCluster.newClusterCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@cesium/engine", "EntityCluster")
@js.native
open class EntityCluster () extends StObject {
  def this(options: ClusterBillboards) = this()
  
  /**
    * Gets or sets whether clustering billboard entities is enabled.
    */
  var clusterBillboards: Boolean = js.native
  
  /**
    * Gets the event that will be raised when a new cluster will be displayed. The signature of the event listener is {@link EntityCluster.newClusterCallback}.
    */
  var clusterEvent: Event[newClusterCallback] = js.native
  
  /**
    * Gets or sets whether clustering labels entities is enabled.
    */
  var clusterLabels: Boolean = js.native
  
  /**
    * Gets or sets whether clustering point entities is enabled.
    */
  var clusterPoints: Boolean = js.native
  
  /**
    * Destroys the WebGL resources held by this object.  Destroying an object allows for deterministic
    * release of WebGL resources, instead of relying on the garbage collector to destroy this object.
    * <p>
    * Unlike other objects that use WebGL resources, this object can be reused. For example, if a data source is removed
    * from a data source collection and added to another.
    * </p>
    */
  def destroy(): Unit = js.native
  
  /**
    * Gets or sets whether clustering is enabled.
    */
  var enabled: Boolean = js.native
  
  /**
    * Gets or sets the minimum number of screen space objects that can be clustered.
    */
  var minimumClusterSize: Double = js.native
  
  /**
    * Gets or sets the pixel range to extend the screen space bounding box.
    */
  var pixelRange: Double = js.native
  
  /**
    * Determines if entities in this collection will be shown.
    */
  var show: Boolean = js.native
}
object EntityCluster {
  
  /**
    * A event listener function used to style clusters.
    * @example
    * // The default cluster values.
    * dataSource.clustering.clusterEvent.addEventListener(function(entities, cluster) {
    *     cluster.label.show = true;
    *     cluster.label.text = entities.length.toLocaleString();
    * });
    * @param clusteredEntities - An array of the entities contained in the cluster.
    * @param cluster - An object containing the Billboard, Label, and Point
    * primitives that represent this cluster of entities.
    */
  type newClusterCallback = js.Function2[
    /* clusteredEntities */ js.Array[Entity], 
    /* cluster */ typings.cesiumEngine.anon.Billboard, 
    Unit
  ]
}
