package typings.chayns.chaynsNs

import typings.chayns.BeaconHistory
import typings.chayns.FloatingConfig
import typings.chayns.GeoLocationResult
import typings.chayns.GetUserConfig
import typings.chayns.GlobalData
import typings.chayns.InteractionIdentificationConfig
import typings.chayns.LocationBeacon
import typings.chayns.NetworkChangeResult
import typings.chayns.NfcDetectionResult
import typings.chayns.OpenUrlConfig
import typings.chayns.RegisterConfig
import typings.chayns.RemoveSubTappConfig
import typings.chayns.SaveAppointmentConfig
import typings.chayns.SelectTappConfig
import typings.chayns.SetHeightConfig
import typings.chayns.ShareConfig
import typings.chayns.Site
import typings.chayns.SpeechToTextResult
import typings.chayns.SubTappConfig
import typings.chayns.UacGroup
import typings.chayns.UpdateNavigationConfig
import typings.chayns.User
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chayns")
@js.native
object ^ extends js.Object {
  /**
    * Getting Started
    * chayns
    *
    */
  var ready: js.Promise[js.Any] = js.native
  /**
    * chayns.smartShop
    */
  var smartShop: js.Any = js.native
  def addErrorListener(logFn: js.Function1[/* error */ js.Any, js.Promise[js.Object]], appName: String): Unit = js.native
  def addScrollListener(callback: js.Function1[/* data */ js.Any, _]): js.Promise[_] = js.native
  def addScrollListener(callback: js.Function1[/* data */ js.Any, _], throttle: Double): js.Promise[_] = js.native
  def addToWallet(passbook: String): js.Promise[_] = js.native
  def allowRefreshScroll(): js.Promise[_] = js.native
  def closeUrl(): Unit = js.native
  def createQRCode(text: String): js.Promise[String] = js.native
  def createTappShortcut(name: String, imageUrl: String): js.Promise[_] = js.native
  def disableDisplayTimeout(): js.Promise[_] = js.native
  def disallowRefreshScroll(): js.Promise[_] = js.native
  def enableDisplayTimeout(): js.Promise[_] = js.native
  def findSite(name: String): js.Promise[js.Array[Site]] = js.native
  def findSite(name: String, skip: Double): js.Promise[js.Array[Site]] = js.native
  def findSite(name: String, skip: Double, take: Double): js.Promise[js.Array[Site]] = js.native
  def getAvailableSharingServices(): js.Promise[js.Array[Double]] = js.native
  def getBaseColor(): String = js.native
  def getBaseColor(color: String): String = js.native
  def getBaseColor(color: String, colorMode: Double): String = js.native
  def getBeaconHistory(): js.Promise[js.Array[BeaconHistory]] = js.native
  def getBeaconHistory(subNumber: Double): js.Promise[js.Array[BeaconHistory]] = js.native
  def getGeoLocation(): js.Promise[GeoLocationResult] = js.native
  def getGlobalData(): GlobalData = js.native
  def getLocationBeacons(forceReload: Boolean): js.Promise[js.Array[LocationBeacon]] = js.native
  def getUacGroups(siteId: Double): js.Promise[js.Array[UacGroup]] = js.native
  def getUacGroups(siteId: Double, updateCache: Boolean): js.Promise[js.Array[UacGroup]] = js.native
  def getUser(config: GetUserConfig): js.Promise[User] = js.native
  def hideFloatingButton(): Unit = js.native
  def hideTitleImage(): js.Promise[_] = js.native
  def hideWaitCursor(): js.Promise[_] = js.native
  /**
    * Basic Functions
    * chayns
    */
  def login(): js.Promise[_] = js.native
  def login(parameters: js.Array[String]): js.Promise[_] = js.native
  def navigateBack(): js.Promise[_] = js.native
  /**
    * Media Functions
    * Image
    * chayns
    */
  def openImage(urls: js.Array[String]): js.Promise[_] = js.native
  def openImage(urls: js.Array[String], start: Double): js.Promise[_] = js.native
  def openUrl(config: OpenUrlConfig): Unit = js.native
  def openUrlInBrowser(url: String): Unit = js.native
  /**
    * Media Functions
    * Miscellaneous
    * chayns
    */
  def openVideo(url: String): js.Promise[_] = js.native
  def playSound(url: String): js.Promise[_] = js.native
  def playSound(url: String, playOnMute: Boolean): js.Promise[_] = js.native
  def register(config: RegisterConfig): Unit = js.native
  def removeNfcCallback(): js.Promise[_] = js.native
  def removeSubTapp(config: RemoveSubTappConfig): Unit = js.native
  def saveAppointment(config: SaveAppointmentConfig): js.Promise[_] = js.native
  def scanQRCode(): js.Promise[_] = js.native
  def scanQRCode(cameryType: Double): js.Promise[_] = js.native
  def scanQRCode(cameryType: Double, timeout: Double): js.Promise[_] = js.native
  def scrollToY(position: Double): js.Promise[_] = js.native
  def selectTapp(tapp: SelectTappConfig): js.Promise[_] = js.native
  def selectTapp(tapp: SelectTappConfig, parameter: js.Array[String]): js.Promise[_] = js.native
  def setHeight(config: SetHeightConfig): js.Promise[_] = js.native
  def setNetworkChangeCallback(callback: js.Function1[/* result */ NetworkChangeResult, _], ongoing: Boolean): js.Promise[_] = js.native
  def setNfcCallback(callback: js.Function1[/* rfid */ String, _]): js.Promise[_] = js.native
  def setOnActivateCallback(callback: js.Function1[/* tappEvent */ Double, _]): js.Promise[_] = js.native
  def setScreenOrientation(orientation: Double): js.Promise[_] = js.native
  def setSpeechToText(callback: js.Function1[/* result */ SpeechToTextResult, _]): js.Promise[_] = js.native
  def setSpeechToText(callback: js.Function1[/* result */ SpeechToTextResult, _], title: String): js.Promise[_] = js.native
  def setSubTapp(config: SubTappConfig): Unit = js.native
  def share(config: ShareConfig): js.Promise[_] = js.native
  def showFinetradingQRCode(): js.Promise[_] = js.native
  /**
    * UI Functions
    * Floating Button
    * chayns
    */
  def showFloatingButton(config: FloatingConfig, callback: js.Function0[_]): Unit = js.native
  def showTitleImage(): js.Promise[_] = js.native
  /**
    * UI Functions
    * Waitcursor
    * chayns
    */
  def showWaitCursor(): js.Promise[_] = js.native
  def showWaitCursor(text: String): js.Promise[_] = js.native
  def showWaitCursor(text: String, timeout: Double): js.Promise[_] = js.native
  def startInteractionIdentification(config: InteractionIdentificationConfig): js.Promise[_] = js.native
  def startNfcDetection(callback: js.Function1[/* result */ NfcDetectionResult, _], interval: Double, vibrate: Boolean): js.Promise[_] = js.native
  def stopInteractionIdentification(): js.Promise[_] = js.native
  def stopNfcDetection(): js.Promise[_] = js.native
  def updateNavigation(): js.Promise[_] = js.native
  def updateNavigation(tappId: Double): js.Promise[_] = js.native
  def updateNavigation(tappId: Double, config: UpdateNavigationConfig): js.Promise[_] = js.native
  def uploadImage(): js.Promise[String] = js.native
  def vibrate(ms: js.Array[Double]): js.Promise[_] = js.native
}

