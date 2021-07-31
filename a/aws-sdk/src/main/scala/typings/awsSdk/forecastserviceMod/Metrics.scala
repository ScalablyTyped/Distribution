package typings.awsSdk.forecastserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Metrics extends StObject {
  
  /**
    *  Provides detailed error metrics on forecast type, root-mean square-error (RMSE), and weighted average percentage error (WAPE). 
    */
  var ErrorMetrics: js.UndefOr[typings.awsSdk.forecastserviceMod.ErrorMetrics] = js.undefined
  
  /**
    * The root-mean-square error (RMSE).
    */
  var RMSE: js.UndefOr[Double] = js.undefined
  
  /**
    * An array of weighted quantile losses. Quantiles divide a probability distribution into regions of equal probability. The distribution in this case is the loss function.
    */
  var WeightedQuantileLosses: js.UndefOr[typings.awsSdk.forecastserviceMod.WeightedQuantileLosses] = js.undefined
}
object Metrics {
  
  @scala.inline
  def apply(): Metrics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Metrics]
  }
  
  @scala.inline
  implicit class MetricsMutableBuilder[Self <: Metrics] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrorMetrics(value: ErrorMetrics): Self = StObject.set(x, "ErrorMetrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorMetricsUndefined: Self = StObject.set(x, "ErrorMetrics", js.undefined)
    
    @scala.inline
    def setErrorMetricsVarargs(value: ErrorMetric*): Self = StObject.set(x, "ErrorMetrics", js.Array(value :_*))
    
    @scala.inline
    def setRMSE(value: Double): Self = StObject.set(x, "RMSE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRMSEUndefined: Self = StObject.set(x, "RMSE", js.undefined)
    
    @scala.inline
    def setWeightedQuantileLosses(value: WeightedQuantileLosses): Self = StObject.set(x, "WeightedQuantileLosses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeightedQuantileLossesUndefined: Self = StObject.set(x, "WeightedQuantileLosses", js.undefined)
    
    @scala.inline
    def setWeightedQuantileLossesVarargs(value: WeightedQuantileLoss*): Self = StObject.set(x, "WeightedQuantileLosses", js.Array(value :_*))
  }
}
