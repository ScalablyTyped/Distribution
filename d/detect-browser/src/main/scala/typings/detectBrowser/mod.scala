package typings.detectBrowser

import typings.detectBrowser.detectBrowserBooleans.`true`
import typings.detectBrowser.detectBrowserStrings.`bot-device`
import typings.detectBrowser.detectBrowserStrings.`react-native`
import typings.detectBrowser.detectBrowserStrings.browser
import typings.detectBrowser.detectBrowserStrings.ios_
import typings.detectBrowser.detectBrowserStrings.node
import typings.node.processMod.global.NodeJS.Platform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("detect-browser", "BotInfo")
  @js.native
  class BotInfo ()
    extends DetectedInfo[
          typings.detectBrowser.detectBrowserStrings.bot, 
          typings.detectBrowser.detectBrowserStrings.bot, 
          Null, 
          Null
        ] {
    
    val bot: `true` = js.native
    
    @JSName("type")
    val type_BotInfo: /* "bot" */ String = js.native
  }
  
  @JSImport("detect-browser", "BrowserInfo")
  @js.native
  class BrowserInfo protected () extends DetectedInfo[browser, Browser, OperatingSystem | Null, String] {
    def this(name: Browser, version: String) = this()
    def this(name: Browser, version: String, os: OperatingSystem) = this()
    
    @JSName("type")
    val type_BrowserInfo: /* "browser" */ String = js.native
  }
  
  @JSImport("detect-browser", "NodeInfo")
  @js.native
  class NodeInfo protected () extends DetectedInfo[node, node, Platform, String] {
    def this(version: String) = this()
    
    @JSName("type")
    val type_NodeInfo: /* "node" */ String = js.native
  }
  
  @JSImport("detect-browser", "ReactNativeInfo")
  @js.native
  class ReactNativeInfo () extends DetectedInfo[`react-native`, `react-native`, Null, Null] {
    
    @JSName("type")
    val type_ReactNativeInfo: /* "react-native" */ String = js.native
  }
  
  @JSImport("detect-browser", "SearchBotDeviceInfo")
  @js.native
  class SearchBotDeviceInfo protected () extends DetectedInfo[`bot-device`, Browser, OperatingSystem | Null, String] {
    def this(name: Browser, version: String, os: Null, bot: String) = this()
    def this(name: Browser, version: String, os: OperatingSystem, bot: String) = this()
    
    val bot: String = js.native
    
    @JSName("type")
    val type_SearchBotDeviceInfo: /* "bot-device" */ String = js.native
  }
  
  @JSImport("detect-browser", "browserName")
  @js.native
  def browserName(ua: String): Browser | Null = js.native
  
  @JSImport("detect-browser", "detect")
  @js.native
  def detect(): BrowserInfo | SearchBotDeviceInfo | BotInfo | NodeInfo | ReactNativeInfo | Null = js.native
  @JSImport("detect-browser", "detect")
  @js.native
  def detect(userAgent: String): BrowserInfo | SearchBotDeviceInfo | BotInfo | NodeInfo | ReactNativeInfo | Null = js.native
  
  @JSImport("detect-browser", "detectOS")
  @js.native
  def detectOS(ua: String): OperatingSystem | Null = js.native
  
  @JSImport("detect-browser", "getNodeVersion")
  @js.native
  def getNodeVersion(): NodeInfo | Null = js.native
  
  @JSImport("detect-browser", "parseUserAgent")
  @js.native
  def parseUserAgent(ua: String): BrowserInfo | SearchBotDeviceInfo | BotInfo | Null = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.detectBrowser.detectBrowserStrings.aol
    - typings.detectBrowser.detectBrowserStrings.edge
    - typings.detectBrowser.detectBrowserStrings.`edge-ios`
    - typings.detectBrowser.detectBrowserStrings.yandexbrowser
    - typings.detectBrowser.detectBrowserStrings.kakaotalk
    - typings.detectBrowser.detectBrowserStrings.samsung
    - typings.detectBrowser.detectBrowserStrings.silk
    - typings.detectBrowser.detectBrowserStrings.miui
    - typings.detectBrowser.detectBrowserStrings.beaker
    - typings.detectBrowser.detectBrowserStrings.`edge-chromium`
    - typings.detectBrowser.detectBrowserStrings.chrome
    - typings.detectBrowser.detectBrowserStrings.`chromium-webview`
    - typings.detectBrowser.detectBrowserStrings.phantomjs
    - typings.detectBrowser.detectBrowserStrings.crios
    - typings.detectBrowser.detectBrowserStrings.firefox
    - typings.detectBrowser.detectBrowserStrings.fxios
    - typings.detectBrowser.detectBrowserStrings.`opera-mini`
    - typings.detectBrowser.detectBrowserStrings.opera
    - typings.detectBrowser.detectBrowserStrings.ie
    - typings.detectBrowser.detectBrowserStrings.bb10
    - typings.detectBrowser.detectBrowserStrings.android
    - typings.detectBrowser.detectBrowserStrings.ios_
    - typings.detectBrowser.detectBrowserStrings.safari
    - typings.detectBrowser.detectBrowserStrings.facebook
    - typings.detectBrowser.detectBrowserStrings.instagram
    - typings.detectBrowser.detectBrowserStrings.`ios-webview`
    - typings.detectBrowser.detectBrowserStrings.searchbot
  */
  trait Browser extends StObject
  object Browser {
    
    @scala.inline
    def android: typings.detectBrowser.detectBrowserStrings.android = "android".asInstanceOf[typings.detectBrowser.detectBrowserStrings.android]
    
    @scala.inline
    def aol: typings.detectBrowser.detectBrowserStrings.aol = "aol".asInstanceOf[typings.detectBrowser.detectBrowserStrings.aol]
    
    @scala.inline
    def bb10: typings.detectBrowser.detectBrowserStrings.bb10 = "bb10".asInstanceOf[typings.detectBrowser.detectBrowserStrings.bb10]
    
    @scala.inline
    def beaker: typings.detectBrowser.detectBrowserStrings.beaker = "beaker".asInstanceOf[typings.detectBrowser.detectBrowserStrings.beaker]
    
    @scala.inline
    def chrome: typings.detectBrowser.detectBrowserStrings.chrome = "chrome".asInstanceOf[typings.detectBrowser.detectBrowserStrings.chrome]
    
    @scala.inline
    def `chromium-webview`: typings.detectBrowser.detectBrowserStrings.`chromium-webview` = "chromium-webview".asInstanceOf[typings.detectBrowser.detectBrowserStrings.`chromium-webview`]
    
    @scala.inline
    def crios: typings.detectBrowser.detectBrowserStrings.crios = "crios".asInstanceOf[typings.detectBrowser.detectBrowserStrings.crios]
    
    @scala.inline
    def edge: typings.detectBrowser.detectBrowserStrings.edge = "edge".asInstanceOf[typings.detectBrowser.detectBrowserStrings.edge]
    
    @scala.inline
    def `edge-chromium`: typings.detectBrowser.detectBrowserStrings.`edge-chromium` = "edge-chromium".asInstanceOf[typings.detectBrowser.detectBrowserStrings.`edge-chromium`]
    
    @scala.inline
    def `edge-ios`: typings.detectBrowser.detectBrowserStrings.`edge-ios` = "edge-ios".asInstanceOf[typings.detectBrowser.detectBrowserStrings.`edge-ios`]
    
    @scala.inline
    def facebook: typings.detectBrowser.detectBrowserStrings.facebook = "facebook".asInstanceOf[typings.detectBrowser.detectBrowserStrings.facebook]
    
    @scala.inline
    def firefox: typings.detectBrowser.detectBrowserStrings.firefox = "firefox".asInstanceOf[typings.detectBrowser.detectBrowserStrings.firefox]
    
    @scala.inline
    def fxios: typings.detectBrowser.detectBrowserStrings.fxios = "fxios".asInstanceOf[typings.detectBrowser.detectBrowserStrings.fxios]
    
    @scala.inline
    def ie: typings.detectBrowser.detectBrowserStrings.ie = "ie".asInstanceOf[typings.detectBrowser.detectBrowserStrings.ie]
    
    @scala.inline
    def instagram: typings.detectBrowser.detectBrowserStrings.instagram = "instagram".asInstanceOf[typings.detectBrowser.detectBrowserStrings.instagram]
    
    @scala.inline
    def ios: ios_ = "ios".asInstanceOf[ios_]
    
    @scala.inline
    def `ios-webview`: typings.detectBrowser.detectBrowserStrings.`ios-webview` = "ios-webview".asInstanceOf[typings.detectBrowser.detectBrowserStrings.`ios-webview`]
    
    @scala.inline
    def kakaotalk: typings.detectBrowser.detectBrowserStrings.kakaotalk = "kakaotalk".asInstanceOf[typings.detectBrowser.detectBrowserStrings.kakaotalk]
    
    @scala.inline
    def miui: typings.detectBrowser.detectBrowserStrings.miui = "miui".asInstanceOf[typings.detectBrowser.detectBrowserStrings.miui]
    
    @scala.inline
    def opera: typings.detectBrowser.detectBrowserStrings.opera = "opera".asInstanceOf[typings.detectBrowser.detectBrowserStrings.opera]
    
    @scala.inline
    def `opera-mini`: typings.detectBrowser.detectBrowserStrings.`opera-mini` = "opera-mini".asInstanceOf[typings.detectBrowser.detectBrowserStrings.`opera-mini`]
    
    @scala.inline
    def phantomjs: typings.detectBrowser.detectBrowserStrings.phantomjs = "phantomjs".asInstanceOf[typings.detectBrowser.detectBrowserStrings.phantomjs]
    
    @scala.inline
    def safari: typings.detectBrowser.detectBrowserStrings.safari = "safari".asInstanceOf[typings.detectBrowser.detectBrowserStrings.safari]
    
    @scala.inline
    def samsung: typings.detectBrowser.detectBrowserStrings.samsung = "samsung".asInstanceOf[typings.detectBrowser.detectBrowserStrings.samsung]
    
    @scala.inline
    def searchbot: typings.detectBrowser.detectBrowserStrings.searchbot = "searchbot".asInstanceOf[typings.detectBrowser.detectBrowserStrings.searchbot]
    
    @scala.inline
    def silk: typings.detectBrowser.detectBrowserStrings.silk = "silk".asInstanceOf[typings.detectBrowser.detectBrowserStrings.silk]
    
    @scala.inline
    def yandexbrowser: typings.detectBrowser.detectBrowserStrings.yandexbrowser = "yandexbrowser".asInstanceOf[typings.detectBrowser.detectBrowserStrings.yandexbrowser]
  }
  
  @js.native
  trait DetectedInfo[T /* <: DetectedInfoType */, N /* <: String */, O, V] extends StObject {
    
    val name: N = js.native
    
    val os: O = js.native
    
    val `type`: T = js.native
    
    val version: V = js.native
  }
  object DetectedInfo {
    
    @scala.inline
    def apply[T /* <: DetectedInfoType */, N /* <: String */, O, V](name: N, os: O, `type`: T, version: V): DetectedInfo[T, N, O, V] = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], os = os.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[DetectedInfo[T, N, O, V]]
    }
    
    @scala.inline
    implicit class DetectedInfoMutableBuilder[Self <: DetectedInfo[_, _, _, _], T /* <: DetectedInfoType */, N /* <: String */, O, V] (val x: Self with (DetectedInfo[T, N, O, V])) extends AnyVal {
      
      @scala.inline
      def setName(value: N): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOs(value: O): Self = StObject.set(x, "os", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: T): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersion(value: V): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.detectBrowser.detectBrowserStrings.browser
    - typings.detectBrowser.detectBrowserStrings.node
    - typings.detectBrowser.detectBrowserStrings.`bot-device`
    - typings.detectBrowser.detectBrowserStrings.bot
    - typings.detectBrowser.detectBrowserStrings.`react-native`
  */
  trait DetectedInfoType extends StObject
  object DetectedInfoType {
    
    @scala.inline
    def bot: typings.detectBrowser.detectBrowserStrings.bot = "bot".asInstanceOf[typings.detectBrowser.detectBrowserStrings.bot]
    
    @scala.inline
    def `bot-device`: typings.detectBrowser.detectBrowserStrings.`bot-device` = "bot-device".asInstanceOf[typings.detectBrowser.detectBrowserStrings.`bot-device`]
    
    @scala.inline
    def browser: typings.detectBrowser.detectBrowserStrings.browser = "browser".asInstanceOf[typings.detectBrowser.detectBrowserStrings.browser]
    
    @scala.inline
    def node: typings.detectBrowser.detectBrowserStrings.node = "node".asInstanceOf[typings.detectBrowser.detectBrowserStrings.node]
    
    @scala.inline
    def `react-native`: typings.detectBrowser.detectBrowserStrings.`react-native` = "react-native".asInstanceOf[typings.detectBrowser.detectBrowserStrings.`react-native`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.detectBrowser.detectBrowserStrings.iOS
    - typings.detectBrowser.detectBrowserStrings.`Android OS`
    - typings.detectBrowser.detectBrowserStrings.`BlackBerry OS`
    - typings.detectBrowser.detectBrowserStrings.`Windows Mobile`
    - typings.detectBrowser.detectBrowserStrings.`Amazon OS`
    - typings.detectBrowser.detectBrowserStrings.`Windows 3Dot11`
    - typings.detectBrowser.detectBrowserStrings.`Windows 95`
    - typings.detectBrowser.detectBrowserStrings.`Windows 98`
    - typings.detectBrowser.detectBrowserStrings.`Windows 2000`
    - typings.detectBrowser.detectBrowserStrings.`Windows XP`
    - typings.detectBrowser.detectBrowserStrings.`Windows Server 2003`
    - typings.detectBrowser.detectBrowserStrings.`Windows Vista`
    - typings.detectBrowser.detectBrowserStrings.`Windows 7`
    - typings.detectBrowser.detectBrowserStrings.`Windows 8`
    - typings.detectBrowser.detectBrowserStrings.`Windows 8Dot1`
    - typings.detectBrowser.detectBrowserStrings.`Windows 10`
    - typings.detectBrowser.detectBrowserStrings.`Windows ME`
    - typings.detectBrowser.detectBrowserStrings.`Open BSD`
    - typings.detectBrowser.detectBrowserStrings.`Sun OS`
    - typings.detectBrowser.detectBrowserStrings.Linux
    - typings.detectBrowser.detectBrowserStrings.`Mac OS`
    - typings.detectBrowser.detectBrowserStrings.QNX
    - typings.detectBrowser.detectBrowserStrings.BeOS
    - typings.detectBrowser.detectBrowserStrings.OSSlash2
    - typings.detectBrowser.detectBrowserStrings.`Chrome OS`
  */
  trait OperatingSystem extends StObject
  object OperatingSystem {
    
    @scala.inline
    def `Amazon OS`: typings.detectBrowser.detectBrowserStrings.`Amazon OS` = ("Amazon OS").asInstanceOf[typings.detectBrowser.detectBrowserStrings.`Amazon OS`]
    
    @scala.inline
    def `Android OS`: typings.detectBrowser.detectBrowserStrings.`Android OS` = ("Android OS").asInstanceOf[typings.detectBrowser.detectBrowserStrings.`Android OS`]
    
    @scala.inline
    def BeOS: typings.detectBrowser.detectBrowserStrings.BeOS = "BeOS".asInstanceOf[typings.detectBrowser.detectBrowserStrings.BeOS]
    
    @scala.inline
    def `BlackBerry OS`: typings.detectBrowser.detectBrowserStrings.`BlackBerry OS` = ("BlackBerry OS").asInstanceOf[typings.detectBrowser.detectBrowserStrings.`BlackBerry OS`]
    
    @scala.inline
    def `Chrome OS`: typings.detectBrowser.detectBrowserStrings.`Chrome OS` = ("Chrome OS").asInstanceOf[typings.detectBrowser.detectBrowserStrings.`Chrome OS`]
    
    @scala.inline
    def Linux: typings.detectBrowser.detectBrowserStrings.Linux = "Linux".asInstanceOf[typings.detectBrowser.detectBrowserStrings.Linux]
    
    @scala.inline
    def `Mac OS`: typings.detectBrowser.detectBrowserStrings.`Mac OS` = ("Mac OS").asInstanceOf[typings.detectBrowser.detectBrowserStrings.`Mac OS`]
    
    @scala.inline
    def OSSlash2: typings.detectBrowser.detectBrowserStrings.OSSlash2 = "OS/2".asInstanceOf[typings.detectBrowser.detectBrowserStrings.OSSlash2]
    
    @scala.inline
    def `Open BSD`: typings.detectBrowser.detectBrowserStrings.`Open BSD` = ("Open BSD").asInstanceOf[typings.detectBrowser.detectBrowserStrings.`Open BSD`]
    
    @scala.inline
    def QNX: typings.detectBrowser.detectBrowserStrings.QNX = "QNX".asInstanceOf[typings.detectBrowser.detectBrowserStrings.QNX]
    
    @scala.inline
    def `Sun OS`: typings.detectBrowser.detectBrowserStrings.`Sun OS` = ("Sun OS").asInstanceOf[typings.detectBrowser.detectBrowserStrings.`Sun OS`]
    
    @scala.inline
    def `Windows 10`: typings.detectBrowser.detectBrowserStrings.`Windows 10` = ("Windows 10").asInstanceOf[typings.detectBrowser.detectBrowserStrings.`Windows 10`]
    
    @scala.inline
    def `Windows 2000`: typings.detectBrowser.detectBrowserStrings.`Windows 2000` = ("Windows 2000").asInstanceOf[typings.detectBrowser.detectBrowserStrings.`Windows 2000`]
    
    @scala.inline
    def `Windows 3Dot11`: typings.detectBrowser.detectBrowserStrings.`Windows 3Dot11` = ("Windows 3.11").asInstanceOf[typings.detectBrowser.detectBrowserStrings.`Windows 3Dot11`]
    
    @scala.inline
    def `Windows 7`: typings.detectBrowser.detectBrowserStrings.`Windows 7` = ("Windows 7").asInstanceOf[typings.detectBrowser.detectBrowserStrings.`Windows 7`]
    
    @scala.inline
    def `Windows 8`: typings.detectBrowser.detectBrowserStrings.`Windows 8` = ("Windows 8").asInstanceOf[typings.detectBrowser.detectBrowserStrings.`Windows 8`]
    
    @scala.inline
    def `Windows 8Dot1`: typings.detectBrowser.detectBrowserStrings.`Windows 8Dot1` = ("Windows 8.1").asInstanceOf[typings.detectBrowser.detectBrowserStrings.`Windows 8Dot1`]
    
    @scala.inline
    def `Windows 95`: typings.detectBrowser.detectBrowserStrings.`Windows 95` = ("Windows 95").asInstanceOf[typings.detectBrowser.detectBrowserStrings.`Windows 95`]
    
    @scala.inline
    def `Windows 98`: typings.detectBrowser.detectBrowserStrings.`Windows 98` = ("Windows 98").asInstanceOf[typings.detectBrowser.detectBrowserStrings.`Windows 98`]
    
    @scala.inline
    def `Windows ME`: typings.detectBrowser.detectBrowserStrings.`Windows ME` = ("Windows ME").asInstanceOf[typings.detectBrowser.detectBrowserStrings.`Windows ME`]
    
    @scala.inline
    def `Windows Mobile`: typings.detectBrowser.detectBrowserStrings.`Windows Mobile` = ("Windows Mobile").asInstanceOf[typings.detectBrowser.detectBrowserStrings.`Windows Mobile`]
    
    @scala.inline
    def `Windows Server 2003`: typings.detectBrowser.detectBrowserStrings.`Windows Server 2003` = ("Windows Server 2003").asInstanceOf[typings.detectBrowser.detectBrowserStrings.`Windows Server 2003`]
    
    @scala.inline
    def `Windows Vista`: typings.detectBrowser.detectBrowserStrings.`Windows Vista` = ("Windows Vista").asInstanceOf[typings.detectBrowser.detectBrowserStrings.`Windows Vista`]
    
    @scala.inline
    def `Windows XP`: typings.detectBrowser.detectBrowserStrings.`Windows XP` = ("Windows XP").asInstanceOf[typings.detectBrowser.detectBrowserStrings.`Windows XP`]
    
    @scala.inline
    def iOS: typings.detectBrowser.detectBrowserStrings.iOS = "iOS".asInstanceOf[typings.detectBrowser.detectBrowserStrings.iOS]
  }
}
