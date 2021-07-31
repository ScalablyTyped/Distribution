package typings.bingmaps.global.Microsoft.Maps

import typings.bingmaps.Microsoft.Maps.IClusterLayerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Microsoft.Maps.ClusterLayer")
@js.native
class ClusterLayer protected ()
  extends StObject
     with typings.bingmaps.Microsoft.Maps.ClusterLayer {
  /**
    * @constructor
    * @requires The Microsoft.Maps.Clustering module.
    * @param pushpins An array of pushpins to cluster in the layer.
    * @param options The options used to customize how the ClusterLayer functions.
    */
  def this(pushpins: js.Array[typings.bingmaps.Microsoft.Maps.Pushpin]) = this()
  def this(pushpins: js.Array[typings.bingmaps.Microsoft.Maps.Pushpin], options: IClusterLayerOptions) = this()
  
  /** Clears all data in the layer. */
  /* CompleteClass */
  override def clear(): Unit = js.native
  
  /**
    * Gets the pushpin in the specified cluster grid cell which can be either a ClusterPushpin if there are multiple pushpins in a cell or a single Pushpin.
    * @param The gridKey index to retrieve the pushpins for.
    * @returns The pushpin in the specified cluster grid cell which can be either a ClusterPushpin if there are multiple pushpins in a cell or a single Pushpin.
    */
  /* CompleteClass */
  override def getClusterPushpinByGridKey(gridKey: Double): typings.bingmaps.Microsoft.Maps.ClusterPushpin | typings.bingmaps.Microsoft.Maps.Pushpin = js.native
  
  /**
    * Gets all the pushpins that are in the current map view. If clustering is disabled, all pushpins in the clustering layer are returned.
    * @returns All the pushpins that are in the current map view. If clustering is disabled, all pushpins in the clustering layer are returned.
    */
  /* CompleteClass */
  override def getDisplayedPushpins(): js.Array[typings.bingmaps.Microsoft.Maps.Pushpin] = js.native
  
  /**
    * Gets the current options used by the cluster layer.
    * @returns The current options used by the cluster layer.
    */
  /* CompleteClass */
  override def getOptions(): IClusterLayerOptions = js.native
  
  /**
    * Gets all pushpins that are in the layers.
    * @returns An array of all the pushpins that are in the layers.
    */
  /* CompleteClass */
  override def getPushpins(): js.Array[typings.bingmaps.Microsoft.Maps.Pushpin] = js.native
  
  /**
    * Gets the original pushpins that are in the specified grid cell.
    * @param The gridKey index to retrieve the pushpins for.
    * @returns The original pushpins that are in the specified grid cell.
    */
  /* CompleteClass */
  override def getPushpinsByGridKey(gridKey: Double): js.Array[typings.bingmaps.Microsoft.Maps.Pushpin] = js.native
  
  /**
    * Sets the clustering options to use in the layer.
    * @params options The clustering options to use in the layer.
    */
  /* CompleteClass */
  override def setOptions(options: IClusterLayerOptions): Unit = js.native
  
  /**
    * Sets the array of pushpins that are used in the clustering layer.
    * @param pushpins An array of pushpins that are to be used by the clustering layer.
    */
  /* CompleteClass */
  override def setPushpins(pushpins: js.Array[typings.bingmaps.Microsoft.Maps.Pushpin]): Unit = js.native
}
