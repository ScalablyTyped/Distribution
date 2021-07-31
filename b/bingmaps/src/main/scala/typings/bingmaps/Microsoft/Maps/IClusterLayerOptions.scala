package typings.bingmaps.Microsoft.Maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IClusterLayerOptions extends StObject {
  
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
  def apply(): IClusterLayerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IClusterLayerOptions]
  }
  
  @scala.inline
  implicit class IClusterLayerOptionsMutableBuilder[Self <: IClusterLayerOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCallback(value: () => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
    
    @scala.inline
    def setClusterPlacementType(value: ClusterPlacementType): Self = StObject.set(x, "clusterPlacementType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterPlacementTypeUndefined: Self = StObject.set(x, "clusterPlacementType", js.undefined)
    
    @scala.inline
    def setClusteredPinCallback(value: /* pin */ ClusterPushpin => Unit): Self = StObject.set(x, "clusteredPinCallback", js.Any.fromFunction1(value))
    
    @scala.inline
    def setClusteredPinCallbackUndefined: Self = StObject.set(x, "clusteredPinCallback", js.undefined)
    
    @scala.inline
    def setClusteringEnabled(value: Boolean): Self = StObject.set(x, "clusteringEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusteringEnabledUndefined: Self = StObject.set(x, "clusteringEnabled", js.undefined)
    
    @scala.inline
    def setGridSize(value: Double): Self = StObject.set(x, "gridSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGridSizeUndefined: Self = StObject.set(x, "gridSize", js.undefined)
    
    @scala.inline
    def setLayerOffset(value: Point): Self = StObject.set(x, "layerOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayerOffsetUndefined: Self = StObject.set(x, "layerOffset", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    
    @scala.inline
    def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
  }
}
