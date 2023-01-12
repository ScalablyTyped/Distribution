package typings.awsSyntheticsPuppeteer

import org.scalablytyped.runtime.Shortcut
import typings.awsSyntheticsPuppeteer.httpRequestsReportMod.HttpTimingsResult
import typings.awsSyntheticsPuppeteer.syntheticsConfigurationMod.SyntheticsConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object httpRequestCapturerMod extends Shortcut {
  
  @JSImport("HttpRequestCapturer", JSImport.Namespace)
  @js.native
  val ^ : HttpRequestCapturer = js.native
  
  /**
    * This module captures HTTP requests for reporting and creates traces if enabled.
    */
  trait HttpRequestCapturer extends StObject {
    
    var _executionError: Any
    
    var _httpRequestCount: Double
    
    var _httpRequests: js.Array[Any]
    
    var _requestsResult: Any
    
    var _syntheticsConfiguration: SyntheticsConfiguration
    
    var _tracing: Any
    
    def addHelperHeaders(stepId: Any, requestOptions: Any, body: Any, stepConfig: Any): Unit
    
    def addRequest(stepId: Any, request: Any): Unit
    
    def captureHTTPsGlobal(module: Any): Unit
    
    def configure(requestsResult: Any, tracing: Any, syntheticsConfiguration: Any): Unit
    
    def enableCapture(module: Any): Unit
    
    def getExecutionError(): Any
    
    def getHttpRequests(): js.Array[Any]
    
    def getHttpTimings(timings: Any): HttpTimingsResult
    
    def getRequestsResult(): Any
    
    def getStepHttpMapping(): js.Object
    
    def isLibraryGeneratedRequest(requestOptions: Any): Boolean
    
    def reset(): Unit
    
    def setExecutionError(err: Any): Unit
    
    def startCapture(): Unit
  }
  object HttpRequestCapturer {
    
    inline def apply(
      _executionError: Any,
      _httpRequestCount: Double,
      _httpRequests: js.Array[Any],
      _requestsResult: Any,
      _syntheticsConfiguration: SyntheticsConfiguration,
      _tracing: Any,
      addHelperHeaders: (Any, Any, Any, Any) => Unit,
      addRequest: (Any, Any) => Unit,
      captureHTTPsGlobal: Any => Unit,
      configure: (Any, Any, Any) => Unit,
      enableCapture: Any => Unit,
      getExecutionError: () => Any,
      getHttpRequests: () => js.Array[Any],
      getHttpTimings: Any => HttpTimingsResult,
      getRequestsResult: () => Any,
      getStepHttpMapping: () => js.Object,
      isLibraryGeneratedRequest: Any => Boolean,
      reset: () => Unit,
      setExecutionError: Any => Unit,
      startCapture: () => Unit
    ): HttpRequestCapturer = {
      val __obj = js.Dynamic.literal(_executionError = _executionError.asInstanceOf[js.Any], _httpRequestCount = _httpRequestCount.asInstanceOf[js.Any], _httpRequests = _httpRequests.asInstanceOf[js.Any], _requestsResult = _requestsResult.asInstanceOf[js.Any], _syntheticsConfiguration = _syntheticsConfiguration.asInstanceOf[js.Any], _tracing = _tracing.asInstanceOf[js.Any], addHelperHeaders = js.Any.fromFunction4(addHelperHeaders), addRequest = js.Any.fromFunction2(addRequest), captureHTTPsGlobal = js.Any.fromFunction1(captureHTTPsGlobal), configure = js.Any.fromFunction3(configure), enableCapture = js.Any.fromFunction1(enableCapture), getExecutionError = js.Any.fromFunction0(getExecutionError), getHttpRequests = js.Any.fromFunction0(getHttpRequests), getHttpTimings = js.Any.fromFunction1(getHttpTimings), getRequestsResult = js.Any.fromFunction0(getRequestsResult), getStepHttpMapping = js.Any.fromFunction0(getStepHttpMapping), isLibraryGeneratedRequest = js.Any.fromFunction1(isLibraryGeneratedRequest), reset = js.Any.fromFunction0(reset), setExecutionError = js.Any.fromFunction1(setExecutionError), startCapture = js.Any.fromFunction0(startCapture))
      __obj.asInstanceOf[HttpRequestCapturer]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HttpRequestCapturer] (val x: Self) extends AnyVal {
      
      inline def setAddHelperHeaders(value: (Any, Any, Any, Any) => Unit): Self = StObject.set(x, "addHelperHeaders", js.Any.fromFunction4(value))
      
      inline def setAddRequest(value: (Any, Any) => Unit): Self = StObject.set(x, "addRequest", js.Any.fromFunction2(value))
      
      inline def setCaptureHTTPsGlobal(value: Any => Unit): Self = StObject.set(x, "captureHTTPsGlobal", js.Any.fromFunction1(value))
      
      inline def setConfigure(value: (Any, Any, Any) => Unit): Self = StObject.set(x, "configure", js.Any.fromFunction3(value))
      
      inline def setEnableCapture(value: Any => Unit): Self = StObject.set(x, "enableCapture", js.Any.fromFunction1(value))
      
      inline def setGetExecutionError(value: () => Any): Self = StObject.set(x, "getExecutionError", js.Any.fromFunction0(value))
      
      inline def setGetHttpRequests(value: () => js.Array[Any]): Self = StObject.set(x, "getHttpRequests", js.Any.fromFunction0(value))
      
      inline def setGetHttpTimings(value: Any => HttpTimingsResult): Self = StObject.set(x, "getHttpTimings", js.Any.fromFunction1(value))
      
      inline def setGetRequestsResult(value: () => Any): Self = StObject.set(x, "getRequestsResult", js.Any.fromFunction0(value))
      
      inline def setGetStepHttpMapping(value: () => js.Object): Self = StObject.set(x, "getStepHttpMapping", js.Any.fromFunction0(value))
      
      inline def setIsLibraryGeneratedRequest(value: Any => Boolean): Self = StObject.set(x, "isLibraryGeneratedRequest", js.Any.fromFunction1(value))
      
      inline def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
      
      inline def setSetExecutionError(value: Any => Unit): Self = StObject.set(x, "setExecutionError", js.Any.fromFunction1(value))
      
      inline def setStartCapture(value: () => Unit): Self = StObject.set(x, "startCapture", js.Any.fromFunction0(value))
      
      inline def set_executionError(value: Any): Self = StObject.set(x, "_executionError", value.asInstanceOf[js.Any])
      
      inline def set_httpRequestCount(value: Double): Self = StObject.set(x, "_httpRequestCount", value.asInstanceOf[js.Any])
      
      inline def set_httpRequests(value: js.Array[Any]): Self = StObject.set(x, "_httpRequests", value.asInstanceOf[js.Any])
      
      inline def set_httpRequestsVarargs(value: Any*): Self = StObject.set(x, "_httpRequests", js.Array(value*))
      
      inline def set_requestsResult(value: Any): Self = StObject.set(x, "_requestsResult", value.asInstanceOf[js.Any])
      
      inline def set_syntheticsConfiguration(value: SyntheticsConfiguration): Self = StObject.set(x, "_syntheticsConfiguration", value.asInstanceOf[js.Any])
      
      inline def set_tracing(value: Any): Self = StObject.set(x, "_tracing", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = HttpRequestCapturer
  
  /* This means you don't have to write `^`, but can instead just say `httpRequestCapturerMod.foo` */
  override def _to: HttpRequestCapturer = ^
}
