package typings.cesium.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterBillboards extends StObject {
  
  var clusterBillboards: js.UndefOr[Boolean] = js.undefined
  
  var clusterLabels: js.UndefOr[Boolean] = js.undefined
  
  var clusterPoints: js.UndefOr[Boolean] = js.undefined
  
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  var minimumClusterSize: js.UndefOr[Double] = js.undefined
  
  var pixelRange: js.UndefOr[Double] = js.undefined
}
object ClusterBillboards {
  
  inline def apply(): ClusterBillboards = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterBillboards]
  }
  
  extension [Self <: ClusterBillboards](x: Self) {
    
    inline def setClusterBillboards(value: Boolean): Self = StObject.set(x, "clusterBillboards", value.asInstanceOf[js.Any])
    
    inline def setClusterBillboardsUndefined: Self = StObject.set(x, "clusterBillboards", js.undefined)
    
    inline def setClusterLabels(value: Boolean): Self = StObject.set(x, "clusterLabels", value.asInstanceOf[js.Any])
    
    inline def setClusterLabelsUndefined: Self = StObject.set(x, "clusterLabels", js.undefined)
    
    inline def setClusterPoints(value: Boolean): Self = StObject.set(x, "clusterPoints", value.asInstanceOf[js.Any])
    
    inline def setClusterPointsUndefined: Self = StObject.set(x, "clusterPoints", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setMinimumClusterSize(value: Double): Self = StObject.set(x, "minimumClusterSize", value.asInstanceOf[js.Any])
    
    inline def setMinimumClusterSizeUndefined: Self = StObject.set(x, "minimumClusterSize", js.undefined)
    
    inline def setPixelRange(value: Double): Self = StObject.set(x, "pixelRange", value.asInstanceOf[js.Any])
    
    inline def setPixelRangeUndefined: Self = StObject.set(x, "pixelRange", js.undefined)
  }
}
