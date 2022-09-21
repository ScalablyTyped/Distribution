package typings.branchSdk

import org.scalablytyped.runtime.StringDictionary
import typings.branchSdk.anon.Amount
import typings.branchSdk.anon.Dictcustomkey
import typings.branchSdk.anon.Makenewlink
import typings.branchSdk.branchSdkStrings.purchase
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("branch-sdk", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait JourneyEvent extends StObject
  @JSImport("branch-sdk", "JourneyEvent")
  @js.native
  object JourneyEvent extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[JourneyEvent & String] = js.native
    
    @js.native
    sealed trait didCallJourneyClose
      extends StObject
         with JourneyEvent
    /* "didCallJourneyClose" */ val didCallJourneyClose: typings.branchSdk.mod.JourneyEvent.didCallJourneyClose & String = js.native
    
    @js.native
    sealed trait didClickJourneyCTA
      extends StObject
         with JourneyEvent
    /* "didClickJourneyCTA" */ val didClickJourneyCTA: typings.branchSdk.mod.JourneyEvent.didClickJourneyCTA & String = js.native
    
    @js.native
    sealed trait didClickJourneyClose
      extends StObject
         with JourneyEvent
    /* "didClickJourneyClose" */ val didClickJourneyClose: typings.branchSdk.mod.JourneyEvent.didClickJourneyClose & String = js.native
    
    @js.native
    sealed trait didCloseJourney
      extends StObject
         with JourneyEvent
    /* "didCloseJourney" */ val didCloseJourney: typings.branchSdk.mod.JourneyEvent.didCloseJourney & String = js.native
    
    @js.native
    sealed trait didShowJourney
      extends StObject
         with JourneyEvent
    /* "didShowJourney" */ val didShowJourney: typings.branchSdk.mod.JourneyEvent.didShowJourney & String = js.native
    
    @js.native
    sealed trait willCloseJourney
      extends StObject
         with JourneyEvent
    /* "willCloseJourney" */ val willCloseJourney: typings.branchSdk.mod.JourneyEvent.willCloseJourney & String = js.native
    
    @js.native
    sealed trait willNotShowJourney
      extends StObject
         with JourneyEvent
    /* "willNotShowJourney" */ val willNotShowJourney: typings.branchSdk.mod.JourneyEvent.willNotShowJourney & String = js.native
    
    @js.native
    sealed trait willShowJourney
      extends StObject
         with JourneyEvent
    /* "willShowJourney" */ val willShowJourney: typings.branchSdk.mod.JourneyEvent.willShowJourney & String = js.native
  }
  
  @js.native
  sealed trait UriRedirectMode extends StObject
  @JSImport("branch-sdk", "UriRedirectMode")
  @js.native
  object UriRedirectMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[UriRedirectMode & Double] = js.native
    
    /**
      * This is the default value that yields the standard behavior where we don't try to open the app if the user can see an error.
      */
    @js.native
    sealed trait Default
      extends StObject
         with UriRedirectMode
    /* 0 */ val Default: typings.branchSdk.mod.UriRedirectMode.Default & Double = js.native
    
    /**
      * Forceful redirect mode. Always try to force open the app, even if it risks showing an error message when the app is not installed.
      */
    @js.native
    sealed trait Forceful
      extends StObject
         with UriRedirectMode
    /* 2 */ val Forceful: typings.branchSdk.mod.UriRedirectMode.Forceful & Double = js.native
    
    /**
      * Smart redirect mode. Same behavior as Default until we know the user has the app installed through Branch persona data. In that case, force URI schemes to open the app.
      */
    @js.native
    sealed trait Smart
      extends StObject
         with UriRedirectMode
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
  
  trait AutoAppIndexData extends StObject {
    
    var androidPackageName: js.UndefOr[String] = js.undefined
    
    var androidURL: js.UndefOr[String] = js.undefined
    
    var data: js.UndefOr[StringDictionary[CustomLinkData]] = js.undefined
    
    var iosAppId: js.UndefOr[String] = js.undefined
    
    var iosURL: js.UndefOr[String] = js.undefined
  }
  object AutoAppIndexData {
    
    inline def apply(): AutoAppIndexData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AutoAppIndexData]
    }
    
    extension [Self <: AutoAppIndexData](x: Self) {
      
      inline def setAndroidPackageName(value: String): Self = StObject.set(x, "androidPackageName", value.asInstanceOf[js.Any])
      
      inline def setAndroidPackageNameUndefined: Self = StObject.set(x, "androidPackageName", js.undefined)
      
      inline def setAndroidURL(value: String): Self = StObject.set(x, "androidURL", value.asInstanceOf[js.Any])
      
      inline def setAndroidURLUndefined: Self = StObject.set(x, "androidURL", js.undefined)
      
      inline def setData(value: StringDictionary[CustomLinkData]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setIosAppId(value: String): Self = StObject.set(x, "iosAppId", value.asInstanceOf[js.Any])
      
      inline def setIosAppIdUndefined: Self = StObject.set(x, "iosAppId", js.undefined)
      
      inline def setIosURL(value: String): Self = StObject.set(x, "iosURL", value.asInstanceOf[js.Any])
      
      inline def setIosURLUndefined: Self = StObject.set(x, "iosURL", js.undefined)
    }
  }
  
  type BranchError = String | Null
  
  type CreditHistoryCallbackResponse = js.Array[CreditHistoryTransaction] | Null
  
  trait CreditHistoryOptions extends StObject {
    
    var begin_after_id: js.UndefOr[String] = js.undefined
    
    var bucket: js.UndefOr[String] = js.undefined
    
    var length: js.UndefOr[Double] = js.undefined
  }
  object CreditHistoryOptions {
    
    inline def apply(): CreditHistoryOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreditHistoryOptions]
    }
    
    extension [Self <: CreditHistoryOptions](x: Self) {
      
      inline def setBegin_after_id(value: String): Self = StObject.set(x, "begin_after_id", value.asInstanceOf[js.Any])
      
      inline def setBegin_after_idUndefined: Self = StObject.set(x, "begin_after_id", js.undefined)
      
      inline def setBucket(value: String): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
      
      inline def setBucketUndefined: Self = StObject.set(x, "bucket", js.undefined)
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    }
  }
  
  trait CreditHistoryTransaction extends StObject {
    
    var referree: String
    
    var referrer: String
    
    var transaction: Amount
  }
  object CreditHistoryTransaction {
    
    inline def apply(referree: String, referrer: String, transaction: Amount): CreditHistoryTransaction = {
      val __obj = js.Dynamic.literal(referree = referree.asInstanceOf[js.Any], referrer = referrer.asInstanceOf[js.Any], transaction = transaction.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreditHistoryTransaction]
    }
    
    extension [Self <: CreditHistoryTransaction](x: Self) {
      
      inline def setReferree(value: String): Self = StObject.set(x, "referree", value.asInstanceOf[js.Any])
      
      inline def setReferrer(value: String): Self = StObject.set(x, "referrer", value.asInstanceOf[js.Any])
      
      inline def setTransaction(value: Amount): Self = StObject.set(x, "transaction", value.asInstanceOf[js.Any])
    }
  }
  
  type CustomLinkData = String | Double | Boolean
  
  trait DeepLinkData extends StObject {
    
    /**
      * Use this field to organize the links by actual campaign. For example, if you launched a new feature or product and want to run a campaign around that
      */
    var campaign: js.UndefOr[String] = js.undefined
    
    // Analytical labels
    /**
      * Use channel to tag the route that your link reaches users. For example, tag links with 'Facebook' or 'LinkedIn' to help track clicks and installs through those paths separately
      */
    var channel: js.UndefOr[String] = js.undefined
    
    var data: js.UndefOr[Dictcustomkey] = js.undefined
    
    /**
      * This is the feature of your app that the link might be associated with. For example, if you had built a referral program, you would label links with the feature 'referral'
      */
    var feature: js.UndefOr[String] = js.undefined
    
    /**
      * Use this to categorize the progress or category of a user when the link was generated.
      * For example, if you had an invite system accessible on level 1, level 3 and 5, you could differentiate links generated at each level with this parameter.
      */
    var stage: js.UndefOr[String] = js.undefined
    
    /**
      * This is a free form entry with unlimited values ['string']. Use it to organize your link data with labels that don't fit within the bounds of the above
      */
    var tags: js.UndefOr[js.Array[String]] = js.undefined
  }
  object DeepLinkData {
    
    inline def apply(): DeepLinkData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeepLinkData]
    }
    
    extension [Self <: DeepLinkData](x: Self) {
      
      inline def setCampaign(value: String): Self = StObject.set(x, "campaign", value.asInstanceOf[js.Any])
      
      inline def setCampaignUndefined: Self = StObject.set(x, "campaign", js.undefined)
      
      inline def setChannel(value: String): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
      
      inline def setChannelUndefined: Self = StObject.set(x, "channel", js.undefined)
      
      inline def setData(value: Dictcustomkey): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setFeature(value: String): Self = StObject.set(x, "feature", value.asInstanceOf[js.Any])
      
      inline def setFeatureUndefined: Self = StObject.set(x, "feature", js.undefined)
      
      inline def setStage(value: String): Self = StObject.set(x, "stage", value.asInstanceOf[js.Any])
      
      inline def setStageUndefined: Self = StObject.set(x, "stage", js.undefined)
      
      inline def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value*))
    }
  }
  
  trait DeepViewOptions extends StObject {
    
    var make_new_link: js.UndefOr[Boolean] = js.undefined
    
    var open_app: js.UndefOr[Boolean] = js.undefined
  }
  object DeepViewOptions {
    
    inline def apply(): DeepViewOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeepViewOptions]
    }
    
    extension [Self <: DeepViewOptions](x: Self) {
      
      inline def setMake_new_link(value: Boolean): Self = StObject.set(x, "make_new_link", value.asInstanceOf[js.Any])
      
      inline def setMake_new_linkUndefined: Self = StObject.set(x, "make_new_link", js.undefined)
      
      inline def setOpen_app(value: Boolean): Self = StObject.set(x, "open_app", value.asInstanceOf[js.Any])
      
      inline def setOpen_appUndefined: Self = StObject.set(x, "open_app", js.undefined)
    }
  }
  
  type FingerprintResponse = String | Null
  
  trait IdentityCallbackData extends StObject {
    
    var identity_id: String
    
    var link: String
    
    var referring_data_parsed: js.UndefOr[js.Object] = js.undefined
    
    var referring_identity: js.UndefOr[String] = js.undefined
  }
  object IdentityCallbackData {
    
    inline def apply(identity_id: String, link: String): IdentityCallbackData = {
      val __obj = js.Dynamic.literal(identity_id = identity_id.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any])
      __obj.asInstanceOf[IdentityCallbackData]
    }
    
    extension [Self <: IdentityCallbackData](x: Self) {
      
      inline def setIdentity_id(value: String): Self = StObject.set(x, "identity_id", value.asInstanceOf[js.Any])
      
      inline def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
      
      inline def setReferring_data_parsed(value: js.Object): Self = StObject.set(x, "referring_data_parsed", value.asInstanceOf[js.Any])
      
      inline def setReferring_data_parsedUndefined: Self = StObject.set(x, "referring_data_parsed", js.undefined)
      
      inline def setReferring_identity(value: String): Self = StObject.set(x, "referring_identity", value.asInstanceOf[js.Any])
      
      inline def setReferring_identityUndefined: Self = StObject.set(x, "referring_identity", js.undefined)
    }
  }
  
  trait InitOptions extends StObject {
    
    var branch_match_id: js.UndefOr[String] = js.undefined
    
    var branch_view_id: js.UndefOr[String] = js.undefined
    
    var disable_entry_animation: js.UndefOr[Boolean] = js.undefined
    
    var disable_exit_animation: js.UndefOr[Boolean] = js.undefined
    
    var metadata: js.UndefOr[js.Object] = js.undefined
    
    var no_journeys: js.UndefOr[Boolean] = js.undefined
    
    var nonce: js.UndefOr[String] = js.undefined
    
    var retries: js.UndefOr[Double] = js.undefined
    
    var retry_delay: js.UndefOr[Double] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
    
    var tracking_disabled: js.UndefOr[Boolean] = js.undefined
  }
  object InitOptions {
    
    inline def apply(): InitOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InitOptions]
    }
    
    extension [Self <: InitOptions](x: Self) {
      
      inline def setBranch_match_id(value: String): Self = StObject.set(x, "branch_match_id", value.asInstanceOf[js.Any])
      
      inline def setBranch_match_idUndefined: Self = StObject.set(x, "branch_match_id", js.undefined)
      
      inline def setBranch_view_id(value: String): Self = StObject.set(x, "branch_view_id", value.asInstanceOf[js.Any])
      
      inline def setBranch_view_idUndefined: Self = StObject.set(x, "branch_view_id", js.undefined)
      
      inline def setDisable_entry_animation(value: Boolean): Self = StObject.set(x, "disable_entry_animation", value.asInstanceOf[js.Any])
      
      inline def setDisable_entry_animationUndefined: Self = StObject.set(x, "disable_entry_animation", js.undefined)
      
      inline def setDisable_exit_animation(value: Boolean): Self = StObject.set(x, "disable_exit_animation", value.asInstanceOf[js.Any])
      
      inline def setDisable_exit_animationUndefined: Self = StObject.set(x, "disable_exit_animation", js.undefined)
      
      inline def setMetadata(value: js.Object): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
      
      inline def setNo_journeys(value: Boolean): Self = StObject.set(x, "no_journeys", value.asInstanceOf[js.Any])
      
      inline def setNo_journeysUndefined: Self = StObject.set(x, "no_journeys", js.undefined)
      
      inline def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
      
      inline def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
      
      inline def setRetries(value: Double): Self = StObject.set(x, "retries", value.asInstanceOf[js.Any])
      
      inline def setRetriesUndefined: Self = StObject.set(x, "retries", js.undefined)
      
      inline def setRetry_delay(value: Double): Self = StObject.set(x, "retry_delay", value.asInstanceOf[js.Any])
      
      inline def setRetry_delayUndefined: Self = StObject.set(x, "retry_delay", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setTracking_disabled(value: Boolean): Self = StObject.set(x, "tracking_disabled", value.asInstanceOf[js.Any])
      
      inline def setTracking_disabledUndefined: Self = StObject.set(x, "tracking_disabled", js.undefined)
    }
  }
  
  trait SessionData extends StObject {
    
    @JSName("~referring_link")
    var Tildereferring_link: js.UndefOr[String] = js.undefined
    
    var has_app: Boolean
    
    var identity: String
    
    var referring_identity: js.UndefOr[String] = js.undefined
  }
  object SessionData {
    
    inline def apply(has_app: Boolean, identity: String): SessionData = {
      val __obj = js.Dynamic.literal(has_app = has_app.asInstanceOf[js.Any], identity = identity.asInstanceOf[js.Any])
      __obj.asInstanceOf[SessionData]
    }
    
    extension [Self <: SessionData](x: Self) {
      
      inline def setHas_app(value: Boolean): Self = StObject.set(x, "has_app", value.asInstanceOf[js.Any])
      
      inline def setIdentity(value: String): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
      
      inline def setReferring_identity(value: String): Self = StObject.set(x, "referring_identity", value.asInstanceOf[js.Any])
      
      inline def setReferring_identityUndefined: Self = StObject.set(x, "referring_identity", js.undefined)
      
      inline def setTildereferring_link(value: String): Self = StObject.set(x, "~referring_link", value.asInstanceOf[js.Any])
      
      inline def setTildereferring_linkUndefined: Self = StObject.set(x, "~referring_link", js.undefined)
    }
  }
}
