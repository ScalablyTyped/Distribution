package typings.clevertapWebSdk

import org.scalablytyped.runtime.StringDictionary
import typings.clevertapWebSdk.clevertapWebSdkInts.`0`
import typings.clevertapWebSdk.clevertapWebSdkInts.`1`
import typings.clevertapWebSdk.clevertapWebSdkInts.`2`
import typings.clevertapWebSdk.clevertapWebSdkInts.`3`
import typings.clevertapWebSdk.clevertapWebSdkStrings.College
import typings.clevertapWebSdk.clevertapWebSdkStrings.F
import typings.clevertapWebSdk.clevertapWebSdkStrings.Graduate
import typings.clevertapWebSdk.clevertapWebSdkStrings.M
import typings.clevertapWebSdk.clevertapWebSdkStrings.N
import typings.clevertapWebSdk.clevertapWebSdkStrings.School
import typings.clevertapWebSdk.clevertapWebSdkStrings.Y
import typings.std.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object clevertapMod {
  
  @JSImport("clevertap-web-sdk/clevertap", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with CleverTap
  
  @js.native
  trait CleverTap extends StObject {
    
    def clear(): Unit = js.native
    
    var enablePersonalization: Boolean = js.native
    
    var event: EventHandler = js.native
    
    def getCleverTapID(): String | Null = js.native
    
    def init(accountId: String): Unit = js.native
    def init(accountId: String, region: Unit, targetDomain: String): Unit = js.native
    def init(accountId: String, region: Region): Unit = js.native
    def init(accountId: String, region: Region, targetDomain: String): Unit = js.native
    
    def logout(): Unit = js.native
    
    var notifications: NotificationHandler = js.native
    
    var onUserLogin: UserLoginHandler = js.native
    
    def pageChanged(): Unit = js.native
    
    var privacy: Privacy = js.native
    
    var profile: ProfileHandler = js.native
    
    def raiseNotificationClicked(): Unit = js.native
    
    var session: Session = js.native
    
    def setLogLevel(logLevel: `0` | `1` | `2` | `3`): Unit = js.native
    
    var spa: Boolean = js.native
    
    var user: User = js.native
  }
  
  type EventData = js.Object
  
  trait EventDetails extends StObject {
    
    var count: Double
    
    var firstTime: js.Date
    
    var lastTime: js.Date
  }
  object EventDetails {
    
    inline def apply(count: Double, firstTime: js.Date, lastTime: js.Date): EventDetails = {
      val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], firstTime = firstTime.asInstanceOf[js.Any], lastTime = lastTime.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventDetails]
    }
    
    extension [Self <: EventDetails](x: Self) {
      
      inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      inline def setFirstTime(value: js.Date): Self = StObject.set(x, "firstTime", value.asInstanceOf[js.Any])
      
      inline def setLastTime(value: js.Date): Self = StObject.set(x, "lastTime", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait EventHandler
    extends StObject
       with Array[Any] {
    
    def getDetails(evtName: String): js.UndefOr[EventDetails] = js.native
    
    def push(evtName: String, evtNameOrData: EventNameOrData*): `0` = js.native
  }
  
  type EventName = String
  
  type EventNameOrData = EventName | EventData
  
  trait NotificationData extends StObject {
    
    var apnsWebPushId: js.UndefOr[String] = js.undefined
    
    var apnsWebPushServiceUrl: js.UndefOr[String] = js.undefined
    
    var askAgainTimeInSeconds: js.UndefOr[Double] = js.undefined
    
    var bodyText: String
    
    var hidePoweredByCT: js.UndefOr[Boolean] = js.undefined
    
    var httpsIframePath: js.UndefOr[String] = js.undefined
    
    var httpsPopupPath: js.UndefOr[String] = js.undefined
    
    var okButtonColor: js.UndefOr[String] = js.undefined
    
    var okButtonText: String
    
    var okCallback: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var rejectButtonText: String
    
    var rejectCallback: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var serviceWorkerPath: js.UndefOr[String] = js.undefined
    
    var skipDialog: js.UndefOr[Boolean] = js.undefined
    
    var subscriptionCallback: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var titleText: String
  }
  object NotificationData {
    
    inline def apply(bodyText: String, okButtonText: String, rejectButtonText: String, titleText: String): NotificationData = {
      val __obj = js.Dynamic.literal(bodyText = bodyText.asInstanceOf[js.Any], okButtonText = okButtonText.asInstanceOf[js.Any], rejectButtonText = rejectButtonText.asInstanceOf[js.Any], titleText = titleText.asInstanceOf[js.Any])
      __obj.asInstanceOf[NotificationData]
    }
    
    extension [Self <: NotificationData](x: Self) {
      
      inline def setApnsWebPushId(value: String): Self = StObject.set(x, "apnsWebPushId", value.asInstanceOf[js.Any])
      
      inline def setApnsWebPushIdUndefined: Self = StObject.set(x, "apnsWebPushId", js.undefined)
      
      inline def setApnsWebPushServiceUrl(value: String): Self = StObject.set(x, "apnsWebPushServiceUrl", value.asInstanceOf[js.Any])
      
      inline def setApnsWebPushServiceUrlUndefined: Self = StObject.set(x, "apnsWebPushServiceUrl", js.undefined)
      
      inline def setAskAgainTimeInSeconds(value: Double): Self = StObject.set(x, "askAgainTimeInSeconds", value.asInstanceOf[js.Any])
      
      inline def setAskAgainTimeInSecondsUndefined: Self = StObject.set(x, "askAgainTimeInSeconds", js.undefined)
      
      inline def setBodyText(value: String): Self = StObject.set(x, "bodyText", value.asInstanceOf[js.Any])
      
      inline def setHidePoweredByCT(value: Boolean): Self = StObject.set(x, "hidePoweredByCT", value.asInstanceOf[js.Any])
      
      inline def setHidePoweredByCTUndefined: Self = StObject.set(x, "hidePoweredByCT", js.undefined)
      
      inline def setHttpsIframePath(value: String): Self = StObject.set(x, "httpsIframePath", value.asInstanceOf[js.Any])
      
      inline def setHttpsIframePathUndefined: Self = StObject.set(x, "httpsIframePath", js.undefined)
      
      inline def setHttpsPopupPath(value: String): Self = StObject.set(x, "httpsPopupPath", value.asInstanceOf[js.Any])
      
      inline def setHttpsPopupPathUndefined: Self = StObject.set(x, "httpsPopupPath", js.undefined)
      
      inline def setOkButtonColor(value: String): Self = StObject.set(x, "okButtonColor", value.asInstanceOf[js.Any])
      
      inline def setOkButtonColorUndefined: Self = StObject.set(x, "okButtonColor", js.undefined)
      
      inline def setOkButtonText(value: String): Self = StObject.set(x, "okButtonText", value.asInstanceOf[js.Any])
      
      inline def setOkCallback(value: () => Unit): Self = StObject.set(x, "okCallback", js.Any.fromFunction0(value))
      
      inline def setOkCallbackUndefined: Self = StObject.set(x, "okCallback", js.undefined)
      
      inline def setRejectButtonText(value: String): Self = StObject.set(x, "rejectButtonText", value.asInstanceOf[js.Any])
      
      inline def setRejectCallback(value: () => Unit): Self = StObject.set(x, "rejectCallback", js.Any.fromFunction0(value))
      
      inline def setRejectCallbackUndefined: Self = StObject.set(x, "rejectCallback", js.undefined)
      
      inline def setServiceWorkerPath(value: String): Self = StObject.set(x, "serviceWorkerPath", value.asInstanceOf[js.Any])
      
      inline def setServiceWorkerPathUndefined: Self = StObject.set(x, "serviceWorkerPath", js.undefined)
      
      inline def setSkipDialog(value: Boolean): Self = StObject.set(x, "skipDialog", value.asInstanceOf[js.Any])
      
      inline def setSkipDialogUndefined: Self = StObject.set(x, "skipDialog", js.undefined)
      
      inline def setSubscriptionCallback(value: () => Unit): Self = StObject.set(x, "subscriptionCallback", js.Any.fromFunction0(value))
      
      inline def setSubscriptionCallbackUndefined: Self = StObject.set(x, "subscriptionCallback", js.undefined)
      
      inline def setTitleText(value: String): Self = StObject.set(x, "titleText", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait NotificationHandler
    extends StObject
       with Array[Any] {
    
    def push(notificationData: NotificationData): `0` = js.native
    def push(titleText: String, bodyText: String, okButtonText: String, rejectButtonText: String): `0` = js.native
    def push(
      titleText: String,
      bodyText: String,
      okButtonText: String,
      rejectButtonText: String,
      okButtonColor: String
    ): `0` = js.native
    def push(
      titleText: String,
      bodyText: String,
      okButtonText: String,
      rejectButtonText: String,
      okButtonColor: String,
      skipDialog: Boolean
    ): `0` = js.native
    def push(
      titleText: String,
      bodyText: String,
      okButtonText: String,
      rejectButtonText: String,
      okButtonColor: String,
      skipDialog: Boolean,
      askAgainTimeInSeconds: Double
    ): `0` = js.native
    def push(
      titleText: String,
      bodyText: String,
      okButtonText: String,
      rejectButtonText: String,
      okButtonColor: String,
      skipDialog: Unit,
      askAgainTimeInSeconds: Double
    ): `0` = js.native
    def push(
      titleText: String,
      bodyText: String,
      okButtonText: String,
      rejectButtonText: String,
      okButtonColor: Unit,
      skipDialog: Boolean
    ): `0` = js.native
    def push(
      titleText: String,
      bodyText: String,
      okButtonText: String,
      rejectButtonText: String,
      okButtonColor: Unit,
      skipDialog: Boolean,
      askAgainTimeInSeconds: Double
    ): `0` = js.native
    def push(
      titleText: String,
      bodyText: String,
      okButtonText: String,
      rejectButtonText: String,
      okButtonColor: Unit,
      skipDialog: Unit,
      askAgainTimeInSeconds: Double
    ): `0` = js.native
  }
  
  @js.native
  trait Privacy
    extends StObject
       with Array[Any]
  
  trait PrivacyData extends StObject {
    
    var optOut: js.UndefOr[Boolean] = js.undefined
    
    var useIP: js.UndefOr[Boolean] = js.undefined
  }
  object PrivacyData {
    
    inline def apply(): PrivacyData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PrivacyData]
    }
    
    extension [Self <: PrivacyData](x: Self) {
      
      inline def setOptOut(value: Boolean): Self = StObject.set(x, "optOut", value.asInstanceOf[js.Any])
      
      inline def setOptOutUndefined: Self = StObject.set(x, "optOut", js.undefined)
      
      inline def setUseIP(value: Boolean): Self = StObject.set(x, "useIP", value.asInstanceOf[js.Any])
      
      inline def setUseIPUndefined: Self = StObject.set(x, "useIP", js.undefined)
    }
  }
  
  trait ProfileData extends StObject {
    
    var Facebook: js.UndefOr[js.Object] = js.undefined
    
    var `Google Plus`: js.UndefOr[js.Object] = js.undefined
    
    var Site: js.UndefOr[SiteData] = js.undefined
  }
  object ProfileData {
    
    inline def apply(): ProfileData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ProfileData]
    }
    
    extension [Self <: ProfileData](x: Self) {
      
      inline def setFacebook(value: js.Object): Self = StObject.set(x, "Facebook", value.asInstanceOf[js.Any])
      
      inline def setFacebookUndefined: Self = StObject.set(x, "Facebook", js.undefined)
      
      inline def `setGoogle Plus`(value: js.Object): Self = StObject.set(x, "Google Plus", value.asInstanceOf[js.Any])
      
      inline def `setGoogle PlusUndefined`: Self = StObject.set(x, "Google Plus", js.undefined)
      
      inline def setSite(value: SiteData): Self = StObject.set(x, "Site", value.asInstanceOf[js.Any])
      
      inline def setSiteUndefined: Self = StObject.set(x, "Site", js.undefined)
    }
  }
  
  @js.native
  trait ProfileHandler
    extends StObject
       with Array[Any] {
    
    def getAttribute(profileName: String): Any = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.clevertapWebSdk.clevertapWebSdkStrings.eu1
    - typings.clevertapWebSdk.clevertapWebSdkStrings.in1
    - typings.clevertapWebSdk.clevertapWebSdkStrings.sg1
    - typings.clevertapWebSdk.clevertapWebSdkStrings.us1
    - typings.clevertapWebSdk.clevertapWebSdkStrings.sk1
  */
  trait Region extends StObject
  object Region {
    
    inline def eu1: typings.clevertapWebSdk.clevertapWebSdkStrings.eu1 = "eu1".asInstanceOf[typings.clevertapWebSdk.clevertapWebSdkStrings.eu1]
    
    inline def in1: typings.clevertapWebSdk.clevertapWebSdkStrings.in1 = "in1".asInstanceOf[typings.clevertapWebSdk.clevertapWebSdkStrings.in1]
    
    inline def sg1: typings.clevertapWebSdk.clevertapWebSdkStrings.sg1 = "sg1".asInstanceOf[typings.clevertapWebSdk.clevertapWebSdkStrings.sg1]
    
    inline def sk1: typings.clevertapWebSdk.clevertapWebSdkStrings.sk1 = "sk1".asInstanceOf[typings.clevertapWebSdk.clevertapWebSdkStrings.sk1]
    
    inline def us1: typings.clevertapWebSdk.clevertapWebSdkStrings.us1 = "us1".asInstanceOf[typings.clevertapWebSdk.clevertapWebSdkStrings.us1]
  }
  
  trait Session extends StObject {
    
    def getPageCount(): js.UndefOr[Double]
    
    def getTimeElapsed(): js.UndefOr[Double]
  }
  object Session {
    
    inline def apply(getPageCount: () => js.UndefOr[Double], getTimeElapsed: () => js.UndefOr[Double]): Session = {
      val __obj = js.Dynamic.literal(getPageCount = js.Any.fromFunction0(getPageCount), getTimeElapsed = js.Any.fromFunction0(getTimeElapsed))
      __obj.asInstanceOf[Session]
    }
    
    extension [Self <: Session](x: Self) {
      
      inline def setGetPageCount(value: () => js.UndefOr[Double]): Self = StObject.set(x, "getPageCount", js.Any.fromFunction0(value))
      
      inline def setGetTimeElapsed(value: () => js.UndefOr[Double]): Self = StObject.set(x, "getTimeElapsed", js.Any.fromFunction0(value))
    }
  }
  
  trait SiteData
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var Age: js.UndefOr[String | Double] = js.undefined
    
    var DOB: js.UndefOr[String | Double | js.Date] = js.undefined
    
    var Education: js.UndefOr[School | College | Graduate] = js.undefined
    
    var Employed: js.UndefOr[Y | N] = js.undefined
    
    var Gender: js.UndefOr[M | F] = js.undefined
    
    var Identity: js.UndefOr[String | Double] = js.undefined
    
    var Married: js.UndefOr[Y | N] = js.undefined
    
    var Name: js.UndefOr[String] = js.undefined
    
    var Phone: js.UndefOr[String | Double] = js.undefined
  }
  object SiteData {
    
    inline def apply(): SiteData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SiteData]
    }
    
    extension [Self <: SiteData](x: Self) {
      
      inline def setAge(value: String | Double): Self = StObject.set(x, "Age", value.asInstanceOf[js.Any])
      
      inline def setAgeUndefined: Self = StObject.set(x, "Age", js.undefined)
      
      inline def setDOB(value: String | Double | js.Date): Self = StObject.set(x, "DOB", value.asInstanceOf[js.Any])
      
      inline def setDOBUndefined: Self = StObject.set(x, "DOB", js.undefined)
      
      inline def setEducation(value: School | College | Graduate): Self = StObject.set(x, "Education", value.asInstanceOf[js.Any])
      
      inline def setEducationUndefined: Self = StObject.set(x, "Education", js.undefined)
      
      inline def setEmployed(value: Y | N): Self = StObject.set(x, "Employed", value.asInstanceOf[js.Any])
      
      inline def setEmployedUndefined: Self = StObject.set(x, "Employed", js.undefined)
      
      inline def setGender(value: M | F): Self = StObject.set(x, "Gender", value.asInstanceOf[js.Any])
      
      inline def setGenderUndefined: Self = StObject.set(x, "Gender", js.undefined)
      
      inline def setIdentity(value: String | Double): Self = StObject.set(x, "Identity", value.asInstanceOf[js.Any])
      
      inline def setIdentityUndefined: Self = StObject.set(x, "Identity", js.undefined)
      
      inline def setMarried(value: Y | N): Self = StObject.set(x, "Married", value.asInstanceOf[js.Any])
      
      inline def setMarriedUndefined: Self = StObject.set(x, "Married", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
      
      inline def setPhone(value: String | Double): Self = StObject.set(x, "Phone", value.asInstanceOf[js.Any])
      
      inline def setPhoneUndefined: Self = StObject.set(x, "Phone", js.undefined)
    }
  }
  
  trait User extends StObject {
    
    def getLastVisit(): js.UndefOr[js.Date]
    
    def getTotalVisits(): js.UndefOr[Double]
  }
  object User {
    
    inline def apply(getLastVisit: () => js.UndefOr[js.Date], getTotalVisits: () => js.UndefOr[Double]): User = {
      val __obj = js.Dynamic.literal(getLastVisit = js.Any.fromFunction0(getLastVisit), getTotalVisits = js.Any.fromFunction0(getTotalVisits))
      __obj.asInstanceOf[User]
    }
    
    extension [Self <: User](x: Self) {
      
      inline def setGetLastVisit(value: () => js.UndefOr[js.Date]): Self = StObject.set(x, "getLastVisit", js.Any.fromFunction0(value))
      
      inline def setGetTotalVisits(value: () => js.UndefOr[Double]): Self = StObject.set(x, "getTotalVisits", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait UserLoginHandler
    extends StObject
       with Array[Any] {
    
    def clear(): Unit = js.native
  }
}
