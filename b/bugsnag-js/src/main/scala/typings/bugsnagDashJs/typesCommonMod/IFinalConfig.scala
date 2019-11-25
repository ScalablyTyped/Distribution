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
    val __obj = js.Dynamic.literal(apiKey = apiKey.asInstanceOf[js.Any], autoBreadcrumbs = autoBreadcrumbs.asInstanceOf[js.Any], autoCaptureSessions = autoCaptureSessions.asInstanceOf[js.Any], autoNotify = autoNotify.asInstanceOf[js.Any], beforeSend = beforeSend.asInstanceOf[js.Any], collectUserIp = collectUserIp.asInstanceOf[js.Any], consoleBreadcrumbsEnabled = consoleBreadcrumbsEnabled.asInstanceOf[js.Any], endpoints = endpoints.asInstanceOf[js.Any], interactionBreadcrumbsEnabled = interactionBreadcrumbsEnabled.asInstanceOf[js.Any], maxBreadcrumbs = maxBreadcrumbs.asInstanceOf[js.Any], maxEvents = maxEvents.asInstanceOf[js.Any], navigationBreadcrumbsEnabled = navigationBreadcrumbsEnabled.asInstanceOf[js.Any], notifyReleaseStages = notifyReleaseStages.asInstanceOf[js.Any], releaseStage = releaseStage.asInstanceOf[js.Any])
    if (appVersion != null) __obj.updateDynamic("appVersion")(appVersion.asInstanceOf[js.Any])
    if (endpoint != null) __obj.updateDynamic("endpoint")(endpoint.asInstanceOf[js.Any])
    if (logger != null) __obj.updateDynamic("logger")(logger.asInstanceOf[js.Any])
    if (metaData != null) __obj.updateDynamic("metaData")(metaData.asInstanceOf[js.Any])
    if (!js.isUndefined(networkBreadcrumbsEnabled)) __obj.updateDynamic("networkBreadcrumbsEnabled")(networkBreadcrumbsEnabled.asInstanceOf[js.Any])
    if (sessionEndpoint != null) __obj.updateDynamic("sessionEndpoint")(sessionEndpoint.asInstanceOf[js.Any])
    if (user != null) __obj.updateDynamic("user")(user.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFinalConfig]
  }
}

