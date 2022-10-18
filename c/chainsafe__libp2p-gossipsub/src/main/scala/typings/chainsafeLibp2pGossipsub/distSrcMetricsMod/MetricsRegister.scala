package typings.chainsafeLibp2pGossipsub.distSrcMetricsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MetricsRegister extends StObject {
  
  def avgMinMax[T /* <: LabelsGeneric */](config: AvgMinMaxConfig[T]): AvgMinMax[T]
  
  def gauge[T /* <: LabelsGeneric */](config: GaugeConfig[T]): Gauge[T]
  
  def histogram[T /* <: LabelsGeneric */](config: HistogramConfig[T]): Histogram[T]
}
object MetricsRegister {
  
  inline def apply(
    avgMinMax: AvgMinMaxConfig[Any] => AvgMinMax[Any],
    gauge: GaugeConfig[Any] => Gauge[Any],
    histogram: HistogramConfig[Any] => Histogram[Any]
  ): MetricsRegister = {
    val __obj = js.Dynamic.literal(avgMinMax = js.Any.fromFunction1(avgMinMax), gauge = js.Any.fromFunction1(gauge), histogram = js.Any.fromFunction1(histogram))
    __obj.asInstanceOf[MetricsRegister]
  }
  
  extension [Self <: MetricsRegister](x: Self) {
    
    inline def setAvgMinMax(value: AvgMinMaxConfig[Any] => AvgMinMax[Any]): Self = StObject.set(x, "avgMinMax", js.Any.fromFunction1(value))
    
    inline def setGauge(value: GaugeConfig[Any] => Gauge[Any]): Self = StObject.set(x, "gauge", js.Any.fromFunction1(value))
    
    inline def setHistogram(value: HistogramConfig[Any] => Histogram[Any]): Self = StObject.set(x, "histogram", js.Any.fromFunction1(value))
  }
}
