package typings.awsSdk.forecastserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Metrics extends js.Object {
  
  /**
    *  Provides detailed error metrics on forecast type, root-mean square-error (RMSE), and weighted average percentage error (WAPE). 
    */
  var ErrorMetrics: js.UndefOr[typings.awsSdk.forecastserviceMod.ErrorMetrics] = js.native
  
  /**
    * The root-mean-square error (RMSE).
    */
  var RMSE: js.UndefOr[Double] = js.native
  
  /**
    * An array of weighted quantile losses. Quantiles divide a probability distribution into regions of equal probability. The distribution in this case is the loss function.
    */
  var WeightedQuantileLosses: js.UndefOr[typings.awsSdk.forecastserviceMod.WeightedQuantileLosses] = js.native
}
object Metrics {
  
  @scala.inline
  def apply(): Metrics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Metrics]
  }
  
  @scala.inline
  implicit class MetricsOps[Self <: Metrics] (val x: Self) extends AnyVal {
    
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
    def setErrorMetricsVarargs(value: ErrorMetric*): Self = this.set("ErrorMetrics", js.Array(value :_*))
    
    @scala.inline
    def setErrorMetrics(value: ErrorMetrics): Self = this.set("ErrorMetrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorMetrics: Self = this.set("ErrorMetrics", js.undefined)
    
    @scala.inline
    def setRMSE(value: Double): Self = this.set("RMSE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRMSE: Self = this.set("RMSE", js.undefined)
    
    @scala.inline
    def setWeightedQuantileLossesVarargs(value: WeightedQuantileLoss*): Self = this.set("WeightedQuantileLosses", js.Array(value :_*))
    
    @scala.inline
    def setWeightedQuantileLosses(value: WeightedQuantileLosses): Self = this.set("WeightedQuantileLosses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWeightedQuantileLosses: Self = this.set("WeightedQuantileLosses", js.undefined)
  }
}
