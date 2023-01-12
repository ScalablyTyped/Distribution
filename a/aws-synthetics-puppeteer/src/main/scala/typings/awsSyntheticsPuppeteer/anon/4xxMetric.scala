package typings.awsSyntheticsPuppeteer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `4xxMetric` extends StObject {
  
  var _2xxMetric: Boolean
  
  var _4xxMetric: Boolean
  
  var _5xxMetric: Boolean
  
  var aggregated2xxMetric: Boolean
  
  var aggregated4xxMetric: Boolean
  
  var aggregated5xxMetric: Boolean
  
  var aggregatedFailedCanaryMetric: Boolean
  
  var aggregatedFailedRequestsMetric: Boolean
  
  var continueOnHttpStepFailure: Boolean
  
  var continueOnStepFailure: Boolean
  
  var failedCanaryMetric: Boolean
  
  var failedRequestsMetric: Boolean
  
  var includeRequestBody: Boolean
  
  var includeRequestHeaders: Boolean
  
  var includeResponseBody: Boolean
  
  var includeResponseHeaders: Boolean
  
  var restrictedHeaders: js.Array[Any]
  
  var screenshotOnStepFailure: Boolean
  
  var screenshotOnStepStart: Boolean
  
  var screenshotOnStepSuccess: Boolean
  
  var stepDurationMetric: Boolean
  
  var stepSuccessMetric: Boolean
}
object `4xxMetric` {
  
  inline def apply(
    _2xxMetric: Boolean,
    _4xxMetric: Boolean,
    _5xxMetric: Boolean,
    aggregated2xxMetric: Boolean,
    aggregated4xxMetric: Boolean,
    aggregated5xxMetric: Boolean,
    aggregatedFailedCanaryMetric: Boolean,
    aggregatedFailedRequestsMetric: Boolean,
    continueOnHttpStepFailure: Boolean,
    continueOnStepFailure: Boolean,
    failedCanaryMetric: Boolean,
    failedRequestsMetric: Boolean,
    includeRequestBody: Boolean,
    includeRequestHeaders: Boolean,
    includeResponseBody: Boolean,
    includeResponseHeaders: Boolean,
    restrictedHeaders: js.Array[Any],
    screenshotOnStepFailure: Boolean,
    screenshotOnStepStart: Boolean,
    screenshotOnStepSuccess: Boolean,
    stepDurationMetric: Boolean,
    stepSuccessMetric: Boolean
  ): `4xxMetric` = {
    val __obj = js.Dynamic.literal(_2xxMetric = _2xxMetric.asInstanceOf[js.Any], _4xxMetric = _4xxMetric.asInstanceOf[js.Any], _5xxMetric = _5xxMetric.asInstanceOf[js.Any], aggregated2xxMetric = aggregated2xxMetric.asInstanceOf[js.Any], aggregated4xxMetric = aggregated4xxMetric.asInstanceOf[js.Any], aggregated5xxMetric = aggregated5xxMetric.asInstanceOf[js.Any], aggregatedFailedCanaryMetric = aggregatedFailedCanaryMetric.asInstanceOf[js.Any], aggregatedFailedRequestsMetric = aggregatedFailedRequestsMetric.asInstanceOf[js.Any], continueOnHttpStepFailure = continueOnHttpStepFailure.asInstanceOf[js.Any], continueOnStepFailure = continueOnStepFailure.asInstanceOf[js.Any], failedCanaryMetric = failedCanaryMetric.asInstanceOf[js.Any], failedRequestsMetric = failedRequestsMetric.asInstanceOf[js.Any], includeRequestBody = includeRequestBody.asInstanceOf[js.Any], includeRequestHeaders = includeRequestHeaders.asInstanceOf[js.Any], includeResponseBody = includeResponseBody.asInstanceOf[js.Any], includeResponseHeaders = includeResponseHeaders.asInstanceOf[js.Any], restrictedHeaders = restrictedHeaders.asInstanceOf[js.Any], screenshotOnStepFailure = screenshotOnStepFailure.asInstanceOf[js.Any], screenshotOnStepStart = screenshotOnStepStart.asInstanceOf[js.Any], screenshotOnStepSuccess = screenshotOnStepSuccess.asInstanceOf[js.Any], stepDurationMetric = stepDurationMetric.asInstanceOf[js.Any], stepSuccessMetric = stepSuccessMetric.asInstanceOf[js.Any])
    __obj.asInstanceOf[`4xxMetric`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `4xxMetric`] (val x: Self) extends AnyVal {
    
    inline def setAggregated2xxMetric(value: Boolean): Self = StObject.set(x, "aggregated2xxMetric", value.asInstanceOf[js.Any])
    
    inline def setAggregated4xxMetric(value: Boolean): Self = StObject.set(x, "aggregated4xxMetric", value.asInstanceOf[js.Any])
    
    inline def setAggregated5xxMetric(value: Boolean): Self = StObject.set(x, "aggregated5xxMetric", value.asInstanceOf[js.Any])
    
    inline def setAggregatedFailedCanaryMetric(value: Boolean): Self = StObject.set(x, "aggregatedFailedCanaryMetric", value.asInstanceOf[js.Any])
    
    inline def setAggregatedFailedRequestsMetric(value: Boolean): Self = StObject.set(x, "aggregatedFailedRequestsMetric", value.asInstanceOf[js.Any])
    
    inline def setContinueOnHttpStepFailure(value: Boolean): Self = StObject.set(x, "continueOnHttpStepFailure", value.asInstanceOf[js.Any])
    
    inline def setContinueOnStepFailure(value: Boolean): Self = StObject.set(x, "continueOnStepFailure", value.asInstanceOf[js.Any])
    
    inline def setFailedCanaryMetric(value: Boolean): Self = StObject.set(x, "failedCanaryMetric", value.asInstanceOf[js.Any])
    
    inline def setFailedRequestsMetric(value: Boolean): Self = StObject.set(x, "failedRequestsMetric", value.asInstanceOf[js.Any])
    
    inline def setIncludeRequestBody(value: Boolean): Self = StObject.set(x, "includeRequestBody", value.asInstanceOf[js.Any])
    
    inline def setIncludeRequestHeaders(value: Boolean): Self = StObject.set(x, "includeRequestHeaders", value.asInstanceOf[js.Any])
    
    inline def setIncludeResponseBody(value: Boolean): Self = StObject.set(x, "includeResponseBody", value.asInstanceOf[js.Any])
    
    inline def setIncludeResponseHeaders(value: Boolean): Self = StObject.set(x, "includeResponseHeaders", value.asInstanceOf[js.Any])
    
    inline def setRestrictedHeaders(value: js.Array[Any]): Self = StObject.set(x, "restrictedHeaders", value.asInstanceOf[js.Any])
    
    inline def setRestrictedHeadersVarargs(value: Any*): Self = StObject.set(x, "restrictedHeaders", js.Array(value*))
    
    inline def setScreenshotOnStepFailure(value: Boolean): Self = StObject.set(x, "screenshotOnStepFailure", value.asInstanceOf[js.Any])
    
    inline def setScreenshotOnStepStart(value: Boolean): Self = StObject.set(x, "screenshotOnStepStart", value.asInstanceOf[js.Any])
    
    inline def setScreenshotOnStepSuccess(value: Boolean): Self = StObject.set(x, "screenshotOnStepSuccess", value.asInstanceOf[js.Any])
    
    inline def setStepDurationMetric(value: Boolean): Self = StObject.set(x, "stepDurationMetric", value.asInstanceOf[js.Any])
    
    inline def setStepSuccessMetric(value: Boolean): Self = StObject.set(x, "stepSuccessMetric", value.asInstanceOf[js.Any])
    
    inline def set_2xxMetric(value: Boolean): Self = StObject.set(x, "_2xxMetric", value.asInstanceOf[js.Any])
    
    inline def set_4xxMetric(value: Boolean): Self = StObject.set(x, "_4xxMetric", value.asInstanceOf[js.Any])
    
    inline def set_5xxMetric(value: Boolean): Self = StObject.set(x, "_5xxMetric", value.asInstanceOf[js.Any])
  }
}
