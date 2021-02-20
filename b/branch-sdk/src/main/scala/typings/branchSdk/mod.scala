package typings.branchSdk

import org.scalablytyped.runtime.StringDictionary
import typings.branchSdk.anon.Amount
import typings.branchSdk.anon.Dictcustomkey
import typings.branchSdk.anon.Makenewlink
import typings.branchSdk.branchSdkStrings.purchase
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @js.native
  sealed trait JourneyEvent extends StObject
  @JSImport("branch-sdk", "JourneyEvent")
  @js.native
  object JourneyEvent extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[JourneyEvent with String] = js.native
    
    @js.native
    sealed trait didCallJourneyClose extends JourneyEvent
    /* "didCallJourneyClose" */ val didCallJourneyClose: typings.branchSdk.mod.JourneyEvent.didCallJourneyClose with String = js.native
    
    @js.native
    sealed trait didClickJourneyCTA extends JourneyEvent
    /* "didClickJourneyCTA" */ val didClickJourneyCTA: typings.branchSdk.mod.JourneyEvent.didClickJourneyCTA with String = js.native
    
    @js.native
    sealed trait didClickJourneyClose extends JourneyEvent
    /* "didClickJourneyClose" */ val didClickJourneyClose: typings.branchSdk.mod.JourneyEvent.didClickJourneyClose with String = js.native
    
    @js.native
    sealed trait didCloseJourney extends JourneyEvent
    /* "didCloseJourney" */ val didCloseJourney: typings.branchSdk.mod.JourneyEvent.didCloseJourney with String = js.native
    
    @js.native
    sealed trait didShowJourney extends JourneyEvent
    /* "didShowJourney" */ val didShowJourney: typings.branchSdk.mod.JourneyEvent.didShowJourney with String = js.native
    
    @js.native
    sealed trait willCloseJourney extends JourneyEvent
    /* "willCloseJourney" */ val willCloseJourney: typings.branchSdk.mod.JourneyEvent.willCloseJourney with String = js.native
    
    @js.native
    sealed trait willNotShowJourney extends JourneyEvent
    /* "willNotShowJourney" */ val willNotShowJourney: typings.branchSdk.mod.JourneyEvent.willNotShowJourney with String = js.native
    
    @js.native
    sealed trait willShowJourney extends JourneyEvent
    /* "willShowJourney" */ val willShowJourney: typings.branchSdk.mod.JourneyEvent.willShowJourney with String = js.native
  }
  
  @js.native
  sealed trait UriRedirectMode extends StObject
  @JSImport("branch-sdk", "UriRedirectMode")
  @js.native
  object UriRedirectMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[UriRedirectMode with Double] = js.native
    
    /**
      * This is the default value that yields the standard behavior where we don't try to open the app if the user can see an error.
      */
    @js.native
    sealed trait Default extends UriRedirectMode
    /* 0 */ val Default: typings.branchSdk.mod.UriRedirectMode.Default with Double = js.native
    
    /**
      * Forceful redirect mode. Always try to force open the app, even if it risks showing an error message when the app is not installed.
      */
    @js.native
    sealed trait Forceful extends UriRedirectMode
    /* 2 */ val Forceful: typings.branchSdk.mod.UriRedirectMode.Forceful with Double = js.native
    
    /**
      * Smart redirect mode. Same behavior as Default until we know the user has the app installed through Branch persona data. In that case, force URI schemes to open the app.
      */
    @js.native
    sealed trait Smart extends UriRedirectMode
    /* 1 */ val Smart: typings.branchSdk.mod.UriRedirectMode.Smart with Double = js.native
  }
  
  @JSImport("branch-sdk", "addListener")
  @js.native
  def addListener(
    event: js.UndefOr[scala.Nothing],
    listener: js.Function2[/* event */ JourneyEvent, /* data */ js.Object, Unit]
  ): Unit = js.native
  @JSImport("branch-sdk", "addListener")
  @js.native
  def addListener(event: JourneyEvent, listener: js.Function2[/* event */ JourneyEvent, /* data */ js.Object, Unit]): Unit = js.native
  
  @JSImport("branch-sdk", "autoAppIndex")
  @js.native
  def autoAppIndex(data: AutoAppIndexData): Unit = js.native
  @JSImport("branch-sdk", "autoAppIndex")
  @js.native
  def autoAppIndex(data: AutoAppIndexData, callback: js.Function1[/* err */ BranchError, Unit]): Unit = js.native
  
  @JSImport("branch-sdk", "closeJourney")
  @js.native
  def closeJourney(): Unit = js.native
  @JSImport("branch-sdk", "closeJourney")
  @js.native
  def closeJourney(callback: js.Function1[/* err */ BranchError, Unit]): Unit = js.native
  
  @JSImport("branch-sdk", "creditHistory")
  @js.native
  def creditHistory(
    options: CreditHistoryOptions,
    callback: js.Function2[/* err */ BranchError, /* data */ CreditHistoryCallbackResponse, Unit]
  ): Unit = js.native
  
  @JSImport("branch-sdk", "credits")
  @js.native
  def credits(callback: js.Function2[/* err */ BranchError, /* data */ Record[String, Double], Unit]): Unit = js.native
  
  @JSImport("branch-sdk", "crossPlatformIds")
  @js.native
  def crossPlatformIds(callback: js.Function2[/* err */ BranchError, /* data */ js.Any, Unit]): Unit = js.native
  
  @JSImport("branch-sdk", "data")
  @js.native
  def data(): Unit = js.native
  @JSImport("branch-sdk", "data")
  @js.native
  def data(callback: js.Function2[/* err */ BranchError, /* data */ SessionData | Null, Unit]): Unit = js.native
  
  @JSImport("branch-sdk", "deepview")
  @js.native
  def deepview(deepview_data: DeepLinkData): Unit = js.native
  @JSImport("branch-sdk", "deepview")
  @js.native
  def deepview(
    deepview_data: DeepLinkData,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* err */ BranchError, Unit]
  ): Unit = js.native
  @JSImport("branch-sdk", "deepview")
  @js.native
  def deepview(deepview_data: DeepLinkData, options: DeepViewOptions): Unit = js.native
  @JSImport("branch-sdk", "deepview")
  @js.native
  def deepview(
    deepview_data: DeepLinkData,
    options: DeepViewOptions,
    callback: js.Function1[/* err */ BranchError, Unit]
  ): Unit = js.native
  
  @JSImport("branch-sdk", "deepviewCta")
  @js.native
  def deepviewCta(): Unit = js.native
  
  @JSImport("branch-sdk", "disableTracking")
  @js.native
  def disableTracking(): Unit = js.native
  @JSImport("branch-sdk", "disableTracking")
  @js.native
  def disableTracking(disable: Boolean): Unit = js.native
  
  @JSImport("branch-sdk", "first")
  @js.native
  def first(): Unit = js.native
  @JSImport("branch-sdk", "first")
  @js.native
  def first(callback: js.Function2[/* err */ BranchError, /* data */ SessionData | Null, Unit]): Unit = js.native
  
  @JSImport("branch-sdk", "getBrowserFingerprintId")
  @js.native
  def getBrowserFingerprintId(callback: js.Function2[/* err */ BranchError, /* browser_fingerprint */ FingerprintResponse, Unit]): Unit = js.native
  
  @JSImport("branch-sdk", "init")
  @js.native
  def init(branch_key: String): Unit = js.native
  @JSImport("branch-sdk", "init")
  @js.native
  def init(
    branch_key: String,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* err */ BranchError, /* data */ SessionData | Null, Unit]
  ): Unit = js.native
  @JSImport("branch-sdk", "init")
  @js.native
  def init(branch_key: String, options: InitOptions): Unit = js.native
  @JSImport("branch-sdk", "init")
  @js.native
  def init(
    branch_key: String,
    options: InitOptions,
    callback: js.Function2[/* err */ BranchError, /* data */ SessionData | Null, Unit]
  ): Unit = js.native
  
  @JSImport("branch-sdk", "lastAttributedTouchData")
  @js.native
  def lastAttributedTouchData(attribution_window: Double): Unit = js.native
  @JSImport("branch-sdk", "lastAttributedTouchData")
  @js.native
  def lastAttributedTouchData(attribution_window: Double, callback: js.Function2[/* err */ BranchError, /* data */ js.Any, Unit]): Unit = js.native
  
  @JSImport("branch-sdk", "link")
  @js.native
  def link(
    link_data: DeepLinkData,
    callback: js.Function2[/* err */ BranchError, /* link */ String | Null, Unit]
  ): Unit = js.native
  
  @JSImport("branch-sdk", "logEvent")
  @js.native
  def logEvent(event: String): Unit = js.native
  @JSImport("branch-sdk", "logEvent")
  @js.native
  def logEvent(
    event: String,
    event_data_and_custom_data: js.UndefOr[scala.Nothing],
    content_items: js.UndefOr[scala.Nothing],
    customer_event_alias: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* err */ BranchError, Unit]
  ): Unit = js.native
  @JSImport("branch-sdk", "logEvent")
  @js.native
  def logEvent(
    event: String,
    event_data_and_custom_data: js.UndefOr[scala.Nothing],
    content_items: js.UndefOr[scala.Nothing],
    customer_event_alias: String
  ): Unit = js.native
  @JSImport("branch-sdk", "logEvent")
  @js.native
  def logEvent(
    event: String,
    event_data_and_custom_data: js.UndefOr[scala.Nothing],
    content_items: js.UndefOr[scala.Nothing],
    customer_event_alias: String,
    callback: js.Function1[/* err */ BranchError, Unit]
  ): Unit = js.native
  @JSImport("branch-sdk", "logEvent")
  @js.native
  def logEvent(
    event: String,
    event_data_and_custom_data: js.UndefOr[scala.Nothing],
    content_items: js.Array[js.Object]
  ): Unit = js.native
  @JSImport("branch-sdk", "logEvent")
  @js.native
  def logEvent(
    event: String,
    event_data_and_custom_data: js.UndefOr[scala.Nothing],
    content_items: js.Array[js.Object],
    customer_event_alias: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* err */ BranchError, Unit]
  ): Unit = js.native
  @JSImport("branch-sdk", "logEvent")
  @js.native
  def logEvent(
    event: String,
    event_data_and_custom_data: js.UndefOr[scala.Nothing],
    content_items: js.Array[js.Object],
    customer_event_alias: String
  ): Unit = js.native
  @JSImport("branch-sdk", "logEvent")
  @js.native
  def logEvent(
    event: String,
    event_data_and_custom_data: js.UndefOr[scala.Nothing],
    content_items: js.Array[js.Object],
    customer_event_alias: String,
    callback: js.Function1[/* err */ BranchError, Unit]
  ): Unit = js.native
  @JSImport("branch-sdk", "logEvent")
  @js.native
  def logEvent(event: String, event_data_and_custom_data: js.Object): Unit = js.native
  @JSImport("branch-sdk", "logEvent")
  @js.native
  def logEvent(
    event: String,
    event_data_and_custom_data: js.Object,
    content_items: js.UndefOr[scala.Nothing],
    customer_event_alias: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* err */ BranchError, Unit]
  ): Unit = js.native
  @JSImport("branch-sdk", "logEvent")
  @js.native
  def logEvent(
    event: String,
    event_data_and_custom_data: js.Object,
    content_items: js.UndefOr[scala.Nothing],
    customer_event_alias: String
  ): Unit = js.native
  @JSImport("branch-sdk", "logEvent")
  @js.native
  def logEvent(
    event: String,
    event_data_and_custom_data: js.Object,
    content_items: js.UndefOr[scala.Nothing],
    customer_event_alias: String,
    callback: js.Function1[/* err */ BranchError, Unit]
  ): Unit = js.native
  @JSImport("branch-sdk", "logEvent")
  @js.native
  def logEvent(event: String, event_data_and_custom_data: js.Object, content_items: js.Array[js.Object]): Unit = js.native
  @JSImport("branch-sdk", "logEvent")
  @js.native
  def logEvent(
    event: String,
    event_data_and_custom_data: js.Object,
    content_items: js.Array[js.Object],
    customer_event_alias: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* err */ BranchError, Unit]
  ): Unit = js.native
  @JSImport("branch-sdk", "logEvent")
  @js.native
  def logEvent(
    event: String,
    event_data_and_custom_data: js.Object,
    content_items: js.Array[js.Object],
    customer_event_alias: String
  ): Unit = js.native
  @JSImport("branch-sdk", "logEvent")
  @js.native
  def logEvent(
    event: String,
    event_data_and_custom_data: js.Object,
    content_items: js.Array[js.Object],
    customer_event_alias: String,
    callback: js.Function1[/* err */ BranchError, Unit]
  ): Unit = js.native
  
  @JSImport("branch-sdk", "logout")
  @js.native
  def logout(): Unit = js.native
  @JSImport("branch-sdk", "logout")
  @js.native
  def logout(callback: js.Function1[/* err */ BranchError, Unit]): Unit = js.native
  
  @JSImport("branch-sdk", "redeem")
  @js.native
  def redeem(amount: Double, bucket: String): Unit = js.native
  @JSImport("branch-sdk", "redeem")
  @js.native
  def redeem(amount: Double, bucket: String, callback: js.Function1[/* err */ BranchError, Unit]): Unit = js.native
  
  @JSImport("branch-sdk", "removeListener")
  @js.native
  def removeListener(listener: js.Function2[/* event */ JourneyEvent, /* data */ js.Object, Unit]): Unit = js.native
  
  @JSImport("branch-sdk", "sendSMS")
  @js.native
  def sendSMS(phone: String, link_data: DeepLinkData): Unit = js.native
  @JSImport("branch-sdk", "sendSMS")
  @js.native
  def sendSMS(
    phone: String,
    link_data: DeepLinkData,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* err */ BranchError, Unit]
  ): Unit = js.native
  @JSImport("branch-sdk", "sendSMS")
  @js.native
  def sendSMS(phone: String, link_data: DeepLinkData, options: Makenewlink): Unit = js.native
  @JSImport("branch-sdk", "sendSMS")
  @js.native
  def sendSMS(
    phone: String,
    link_data: DeepLinkData,
    options: Makenewlink,
    callback: js.Function1[/* err */ BranchError, Unit]
  ): Unit = js.native
  
  @JSImport("branch-sdk", "setBranchViewData")
  @js.native
  def setBranchViewData(view_data: DeepLinkData): Unit = js.native
  
  @JSImport("branch-sdk", "setIdentity")
  @js.native
  def setIdentity(identity: String): Unit = js.native
  @JSImport("branch-sdk", "setIdentity")
  @js.native
  def setIdentity(
    identity: String,
    callback: js.Function2[/* err */ BranchError, /* data */ IdentityCallbackData | Null, Unit]
  ): Unit = js.native
  
  @JSImport("branch-sdk", "track")
  @js.native
  def track(event: String): Unit = js.native
  @JSImport("branch-sdk", "track")
  @js.native
  def track(
    event: String,
    metadata: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* err */ BranchError, Unit]
  ): Unit = js.native
  @JSImport("branch-sdk", "track")
  @js.native
  def track(event: String, metadata: js.Object): Unit = js.native
  @JSImport("branch-sdk", "track")
  @js.native
  def track(event: String, metadata: js.Object, callback: js.Function1[/* err */ BranchError, Unit]): Unit = js.native
  
  @JSImport("branch-sdk", "trackCommerceEvent")
  @js.native
  def trackCommerceEvent_purchase(event: purchase, commerce_data: js.Object): Unit = js.native
  @JSImport("branch-sdk", "trackCommerceEvent")
  @js.native
  def trackCommerceEvent_purchase(
    event: purchase,
    commerce_data: js.Object,
    metadata: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* err */ BranchError, Unit]
  ): Unit = js.native
  @JSImport("branch-sdk", "trackCommerceEvent")
  @js.native
  def trackCommerceEvent_purchase(event: purchase, commerce_data: js.Object, metadata: js.Object): Unit = js.native
  @JSImport("branch-sdk", "trackCommerceEvent")
  @js.native
  def trackCommerceEvent_purchase(
    event: purchase,
    commerce_data: js.Object,
    metadata: js.Object,
    callback: js.Function1[/* err */ BranchError, Unit]
  ): Unit = js.native
  
  @js.native
  trait AutoAppIndexData extends StObject {
    
    var androidPackageName: js.UndefOr[String] = js.native
    
    var androidURL: js.UndefOr[String] = js.native
    
    var data: js.UndefOr[StringDictionary[CustomLinkData]] = js.native
    
    var iosAppId: js.UndefOr[String] = js.native
    
    var iosURL: js.UndefOr[String] = js.native
  }
  object AutoAppIndexData {
    
    @scala.inline
    def apply(): AutoAppIndexData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AutoAppIndexData]
    }
    
    @scala.inline
    implicit class AutoAppIndexDataMutableBuilder[Self <: AutoAppIndexData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAndroidPackageName(value: String): Self = StObject.set(x, "androidPackageName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAndroidPackageNameUndefined: Self = StObject.set(x, "androidPackageName", js.undefined)
      
      @scala.inline
      def setAndroidURL(value: String): Self = StObject.set(x, "androidURL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAndroidURLUndefined: Self = StObject.set(x, "androidURL", js.undefined)
      
      @scala.inline
      def setData(value: StringDictionary[CustomLinkData]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setIosAppId(value: String): Self = StObject.set(x, "iosAppId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIosAppIdUndefined: Self = StObject.set(x, "iosAppId", js.undefined)
      
      @scala.inline
      def setIosURL(value: String): Self = StObject.set(x, "iosURL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIosURLUndefined: Self = StObject.set(x, "iosURL", js.undefined)
    }
  }
  
  type BranchError = String | Null
  
  type CreditHistoryCallbackResponse = js.Array[CreditHistoryTransaction] | Null
  
  @js.native
  trait CreditHistoryOptions extends StObject {
    
    var begin_after_id: js.UndefOr[String] = js.native
    
    var bucket: js.UndefOr[String] = js.native
    
    var length: js.UndefOr[Double] = js.native
  }
  object CreditHistoryOptions {
    
    @scala.inline
    def apply(): CreditHistoryOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreditHistoryOptions]
    }
    
    @scala.inline
    implicit class CreditHistoryOptionsMutableBuilder[Self <: CreditHistoryOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBegin_after_id(value: String): Self = StObject.set(x, "begin_after_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBegin_after_idUndefined: Self = StObject.set(x, "begin_after_id", js.undefined)
      
      @scala.inline
      def setBucket(value: String): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBucketUndefined: Self = StObject.set(x, "bucket", js.undefined)
      
      @scala.inline
      def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    }
  }
  
  @js.native
  trait CreditHistoryTransaction extends StObject {
    
    var referree: String = js.native
    
    var referrer: String = js.native
    
    var transaction: Amount = js.native
  }
  object CreditHistoryTransaction {
    
    @scala.inline
    def apply(referree: String, referrer: String, transaction: Amount): CreditHistoryTransaction = {
      val __obj = js.Dynamic.literal(referree = referree.asInstanceOf[js.Any], referrer = referrer.asInstanceOf[js.Any], transaction = transaction.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreditHistoryTransaction]
    }
    
    @scala.inline
    implicit class CreditHistoryTransactionMutableBuilder[Self <: CreditHistoryTransaction] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setReferree(value: String): Self = StObject.set(x, "referree", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReferrer(value: String): Self = StObject.set(x, "referrer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransaction(value: Amount): Self = StObject.set(x, "transaction", value.asInstanceOf[js.Any])
    }
  }
  
  type CustomLinkData = String | Double | Boolean
  
  @js.native
  trait DeepLinkData extends StObject {
    
    /**
      * Use this field to organize the links by actual campaign. For example, if you launched a new feature or product and want to run a campaign around that
      */
    var campaign: js.UndefOr[String] = js.native
    
    // Analytical labels
    /**
      * Use channel to tag the route that your link reaches users. For example, tag links with 'Facebook' or 'LinkedIn' to help track clicks and installs through those paths separately
      */
    var channel: js.UndefOr[String] = js.native
    
    var data: js.UndefOr[Dictcustomkey] = js.native
    
    /**
      * This is the feature of your app that the link might be associated with. For example, if you had built a referral program, you would label links with the feature 'referral'
      */
    var feature: js.UndefOr[String] = js.native
    
    /**
      * Use this to categorize the progress or category of a user when the link was generated.
      * For example, if you had an invite system accessible on level 1, level 3 and 5, you could differentiate links generated at each level with this parameter.
      */
    var stage: js.UndefOr[String] = js.native
    
    /**
      * This is a free form entry with unlimited values ['string']. Use it to organize your link data with labels that don't fit within the bounds of the above
      */
    var tags: js.UndefOr[js.Array[String]] = js.native
  }
  object DeepLinkData {
    
    @scala.inline
    def apply(): DeepLinkData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeepLinkData]
    }
    
    @scala.inline
    implicit class DeepLinkDataMutableBuilder[Self <: DeepLinkData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCampaign(value: String): Self = StObject.set(x, "campaign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCampaignUndefined: Self = StObject.set(x, "campaign", js.undefined)
      
      @scala.inline
      def setChannel(value: String): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChannelUndefined: Self = StObject.set(x, "channel", js.undefined)
      
      @scala.inline
      def setData(value: Dictcustomkey): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setFeature(value: String): Self = StObject.set(x, "feature", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFeatureUndefined: Self = StObject.set(x, "feature", js.undefined)
      
      @scala.inline
      def setStage(value: String): Self = StObject.set(x, "stage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStageUndefined: Self = StObject.set(x, "stage", js.undefined)
      
      @scala.inline
      def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value :_*))
    }
  }
  
  @js.native
  trait DeepViewOptions extends StObject {
    
    var make_new_link: js.UndefOr[Boolean] = js.native
    
    var open_app: js.UndefOr[Boolean] = js.native
  }
  object DeepViewOptions {
    
    @scala.inline
    def apply(): DeepViewOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeepViewOptions]
    }
    
    @scala.inline
    implicit class DeepViewOptionsMutableBuilder[Self <: DeepViewOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMake_new_link(value: Boolean): Self = StObject.set(x, "make_new_link", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMake_new_linkUndefined: Self = StObject.set(x, "make_new_link", js.undefined)
      
      @scala.inline
      def setOpen_app(value: Boolean): Self = StObject.set(x, "open_app", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpen_appUndefined: Self = StObject.set(x, "open_app", js.undefined)
    }
  }
  
  type FingerprintResponse = String | Null
  
  @js.native
  trait IdentityCallbackData extends StObject {
    
    var identity_id: String = js.native
    
    var link: String = js.native
    
    var referring_data_parsed: js.UndefOr[js.Object] = js.native
    
    var referring_identity: js.UndefOr[String] = js.native
  }
  object IdentityCallbackData {
    
    @scala.inline
    def apply(identity_id: String, link: String): IdentityCallbackData = {
      val __obj = js.Dynamic.literal(identity_id = identity_id.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any])
      __obj.asInstanceOf[IdentityCallbackData]
    }
    
    @scala.inline
    implicit class IdentityCallbackDataMutableBuilder[Self <: IdentityCallbackData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIdentity_id(value: String): Self = StObject.set(x, "identity_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReferring_data_parsed(value: js.Object): Self = StObject.set(x, "referring_data_parsed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReferring_data_parsedUndefined: Self = StObject.set(x, "referring_data_parsed", js.undefined)
      
      @scala.inline
      def setReferring_identity(value: String): Self = StObject.set(x, "referring_identity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReferring_identityUndefined: Self = StObject.set(x, "referring_identity", js.undefined)
    }
  }
  
  @js.native
  trait InitOptions extends StObject {
    
    var branch_match_id: js.UndefOr[String] = js.native
    
    var branch_view_id: js.UndefOr[String] = js.native
    
    var disable_entry_animation: js.UndefOr[Boolean] = js.native
    
    var disable_exit_animation: js.UndefOr[Boolean] = js.native
    
    var metadata: js.UndefOr[js.Object] = js.native
    
    var no_journeys: js.UndefOr[Boolean] = js.native
    
    var nonce: js.UndefOr[String] = js.native
    
    var retries: js.UndefOr[Double] = js.native
    
    var retry_delay: js.UndefOr[Double] = js.native
    
    var timeout: js.UndefOr[Double] = js.native
    
    var tracking_disabled: js.UndefOr[Boolean] = js.native
  }
  object InitOptions {
    
    @scala.inline
    def apply(): InitOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InitOptions]
    }
    
    @scala.inline
    implicit class InitOptionsMutableBuilder[Self <: InitOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBranch_match_id(value: String): Self = StObject.set(x, "branch_match_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBranch_match_idUndefined: Self = StObject.set(x, "branch_match_id", js.undefined)
      
      @scala.inline
      def setBranch_view_id(value: String): Self = StObject.set(x, "branch_view_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBranch_view_idUndefined: Self = StObject.set(x, "branch_view_id", js.undefined)
      
      @scala.inline
      def setDisable_entry_animation(value: Boolean): Self = StObject.set(x, "disable_entry_animation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisable_entry_animationUndefined: Self = StObject.set(x, "disable_entry_animation", js.undefined)
      
      @scala.inline
      def setDisable_exit_animation(value: Boolean): Self = StObject.set(x, "disable_exit_animation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisable_exit_animationUndefined: Self = StObject.set(x, "disable_exit_animation", js.undefined)
      
      @scala.inline
      def setMetadata(value: js.Object): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
      
      @scala.inline
      def setNo_journeys(value: Boolean): Self = StObject.set(x, "no_journeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNo_journeysUndefined: Self = StObject.set(x, "no_journeys", js.undefined)
      
      @scala.inline
      def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
      
      @scala.inline
      def setRetries(value: Double): Self = StObject.set(x, "retries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRetriesUndefined: Self = StObject.set(x, "retries", js.undefined)
      
      @scala.inline
      def setRetry_delay(value: Double): Self = StObject.set(x, "retry_delay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRetry_delayUndefined: Self = StObject.set(x, "retry_delay", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      @scala.inline
      def setTracking_disabled(value: Boolean): Self = StObject.set(x, "tracking_disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTracking_disabledUndefined: Self = StObject.set(x, "tracking_disabled", js.undefined)
    }
  }
  
  @js.native
  trait SessionData extends StObject {
    
    @JSName("~referring_link")
    var Tildereferring_link: js.UndefOr[String] = js.native
    
    var has_app: Boolean = js.native
    
    var identity: String = js.native
    
    var referring_identity: js.UndefOr[String] = js.native
  }
  object SessionData {
    
    @scala.inline
    def apply(has_app: Boolean, identity: String): SessionData = {
      val __obj = js.Dynamic.literal(has_app = has_app.asInstanceOf[js.Any], identity = identity.asInstanceOf[js.Any])
      __obj.asInstanceOf[SessionData]
    }
    
    @scala.inline
    implicit class SessionDataMutableBuilder[Self <: SessionData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHas_app(value: Boolean): Self = StObject.set(x, "has_app", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdentity(value: String): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReferring_identity(value: String): Self = StObject.set(x, "referring_identity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReferring_identityUndefined: Self = StObject.set(x, "referring_identity", js.undefined)
      
      @scala.inline
      def setTildereferring_link(value: String): Self = StObject.set(x, "~referring_link", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTildereferring_linkUndefined: Self = StObject.set(x, "~referring_link", js.undefined)
    }
  }
}
