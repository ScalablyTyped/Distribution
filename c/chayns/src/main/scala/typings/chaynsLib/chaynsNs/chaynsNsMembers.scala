package typings
package chaynsLib.chaynsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chayns")
@js.native
object chaynsNsMembers extends js.Object {
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
  def addErrorListener(logFn: js.Function1[/* error */ js.Any, js.Promise[js.Object]], appName: java.lang.String): scala.Unit = js.native
  def addScrollListener(callback: js.Function1[/* data */ js.Any, _]): js.Promise[_] = js.native
  def addScrollListener(callback: js.Function1[/* data */ js.Any, _], throttle: scala.Double): js.Promise[_] = js.native
  def addToWallet(passbook: java.lang.String): js.Promise[_] = js.native
  def allowRefreshScroll(): js.Promise[_] = js.native
  def closeUrl(): scala.Unit = js.native
  def createQRCode(text: java.lang.String): js.Promise[java.lang.String] = js.native
  def createTappShortcut(name: java.lang.String, imageUrl: java.lang.String): js.Promise[_] = js.native
  def disableDisplayTimeout(): js.Promise[_] = js.native
  def disallowRefreshScroll(): js.Promise[_] = js.native
  def enableDisplayTimeout(): js.Promise[_] = js.native
  def findSite(name: java.lang.String): js.Promise[js.Array[chaynsLib.Site]] = js.native
  def findSite(name: java.lang.String, skip: scala.Double): js.Promise[js.Array[chaynsLib.Site]] = js.native
  def findSite(name: java.lang.String, skip: scala.Double, take: scala.Double): js.Promise[js.Array[chaynsLib.Site]] = js.native
  def getAvailableSharingServices(): js.Promise[js.Array[scala.Double]] = js.native
  def getBaseColor(): java.lang.String = js.native
  def getBaseColor(color: java.lang.String): java.lang.String = js.native
  def getBaseColor(color: java.lang.String, colorMode: scala.Double): java.lang.String = js.native
  def getBeaconHistory(): js.Promise[js.Array[chaynsLib.BeaconHistory]] = js.native
  def getBeaconHistory(subNumber: scala.Double): js.Promise[js.Array[chaynsLib.BeaconHistory]] = js.native
  def getGeoLocation(): js.Promise[chaynsLib.GeoLocationResult] = js.native
  def getGlobalData(): chaynsLib.GlobalData = js.native
  def getLocationBeacons(forceReload: scala.Boolean): js.Promise[js.Array[chaynsLib.LocationBeacon]] = js.native
  def getUacGroups(siteId: scala.Double): js.Promise[js.Array[chaynsLib.UacGroup]] = js.native
  def getUacGroups(siteId: scala.Double, updateCache: scala.Boolean): js.Promise[js.Array[chaynsLib.UacGroup]] = js.native
  def getUser(config: chaynsLib.GetUserConfig): js.Promise[chaynsLib.User] = js.native
  def hideFloatingButton(): scala.Unit = js.native
  def hideTitleImage(): js.Promise[_] = js.native
  def hideWaitCursor(): js.Promise[_] = js.native
  /**
       * Basic Functions
       * chayns
       */
  def login(): js.Promise[_] = js.native
  /**
       * Basic Functions
       * chayns
       */
  def login(parameters: js.Array[java.lang.String]): js.Promise[_] = js.native
  def navigateBack(): js.Promise[_] = js.native
  /**
       * Media Functions
       * Image
       * chayns
       */
  def openImage(urls: js.Array[java.lang.String]): js.Promise[_] = js.native
  /**
       * Media Functions
       * Image
       * chayns
       */
  def openImage(urls: js.Array[java.lang.String], start: scala.Double): js.Promise[_] = js.native
  def openUrl(config: chaynsLib.OpenUrlConfig): scala.Unit = js.native
  def openUrlInBrowser(url: java.lang.String): scala.Unit = js.native
  /**
       * Media Functions
       * Miscellaneous
       * chayns
       */
  def openVideo(url: java.lang.String): js.Promise[_] = js.native
  def playSound(url: java.lang.String): js.Promise[_] = js.native
  def playSound(url: java.lang.String, playOnMute: scala.Boolean): js.Promise[_] = js.native
  def register(config: chaynsLib.RegisterConfig): scala.Unit = js.native
  def removeNfcCallback(): js.Promise[_] = js.native
  def removeSubTapp(config: chaynsLib.RemoveSubTappConfig): scala.Unit = js.native
  def saveAppointment(config: chaynsLib.SaveAppointmentConfig): js.Promise[_] = js.native
  def scanQRCode(): js.Promise[_] = js.native
  def scanQRCode(cameryType: scala.Double): js.Promise[_] = js.native
  def scanQRCode(cameryType: scala.Double, timeout: scala.Double): js.Promise[_] = js.native
  def scrollToY(position: scala.Double): js.Promise[_] = js.native
  def selectTapp(tapp: chaynsLib.SelectTappConfig): js.Promise[_] = js.native
  def selectTapp(tapp: chaynsLib.SelectTappConfig, parameter: js.Array[java.lang.String]): js.Promise[_] = js.native
  def setHeight(config: chaynsLib.SetHeightConfig): js.Promise[_] = js.native
  def setNetworkChangeCallback(callback: js.Function1[/* result */ chaynsLib.NetworkChangeResult, _], ongoing: scala.Boolean): js.Promise[_] = js.native
  def setNfcCallback(callback: js.Function1[/* rfid */ java.lang.String, _]): js.Promise[_] = js.native
  def setOnActivateCallback(callback: js.Function1[/* tappEvent */ scala.Double, _]): js.Promise[_] = js.native
  def setScreenOrientation(orientation: scala.Double): js.Promise[_] = js.native
  def setSpeechToText(callback: js.Function1[/* result */ chaynsLib.SpeechToTextResult, _]): js.Promise[_] = js.native
  def setSpeechToText(callback: js.Function1[/* result */ chaynsLib.SpeechToTextResult, _], title: java.lang.String): js.Promise[_] = js.native
  def setSubTapp(config: chaynsLib.SubTappConfig): scala.Unit = js.native
  def share(config: chaynsLib.ShareConfig): js.Promise[_] = js.native
  def showFinetradingQRCode(): js.Promise[_] = js.native
  /**
       * UI Functions
       * Floating Button
       * chayns
       */
  def showFloatingButton(config: chaynsLib.FloatingConfig, callback: js.Function0[_]): scala.Unit = js.native
  def showTitleImage(): js.Promise[_] = js.native
  /**
       * UI Functions
       * Waitcursor
       * chayns
       */
  def showWaitCursor(): js.Promise[_] = js.native
  /**
       * UI Functions
       * Waitcursor
       * chayns
       */
  def showWaitCursor(text: java.lang.String): js.Promise[_] = js.native
  /**
       * UI Functions
       * Waitcursor
       * chayns
       */
  def showWaitCursor(text: java.lang.String, timeout: scala.Double): js.Promise[_] = js.native
  def startInteractionIdentification(config: chaynsLib.InteractionIdentificationConfig): js.Promise[_] = js.native
  def startNfcDetection(
    callback: js.Function1[/* result */ chaynsLib.NfcDetectionResult, _],
    interval: scala.Double,
    vibrate: scala.Boolean
  ): js.Promise[_] = js.native
  def stopInteractionIdentification(): js.Promise[_] = js.native
  def stopNfcDetection(): js.Promise[_] = js.native
  def updateNavigation(): js.Promise[_] = js.native
  def updateNavigation(tappId: scala.Double): js.Promise[_] = js.native
  def updateNavigation(tappId: scala.Double, config: chaynsLib.UpdateNavigationConfig): js.Promise[_] = js.native
  def uploadImage(): js.Promise[java.lang.String] = js.native
  def vibrate(ms: js.Array[scala.Double]): js.Promise[_] = js.native
}

