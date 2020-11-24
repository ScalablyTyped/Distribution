package typings.awsSdk.connectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HistoricalMetricResult extends js.Object {
  
  /**
    * The set of metrics.
    */
  var Collections: js.UndefOr[HistoricalMetricDataCollections] = js.native
  
  /**
    * The dimension for the metrics.
    */
  var Dimensions: js.UndefOr[typings.awsSdk.connectMod.Dimensions] = js.native
}
object HistoricalMetricResult {
  
  @scala.inline
  def apply(): HistoricalMetricResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HistoricalMetricResult]
  }
  
  @scala.inline
  implicit class HistoricalMetricResultOps[Self <: HistoricalMetricResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCollectionsVarargs(value: HistoricalMetricData*): Self = this.set("Collections", js.Array(value :_*))
    
    @scala.inline
    def setCollections(value: HistoricalMetricDataCollections): Self = this.set("Collections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCollections: Self = this.set("Collections", js.undefined)
    
    @scala.inline
    def setDimensions(value: Dimensions): Self = this.set("Dimensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDimensions: Self = this.set("Dimensions", js.undefined)
  }
}
