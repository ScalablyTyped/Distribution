package typings
package bugsnagDashJsLib.typesCommonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFinalConfig extends IConfig {
  @JSName("autoBreadcrumbs")
  var autoBreadcrumbs_IFinalConfig: scala.Boolean
  @JSName("autoCaptureSessions")
  var autoCaptureSessions_IFinalConfig: scala.Boolean
  @JSName("autoNotify")
  var autoNotify_IFinalConfig: scala.Boolean
  @JSName("beforeSend")
  var beforeSend_IFinalConfig: js.Array[BeforeSend]
  @JSName("collectUserIp")
  var collectUserIp_IFinalConfig: scala.Boolean
  @JSName("consoleBreadcrumbsEnabled")
  var consoleBreadcrumbsEnabled_IFinalConfig: scala.Boolean
  @JSName("endpoints")
  var endpoints_IFinalConfig: bugsnagDashJsLib.Anon_Notify
  @JSName("interactionBreadcrumbsEnabled")
  var interactionBreadcrumbsEnabled_IFinalConfig: scala.Boolean
  @JSName("maxBreadcrumbs")
  var maxBreadcrumbs_IFinalConfig: scala.Double
  @JSName("maxEvents")
  var maxEvents_IFinalConfig: scala.Double
  @JSName("metaData")
  var metaData_IFinalConfig: js.Object | scala.Null
  @JSName("navigationBreadcrumbsEnabled")
  var navigationBreadcrumbsEnabled_IFinalConfig: scala.Boolean
  @JSName("notifyReleaseStages")
  var notifyReleaseStages_IFinalConfig: js.Array[java.lang.String]
  @JSName("releaseStage")
  var releaseStage_IFinalConfig: java.lang.String
  @JSName("user")
  var user_IFinalConfig: js.Object | scala.Null
}

object IFinalConfig {
  @scala.inline
  def apply(
    apiKey: java.lang.String,
    autoBreadcrumbs: scala.Boolean,
    autoCaptureSessions: scala.Boolean,
    autoNotify: scala.Boolean,
    beforeSend: js.Array[BeforeSend],
    collectUserIp: scala.Boolean,
    consoleBreadcrumbsEnabled: scala.Boolean,
    endpoints: bugsnagDashJsLib.Anon_Notify,
    interactionBreadcrumbsEnabled: scala.Boolean,
    maxBreadcrumbs: scala.Double,
    maxEvents: scala.Double,
    navigationBreadcrumbsEnabled: scala.Boolean,
    notifyReleaseStages: js.Array[java.lang.String],
    releaseStage: java.lang.String,
    appVersion: java.lang.String = null,
    endpoint: java.lang.String = null,
    logger: bugsnagDashJsLib.typesClientMod.ILogger = null,
    metaData: js.Object = null,
    networkBreadcrumbsEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    sessionEndpoint: java.lang.String = null,
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

