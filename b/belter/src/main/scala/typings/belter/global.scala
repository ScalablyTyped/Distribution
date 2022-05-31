package typings.belter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object belter {
    
    @JSGlobal("belter")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getUserAgent(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getUserAgent")().asInstanceOf[String]
    
    inline def isAndroid(ua: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAndroid")(ua.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def isAndroidWebview(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAndroidWebview")().asInstanceOf[Boolean]
    inline def isAndroidWebview(ua: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAndroidWebview")(ua.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def isChrome(ua: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isChrome")(ua.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def isDevice(userAgent: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDevice")(userAgent.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def isEdgeIOS(ua: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEdgeIOS")(ua.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def isElectron(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isElectron")().asInstanceOf[Boolean]
    
    inline def isFacebookWebView(ua: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFacebookWebView")(ua.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def isFirefoxIOS(ua: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFirefoxIOS")(ua.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def isGoogleSearchApp(ua: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isGoogleSearchApp")(ua.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def isIE(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIE")().asInstanceOf[Boolean]
    
    inline def isIECompHeader(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIECompHeader")().asInstanceOf[Boolean]
    
    inline def isIEIntranet(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIEIntranet")().asInstanceOf[Boolean]
    
    inline def isIos(ua: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIos")(ua.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def isIosWebview(ua: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIosWebview")(ua.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def isMacOsCna(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMacOsCna")().asInstanceOf[Boolean]
    
    inline def isOperaMini(ua: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isOperaMini")(ua.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def isQQBrowser(ua: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isQQBrowser")(ua.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def isSafari(ua: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSafari")(ua.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def isStandAlone(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isStandAlone")().asInstanceOf[Boolean]
    
    inline def isWebView(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isWebView")().asInstanceOf[Boolean]
    
    inline def supportsPopups(ua: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("supportsPopups")(ua.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
}
