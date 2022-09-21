package typings.awsSdk.forecastserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Metrics extends StObject {
  
  /**
    * The average value of all weighted quantile losses.
    */
  var AverageWeightedQuantileLoss: js.UndefOr[Double] = js.undefined
  
  /**
    *  Provides detailed error metrics for each forecast type. Metrics include root-mean square-error (RMSE), mean absolute percentage error (MAPE), mean absolute scaled error (MASE), and weighted average percentage error (WAPE). 
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
  
  inline def apply(): Metrics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Metrics]
  }
  
  extension [Self <: Metrics](x: Self) {
    
    inline def setAverageWeightedQuantileLoss(value: Double): Self = StObject.set(x, "AverageWeightedQuantileLoss", value.asInstanceOf[js.Any])
    
    inline def setAverageWeightedQuantileLossUndefined: Self = StObject.set(x, "AverageWeightedQuantileLoss", js.undefined)
    
    inline def setErrorMetrics(value: ErrorMetrics): Self = StObject.set(x, "ErrorMetrics", value.asInstanceOf[js.Any])
    
    inline def setErrorMetricsUndefined: Self = StObject.set(x, "ErrorMetrics", js.undefined)
    
    inline def setErrorMetricsVarargs(value: ErrorMetric*): Self = StObject.set(x, "ErrorMetrics", js.Array(value*))
    
    inline def setRMSE(value: Double): Self = StObject.set(x, "RMSE", value.asInstanceOf[js.Any])
    
    inline def setRMSEUndefined: Self = StObject.set(x, "RMSE", js.undefined)
    
    inline def setWeightedQuantileLosses(value: WeightedQuantileLosses): Self = StObject.set(x, "WeightedQuantileLosses", value.asInstanceOf[js.Any])
    
    inline def setWeightedQuantileLossesUndefined: Self = StObject.set(x, "WeightedQuantileLosses", js.undefined)
    
    inline def setWeightedQuantileLossesVarargs(value: WeightedQuantileLoss*): Self = StObject.set(x, "WeightedQuantileLosses", js.Array(value*))
  }
}
