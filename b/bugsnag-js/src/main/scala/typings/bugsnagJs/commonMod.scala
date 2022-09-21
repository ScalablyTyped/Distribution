package typings.bugsnagJs

import typings.bugsnagJs.anon.Notify
import typings.bugsnagJs.clientMod.Client
import typings.bugsnagJs.clientMod.ILogger
import typings.bugsnagJs.reportMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commonMod {
  
  type BeforeSend = js.Function1[/* report */ default, Boolean | Unit]
  
  type BeforeSession = js.Function1[/* client */ Client, Unit]
  
  trait IConfig extends StObject {
    
    var apiKey: String
    
    var appVersion: js.UndefOr[String] = js.undefined
    
    var autoBreadcrumbs: js.UndefOr[Boolean] = js.undefined
    
    var autoCaptureSessions: js.UndefOr[Boolean] = js.undefined
    
    var autoNotify: js.UndefOr[Boolean] = js.undefined
    
    var beforeSend: js.UndefOr[BeforeSend | js.Array[BeforeSend]] = js.undefined
    
    var collectUserIp: js.UndefOr[Boolean] = js.undefined
    
    var consoleBreadcrumbsEnabled: js.UndefOr[Boolean] = js.undefined
    
    var endpoint: js.UndefOr[String] = js.undefined
    
    var endpoints: js.UndefOr[Notify] = js.undefined
    
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
    
    inline def apply(apiKey: String): IConfig = {
      val __obj = js.Dynamic.literal(apiKey = apiKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[IConfig]
    }
    
    extension [Self <: IConfig](x: Self) {
      
      inline def setApiKey(value: String): Self = StObject.set(x, "apiKey", value.asInstanceOf[js.Any])
      
      inline def setAppVersion(value: String): Self = StObject.set(x, "appVersion", value.asInstanceOf[js.Any])
      
      inline def setAppVersionUndefined: Self = StObject.set(x, "appVersion", js.undefined)
      
      inline def setAutoBreadcrumbs(value: Boolean): Self = StObject.set(x, "autoBreadcrumbs", value.asInstanceOf[js.Any])
      
      inline def setAutoBreadcrumbsUndefined: Self = StObject.set(x, "autoBreadcrumbs", js.undefined)
      
      inline def setAutoCaptureSessions(value: Boolean): Self = StObject.set(x, "autoCaptureSessions", value.asInstanceOf[js.Any])
      
      inline def setAutoCaptureSessionsUndefined: Self = StObject.set(x, "autoCaptureSessions", js.undefined)
      
      inline def setAutoNotify(value: Boolean): Self = StObject.set(x, "autoNotify", value.asInstanceOf[js.Any])
      
      inline def setAutoNotifyUndefined: Self = StObject.set(x, "autoNotify", js.undefined)
      
      inline def setBeforeSend(value: BeforeSend | js.Array[BeforeSend]): Self = StObject.set(x, "beforeSend", value.asInstanceOf[js.Any])
      
      inline def setBeforeSendFunction1(value: /* report */ default => Boolean | Unit): Self = StObject.set(x, "beforeSend", js.Any.fromFunction1(value))
      
      inline def setBeforeSendUndefined: Self = StObject.set(x, "beforeSend", js.undefined)
      
      inline def setBeforeSendVarargs(value: BeforeSend*): Self = StObject.set(x, "beforeSend", js.Array(value*))
      
      inline def setCollectUserIp(value: Boolean): Self = StObject.set(x, "collectUserIp", value.asInstanceOf[js.Any])
      
      inline def setCollectUserIpUndefined: Self = StObject.set(x, "collectUserIp", js.undefined)
      
      inline def setConsoleBreadcrumbsEnabled(value: Boolean): Self = StObject.set(x, "consoleBreadcrumbsEnabled", value.asInstanceOf[js.Any])
      
      inline def setConsoleBreadcrumbsEnabledUndefined: Self = StObject.set(x, "consoleBreadcrumbsEnabled", js.undefined)
      
      inline def setEndpoint(value: String): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
      
      inline def setEndpointUndefined: Self = StObject.set(x, "endpoint", js.undefined)
      
      inline def setEndpoints(value: Notify): Self = StObject.set(x, "endpoints", value.asInstanceOf[js.Any])
      
      inline def setEndpointsUndefined: Self = StObject.set(x, "endpoints", js.undefined)
      
      inline def setInteractionBreadcrumbsEnabled(value: Boolean): Self = StObject.set(x, "interactionBreadcrumbsEnabled", value.asInstanceOf[js.Any])
      
      inline def setInteractionBreadcrumbsEnabledUndefined: Self = StObject.set(x, "interactionBreadcrumbsEnabled", js.undefined)
      
      inline def setLogger(value: ILogger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      
      inline def setLoggerNull: Self = StObject.set(x, "logger", null)
      
      inline def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
      
      inline def setMaxBreadcrumbs(value: Double): Self = StObject.set(x, "maxBreadcrumbs", value.asInstanceOf[js.Any])
      
      inline def setMaxBreadcrumbsUndefined: Self = StObject.set(x, "maxBreadcrumbs", js.undefined)
      
      inline def setMaxEvents(value: Double): Self = StObject.set(x, "maxEvents", value.asInstanceOf[js.Any])
      
      inline def setMaxEventsUndefined: Self = StObject.set(x, "maxEvents", js.undefined)
      
      inline def setMetaData(value: js.Object): Self = StObject.set(x, "metaData", value.asInstanceOf[js.Any])
      
      inline def setMetaDataNull: Self = StObject.set(x, "metaData", null)
      
      inline def setMetaDataUndefined: Self = StObject.set(x, "metaData", js.undefined)
      
      inline def setNavigationBreadcrumbsEnabled(value: Boolean): Self = StObject.set(x, "navigationBreadcrumbsEnabled", value.asInstanceOf[js.Any])
      
      inline def setNavigationBreadcrumbsEnabledUndefined: Self = StObject.set(x, "navigationBreadcrumbsEnabled", js.undefined)
      
      inline def setNetworkBreadcrumbsEnabled(value: Boolean): Self = StObject.set(x, "networkBreadcrumbsEnabled", value.asInstanceOf[js.Any])
      
      inline def setNetworkBreadcrumbsEnabledUndefined: Self = StObject.set(x, "networkBreadcrumbsEnabled", js.undefined)
      
      inline def setNotifyReleaseStages(value: js.Array[String]): Self = StObject.set(x, "notifyReleaseStages", value.asInstanceOf[js.Any])
      
      inline def setNotifyReleaseStagesUndefined: Self = StObject.set(x, "notifyReleaseStages", js.undefined)
      
      inline def setNotifyReleaseStagesVarargs(value: String*): Self = StObject.set(x, "notifyReleaseStages", js.Array(value*))
      
      inline def setReleaseStage(value: String): Self = StObject.set(x, "releaseStage", value.asInstanceOf[js.Any])
      
      inline def setReleaseStageUndefined: Self = StObject.set(x, "releaseStage", js.undefined)
      
      inline def setSessionEndpoint(value: String): Self = StObject.set(x, "sessionEndpoint", value.asInstanceOf[js.Any])
      
      inline def setSessionEndpointUndefined: Self = StObject.set(x, "sessionEndpoint", js.undefined)
      
      inline def setUser(value: js.Object): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
      
      inline def setUserNull: Self = StObject.set(x, "user", null)
      
      inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
    }
  }
  
  trait IFinalConfig
    extends StObject
       with IConfig {
    
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
    var endpoints_IFinalConfig: Notify
    
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
    
    inline def apply(
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
      val __obj = js.Dynamic.literal(apiKey = apiKey.asInstanceOf[js.Any], autoBreadcrumbs = autoBreadcrumbs.asInstanceOf[js.Any], autoCaptureSessions = autoCaptureSessions.asInstanceOf[js.Any], autoNotify = autoNotify.asInstanceOf[js.Any], beforeSend = beforeSend.asInstanceOf[js.Any], collectUserIp = collectUserIp.asInstanceOf[js.Any], consoleBreadcrumbsEnabled = consoleBreadcrumbsEnabled.asInstanceOf[js.Any], endpoints = endpoints.asInstanceOf[js.Any], interactionBreadcrumbsEnabled = interactionBreadcrumbsEnabled.asInstanceOf[js.Any], maxBreadcrumbs = maxBreadcrumbs.asInstanceOf[js.Any], maxEvents = maxEvents.asInstanceOf[js.Any], navigationBreadcrumbsEnabled = navigationBreadcrumbsEnabled.asInstanceOf[js.Any], notifyReleaseStages = notifyReleaseStages.asInstanceOf[js.Any], releaseStage = releaseStage.asInstanceOf[js.Any], metaData = null, user = null)
      __obj.asInstanceOf[IFinalConfig]
    }
    
    extension [Self <: IFinalConfig](x: Self) {
      
      inline def setAutoBreadcrumbs(value: Boolean): Self = StObject.set(x, "autoBreadcrumbs", value.asInstanceOf[js.Any])
      
      inline def setAutoCaptureSessions(value: Boolean): Self = StObject.set(x, "autoCaptureSessions", value.asInstanceOf[js.Any])
      
      inline def setAutoNotify(value: Boolean): Self = StObject.set(x, "autoNotify", value.asInstanceOf[js.Any])
      
      inline def setBeforeSend(value: js.Array[BeforeSend]): Self = StObject.set(x, "beforeSend", value.asInstanceOf[js.Any])
      
      inline def setBeforeSendVarargs(value: BeforeSend*): Self = StObject.set(x, "beforeSend", js.Array(value*))
      
      inline def setCollectUserIp(value: Boolean): Self = StObject.set(x, "collectUserIp", value.asInstanceOf[js.Any])
      
      inline def setConsoleBreadcrumbsEnabled(value: Boolean): Self = StObject.set(x, "consoleBreadcrumbsEnabled", value.asInstanceOf[js.Any])
      
      inline def setEndpoints(value: Notify): Self = StObject.set(x, "endpoints", value.asInstanceOf[js.Any])
      
      inline def setInteractionBreadcrumbsEnabled(value: Boolean): Self = StObject.set(x, "interactionBreadcrumbsEnabled", value.asInstanceOf[js.Any])
      
      inline def setMaxBreadcrumbs(value: Double): Self = StObject.set(x, "maxBreadcrumbs", value.asInstanceOf[js.Any])
      
      inline def setMaxEvents(value: Double): Self = StObject.set(x, "maxEvents", value.asInstanceOf[js.Any])
      
      inline def setMetaData(value: js.Object): Self = StObject.set(x, "metaData", value.asInstanceOf[js.Any])
      
      inline def setMetaDataNull: Self = StObject.set(x, "metaData", null)
      
      inline def setNavigationBreadcrumbsEnabled(value: Boolean): Self = StObject.set(x, "navigationBreadcrumbsEnabled", value.asInstanceOf[js.Any])
      
      inline def setNotifyReleaseStages(value: js.Array[String]): Self = StObject.set(x, "notifyReleaseStages", value.asInstanceOf[js.Any])
      
      inline def setNotifyReleaseStagesVarargs(value: String*): Self = StObject.set(x, "notifyReleaseStages", js.Array(value*))
      
      inline def setReleaseStage(value: String): Self = StObject.set(x, "releaseStage", value.asInstanceOf[js.Any])
      
      inline def setUser(value: js.Object): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
      
      inline def setUserNull: Self = StObject.set(x, "user", null)
    }
  }
}
