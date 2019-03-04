package typings
package bugsnagDashJsLib.typesCommonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IConfig extends js.Object {
  var apiKey: java.lang.String
  var appVersion: js.UndefOr[java.lang.String] = js.undefined
  var autoBreadcrumbs: js.UndefOr[scala.Boolean] = js.undefined
  var autoCaptureSessions: js.UndefOr[scala.Boolean] = js.undefined
  var autoNotify: js.UndefOr[scala.Boolean] = js.undefined
  var beforeSend: js.UndefOr[BeforeSend | js.Array[BeforeSend]] = js.undefined
  var collectUserIp: js.UndefOr[scala.Boolean] = js.undefined
  var consoleBreadcrumbsEnabled: js.UndefOr[scala.Boolean] = js.undefined
  var endpoint: js.UndefOr[java.lang.String] = js.undefined
  var endpoints: js.UndefOr[bugsnagDashJsLib.Anon_Notify] = js.undefined
  var interactionBreadcrumbsEnabled: js.UndefOr[scala.Boolean] = js.undefined
  var logger: js.UndefOr[bugsnagDashJsLib.typesClientMod.ILogger | scala.Null] = js.undefined
  var maxBreadcrumbs: js.UndefOr[scala.Double] = js.undefined
  var maxEvents: js.UndefOr[scala.Double] = js.undefined
  var metaData: js.UndefOr[js.Object | scala.Null] = js.undefined
  var navigationBreadcrumbsEnabled: js.UndefOr[scala.Boolean] = js.undefined
  var networkBreadcrumbsEnabled: js.UndefOr[scala.Boolean] = js.undefined
  var notifyReleaseStages: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var releaseStage: js.UndefOr[java.lang.String] = js.undefined
  var sessionEndpoint: js.UndefOr[java.lang.String] = js.undefined
  var user: js.UndefOr[js.Object | scala.Null] = js.undefined
}

object IConfig {
  @scala.inline
  def apply(
    apiKey: java.lang.String,
    appVersion: java.lang.String = null,
    autoBreadcrumbs: js.UndefOr[scala.Boolean] = js.undefined,
    autoCaptureSessions: js.UndefOr[scala.Boolean] = js.undefined,
    autoNotify: js.UndefOr[scala.Boolean] = js.undefined,
    beforeSend: BeforeSend | js.Array[BeforeSend] = null,
    collectUserIp: js.UndefOr[scala.Boolean] = js.undefined,
    consoleBreadcrumbsEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    endpoint: java.lang.String = null,
    endpoints: bugsnagDashJsLib.Anon_Notify = null,
    interactionBreadcrumbsEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    logger: bugsnagDashJsLib.typesClientMod.ILogger = null,
    maxBreadcrumbs: scala.Int | scala.Double = null,
    maxEvents: scala.Int | scala.Double = null,
    metaData: js.Object = null,
    navigationBreadcrumbsEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    networkBreadcrumbsEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    notifyReleaseStages: js.Array[java.lang.String] = null,
    releaseStage: java.lang.String = null,
    sessionEndpoint: java.lang.String = null,
    user: js.Object = null
  ): IConfig = {
    val __obj = js.Dynamic.literal(apiKey = apiKey)
    if (appVersion != null) __obj.updateDynamic("appVersion")(appVersion)
    if (!js.isUndefined(autoBreadcrumbs)) __obj.updateDynamic("autoBreadcrumbs")(autoBreadcrumbs)
    if (!js.isUndefined(autoCaptureSessions)) __obj.updateDynamic("autoCaptureSessions")(autoCaptureSessions)
    if (!js.isUndefined(autoNotify)) __obj.updateDynamic("autoNotify")(autoNotify)
    if (beforeSend != null) __obj.updateDynamic("beforeSend")(beforeSend.asInstanceOf[js.Any])
    if (!js.isUndefined(collectUserIp)) __obj.updateDynamic("collectUserIp")(collectUserIp)
    if (!js.isUndefined(consoleBreadcrumbsEnabled)) __obj.updateDynamic("consoleBreadcrumbsEnabled")(consoleBreadcrumbsEnabled)
    if (endpoint != null) __obj.updateDynamic("endpoint")(endpoint)
    if (endpoints != null) __obj.updateDynamic("endpoints")(endpoints)
    if (!js.isUndefined(interactionBreadcrumbsEnabled)) __obj.updateDynamic("interactionBreadcrumbsEnabled")(interactionBreadcrumbsEnabled)
    if (logger != null) __obj.updateDynamic("logger")(logger)
    if (maxBreadcrumbs != null) __obj.updateDynamic("maxBreadcrumbs")(maxBreadcrumbs.asInstanceOf[js.Any])
    if (maxEvents != null) __obj.updateDynamic("maxEvents")(maxEvents.asInstanceOf[js.Any])
    if (metaData != null) __obj.updateDynamic("metaData")(metaData)
    if (!js.isUndefined(navigationBreadcrumbsEnabled)) __obj.updateDynamic("navigationBreadcrumbsEnabled")(navigationBreadcrumbsEnabled)
    if (!js.isUndefined(networkBreadcrumbsEnabled)) __obj.updateDynamic("networkBreadcrumbsEnabled")(networkBreadcrumbsEnabled)
    if (notifyReleaseStages != null) __obj.updateDynamic("notifyReleaseStages")(notifyReleaseStages)
    if (releaseStage != null) __obj.updateDynamic("releaseStage")(releaseStage)
    if (sessionEndpoint != null) __obj.updateDynamic("sessionEndpoint")(sessionEndpoint)
    if (user != null) __obj.updateDynamic("user")(user)
    __obj.asInstanceOf[IConfig]
  }
}

