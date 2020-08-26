package typings.bingmaps.Microsoft.Maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IClusterLayerOptions extends js.Object {
  /**
    * A callback function that is fired after the clustering for a map view has completed. This is useful if you want to generate a list of locations based on what is in the current view.
    */
  var callback: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Defines how clusters are positioned on the map. Default: MeanAverage
    */
  var clusterPlacementType: js.UndefOr[ClusterPlacementType] = js.native
  /**
    * A callback function that allows you to process a clustered pushpin before it is added to a layer. This is useful if you want to add events or set style options on the clustered pushpin.
    */
  var clusteredPinCallback: js.UndefOr[js.Function1[/* pin */ ClusterPushpin, Unit]] = js.native
  /**
    * Indicates if the layer should cluster the locations or not. Default: true
    */
  var clusteringEnabled: js.UndefOr[Boolean] = js.native
  /**
    * The width and height of the gird cells used for clustering in pixels. Default: 45
    */
  var gridSize: js.UndefOr[Double] = js.native
  /**
    * Offsets the placement of clustered pushpins by a set number of pixels. This option is only available when the placement type is set to GridCenter.
    * This is useful if you have multiple cluster layers on the map and you want to offset the clustered pushpins between the layers so that they are visible,
    * otherwise the clusters from the different layers would overlap completely.
    */
  var layerOffset: js.UndefOr[Point] = js.native
  /**
    * A boolean indicating if the layer is visible or not.
    */
  var visible: js.UndefOr[Boolean] = js.native
  /**
    * The z-index of the layer.
    */
  var zIndex: js.UndefOr[Double] = js.native
}

object IClusterLayerOptions {
  @scala.inline
  def apply(): IClusterLayerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IClusterLayerOptions]
  }
  @scala.inline
  implicit class IClusterLayerOptionsOps[Self <: IClusterLayerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCallback(value: () => Unit): Self = this.set("callback", js.Any.fromFunction0(value))
    @scala.inline
    def deleteCallback: Self = this.set("callback", js.undefined)
    @scala.inline
    def setClusterPlacementType(value: ClusterPlacementType): Self = this.set("clusterPlacementType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClusterPlacementType: Self = this.set("clusterPlacementType", js.undefined)
    @scala.inline
    def setClusteredPinCallback(value: /* pin */ ClusterPushpin => Unit): Self = this.set("clusteredPinCallback", js.Any.fromFunction1(value))
    @scala.inline
    def deleteClusteredPinCallback: Self = this.set("clusteredPinCallback", js.undefined)
    @scala.inline
    def setClusteringEnabled(value: Boolean): Self = this.set("clusteringEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClusteringEnabled: Self = this.set("clusteringEnabled", js.undefined)
    @scala.inline
    def setGridSize(value: Double): Self = this.set("gridSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGridSize: Self = this.set("gridSize", js.undefined)
    @scala.inline
    def setLayerOffset(value: Point): Self = this.set("layerOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLayerOffset: Self = this.set("layerOffset", js.undefined)
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
    @scala.inline
    def setZIndex(value: Double): Self = this.set("zIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZIndex: Self = this.set("zIndex", js.undefined)
  }
  
}

