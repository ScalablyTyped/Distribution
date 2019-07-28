package typings.bugsnagDashJs.typesCommonMod

import typings.bugsnagDashJs.Anon_Notify
import typings.bugsnagDashJs.typesClientMod.ILogger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFinalConfig extends IConfig {
  @JSName("autoBreadcrumbs")
  var autoBreadcrumbs_IFinalConfig: Boolean
  @JSName("autoCaptureSessions")
  var autoCaptureSessions_IFinalConfig: Boolean
  @JSName("autoNotify")
  var autoNotify_IFinalConfig: Boolean
  @JSName("beforeSend")
  var beforeSend_IFinalConfig: js.Array[BeforeSend]
  @JSName("collectUserIp")
  var collectUserIp_IFinalConfig: Boolean
  @JSName("consoleBreadcrumbsEnabled")
  var consoleBreadcrumbsEnabled_IFinalConfig: Boolean
  @JSName("endpoints")
  var endpoints_IFinalConfig: Anon_Notify
  @JSName("interactionBreadcrumbsEnabled")
  var interactionBreadcrumbsEnabled_IFinalConfig: Boolean
  @JSName("maxBreadcrumbs")
  var maxBreadcrumbs_IFinalConfig: Double
  @JSName("maxEvents")
  var maxEvents_IFinalConfig: Double
  @JSName("metaData")
  var metaData_IFinalConfig: js.Object | Null
  @JSName("navigationBreadcrumbsEnabled")
  var navigationBreadcrumbsEnabled_IFinalConfig: Boolean
  @JSName("notifyReleaseStages")
  var notifyReleaseStages_IFinalConfig: js.Array[String]
  @JSName("releaseStage")
  var releaseStage_IFinalConfig: String
  @JSName("user")
  var user_IFinalConfig: js.Object | Null
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
    endpoints: Anon_Notify,
    interactionBreadcrumbsEnabled: Boolean,
    maxBreadcrumbs: Double,
    maxEvents: Double,
    navigationBreadcrumbsEnabled: Boolean,
    notifyReleaseStages: js.Array[String],
    releaseStage: String,
    appVersion: String = null,
    endpoint: String = null,
    logger: ILogger = null,
    metaData: js.Object = null,
    networkBreadcrumbsEnabled: js.UndefOr[Boolean] = js.undefined,
    sessionEndpoint: String = null,
    user: js.Object = null
  ): IFinalConfig = {
    val __obj = js.Dynamic.literal(apiKey = apiKey, autoBreadcrumbs = autoBreadcrumbs, autoCaptureSessions = autoCaptureSessions, autoNotify = autoNotify, beforeSend = beforeSend, collectUserIp = collectUserIp, consoleBreadcrumbsEnabled = consoleBreadcrumbsEnabled, endpoints = endpoints, interactionBreadcrumbsEnabled = interactionBreadcrumbsEnabled, maxBreadcrumbs = maxBreadcrumbs, maxEvents = maxEvents, navigationBreadcrumbsEnabled = navigationBreadcrumbsEnabled, notifyReleaseStages = notifyReleaseStages, releaseStage = releaseStage)
    if (appVersion != null) __obj.updateDynamic("appVersion")(appVersion)
    if (endpoint != null) __obj.updateDynamic("endpoint")(endpoint)
    if (logger != null) __obj.updateDynamic("logger")(logger)
    if (metaData != null) __obj.updateDynamic("metaData")(metaData)
    if (!js.isUndefined(networkBreadcrumbsEnabled)) __obj.updateDynamic("networkBreadcrumbsEnabled")(networkBreadcrumbsEnabled)
    if (sessionEndpoint != null) __obj.updateDynamic("sessionEndpoint")(sessionEndpoint)
    if (user != null) __obj.updateDynamic("user")(user)
    __obj.asInstanceOf[IFinalConfig]
  }
}

