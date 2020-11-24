package typings.casperjs.mod

import typings.phantomjs.WebPage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CasperOptions extends js.Object {
  
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
  implicit class CasperOptionsOps[Self <: CasperOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClientScriptsVarargs(value: js.Any*): Self = this.set("clientScripts", js.Array(value :_*))
    
    @scala.inline
    def setClientScripts(value: js.Array[_]): Self = this.set("clientScripts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientScripts: Self = this.set("clientScripts", js.undefined)
    
    @scala.inline
    def setExitOnError(value: Boolean): Self = this.set("exitOnError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExitOnError: Self = this.set("exitOnError", js.undefined)
    
    @scala.inline
    def setHttpStatusHandlers(value: js.Any): Self = this.set("httpStatusHandlers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHttpStatusHandlers: Self = this.set("httpStatusHandlers", js.undefined)
    
    @scala.inline
    def setLogLevel(value: String): Self = this.set("logLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogLevel: Self = this.set("logLevel", js.undefined)
    
    @scala.inline
    def setOnAlert(value: js.Function): Self = this.set("onAlert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnAlert: Self = this.set("onAlert", js.undefined)
    
    @scala.inline
    def setOnDie(value: js.Function): Self = this.set("onDie", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnDie: Self = this.set("onDie", js.undefined)
    
    @scala.inline
    def setOnError(value: js.Function): Self = this.set("onError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnError: Self = this.set("onError", js.undefined)
    
    @scala.inline
    def setOnLoadError(value: js.Function): Self = this.set("onLoadError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnLoadError: Self = this.set("onLoadError", js.undefined)
    
    @scala.inline
    def setOnPageInitialized(value: js.Function): Self = this.set("onPageInitialized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnPageInitialized: Self = this.set("onPageInitialized", js.undefined)
    
    @scala.inline
    def setOnResourceReceived(value: js.Function): Self = this.set("onResourceReceived", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnResourceReceived: Self = this.set("onResourceReceived", js.undefined)
    
    @scala.inline
    def setOnResourceRequested(value: js.Function): Self = this.set("onResourceRequested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnResourceRequested: Self = this.set("onResourceRequested", js.undefined)
    
    @scala.inline
    def setOnStepComplete(value: js.Function): Self = this.set("onStepComplete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnStepComplete: Self = this.set("onStepComplete", js.undefined)
    
    @scala.inline
    def setOnStepTimeout(value: js.Function): Self = this.set("onStepTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnStepTimeout: Self = this.set("onStepTimeout", js.undefined)
    
    @scala.inline
    def setOnTimeout(value: js.Function): Self = this.set("onTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnTimeout: Self = this.set("onTimeout", js.undefined)
    
    @scala.inline
    def setOnWaitTimeout(value: js.Function): Self = this.set("onWaitTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnWaitTimeout: Self = this.set("onWaitTimeout", js.undefined)
    
    @scala.inline
    def setPage(value: WebPage): Self = this.set("page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePage: Self = this.set("page", js.undefined)
    
    @scala.inline
    def setPageSettings(value: js.Any): Self = this.set("pageSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageSettings: Self = this.set("pageSettings", js.undefined)
    
    @scala.inline
    def setRemoteScriptsVarargs(value: js.Any*): Self = this.set("remoteScripts", js.Array(value :_*))
    
    @scala.inline
    def setRemoteScripts(value: js.Array[_]): Self = this.set("remoteScripts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemoteScripts: Self = this.set("remoteScripts", js.undefined)
    
    @scala.inline
    def setRetryTimeout(value: Double): Self = this.set("retryTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRetryTimeout: Self = this.set("retryTimeout", js.undefined)
    
    @scala.inline
    def setSafeLogs(value: Boolean): Self = this.set("safeLogs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSafeLogs: Self = this.set("safeLogs", js.undefined)
    
    @scala.inline
    def setSilentErrors(value: Boolean): Self = this.set("silentErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSilentErrors: Self = this.set("silentErrors", js.undefined)
    
    @scala.inline
    def setStepTimeout(value: Double): Self = this.set("stepTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStepTimeout: Self = this.set("stepTimeout", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    
    @scala.inline
    def setVerbose(value: Boolean): Self = this.set("verbose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerbose: Self = this.set("verbose", js.undefined)
    
    @scala.inline
    def setViewportSize(value: js.Any): Self = this.set("viewportSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViewportSize: Self = this.set("viewportSize", js.undefined)
    
    @scala.inline
    def setWaitTimeout(value: Double): Self = this.set("waitTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWaitTimeout: Self = this.set("waitTimeout", js.undefined)
  }
}
