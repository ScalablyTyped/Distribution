package typings
package bingmapsLib.MicrosoftNs.MapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Microsoft.Maps.ClusterLayer")
@js.native
class ClusterLayer protected () extends IDataLayer {
  /**
    * @constructor
    * @requires The Microsoft.Maps.Clustering module.
    * @param pushpins An array of pushpins to cluster in the layer.
    * @param options The options used to customize how the ClusterLayer functions.
    */
  def this(pushpins: js.Array[Pushpin]) = this()
  def this(pushpins: js.Array[Pushpin], options: IClusterLayerOptions) = this()
  /** Clears all data in the layer. */
  /* CompleteClass */
  override def clear(): scala.Unit = js.native
  /**
    * Gets the pushpin in the specified cluster grid cell which can be either a ClusterPushpin if there are multiple pushpins in a cell or a single Pushpin.
    * @param The gridKey index to retrieve the pushpins for.
    * @returns The pushpin in the specified cluster grid cell which can be either a ClusterPushpin if there are multiple pushpins in a cell or a single Pushpin.
    */
  def getClusterPushpinByGridKey(gridKey: scala.Double): ClusterPushpin | Pushpin = js.native
  /**
    * Gets all the pushpins that are in the current map view. If clustering is disabled, all pushpins in the clustering layer are returned.
    * @returns All the pushpins that are in the current map view. If clustering is disabled, all pushpins in the clustering layer are returned.
    */
  def getDisplayedPushpins(): js.Array[Pushpin] = js.native
  /**
    * Gets the current options used by the cluster layer.
    * @returns The current options used by the cluster layer.
    */
  def getOptions(): IClusterLayerOptions = js.native
  /**
    * Gets all pushpins that are in the layers.
    * @returns An array of all the pushpins that are in the layers.
    */
  def getPushpins(): js.Array[Pushpin] = js.native
  /**
    * Gets the original pushpins that are in the specified grid cell.
    * @param The gridKey index to retrieve the pushpins for.
    * @returns The original pushpins that are in the specified grid cell.
    */
  def getPushpinsByGridKey(gridKey: scala.Double): js.Array[Pushpin] = js.native
  /**
    * Sets the clustering options to use in the layer.
    * @params options The clustering options to use in the layer.
    */
  def setOptions(options: IClusterLayerOptions): scala.Unit = js.native
  /**
    * Sets the array of pushpins that are used in the clustering layer.
    * @param pushpins An array of pushpins that are to be used by the clustering layer.
    */
  def setPushpins(pushpins: js.Array[Pushpin]): scala.Unit = js.native
}

