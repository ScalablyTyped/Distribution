package typings.casperjs.mod

import typings.phantomjs.WebPage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CasperOptions extends StObject {
  
  var clientScripts: js.UndefOr[js.Array[_]] = js.native
  
  var exitOnError: js.UndefOr[Boolean] = js.native
  
  var httpStatusHandlers: js.UndefOr[js.Any] = js.native
  
  var logLevel: js.UndefOr[String] = js.native
  
  var onAlert: js.UndefOr[js.Function] = js.native
  
  var onDie: js.UndefOr[js.Function] = js.native
  
  var onError: js.UndefOr[js.Function] = js.native
  
  var onLoadError: js.UndefOr[js.Function] = js.native
  
  var onPageInitialized: js.UndefOr[js.Function] = js.native
  
  var onResourceReceived: js.UndefOr[js.Function] = js.native
  
  var onResourceRequested: js.UndefOr[js.Function] = js.native
  
  var onStepComplete: js.UndefOr[js.Function] = js.native
  
  var onStepTimeout: js.UndefOr[js.Function] = js.native
  
  var onTimeout: js.UndefOr[js.Function] = js.native
  
  var onWaitTimeout: js.UndefOr[js.Function] = js.native
  
  var page: js.UndefOr[WebPage] = js.native
  
  var pageSettings: js.UndefOr[js.Any] = js.native
  
  var remoteScripts: js.UndefOr[js.Array[_]] = js.native
  
  var retryTimeout: js.UndefOr[Double] = js.native
  
  var safeLogs: js.UndefOr[Boolean] = js.native
  
  var silentErrors: js.UndefOr[Boolean] = js.native
  
  var stepTimeout: js.UndefOr[Double] = js.native
  
  var timeout: js.UndefOr[Double] = js.native
  
  var verbose: js.UndefOr[Boolean] = js.native
  
  var viewportSize: js.UndefOr[js.Any] = js.native
  
  var waitTimeout: js.UndefOr[Double] = js.native
}
object CasperOptions {
  
  @scala.inline
  def apply(): CasperOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CasperOptions]
  }
  
  @scala.inline
  implicit class CasperOptionsMutableBuilder[Self <: CasperOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientScripts(value: js.Array[_]): Self = StObject.set(x, "clientScripts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientScriptsUndefined: Self = StObject.set(x, "clientScripts", js.undefined)
    
    @scala.inline
    def setClientScriptsVarargs(value: js.Any*): Self = StObject.set(x, "clientScripts", js.Array(value :_*))
    
    @scala.inline
    def setExitOnError(value: Boolean): Self = StObject.set(x, "exitOnError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExitOnErrorUndefined: Self = StObject.set(x, "exitOnError", js.undefined)
    
    @scala.inline
    def setHttpStatusHandlers(value: js.Any): Self = StObject.set(x, "httpStatusHandlers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttpStatusHandlersUndefined: Self = StObject.set(x, "httpStatusHandlers", js.undefined)
    
    @scala.inline
    def setLogLevel(value: String): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogLevelUndefined: Self = StObject.set(x, "logLevel", js.undefined)
    
    @scala.inline
    def setOnAlert(value: js.Function): Self = StObject.set(x, "onAlert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnAlertUndefined: Self = StObject.set(x, "onAlert", js.undefined)
    
    @scala.inline
    def setOnDie(value: js.Function): Self = StObject.set(x, "onDie", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnDieUndefined: Self = StObject.set(x, "onDie", js.undefined)
    
    @scala.inline
    def setOnError(value: js.Function): Self = StObject.set(x, "onError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
    
    @scala.inline
    def setOnLoadError(value: js.Function): Self = StObject.set(x, "onLoadError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnLoadErrorUndefined: Self = StObject.set(x, "onLoadError", js.undefined)
    
    @scala.inline
    def setOnPageInitialized(value: js.Function): Self = StObject.set(x, "onPageInitialized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnPageInitializedUndefined: Self = StObject.set(x, "onPageInitialized", js.undefined)
    
    @scala.inline
    def setOnResourceReceived(value: js.Function): Self = StObject.set(x, "onResourceReceived", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnResourceReceivedUndefined: Self = StObject.set(x, "onResourceReceived", js.undefined)
    
    @scala.inline
    def setOnResourceRequested(value: js.Function): Self = StObject.set(x, "onResourceRequested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnResourceRequestedUndefined: Self = StObject.set(x, "onResourceRequested", js.undefined)
    
    @scala.inline
    def setOnStepComplete(value: js.Function): Self = StObject.set(x, "onStepComplete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnStepCompleteUndefined: Self = StObject.set(x, "onStepComplete", js.undefined)
    
    @scala.inline
    def setOnStepTimeout(value: js.Function): Self = StObject.set(x, "onStepTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnStepTimeoutUndefined: Self = StObject.set(x, "onStepTimeout", js.undefined)
    
    @scala.inline
    def setOnTimeout(value: js.Function): Self = StObject.set(x, "onTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnTimeoutUndefined: Self = StObject.set(x, "onTimeout", js.undefined)
    
    @scala.inline
    def setOnWaitTimeout(value: js.Function): Self = StObject.set(x, "onWaitTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnWaitTimeoutUndefined: Self = StObject.set(x, "onWaitTimeout", js.undefined)
    
    @scala.inline
    def setPage(value: WebPage): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageSettings(value: js.Any): Self = StObject.set(x, "pageSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageSettingsUndefined: Self = StObject.set(x, "pageSettings", js.undefined)
    
    @scala.inline
    def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    
    @scala.inline
    def setRemoteScripts(value: js.Array[_]): Self = StObject.set(x, "remoteScripts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoteScriptsUndefined: Self = StObject.set(x, "remoteScripts", js.undefined)
    
    @scala.inline
    def setRemoteScriptsVarargs(value: js.Any*): Self = StObject.set(x, "remoteScripts", js.Array(value :_*))
    
    @scala.inline
    def setRetryTimeout(value: Double): Self = StObject.set(x, "retryTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetryTimeoutUndefined: Self = StObject.set(x, "retryTimeout", js.undefined)
    
    @scala.inline
    def setSafeLogs(value: Boolean): Self = StObject.set(x, "safeLogs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSafeLogsUndefined: Self = StObject.set(x, "safeLogs", js.undefined)
    
    @scala.inline
    def setSilentErrors(value: Boolean): Self = StObject.set(x, "silentErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSilentErrorsUndefined: Self = StObject.set(x, "silentErrors", js.undefined)
    
    @scala.inline
    def setStepTimeout(value: Double): Self = StObject.set(x, "stepTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepTimeoutUndefined: Self = StObject.set(x, "stepTimeout", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    @scala.inline
    def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
    
    @scala.inline
    def setViewportSize(value: js.Any): Self = StObject.set(x, "viewportSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewportSizeUndefined: Self = StObject.set(x, "viewportSize", js.undefined)
    
    @scala.inline
    def setWaitTimeout(value: Double): Self = StObject.set(x, "waitTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWaitTimeoutUndefined: Self = StObject.set(x, "waitTimeout", js.undefined)
  }
}
