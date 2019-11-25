package typings.bingmaps.Microsoft.Maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IClusterLayerOptions extends js.Object {
  /**
    * A callback function that is fired after the clustering for a map view has completed. This is useful if you want to generate a list of locations based on what is in the current view.
    */
  var callback: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Defines how clusters are positioned on the map. Default: MeanAverage
    */
  var clusterPlacementType: js.UndefOr[ClusterPlacementType] = js.undefined
  /**
    * A callback function that allows you to process a clustered pushpin before it is added to a layer. This is useful if you want to add events or set style options on the clustered pushpin.
    */
  var clusteredPinCallback: js.UndefOr[js.Function1[/* pin */ ClusterPushpin, Unit]] = js.undefined
  /**
    * Indicates if the layer should cluster the locations or not. Default: true
    */
  var clusteringEnabled: js.UndefOr[Boolean] = js.undefined
  /**
    * The width and height of the gird cells used for clustering in pixels. Default: 45
    */
  var gridSize: js.UndefOr[Double] = js.undefined
  /**
    * Offsets the placement of clustered pushpins by a set number of pixels. This option is only available when the placement type is set to GridCenter.
    * This is useful if you have multiple cluster layers on the map and you want to offset the clustered pushpins between the layers so that they are visible,
    * otherwise the clusters from the different layers would overlap completely.
    */
  var layerOffset: js.UndefOr[Point] = js.undefined
  /**
    * A boolean indicating if the layer is visible or not.
    */
  var visible: js.UndefOr[Boolean] = js.undefined
  /**
    * The z-index of the layer.
    */
  var zIndex: js.UndefOr[Double] = js.undefined
}

object IClusterLayerOptions {
  @scala.inline
  def apply(
    callback: () => Unit = null,
    clusterPlacementType: ClusterPlacementType = null,
    clusteredPinCallback: /* pin */ ClusterPushpin => Unit = null,
    clusteringEnabled: js.UndefOr[Boolean] = js.undefined,
    gridSize: Int | Double = null,
    layerOffset: Point = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    zIndex: Int | Double = null
  ): IClusterLayerOptions = {
    val __obj = js.Dynamic.literal()
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction0(callback))
    if (clusterPlacementType != null) __obj.updateDynamic("clusterPlacementType")(clusterPlacementType.asInstanceOf[js.Any])
    if (clusteredPinCallback != null) __obj.updateDynamic("clusteredPinCallback")(js.Any.fromFunction1(clusteredPinCallback))
    if (!js.isUndefined(clusteringEnabled)) __obj.updateDynamic("clusteringEnabled")(clusteringEnabled.asInstanceOf[js.Any])
    if (gridSize != null) __obj.updateDynamic("gridSize")(gridSize.asInstanceOf[js.Any])
    if (layerOffset != null) __obj.updateDynamic("layerOffset")(layerOffset.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[IClusterLayerOptions]
  }
}

