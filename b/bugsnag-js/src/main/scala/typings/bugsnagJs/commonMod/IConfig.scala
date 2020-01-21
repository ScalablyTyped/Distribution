package typings.bugsnagJs.commonMod

import typings.bugsnagJs.AnonNotify
import typings.bugsnagJs.clientMod.ILogger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IConfig extends js.Object {
  var apiKey: String
  var appVersion: js.UndefOr[String] = js.undefined
  var autoBreadcrumbs: js.UndefOr[Boolean] = js.undefined
  var autoCaptureSessions: js.UndefOr[Boolean] = js.undefined
  var autoNotify: js.UndefOr[Boolean] = js.undefined
  var beforeSend: js.UndefOr[BeforeSend | js.Array[BeforeSend]] = js.undefined
  var collectUserIp: js.UndefOr[Boolean] = js.undefined
  var consoleBreadcrumbsEnabled: js.UndefOr[Boolean] = js.undefined
  var endpoint: js.UndefOr[String] = js.undefined
  var endpoints: js.UndefOr[AnonNotify] = js.undefined
  var interactionBreadcrumbsEnabled: js.UndefOr[Boolean] = js.undefined
  var logger: js.UndefOr[ILogger | Null] = js.undefined
  var maxBreadcrumbs: js.UndefOr[Double] = js.undefined
  var maxEvents: js.UndefOr[Double] = js.undefined
  var metaData: js.UndefOr[js.Object | Null] = js.undefined
  var navigationBreadcrumbsEnabled: js.UndefOr[Boolean] = js.undefined
  var networkBreadcrumbsEnabled: js.UndefOr[Boolean] = js.undefined
  var notifyReleaseStages: js.UndefOr[js.Array[String]] = js.undefined
  var releaseStage: js.UndefOr[String] = js.undefined
  var sessionEndpoint: js.UndefOr[String] = js.undefined
  var user: js.UndefOr[js.Object | Null] = js.undefined
}

object IConfig {
  @scala.inline
  def apply(
    apiKey: String,
    appVersion: String = null,
    autoBreadcrumbs: js.UndefOr[Boolean] = js.undefined,
    autoCaptureSessions: js.UndefOr[Boolean] = js.undefined,
    autoNotify: js.UndefOr[Boolean] = js.undefined,
    beforeSend: BeforeSend | js.Array[BeforeSend] = null,
    collectUserIp: js.UndefOr[Boolean] = js.undefined,
    consoleBreadcrumbsEnabled: js.UndefOr[Boolean] = js.undefined,
    endpoint: String = null,
    endpoints: AnonNotify = null,
    interactionBreadcrumbsEnabled: js.UndefOr[Boolean] = js.undefined,
    logger: ILogger = null,
    maxBreadcrumbs: Int | Double = null,
    maxEvents: Int | Double = null,
    metaData: js.Object = null,
    navigationBreadcrumbsEnabled: js.UndefOr[Boolean] = js.undefined,
    networkBreadcrumbsEnabled: js.UndefOr[Boolean] = js.undefined,
    notifyReleaseStages: js.Array[String] = null,
    releaseStage: String = null,
    sessionEndpoint: String = null,
    user: js.Object = null
  ): IConfig = {
    val __obj = js.Dynamic.literal(apiKey = apiKey.asInstanceOf[js.Any])
    if (appVersion != null) __obj.updateDynamic("appVersion")(appVersion.asInstanceOf[js.Any])
    if (!js.isUndefined(autoBreadcrumbs)) __obj.updateDynamic("autoBreadcrumbs")(autoBreadcrumbs.asInstanceOf[js.Any])
    if (!js.isUndefined(autoCaptureSessions)) __obj.updateDynamic("autoCaptureSessions")(autoCaptureSessions.asInstanceOf[js.Any])
    if (!js.isUndefined(autoNotify)) __obj.updateDynamic("autoNotify")(autoNotify.asInstanceOf[js.Any])
    if (beforeSend != null) __obj.updateDynamic("beforeSend")(beforeSend.asInstanceOf[js.Any])
    if (!js.isUndefined(collectUserIp)) __obj.updateDynamic("collectUserIp")(collectUserIp.asInstanceOf[js.Any])
    if (!js.isUndefined(consoleBreadcrumbsEnabled)) __obj.updateDynamic("consoleBreadcrumbsEnabled")(consoleBreadcrumbsEnabled.asInstanceOf[js.Any])
    if (endpoint != null) __obj.updateDynamic("endpoint")(endpoint.asInstanceOf[js.Any])
    if (endpoints != null) __obj.updateDynamic("endpoints")(endpoints.asInstanceOf[js.Any])
    if (!js.isUndefined(interactionBreadcrumbsEnabled)) __obj.updateDynamic("interactionBreadcrumbsEnabled")(interactionBreadcrumbsEnabled.asInstanceOf[js.Any])
    if (logger != null) __obj.updateDynamic("logger")(logger.asInstanceOf[js.Any])
    if (maxBreadcrumbs != null) __obj.updateDynamic("maxBreadcrumbs")(maxBreadcrumbs.asInstanceOf[js.Any])
    if (maxEvents != null) __obj.updateDynamic("maxEvents")(maxEvents.asInstanceOf[js.Any])
    if (metaData != null) __obj.updateDynamic("metaData")(metaData.asInstanceOf[js.Any])
    if (!js.isUndefined(navigationBreadcrumbsEnabled)) __obj.updateDynamic("navigationBreadcrumbsEnabled")(navigationBreadcrumbsEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(networkBreadcrumbsEnabled)) __obj.updateDynamic("networkBreadcrumbsEnabled")(networkBreadcrumbsEnabled.asInstanceOf[js.Any])
    if (notifyReleaseStages != null) __obj.updateDynamic("notifyReleaseStages")(notifyReleaseStages.asInstanceOf[js.Any])
    if (releaseStage != null) __obj.updateDynamic("releaseStage")(releaseStage.asInstanceOf[js.Any])
    if (sessionEndpoint != null) __obj.updateDynamic("sessionEndpoint")(sessionEndpoint.asInstanceOf[js.Any])
    if (user != null) __obj.updateDynamic("user")(user.asInstanceOf[js.Any])
    __obj.asInstanceOf[IConfig]
  }
}

