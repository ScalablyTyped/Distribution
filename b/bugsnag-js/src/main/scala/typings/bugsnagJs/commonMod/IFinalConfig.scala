package typings.bugsnagJs.commonMod

import typings.bugsnagJs.anon.Notify
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFinalConfig extends IConfig {
  @JSName("autoBreadcrumbs")
  var autoBreadcrumbs_IFinalConfig: Boolean = js.native
  @JSName("autoCaptureSessions")
  var autoCaptureSessions_IFinalConfig: Boolean = js.native
  @JSName("autoNotify")
  var autoNotify_IFinalConfig: Boolean = js.native
  @JSName("beforeSend")
  var beforeSend_IFinalConfig: js.Array[BeforeSend] = js.native
  @JSName("collectUserIp")
  var collectUserIp_IFinalConfig: Boolean = js.native
  @JSName("consoleBreadcrumbsEnabled")
  var consoleBreadcrumbsEnabled_IFinalConfig: Boolean = js.native
  @JSName("endpoints")
  var endpoints_IFinalConfig: Notify = js.native
  @JSName("interactionBreadcrumbsEnabled")
  var interactionBreadcrumbsEnabled_IFinalConfig: Boolean = js.native
  @JSName("maxBreadcrumbs")
  var maxBreadcrumbs_IFinalConfig: Double = js.native
  @JSName("maxEvents")
  var maxEvents_IFinalConfig: Double = js.native
  @JSName("metaData")
  var metaData_IFinalConfig: js.Object | Null = js.native
  @JSName("navigationBreadcrumbsEnabled")
  var navigationBreadcrumbsEnabled_IFinalConfig: Boolean = js.native
  @JSName("notifyReleaseStages")
  var notifyReleaseStages_IFinalConfig: js.Array[String] = js.native
  @JSName("releaseStage")
  var releaseStage_IFinalConfig: String = js.native
  @JSName("user")
  var user_IFinalConfig: js.Object | Null = js.native
}

object IFinalConfig {
  @scala.inline
  def apply(
    apiKey: String,
    autoBreadcrumbs: Boolean,
    autoCaptureSessions: Boolean,
    autoNotify: Boolean,
    beforeSend: js.Array[BeforeSend],
    collectUserIp: Boolean,
    consoleBreadcrumbsEnabled: Boolean,
    endpoints: Notify,
    interactionBreadcrumbsEnabled: Boolean,
    maxBreadcrumbs: Double,
    maxEvents: Double,
    navigationBreadcrumbsEnabled: Boolean,
    notifyReleaseStages: js.Array[String],
    releaseStage: String
  ): IFinalConfig = {
    val __obj = js.Dynamic.literal(apiKey = apiKey.asInstanceOf[js.Any], autoBreadcrumbs = autoBreadcrumbs.asInstanceOf[js.Any], autoCaptureSessions = autoCaptureSessions.asInstanceOf[js.Any], autoNotify = autoNotify.asInstanceOf[js.Any], beforeSend = beforeSend.asInstanceOf[js.Any], collectUserIp = collectUserIp.asInstanceOf[js.Any], consoleBreadcrumbsEnabled = consoleBreadcrumbsEnabled.asInstanceOf[js.Any], endpoints = endpoints.asInstanceOf[js.Any], interactionBreadcrumbsEnabled = interactionBreadcrumbsEnabled.asInstanceOf[js.Any], maxBreadcrumbs = maxBreadcrumbs.asInstanceOf[js.Any], maxEvents = maxEvents.asInstanceOf[js.Any], navigationBreadcrumbsEnabled = navigationBreadcrumbsEnabled.asInstanceOf[js.Any], notifyReleaseStages = notifyReleaseStages.asInstanceOf[js.Any], releaseStage = releaseStage.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFinalConfig]
  }
  @scala.inline
  implicit class IFinalConfigOps[Self <: IFinalConfig] (val x: Self) extends AnyVal {
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
    def setAutoBreadcrumbs(value: Boolean): Self = this.set("autoBreadcrumbs", value.asInstanceOf[js.Any])
    @scala.inline
    def setAutoCaptureSessions(value: Boolean): Self = this.set("autoCaptureSessions", value.asInstanceOf[js.Any])
    @scala.inline
    def setAutoNotify(value: Boolean): Self = this.set("autoNotify", value.asInstanceOf[js.Any])
    @scala.inline
    def setBeforeSendVarargs(value: BeforeSend*): Self = this.set("beforeSend", js.Array(value :_*))
    @scala.inline
    def setBeforeSend(value: js.Array[BeforeSend]): Self = this.set("beforeSend", value.asInstanceOf[js.Any])
    @scala.inline
    def setCollectUserIp(value: Boolean): Self = this.set("collectUserIp", value.asInstanceOf[js.Any])
    @scala.inline
    def setConsoleBreadcrumbsEnabled(value: Boolean): Self = this.set("consoleBreadcrumbsEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setEndpoints(value: Notify): Self = this.set("endpoints", value.asInstanceOf[js.Any])
    @scala.inline
    def setInteractionBreadcrumbsEnabled(value: Boolean): Self = this.set("interactionBreadcrumbsEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxBreadcrumbs(value: Double): Self = this.set("maxBreadcrumbs", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxEvents(value: Double): Self = this.set("maxEvents", value.asInstanceOf[js.Any])
    @scala.inline
    def setNavigationBreadcrumbsEnabled(value: Boolean): Self = this.set("navigationBreadcrumbsEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setNotifyReleaseStagesVarargs(value: String*): Self = this.set("notifyReleaseStages", js.Array(value :_*))
    @scala.inline
    def setNotifyReleaseStages(value: js.Array[String]): Self = this.set("notifyReleaseStages", value.asInstanceOf[js.Any])
    @scala.inline
    def setReleaseStage(value: String): Self = this.set("releaseStage", value.asInstanceOf[js.Any])
    @scala.inline
    def setMetaData(value: js.Object): Self = this.set("metaData", value.asInstanceOf[js.Any])
    @scala.inline
    def setMetaDataNull: Self = this.set("metaData", null)
    @scala.inline
    def setUser(value: js.Object): Self = this.set("user", value.asInstanceOf[js.Any])
    @scala.inline
    def setUserNull: Self = this.set("user", null)
  }
  
}

