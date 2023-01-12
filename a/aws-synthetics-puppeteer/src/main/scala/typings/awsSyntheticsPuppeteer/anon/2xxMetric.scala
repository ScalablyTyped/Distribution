package typings.awsSyntheticsPuppeteer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `2xxMetric` extends StObject {
  
  var _2xxMetric: Boolean
  
  var _4xxMetric: Boolean
  
  var _5xxMetric: Boolean
  
  var aggregated2xxMetric: Boolean
  
  var aggregated4xxMetric: Boolean
  
  var aggregated5xxMetric: Boolean
  
  var aggregatedFailedCanaryMetric: Boolean
  
  var aggregatedFailedRequestsMetric: Boolean
  
  var failedCanaryMetric: Boolean
  
  var failedRequestsMetric: Boolean
}
object `2xxMetric` {
  
  inline def apply(
    _2xxMetric: Boolean,
    _4xxMetric: Boolean,
    _5xxMetric: Boolean,
    aggregated2xxMetric: Boolean,
    aggregated4xxMetric: Boolean,
    aggregated5xxMetric: Boolean,
    aggregatedFailedCanaryMetric: Boolean,
    aggregatedFailedRequestsMetric: Boolean,
    failedCanaryMetric: Boolean,
    failedRequestsMetric: Boolean
  ): `2xxMetric` = {
    val __obj = js.Dynamic.literal(_2xxMetric = _2xxMetric.asInstanceOf[js.Any], _4xxMetric = _4xxMetric.asInstanceOf[js.Any], _5xxMetric = _5xxMetric.asInstanceOf[js.Any], aggregated2xxMetric = aggregated2xxMetric.asInstanceOf[js.Any], aggregated4xxMetric = aggregated4xxMetric.asInstanceOf[js.Any], aggregated5xxMetric = aggregated5xxMetric.asInstanceOf[js.Any], aggregatedFailedCanaryMetric = aggregatedFailedCanaryMetric.asInstanceOf[js.Any], aggregatedFailedRequestsMetric = aggregatedFailedRequestsMetric.asInstanceOf[js.Any], failedCanaryMetric = failedCanaryMetric.asInstanceOf[js.Any], failedRequestsMetric = failedRequestsMetric.asInstanceOf[js.Any])
    __obj.asInstanceOf[`2xxMetric`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `2xxMetric`] (val x: Self) extends AnyVal {
    
    inline def setAggregated2xxMetric(value: Boolean): Self = StObject.set(x, "aggregated2xxMetric", value.asInstanceOf[js.Any])
    
    inline def setAggregated4xxMetric(value: Boolean): Self = StObject.set(x, "aggregated4xxMetric", value.asInstanceOf[js.Any])
    
    inline def setAggregated5xxMetric(value: Boolean): Self = StObject.set(x, "aggregated5xxMetric", value.asInstanceOf[js.Any])
    
    inline def setAggregatedFailedCanaryMetric(value: Boolean): Self = StObject.set(x, "aggregatedFailedCanaryMetric", value.asInstanceOf[js.Any])
    
    inline def setAggregatedFailedRequestsMetric(value: Boolean): Self = StObject.set(x, "aggregatedFailedRequestsMetric", value.asInstanceOf[js.Any])
    
    inline def setFailedCanaryMetric(value: Boolean): Self = StObject.set(x, "failedCanaryMetric", value.asInstanceOf[js.Any])
    
    inline def setFailedRequestsMetric(value: Boolean): Self = StObject.set(x, "failedRequestsMetric", value.asInstanceOf[js.Any])
    
    inline def set_2xxMetric(value: Boolean): Self = StObject.set(x, "_2xxMetric", value.asInstanceOf[js.Any])
    
    inline def set_4xxMetric(value: Boolean): Self = StObject.set(x, "_4xxMetric", value.asInstanceOf[js.Any])
    
    inline def set_5xxMetric(value: Boolean): Self = StObject.set(x, "_5xxMetric", value.asInstanceOf[js.Any])
  }
}
