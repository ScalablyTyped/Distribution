package typings.belter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("belter", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def getUserAgent(): String = js.native
  
  def isAndroid(ua: String): Boolean = js.native
  
  def isAndroidWebview(): Boolean = js.native
  def isAndroidWebview(ua: String): Boolean = js.native
  
  def isChrome(ua: String): Boolean = js.native
  
  def isDevice(userAgent: String): Boolean = js.native
  
  def isEdgeIOS(ua: String): Boolean = js.native
  
  def isElectron(): Boolean = js.native
  
  def isFacebookWebView(ua: String): Boolean = js.native
  
  def isFirefoxIOS(ua: String): Boolean = js.native
  
  def isGoogleSearchApp(ua: String): Boolean = js.native
  
  def isIE(): Boolean = js.native
  
  def isIECompHeader(): Boolean = js.native
  
  def isIEIntranet(): Boolean = js.native
  
  def isIos(ua: String): Boolean = js.native
  
  def isIosWebview(ua: String): Boolean = js.native
  
  def isMacOsCna(): Boolean = js.native
  
  def isOperaMini(ua: String): Boolean = js.native
  
  def isQQBrowser(ua: String): Boolean = js.native
  
  def isSafari(ua: String): Boolean = js.native
  
  def isStandAlone(): Boolean = js.native
  
  def isWebView(): Boolean = js.native
  
  def supportsPopups(ua: String): Boolean = js.native
}
