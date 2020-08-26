package typings.bugsnagJs.commonMod

import typings.bugsnagJs.anon.Notify
import typings.bugsnagJs.clientMod.ILogger
import typings.bugsnagJs.reportMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IConfig extends js.Object {
  var apiKey: String = js.native
  var appVersion: js.UndefOr[String] = js.native
  var autoBreadcrumbs: js.UndefOr[Boolean] = js.native
  var autoCaptureSessions: js.UndefOr[Boolean] = js.native
  var autoNotify: js.UndefOr[Boolean] = js.native
  var beforeSend: js.UndefOr[BeforeSend | js.Array[BeforeSend]] = js.native
  var collectUserIp: js.UndefOr[Boolean] = js.native
  var consoleBreadcrumbsEnabled: js.UndefOr[Boolean] = js.native
  var endpoint: js.UndefOr[String] = js.native
  var endpoints: js.UndefOr[Notify] = js.native
  var interactionBreadcrumbsEnabled: js.UndefOr[Boolean] = js.native
  var logger: js.UndefOr[ILogger | Null] = js.native
  var maxBreadcrumbs: js.UndefOr[Double] = js.native
  var maxEvents: js.UndefOr[Double] = js.native
  var metaData: js.UndefOr[js.Object | Null] = js.native
  var navigationBreadcrumbsEnabled: js.UndefOr[Boolean] = js.native
  var networkBreadcrumbsEnabled: js.UndefOr[Boolean] = js.native
  var notifyReleaseStages: js.UndefOr[js.Array[String]] = js.native
  var releaseStage: js.UndefOr[String] = js.native
  var sessionEndpoint: js.UndefOr[String] = js.native
  var user: js.UndefOr[js.Object | Null] = js.native
}

object IConfig {
  @scala.inline
  def apply(apiKey: String): IConfig = {
    val __obj = js.Dynamic.literal(apiKey = apiKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IConfig]
  }
  @scala.inline
  implicit class IConfigOps[Self <: IConfig] (val x: Self) extends AnyVal {
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
    def setApiKey(value: String): Self = this.set("apiKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setAppVersion(value: String): Self = this.set("appVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppVersion: Self = this.set("appVersion", js.undefined)
    @scala.inline
    def setAutoBreadcrumbs(value: Boolean): Self = this.set("autoBreadcrumbs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoBreadcrumbs: Self = this.set("autoBreadcrumbs", js.undefined)
    @scala.inline
    def setAutoCaptureSessions(value: Boolean): Self = this.set("autoCaptureSessions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoCaptureSessions: Self = this.set("autoCaptureSessions", js.undefined)
    @scala.inline
    def setAutoNotify(value: Boolean): Self = this.set("autoNotify", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoNotify: Self = this.set("autoNotify", js.undefined)
    @scala.inline
    def setBeforeSendVarargs(value: BeforeSend*): Self = this.set("beforeSend", js.Array(value :_*))
    @scala.inline
    def setBeforeSendFunction1(value: /* report */ default => Boolean | Unit): Self = this.set("beforeSend", js.Any.fromFunction1(value))
    @scala.inline
    def setBeforeSend(value: BeforeSend | js.Array[BeforeSend]): Self = this.set("beforeSend", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBeforeSend: Self = this.set("beforeSend", js.undefined)
    @scala.inline
    def setCollectUserIp(value: Boolean): Self = this.set("collectUserIp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCollectUserIp: Self = this.set("collectUserIp", js.undefined)
    @scala.inline
    def setConsoleBreadcrumbsEnabled(value: Boolean): Self = this.set("consoleBreadcrumbsEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConsoleBreadcrumbsEnabled: Self = this.set("consoleBreadcrumbsEnabled", js.undefined)
    @scala.inline
    def setEndpoint(value: String): Self = this.set("endpoint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndpoint: Self = this.set("endpoint", js.undefined)
    @scala.inline
    def setEndpoints(value: Notify): Self = this.set("endpoints", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndpoints: Self = this.set("endpoints", js.undefined)
    @scala.inline
    def setInteractionBreadcrumbsEnabled(value: Boolean): Self = this.set("interactionBreadcrumbsEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInteractionBreadcrumbsEnabled: Self = this.set("interactionBreadcrumbsEnabled", js.undefined)
    @scala.inline
    def setLogger(value: ILogger): Self = this.set("logger", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogger: Self = this.set("logger", js.undefined)
    @scala.inline
    def setLoggerNull: Self = this.set("logger", null)
    @scala.inline
    def setMaxBreadcrumbs(value: Double): Self = this.set("maxBreadcrumbs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxBreadcrumbs: Self = this.set("maxBreadcrumbs", js.undefined)
    @scala.inline
    def setMaxEvents(value: Double): Self = this.set("maxEvents", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxEvents: Self = this.set("maxEvents", js.undefined)
    @scala.inline
    def setMetaData(value: js.Object): Self = this.set("metaData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetaData: Self = this.set("metaData", js.undefined)
    @scala.inline
    def setMetaDataNull: Self = this.set("metaData", null)
    @scala.inline
    def setNavigationBreadcrumbsEnabled(value: Boolean): Self = this.set("navigationBreadcrumbsEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNavigationBreadcrumbsEnabled: Self = this.set("navigationBreadcrumbsEnabled", js.undefined)
    @scala.inline
    def setNetworkBreadcrumbsEnabled(value: Boolean): Self = this.set("networkBreadcrumbsEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNetworkBreadcrumbsEnabled: Self = this.set("networkBreadcrumbsEnabled", js.undefined)
    @scala.inline
    def setNotifyReleaseStagesVarargs(value: String*): Self = this.set("notifyReleaseStages", js.Array(value :_*))
    @scala.inline
    def setNotifyReleaseStages(value: js.Array[String]): Self = this.set("notifyReleaseStages", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotifyReleaseStages: Self = this.set("notifyReleaseStages", js.undefined)
    @scala.inline
    def setReleaseStage(value: String): Self = this.set("releaseStage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReleaseStage: Self = this.set("releaseStage", js.undefined)
    @scala.inline
    def setSessionEndpoint(value: String): Self = this.set("sessionEndpoint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSessionEndpoint: Self = this.set("sessionEndpoint", js.undefined)
    @scala.inline
    def setUser(value: js.Object): Self = this.set("user", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUser: Self = this.set("user", js.undefined)
    @scala.inline
    def setUserNull: Self = this.set("user", null)
  }
  
}

