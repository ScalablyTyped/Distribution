package typings.bugsnag.mod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConfigurationOptions extends js.Object {
  
  var appType: js.UndefOr[String] = js.native
  
  var appVersion: js.UndefOr[String] = js.native
  
  var autoCaptureSessions: js.UndefOr[Boolean] = js.native
  
  var autoNotify: js.UndefOr[Boolean] = js.native
  
  var autoNotifyUnhandledRejection: js.UndefOr[Boolean] = js.native
  
  var endpoints: js.UndefOr[Endpoints] = js.native
  
  var filters: js.UndefOr[js.Array[String]] = js.native
  
  var headers: js.UndefOr[StringDictionary[String]] = js.native
  
  var hostname: js.UndefOr[String] = js.native
  
  var logLevel: js.UndefOr[String] = js.native
  
  var logger: js.UndefOr[Logger] = js.native
  
  var metaData: js.UndefOr[StringDictionary[js.Any]] = js.native
  
  var notifyHost: js.UndefOr[String] = js.native
  
  var notifyPath: js.UndefOr[String] = js.native
  
  var notifyPort: js.UndefOr[Double] = js.native
  
  var notifyReleaseStages: js.UndefOr[js.Array[String]] = js.native
  
  var onUncaughtError: js.UndefOr[js.Function1[/* error */ String | Error, Unit]] = js.native
  
  var packageJSON: js.UndefOr[String] = js.native
  
  var projectRoot: js.UndefOr[String] = js.native
  
  var proxy: js.UndefOr[String] = js.native
  
  var releaseStage: js.UndefOr[String] = js.native
  
  var sendCode: js.UndefOr[Boolean] = js.native
  
  var sessionEndpoint: js.UndefOr[String] = js.native
  
  var useSSL: js.UndefOr[Boolean] = js.native
}
object ConfigurationOptions {
  
  @scala.inline
  def apply(): ConfigurationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigurationOptions]
  }
  
  @scala.inline
  implicit class ConfigurationOptionsOps[Self <: ConfigurationOptions] (val x: Self) extends AnyVal {
    
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
    def setAppType(value: String): Self = this.set("appType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppType: Self = this.set("appType", js.undefined)
    
    @scala.inline
    def setAppVersion(value: String): Self = this.set("appVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppVersion: Self = this.set("appVersion", js.undefined)
    
    @scala.inline
    def setAutoCaptureSessions(value: Boolean): Self = this.set("autoCaptureSessions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoCaptureSessions: Self = this.set("autoCaptureSessions", js.undefined)
    
    @scala.inline
    def setAutoNotify(value: Boolean): Self = this.set("autoNotify", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoNotify: Self = this.set("autoNotify", js.undefined)
    
    @scala.inline
    def setAutoNotifyUnhandledRejection(value: Boolean): Self = this.set("autoNotifyUnhandledRejection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoNotifyUnhandledRejection: Self = this.set("autoNotifyUnhandledRejection", js.undefined)
    
    @scala.inline
    def setEndpoints(value: Endpoints): Self = this.set("endpoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndpoints: Self = this.set("endpoints", js.undefined)
    
    @scala.inline
    def setFiltersVarargs(value: String*): Self = this.set("filters", js.Array(value :_*))
    
    @scala.inline
    def setFilters(value: js.Array[String]): Self = this.set("filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilters: Self = this.set("filters", js.undefined)
    
    @scala.inline
    def setHeaders(value: StringDictionary[String]): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    
    @scala.inline
    def setHostname(value: String): Self = this.set("hostname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHostname: Self = this.set("hostname", js.undefined)
    
    @scala.inline
    def setLogLevel(value: String): Self = this.set("logLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogLevel: Self = this.set("logLevel", js.undefined)
    
    @scala.inline
    def setLogger(value: Logger): Self = this.set("logger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogger: Self = this.set("logger", js.undefined)
    
    @scala.inline
    def setMetaData(value: StringDictionary[js.Any]): Self = this.set("metaData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetaData: Self = this.set("metaData", js.undefined)
    
    @scala.inline
    def setNotifyHost(value: String): Self = this.set("notifyHost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotifyHost: Self = this.set("notifyHost", js.undefined)
    
    @scala.inline
    def setNotifyPath(value: String): Self = this.set("notifyPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotifyPath: Self = this.set("notifyPath", js.undefined)
    
    @scala.inline
    def setNotifyPort(value: Double): Self = this.set("notifyPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotifyPort: Self = this.set("notifyPort", js.undefined)
    
    @scala.inline
    def setNotifyReleaseStagesVarargs(value: String*): Self = this.set("notifyReleaseStages", js.Array(value :_*))
    
    @scala.inline
    def setNotifyReleaseStages(value: js.Array[String]): Self = this.set("notifyReleaseStages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotifyReleaseStages: Self = this.set("notifyReleaseStages", js.undefined)
    
    @scala.inline
    def setOnUncaughtError(value: /* error */ String | Error => Unit): Self = this.set("onUncaughtError", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnUncaughtError: Self = this.set("onUncaughtError", js.undefined)
    
    @scala.inline
    def setPackageJSON(value: String): Self = this.set("packageJSON", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePackageJSON: Self = this.set("packageJSON", js.undefined)
    
    @scala.inline
    def setProjectRoot(value: String): Self = this.set("projectRoot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProjectRoot: Self = this.set("projectRoot", js.undefined)
    
    @scala.inline
    def setProxy(value: String): Self = this.set("proxy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProxy: Self = this.set("proxy", js.undefined)
    
    @scala.inline
    def setReleaseStage(value: String): Self = this.set("releaseStage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReleaseStage: Self = this.set("releaseStage", js.undefined)
    
    @scala.inline
    def setSendCode(value: Boolean): Self = this.set("sendCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSendCode: Self = this.set("sendCode", js.undefined)
    
    @scala.inline
    def setSessionEndpoint(value: String): Self = this.set("sessionEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSessionEndpoint: Self = this.set("sessionEndpoint", js.undefined)
    
    @scala.inline
    def setUseSSL(value: Boolean): Self = this.set("useSSL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseSSL: Self = this.set("useSSL", js.undefined)
  }
}
