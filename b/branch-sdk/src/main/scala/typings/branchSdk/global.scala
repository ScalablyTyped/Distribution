package typings.branchSdk

import typings.branchSdk.anon.Makenewlink
import typings.branchSdk.branchSdkStrings.purchase
import typings.branchSdk.mod.AutoAppIndexData
import typings.branchSdk.mod.BranchError
import typings.branchSdk.mod.CreditHistoryCallbackResponse
import typings.branchSdk.mod.CreditHistoryOptions
import typings.branchSdk.mod.DeepLinkData
import typings.branchSdk.mod.DeepViewOptions
import typings.branchSdk.mod.FingerprintResponse
import typings.branchSdk.mod.IdentityCallbackData
import typings.branchSdk.mod.InitOptions
import typings.branchSdk.mod.JourneyEvent
import typings.branchSdk.mod.SessionData
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object branch {
    
    @JSGlobal("branch")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("branch.JourneyEvent")
    @js.native
    object JourneyEvent extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typings.branchSdk.mod.JourneyEvent & String] = js.native
      
      /* "didCallJourneyClose" */ val didCallJourneyClose: typings.branchSdk.mod.JourneyEvent.didCallJourneyClose & String = js.native
      
      /* "didClickJourneyCTA" */ val didClickJourneyCTA: typings.branchSdk.mod.JourneyEvent.didClickJourneyCTA & String = js.native
      
      /* "didClickJourneyClose" */ val didClickJourneyClose: typings.branchSdk.mod.JourneyEvent.didClickJourneyClose & String = js.native
      
      /* "didCloseJourney" */ val didCloseJourney: typings.branchSdk.mod.JourneyEvent.didCloseJourney & String = js.native
      
      /* "didShowJourney" */ val didShowJourney: typings.branchSdk.mod.JourneyEvent.didShowJourney & String = js.native
      
      /* "willCloseJourney" */ val willCloseJourney: typings.branchSdk.mod.JourneyEvent.willCloseJourney & String = js.native
      
      /* "willNotShowJourney" */ val willNotShowJourney: typings.branchSdk.mod.JourneyEvent.willNotShowJourney & String = js.native
      
      /* "willShowJourney" */ val willShowJourney: typings.branchSdk.mod.JourneyEvent.willShowJourney & String = js.native
    }
    
    @JSGlobal("branch.UriRedirectMode")
    @js.native
    object UriRedirectMode extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.branchSdk.mod.UriRedirectMode & Double] = js.native
      
      /* 0 */ val Default: typings.branchSdk.mod.UriRedirectMode.Default & Double = js.native
      
      /* 2 */ val Forceful: typings.branchSdk.mod.UriRedirectMode.Forceful & Double = js.native
      
      /* 1 */ val Smart: typings.branchSdk.mod.UriRedirectMode.Smart & Double = js.native
    }
    
    inline def addListener(event: Unit, listener: js.Function2[/* event */ JourneyEvent, /* data */ js.Object, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addListener(event: JourneyEvent, listener: js.Function2[/* event */ JourneyEvent, /* data */ js.Object, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def autoAppIndex(data: AutoAppIndexData): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("autoAppIndex")(data.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def autoAppIndex(data: AutoAppIndexData, callback: js.Function1[/* err */ BranchError, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("autoAppIndex")(data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def closeJourney(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("closeJourney")().asInstanceOf[Unit]
    inline def closeJourney(callback: js.Function1[/* err */ BranchError, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("closeJourney")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def creditHistory(
      options: CreditHistoryOptions,
      callback: js.Function2[/* err */ BranchError, /* data */ CreditHistoryCallbackResponse, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("creditHistory")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def credits(callback: js.Function2[/* err */ BranchError, /* data */ Record[String, Double], Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("credits")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def crossPlatformIds(callback: js.Function2[/* err */ BranchError, /* data */ Any, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("crossPlatformIds")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def data(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("data")().asInstanceOf[Unit]
    inline def data(callback: js.Function2[/* err */ BranchError, /* data */ SessionData | Null, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("data")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def deepview(deepview_data: DeepLinkData): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("deepview")(deepview_data.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def deepview(deepview_data: DeepLinkData, options: Unit, callback: js.Function1[/* err */ BranchError, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("deepview")(deepview_data.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def deepview(deepview_data: DeepLinkData, options: DeepViewOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("deepview")(deepview_data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def deepview(
      deepview_data: DeepLinkData,
      options: DeepViewOptions,
      callback: js.Function1[/* err */ BranchError, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("deepview")(deepview_data.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def deepviewCta(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("deepviewCta")().asInstanceOf[Unit]
    
    inline def disableTracking(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disableTracking")().asInstanceOf[Unit]
    inline def disableTracking(disable: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disableTracking")(disable.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def first(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("first")().asInstanceOf[Unit]
    inline def first(callback: js.Function2[/* err */ BranchError, /* data */ SessionData | Null, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("first")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def getBrowserFingerprintId(callback: js.Function2[/* err */ BranchError, /* browser_fingerprint */ FingerprintResponse, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getBrowserFingerprintId")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def init(branch_key: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(branch_key.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def init(
      branch_key: String,
      options: Unit,
      callback: js.Function2[/* err */ BranchError, /* data */ SessionData | Null, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(branch_key.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def init(branch_key: String, options: InitOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(branch_key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def init(
      branch_key: String,
      options: InitOptions,
      callback: js.Function2[/* err */ BranchError, /* data */ SessionData | Null, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(branch_key.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def lastAttributedTouchData(attribution_window: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("lastAttributedTouchData")(attribution_window.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def lastAttributedTouchData(attribution_window: Double, callback: js.Function2[/* err */ BranchError, /* data */ Any, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("lastAttributedTouchData")(attribution_window.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def link(
      link_data: DeepLinkData,
      callback: js.Function2[/* err */ BranchError, /* link */ String | Null, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("link")(link_data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def logEvent(event: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(event.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def logEvent(event: String, event_data_and_custom_data: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(event.asInstanceOf[js.Any], event_data_and_custom_data.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def logEvent(event: String, event_data_and_custom_data: js.Object, content_items: js.Array[js.Object]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(event.asInstanceOf[js.Any], event_data_and_custom_data.asInstanceOf[js.Any], content_items.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def logEvent(
      event: String,
      event_data_and_custom_data: js.Object,
      content_items: js.Array[js.Object],
      customer_event_alias: String
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(event.asInstanceOf[js.Any], event_data_and_custom_data.asInstanceOf[js.Any], content_items.asInstanceOf[js.Any], customer_event_alias.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def logEvent(
      event: String,
      event_data_and_custom_data: js.Object,
      content_items: js.Array[js.Object],
      customer_event_alias: String,
      callback: js.Function1[/* err */ BranchError, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(event.asInstanceOf[js.Any], event_data_and_custom_data.asInstanceOf[js.Any], content_items.asInstanceOf[js.Any], customer_event_alias.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def logEvent(
      event: String,
      event_data_and_custom_data: js.Object,
      content_items: js.Array[js.Object],
      customer_event_alias: Unit,
      callback: js.Function1[/* err */ BranchError, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(event.asInstanceOf[js.Any], event_data_and_custom_data.asInstanceOf[js.Any], content_items.asInstanceOf[js.Any], customer_event_alias.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def logEvent(
      event: String,
      event_data_and_custom_data: js.Object,
      content_items: Unit,
      customer_event_alias: String
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(event.asInstanceOf[js.Any], event_data_and_custom_data.asInstanceOf[js.Any], content_items.asInstanceOf[js.Any], customer_event_alias.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def logEvent(
      event: String,
      event_data_and_custom_data: js.Object,
      content_items: Unit,
      customer_event_alias: String,
      callback: js.Function1[/* err */ BranchError, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(event.asInstanceOf[js.Any], event_data_and_custom_data.asInstanceOf[js.Any], content_items.asInstanceOf[js.Any], customer_event_alias.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def logEvent(
      event: String,
      event_data_and_custom_data: js.Object,
      content_items: Unit,
      customer_event_alias: Unit,
      callback: js.Function1[/* err */ BranchError, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(event.asInstanceOf[js.Any], event_data_and_custom_data.asInstanceOf[js.Any], content_items.asInstanceOf[js.Any], customer_event_alias.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def logEvent(event: String, event_data_and_custom_data: Unit, content_items: js.Array[js.Object]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(event.asInstanceOf[js.Any], event_data_and_custom_data.asInstanceOf[js.Any], content_items.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def logEvent(
      event: String,
      event_data_and_custom_data: Unit,
      content_items: js.Array[js.Object],
      customer_event_alias: String
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(event.asInstanceOf[js.Any], event_data_and_custom_data.asInstanceOf[js.Any], content_items.asInstanceOf[js.Any], customer_event_alias.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def logEvent(
      event: String,
      event_data_and_custom_data: Unit,
      content_items: js.Array[js.Object],
      customer_event_alias: String,
      callback: js.Function1[/* err */ BranchError, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(event.asInstanceOf[js.Any], event_data_and_custom_data.asInstanceOf[js.Any], content_items.asInstanceOf[js.Any], customer_event_alias.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def logEvent(
      event: String,
      event_data_and_custom_data: Unit,
      content_items: js.Array[js.Object],
      customer_event_alias: Unit,
      callback: js.Function1[/* err */ BranchError, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(event.asInstanceOf[js.Any], event_data_and_custom_data.asInstanceOf[js.Any], content_items.asInstanceOf[js.Any], customer_event_alias.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def logEvent(event: String, event_data_and_custom_data: Unit, content_items: Unit, customer_event_alias: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(event.asInstanceOf[js.Any], event_data_and_custom_data.asInstanceOf[js.Any], content_items.asInstanceOf[js.Any], customer_event_alias.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def logEvent(
      event: String,
      event_data_and_custom_data: Unit,
      content_items: Unit,
      customer_event_alias: String,
      callback: js.Function1[/* err */ BranchError, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(event.asInstanceOf[js.Any], event_data_and_custom_data.asInstanceOf[js.Any], content_items.asInstanceOf[js.Any], customer_event_alias.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def logEvent(
      event: String,
      event_data_and_custom_data: Unit,
      content_items: Unit,
      customer_event_alias: Unit,
      callback: js.Function1[/* err */ BranchError, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(event.asInstanceOf[js.Any], event_data_and_custom_data.asInstanceOf[js.Any], content_items.asInstanceOf[js.Any], customer_event_alias.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def logout(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("logout")().asInstanceOf[Unit]
    inline def logout(callback: js.Function1[/* err */ BranchError, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("logout")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def redeem(amount: Double, bucket: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("redeem")(amount.asInstanceOf[js.Any], bucket.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def redeem(amount: Double, bucket: String, callback: js.Function1[/* err */ BranchError, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("redeem")(amount.asInstanceOf[js.Any], bucket.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def removeListener(listener: js.Function2[/* event */ JourneyEvent, /* data */ js.Object, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(listener.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def sendSMS(phone: String, link_data: DeepLinkData): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sendSMS")(phone.asInstanceOf[js.Any], link_data.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def sendSMS(
      phone: String,
      link_data: DeepLinkData,
      options: Unit,
      callback: js.Function1[/* err */ BranchError, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sendSMS")(phone.asInstanceOf[js.Any], link_data.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def sendSMS(phone: String, link_data: DeepLinkData, options: Makenewlink): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sendSMS")(phone.asInstanceOf[js.Any], link_data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def sendSMS(
      phone: String,
      link_data: DeepLinkData,
      options: Makenewlink,
      callback: js.Function1[/* err */ BranchError, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sendSMS")(phone.asInstanceOf[js.Any], link_data.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def setBranchViewData(view_data: DeepLinkData): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setBranchViewData")(view_data.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def setIdentity(identity: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setIdentity")(identity.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def setIdentity(
      identity: String,
      callback: js.Function2[/* err */ BranchError, /* data */ IdentityCallbackData | Null, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setIdentity")(identity.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def track(event: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("track")(event.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def track(event: String, metadata: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("track")(event.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def track(event: String, metadata: js.Object, callback: js.Function1[/* err */ BranchError, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("track")(event.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def track(event: String, metadata: Unit, callback: js.Function1[/* err */ BranchError, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("track")(event.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def trackCommerceEvent_purchase(event: purchase, commerce_data: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("trackCommerceEvent")(event.asInstanceOf[js.Any], commerce_data.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def trackCommerceEvent_purchase(event: purchase, commerce_data: js.Object, metadata: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("trackCommerceEvent")(event.asInstanceOf[js.Any], commerce_data.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def trackCommerceEvent_purchase(
      event: purchase,
      commerce_data: js.Object,
      metadata: js.Object,
      callback: js.Function1[/* err */ BranchError, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("trackCommerceEvent")(event.asInstanceOf[js.Any], commerce_data.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def trackCommerceEvent_purchase(
      event: purchase,
      commerce_data: js.Object,
      metadata: Unit,
      callback: js.Function1[/* err */ BranchError, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("trackCommerceEvent")(event.asInstanceOf[js.Any], commerce_data.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
}
