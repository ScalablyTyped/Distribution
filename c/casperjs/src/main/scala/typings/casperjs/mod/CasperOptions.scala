package typings.casperjs.mod

import typings.phantomjs.WebPage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CasperOptions extends StObject {
  
  var clientScripts: js.UndefOr[js.Array[Any]] = js.undefined
  
  var exitOnError: js.UndefOr[Boolean] = js.undefined
  
  var httpStatusHandlers: js.UndefOr[Any] = js.undefined
  
  var logLevel: js.UndefOr[String] = js.undefined
  
  var onAlert: js.UndefOr[js.Function] = js.undefined
  
  var onDie: js.UndefOr[js.Function] = js.undefined
  
  var onError: js.UndefOr[js.Function] = js.undefined
  
  var onLoadError: js.UndefOr[js.Function] = js.undefined
  
  var onPageInitialized: js.UndefOr[js.Function] = js.undefined
  
  var onResourceReceived: js.UndefOr[js.Function] = js.undefined
  
  var onResourceRequested: js.UndefOr[js.Function] = js.undefined
  
  var onStepComplete: js.UndefOr[js.Function] = js.undefined
  
  var onStepTimeout: js.UndefOr[js.Function] = js.undefined
  
  var onTimeout: js.UndefOr[js.Function] = js.undefined
  
  var onWaitTimeout: js.UndefOr[js.Function] = js.undefined
  
  var page: js.UndefOr[WebPage] = js.undefined
  
  var pageSettings: js.UndefOr[Any] = js.undefined
  
  var remoteScripts: js.UndefOr[js.Array[Any]] = js.undefined
  
  var retryTimeout: js.UndefOr[Double] = js.undefined
  
  var safeLogs: js.UndefOr[Boolean] = js.undefined
  
  var silentErrors: js.UndefOr[Boolean] = js.undefined
  
  var stepTimeout: js.UndefOr[Double] = js.undefined
  
  var timeout: js.UndefOr[Double] = js.undefined
  
  var verbose: js.UndefOr[Boolean] = js.undefined
  
  var viewportSize: js.UndefOr[Any] = js.undefined
  
  var waitTimeout: js.UndefOr[Double] = js.undefined
}
object CasperOptions {
  
  inline def apply(): CasperOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CasperOptions]
  }
  
  extension [Self <: CasperOptions](x: Self) {
    
    inline def setClientScripts(value: js.Array[Any]): Self = StObject.set(x, "clientScripts", value.asInstanceOf[js.Any])
    
    inline def setClientScriptsUndefined: Self = StObject.set(x, "clientScripts", js.undefined)
    
    inline def setClientScriptsVarargs(value: Any*): Self = StObject.set(x, "clientScripts", js.Array(value*))
    
    inline def setExitOnError(value: Boolean): Self = StObject.set(x, "exitOnError", value.asInstanceOf[js.Any])
    
    inline def setExitOnErrorUndefined: Self = StObject.set(x, "exitOnError", js.undefined)
    
    inline def setHttpStatusHandlers(value: Any): Self = StObject.set(x, "httpStatusHandlers", value.asInstanceOf[js.Any])
    
    inline def setHttpStatusHandlersUndefined: Self = StObject.set(x, "httpStatusHandlers", js.undefined)
    
    inline def setLogLevel(value: String): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
    
    inline def setLogLevelUndefined: Self = StObject.set(x, "logLevel", js.undefined)
    
    inline def setOnAlert(value: js.Function): Self = StObject.set(x, "onAlert", value.asInstanceOf[js.Any])
    
    inline def setOnAlertUndefined: Self = StObject.set(x, "onAlert", js.undefined)
    
    inline def setOnDie(value: js.Function): Self = StObject.set(x, "onDie", value.asInstanceOf[js.Any])
    
    inline def setOnDieUndefined: Self = StObject.set(x, "onDie", js.undefined)
    
    inline def setOnError(value: js.Function): Self = StObject.set(x, "onError", value.asInstanceOf[js.Any])
    
    inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
    
    inline def setOnLoadError(value: js.Function): Self = StObject.set(x, "onLoadError", value.asInstanceOf[js.Any])
    
    inline def setOnLoadErrorUndefined: Self = StObject.set(x, "onLoadError", js.undefined)
    
    inline def setOnPageInitialized(value: js.Function): Self = StObject.set(x, "onPageInitialized", value.asInstanceOf[js.Any])
    
    inline def setOnPageInitializedUndefined: Self = StObject.set(x, "onPageInitialized", js.undefined)
    
    inline def setOnResourceReceived(value: js.Function): Self = StObject.set(x, "onResourceReceived", value.asInstanceOf[js.Any])
    
    inline def setOnResourceReceivedUndefined: Self = StObject.set(x, "onResourceReceived", js.undefined)
    
    inline def setOnResourceRequested(value: js.Function): Self = StObject.set(x, "onResourceRequested", value.asInstanceOf[js.Any])
    
    inline def setOnResourceRequestedUndefined: Self = StObject.set(x, "onResourceRequested", js.undefined)
    
    inline def setOnStepComplete(value: js.Function): Self = StObject.set(x, "onStepComplete", value.asInstanceOf[js.Any])
    
    inline def setOnStepCompleteUndefined: Self = StObject.set(x, "onStepComplete", js.undefined)
    
    inline def setOnStepTimeout(value: js.Function): Self = StObject.set(x, "onStepTimeout", value.asInstanceOf[js.Any])
    
    inline def setOnStepTimeoutUndefined: Self = StObject.set(x, "onStepTimeout", js.undefined)
    
    inline def setOnTimeout(value: js.Function): Self = StObject.set(x, "onTimeout", value.asInstanceOf[js.Any])
    
    inline def setOnTimeoutUndefined: Self = StObject.set(x, "onTimeout", js.undefined)
    
    inline def setOnWaitTimeout(value: js.Function): Self = StObject.set(x, "onWaitTimeout", value.asInstanceOf[js.Any])
    
    inline def setOnWaitTimeoutUndefined: Self = StObject.set(x, "onWaitTimeout", js.undefined)
    
    inline def setPage(value: WebPage): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setPageSettings(value: Any): Self = StObject.set(x, "pageSettings", value.asInstanceOf[js.Any])
    
    inline def setPageSettingsUndefined: Self = StObject.set(x, "pageSettings", js.undefined)
    
    inline def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    
    inline def setRemoteScripts(value: js.Array[Any]): Self = StObject.set(x, "remoteScripts", value.asInstanceOf[js.Any])
    
    inline def setRemoteScriptsUndefined: Self = StObject.set(x, "remoteScripts", js.undefined)
    
    inline def setRemoteScriptsVarargs(value: Any*): Self = StObject.set(x, "remoteScripts", js.Array(value*))
    
    inline def setRetryTimeout(value: Double): Self = StObject.set(x, "retryTimeout", value.asInstanceOf[js.Any])
    
    inline def setRetryTimeoutUndefined: Self = StObject.set(x, "retryTimeout", js.undefined)
    
    inline def setSafeLogs(value: Boolean): Self = StObject.set(x, "safeLogs", value.asInstanceOf[js.Any])
    
    inline def setSafeLogsUndefined: Self = StObject.set(x, "safeLogs", js.undefined)
    
    inline def setSilentErrors(value: Boolean): Self = StObject.set(x, "silentErrors", value.asInstanceOf[js.Any])
    
    inline def setSilentErrorsUndefined: Self = StObject.set(x, "silentErrors", js.undefined)
    
    inline def setStepTimeout(value: Double): Self = StObject.set(x, "stepTimeout", value.asInstanceOf[js.Any])
    
    inline def setStepTimeoutUndefined: Self = StObject.set(x, "stepTimeout", js.undefined)
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    inline def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
    
    inline def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
    
    inline def setViewportSize(value: Any): Self = StObject.set(x, "viewportSize", value.asInstanceOf[js.Any])
    
    inline def setViewportSizeUndefined: Self = StObject.set(x, "viewportSize", js.undefined)
    
    inline def setWaitTimeout(value: Double): Self = StObject.set(x, "waitTimeout", value.asInstanceOf[js.Any])
    
    inline def setWaitTimeoutUndefined: Self = StObject.set(x, "waitTimeout", js.undefined)
  }
}
