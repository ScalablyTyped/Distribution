package typings.cesium.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClusterBillboards extends StObject {
  
  var clusterBillboards: js.UndefOr[Boolean] = js.native
  
  var clusterLabels: js.UndefOr[Boolean] = js.native
  
  var clusterPoints: js.UndefOr[Boolean] = js.native
  
  var enabled: js.UndefOr[Boolean] = js.native
  
  var minimumClusterSize: js.UndefOr[Double] = js.native
  
  var pixelRange: js.UndefOr[Double] = js.native
}
object ClusterBillboards {
  
  @scala.inline
  def apply(): ClusterBillboards = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterBillboards]
  }
  
  @scala.inline
  implicit class ClusterBillboardsMutableBuilder[Self <: ClusterBillboards] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClusterBillboards(value: Boolean): Self = StObject.set(x, "clusterBillboards", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterBillboardsUndefined: Self = StObject.set(x, "clusterBillboards", js.undefined)
    
    @scala.inline
    def setClusterLabels(value: Boolean): Self = StObject.set(x, "clusterLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterLabelsUndefined: Self = StObject.set(x, "clusterLabels", js.undefined)
    
    @scala.inline
    def setClusterPoints(value: Boolean): Self = StObject.set(x, "clusterPoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterPointsUndefined: Self = StObject.set(x, "clusterPoints", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setMinimumClusterSize(value: Double): Self = StObject.set(x, "minimumClusterSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumClusterSizeUndefined: Self = StObject.set(x, "minimumClusterSize", js.undefined)
    
    @scala.inline
    def setPixelRange(value: Double): Self = StObject.set(x, "pixelRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPixelRangeUndefined: Self = StObject.set(x, "pixelRange", js.undefined)
  }
}
