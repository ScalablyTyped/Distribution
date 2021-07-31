package typings.belter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("belter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getUserAgent(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getUserAgent")().asInstanceOf[String]
  
  @scala.inline
  def isAndroid(ua: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAndroid")(ua.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isAndroidWebview(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAndroidWebview")().asInstanceOf[Boolean]
  @scala.inline
  def isAndroidWebview(ua: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAndroidWebview")(ua.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isChrome(ua: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isChrome")(ua.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isDevice(userAgent: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDevice")(userAgent.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isEdgeIOS(ua: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEdgeIOS")(ua.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isElectron(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isElectron")().asInstanceOf[Boolean]
  
  @scala.inline
  def isFacebookWebView(ua: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFacebookWebView")(ua.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isFirefoxIOS(ua: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFirefoxIOS")(ua.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isGoogleSearchApp(ua: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isGoogleSearchApp")(ua.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isIE(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIE")().asInstanceOf[Boolean]
  
  @scala.inline
  def isIECompHeader(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIECompHeader")().asInstanceOf[Boolean]
  
  @scala.inline
  def isIEIntranet(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIEIntranet")().asInstanceOf[Boolean]
  
  @scala.inline
  def isIos(ua: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIos")(ua.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isIosWebview(ua: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIosWebview")(ua.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isMacOsCna(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMacOsCna")().asInstanceOf[Boolean]
  
  @scala.inline
  def isOperaMini(ua: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isOperaMini")(ua.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isQQBrowser(ua: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isQQBrowser")(ua.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isSafari(ua: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSafari")(ua.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isStandAlone(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isStandAlone")().asInstanceOf[Boolean]
  
  @scala.inline
  def isWebView(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isWebView")().asInstanceOf[Boolean]
  
  @scala.inline
  def supportsPopups(ua: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("supportsPopups")(ua.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
