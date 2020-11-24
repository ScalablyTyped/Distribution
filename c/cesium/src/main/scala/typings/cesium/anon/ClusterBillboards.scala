package typings.cesium.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClusterBillboards extends js.Object {
  
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
  implicit class ClusterBillboardsOps[Self <: ClusterBillboards] (val x: Self) extends AnyVal {
    
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
    def setClusterBillboards(value: Boolean): Self = this.set("clusterBillboards", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClusterBillboards: Self = this.set("clusterBillboards", js.undefined)
    
    @scala.inline
    def setClusterLabels(value: Boolean): Self = this.set("clusterLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClusterLabels: Self = this.set("clusterLabels", js.undefined)
    
    @scala.inline
    def setClusterPoints(value: Boolean): Self = this.set("clusterPoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClusterPoints: Self = this.set("clusterPoints", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    
    @scala.inline
    def setMinimumClusterSize(value: Double): Self = this.set("minimumClusterSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinimumClusterSize: Self = this.set("minimumClusterSize", js.undefined)
    
    @scala.inline
    def setPixelRange(value: Double): Self = this.set("pixelRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePixelRange: Self = this.set("pixelRange", js.undefined)
  }
}
