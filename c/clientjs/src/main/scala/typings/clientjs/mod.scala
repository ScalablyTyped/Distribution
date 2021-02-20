package typings.clientjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("clientjs", JSImport.Namespace)
  @js.native
  class ^ () extends ClientJS
  
  @js.native
  trait ClientJS extends StObject {
    
    /** @return A string containing the available resolution. */
    def getAvailableResolution(): String = js.native
    
    // Browser methods
    /** @return A string containing the browser name */
    def getBrowser(): String = js.native
    
    /** @return A string containing the major browser version. */
    def getBrowserMajorVersion(): String = js.native
    
    /** @return A string containing the browser version. */
    def getBrowserVersion(): String = js.native
    
    // CPU methods
    /** @return A string containing the CPU architecture. */
    def getCPU(): String = js.native
    
    /** @return A string containing canvas image information */
    def getCanvasPrint(): String = js.native
    
    /** @return A string containing the color depth. */
    def getColorDepth(): String = js.native
    
    /** @return A string containing the current resolution. */
    def getCurrentResolution(): String = js.native
    
    /**
      * @param datapoints Any number of datapoints that are (or can be coerced to
      *                   be) strings.
      * @return A 32-bit integer representing the cumulative fingerprint.
      */
    def getCustomFingerprint(datapoints: (String | Double)*): Double = js.native
    
    // Device methods
    /** @return A string containing the device. */
    def getDevice(): String = js.native
    
    /** @return A string containing the device type. */
    def getDeviceType(): String = js.native
    
    /** @return A string containing the device vendor. */
    def getDeviceVendor(): String = js.native
    
    /** @return A string containing the device horizontal DPI. */
    def getDeviceXDPI(): String = js.native
    
    /** @return A string containing the device vertical DPI. */
    def getDeviceYDPI(): String = js.native
    
    // Engine methods
    /** @return A string containing the browser engine. */
    def getEngine(): String = js.native
    
    /** @return A string containing the browser engine version. */
    def getEngineVersion(): String = js.native
    
    // Fingerprint methods
    /** @return A 32-bit integer representing the browser's fingerprint. */
    def getFingerprint(): Double = js.native
    
    /** @return A string containing the Flash Version. */
    def getFlashVersion(): String = js.native
    
    /** A string containing a comma-separated list of installed fonts. */
    def getFonts(): String = js.native
    
    /** @return A string containing the Java Version. */
    def getJavaVersion(): String = js.native
    
    // Language methods
    /** A lowercase string containing the user language. */
    def getLanguage(): String = js.native
    
    /** A string containing a list of installed MIME types. */
    def getMimeTypes(): String = js.native
    
    // OS methods
    /** @return A string containing the OS. */
    def getOS(): String = js.native
    
    /** @return A string containing the OS version. */
    def getOSVersion(): String = js.native
    
    // Plugin methods
    /** @return A string containing a list of installed plugins. */
    def getPlugins(): String = js.native
    
    // Screen methods
    /** @return A string containing screen information. */
    def getScreenPrint(): String = js.native
    
    /** @return A string containing the Silverlight Version. */
    def getSilverlightVersion(): String = js.native
    
    /** @return A string containing this software version number. */
    def getSoftwareVersion(): String = js.native
    
    /** A lowercase string containing the system language. */
    def getSystemLanguage(): String = js.native
    
    // Time methods
    /** A lowercase string containing the time zone. */
    def getTimeZone(): String = js.native
    
    // User agent methods
    /** @return A string containing unparsed user agent. */
    def getUserAgent(): String = js.native
    
    /** @return A lowercase string containing the user agent. */
    def getUserAgentLowerCase(): String = js.native
    
    // Canvas methods
    /** Check if the canvas element is available. */
    def isCanvas(): Boolean = js.native
    
    /** Check if the browser is Chrome. */
    def isChrome(): Boolean = js.native
    
    /** Check if cookies are avaliable. */
    def isCookie(): Boolean = js.native
    
    /** Check if the browser is Firefox. */
    def isFirefox(): Boolean = js.native
    
    /** Check if Flash is installed. */
    def isFlash(): Boolean = js.native
    
    // Font methods
    /** Check if `font` is installed. */
    def isFont(font: String): Boolean = js.native
    
    /** Check if the browser is IE. */
    def isIE(): Boolean = js.native
    
    /** Check if the browser is on an Apple iPad. */
    def isIpad(): Boolean = js.native
    
    /** Check if the browser is on an Apple iPhone. */
    def isIphone(): Boolean = js.native
    
    /** Check if the browser is on an Apple iPod. */
    def isIpod(): Boolean = js.native
    
    /** Check if Java is installed. */
    def isJava(): Boolean = js.native
    
    /** Check if the OS is Linux. */
    def isLinux(): Boolean = js.native
    
    // Storage methods
    /** Check if local storage is avaliable. */
    def isLocalStorage(): Boolean = js.native
    
    /** Check if the OS is Mac. */
    def isMac(): Boolean = js.native
    
    // MIME type methods
    /** Check if MIME types are installed. */
    def isMimeTypes(): Boolean = js.native
    
    // Mobile methods
    /** Check if the browser is on a mobile device. */
    def isMobile(): Boolean = js.native
    
    /** Check if the browser is on an Android mobile device. */
    def isMobileAndroid(): Boolean = js.native
    
    /** Check if the browser is on a Blackberry mobile device. */
    def isMobileBlackBerry(): Boolean = js.native
    
    // iOS methods
    /** Check if the browser is on an Apple iOS device. */
    def isMobileIOS(): Boolean = js.native
    
    /** Check if the browser is on a major mobile device. */
    def isMobileMajor(): Boolean = js.native
    
    /** Check if the browser is on an Opera mobile device. */
    def isMobileOpera(): Boolean = js.native
    
    /** Check if the browser is mobile Safari. */
    def isMobileSafari(): Boolean = js.native
    
    /** Check if the browser is on a Windows mobile device. */
    def isMobileWindows(): Boolean = js.native
    
    /** Check if the browser is Opera. */
    def isOpera(): Boolean = js.native
    
    /** Check if the browser is Safari. */
    def isSafari(): Boolean = js.native
    
    /** Check if session storage is avaliable. */
    def isSessionStorage(): Boolean = js.native
    
    /** Check if Silverlight is installed. */
    def isSilverlight(): Boolean = js.native
    
    /** Check if the OS is Solaris. */
    def isSolaris(): Boolean = js.native
    
    /** Check if the OS is Ubuntu. */
    def isUbuntu(): Boolean = js.native
    
    /** Check if the OS is Windows. */
    def isWindows(): Boolean = js.native
  }
  object ClientJS {
    
    @scala.inline
    def apply(
      getAvailableResolution: () => String,
      getBrowser: () => String,
      getBrowserMajorVersion: () => String,
      getBrowserVersion: () => String,
      getCPU: () => String,
      getCanvasPrint: () => String,
      getColorDepth: () => String,
      getCurrentResolution: () => String,
      getCustomFingerprint: /* repeated */ String | Double => Double,
      getDevice: () => String,
      getDeviceType: () => String,
      getDeviceVendor: () => String,
      getDeviceXDPI: () => String,
      getDeviceYDPI: () => String,
      getEngine: () => String,
      getEngineVersion: () => String,
      getFingerprint: () => Double,
      getFlashVersion: () => String,
      getFonts: () => String,
      getJavaVersion: () => String,
      getLanguage: () => String,
      getMimeTypes: () => String,
      getOS: () => String,
      getOSVersion: () => String,
      getPlugins: () => String,
      getScreenPrint: () => String,
      getSilverlightVersion: () => String,
      getSoftwareVersion: () => String,
      getSystemLanguage: () => String,
      getTimeZone: () => String,
      getUserAgent: () => String,
      getUserAgentLowerCase: () => String,
      isCanvas: () => Boolean,
      isChrome: () => Boolean,
      isCookie: () => Boolean,
      isFirefox: () => Boolean,
      isFlash: () => Boolean,
      isFont: String => Boolean,
      isIE: () => Boolean,
      isIpad: () => Boolean,
      isIphone: () => Boolean,
      isIpod: () => Boolean,
      isJava: () => Boolean,
      isLinux: () => Boolean,
      isLocalStorage: () => Boolean,
      isMac: () => Boolean,
      isMimeTypes: () => Boolean,
      isMobile: () => Boolean,
      isMobileAndroid: () => Boolean,
      isMobileBlackBerry: () => Boolean,
      isMobileIOS: () => Boolean,
      isMobileMajor: () => Boolean,
      isMobileOpera: () => Boolean,
      isMobileSafari: () => Boolean,
      isMobileWindows: () => Boolean,
      isOpera: () => Boolean,
      isSafari: () => Boolean,
      isSessionStorage: () => Boolean,
      isSilverlight: () => Boolean,
      isSolaris: () => Boolean,
      isUbuntu: () => Boolean,
      isWindows: () => Boolean
    ): ClientJS = {
      val __obj = js.Dynamic.literal(getAvailableResolution = js.Any.fromFunction0(getAvailableResolution), getBrowser = js.Any.fromFunction0(getBrowser), getBrowserMajorVersion = js.Any.fromFunction0(getBrowserMajorVersion), getBrowserVersion = js.Any.fromFunction0(getBrowserVersion), getCPU = js.Any.fromFunction0(getCPU), getCanvasPrint = js.Any.fromFunction0(getCanvasPrint), getColorDepth = js.Any.fromFunction0(getColorDepth), getCurrentResolution = js.Any.fromFunction0(getCurrentResolution), getCustomFingerprint = js.Any.fromFunction1(getCustomFingerprint), getDevice = js.Any.fromFunction0(getDevice), getDeviceType = js.Any.fromFunction0(getDeviceType), getDeviceVendor = js.Any.fromFunction0(getDeviceVendor), getDeviceXDPI = js.Any.fromFunction0(getDeviceXDPI), getDeviceYDPI = js.Any.fromFunction0(getDeviceYDPI), getEngine = js.Any.fromFunction0(getEngine), getEngineVersion = js.Any.fromFunction0(getEngineVersion), getFingerprint = js.Any.fromFunction0(getFingerprint), getFlashVersion = js.Any.fromFunction0(getFlashVersion), getFonts = js.Any.fromFunction0(getFonts), getJavaVersion = js.Any.fromFunction0(getJavaVersion), getLanguage = js.Any.fromFunction0(getLanguage), getMimeTypes = js.Any.fromFunction0(getMimeTypes), getOS = js.Any.fromFunction0(getOS), getOSVersion = js.Any.fromFunction0(getOSVersion), getPlugins = js.Any.fromFunction0(getPlugins), getScreenPrint = js.Any.fromFunction0(getScreenPrint), getSilverlightVersion = js.Any.fromFunction0(getSilverlightVersion), getSoftwareVersion = js.Any.fromFunction0(getSoftwareVersion), getSystemLanguage = js.Any.fromFunction0(getSystemLanguage), getTimeZone = js.Any.fromFunction0(getTimeZone), getUserAgent = js.Any.fromFunction0(getUserAgent), getUserAgentLowerCase = js.Any.fromFunction0(getUserAgentLowerCase), isCanvas = js.Any.fromFunction0(isCanvas), isChrome = js.Any.fromFunction0(isChrome), isCookie = js.Any.fromFunction0(isCookie), isFirefox = js.Any.fromFunction0(isFirefox), isFlash = js.Any.fromFunction0(isFlash), isFont = js.Any.fromFunction1(isFont), isIE = js.Any.fromFunction0(isIE), isIpad = js.Any.fromFunction0(isIpad), isIphone = js.Any.fromFunction0(isIphone), isIpod = js.Any.fromFunction0(isIpod), isJava = js.Any.fromFunction0(isJava), isLinux = js.Any.fromFunction0(isLinux), isLocalStorage = js.Any.fromFunction0(isLocalStorage), isMac = js.Any.fromFunction0(isMac), isMimeTypes = js.Any.fromFunction0(isMimeTypes), isMobile = js.Any.fromFunction0(isMobile), isMobileAndroid = js.Any.fromFunction0(isMobileAndroid), isMobileBlackBerry = js.Any.fromFunction0(isMobileBlackBerry), isMobileIOS = js.Any.fromFunction0(isMobileIOS), isMobileMajor = js.Any.fromFunction0(isMobileMajor), isMobileOpera = js.Any.fromFunction0(isMobileOpera), isMobileSafari = js.Any.fromFunction0(isMobileSafari), isMobileWindows = js.Any.fromFunction0(isMobileWindows), isOpera = js.Any.fromFunction0(isOpera), isSafari = js.Any.fromFunction0(isSafari), isSessionStorage = js.Any.fromFunction0(isSessionStorage), isSilverlight = js.Any.fromFunction0(isSilverlight), isSolaris = js.Any.fromFunction0(isSolaris), isUbuntu = js.Any.fromFunction0(isUbuntu), isWindows = js.Any.fromFunction0(isWindows))
      __obj.asInstanceOf[ClientJS]
    }
    
    @scala.inline
    implicit class ClientJSMutableBuilder[Self <: ClientJS] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetAvailableResolution(value: () => String): Self = StObject.set(x, "getAvailableResolution", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetBrowser(value: () => String): Self = StObject.set(x, "getBrowser", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetBrowserMajorVersion(value: () => String): Self = StObject.set(x, "getBrowserMajorVersion", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetBrowserVersion(value: () => String): Self = StObject.set(x, "getBrowserVersion", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetCPU(value: () => String): Self = StObject.set(x, "getCPU", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetCanvasPrint(value: () => String): Self = StObject.set(x, "getCanvasPrint", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetColorDepth(value: () => String): Self = StObject.set(x, "getColorDepth", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetCurrentResolution(value: () => String): Self = StObject.set(x, "getCurrentResolution", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetCustomFingerprint(value: /* repeated */ String | Double => Double): Self = StObject.set(x, "getCustomFingerprint", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetDevice(value: () => String): Self = StObject.set(x, "getDevice", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetDeviceType(value: () => String): Self = StObject.set(x, "getDeviceType", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetDeviceVendor(value: () => String): Self = StObject.set(x, "getDeviceVendor", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetDeviceXDPI(value: () => String): Self = StObject.set(x, "getDeviceXDPI", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetDeviceYDPI(value: () => String): Self = StObject.set(x, "getDeviceYDPI", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetEngine(value: () => String): Self = StObject.set(x, "getEngine", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetEngineVersion(value: () => String): Self = StObject.set(x, "getEngineVersion", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetFingerprint(value: () => Double): Self = StObject.set(x, "getFingerprint", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetFlashVersion(value: () => String): Self = StObject.set(x, "getFlashVersion", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetFonts(value: () => String): Self = StObject.set(x, "getFonts", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetJavaVersion(value: () => String): Self = StObject.set(x, "getJavaVersion", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetLanguage(value: () => String): Self = StObject.set(x, "getLanguage", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetMimeTypes(value: () => String): Self = StObject.set(x, "getMimeTypes", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetOS(value: () => String): Self = StObject.set(x, "getOS", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetOSVersion(value: () => String): Self = StObject.set(x, "getOSVersion", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetPlugins(value: () => String): Self = StObject.set(x, "getPlugins", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetScreenPrint(value: () => String): Self = StObject.set(x, "getScreenPrint", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetSilverlightVersion(value: () => String): Self = StObject.set(x, "getSilverlightVersion", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetSoftwareVersion(value: () => String): Self = StObject.set(x, "getSoftwareVersion", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetSystemLanguage(value: () => String): Self = StObject.set(x, "getSystemLanguage", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetTimeZone(value: () => String): Self = StObject.set(x, "getTimeZone", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetUserAgent(value: () => String): Self = StObject.set(x, "getUserAgent", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetUserAgentLowerCase(value: () => String): Self = StObject.set(x, "getUserAgentLowerCase", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsCanvas(value: () => Boolean): Self = StObject.set(x, "isCanvas", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsChrome(value: () => Boolean): Self = StObject.set(x, "isChrome", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsCookie(value: () => Boolean): Self = StObject.set(x, "isCookie", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsFirefox(value: () => Boolean): Self = StObject.set(x, "isFirefox", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsFlash(value: () => Boolean): Self = StObject.set(x, "isFlash", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsFont(value: String => Boolean): Self = StObject.set(x, "isFont", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIsIE(value: () => Boolean): Self = StObject.set(x, "isIE", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsIpad(value: () => Boolean): Self = StObject.set(x, "isIpad", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsIphone(value: () => Boolean): Self = StObject.set(x, "isIphone", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsIpod(value: () => Boolean): Self = StObject.set(x, "isIpod", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsJava(value: () => Boolean): Self = StObject.set(x, "isJava", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsLinux(value: () => Boolean): Self = StObject.set(x, "isLinux", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsLocalStorage(value: () => Boolean): Self = StObject.set(x, "isLocalStorage", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsMac(value: () => Boolean): Self = StObject.set(x, "isMac", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsMimeTypes(value: () => Boolean): Self = StObject.set(x, "isMimeTypes", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsMobile(value: () => Boolean): Self = StObject.set(x, "isMobile", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsMobileAndroid(value: () => Boolean): Self = StObject.set(x, "isMobileAndroid", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsMobileBlackBerry(value: () => Boolean): Self = StObject.set(x, "isMobileBlackBerry", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsMobileIOS(value: () => Boolean): Self = StObject.set(x, "isMobileIOS", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsMobileMajor(value: () => Boolean): Self = StObject.set(x, "isMobileMajor", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsMobileOpera(value: () => Boolean): Self = StObject.set(x, "isMobileOpera", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsMobileSafari(value: () => Boolean): Self = StObject.set(x, "isMobileSafari", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsMobileWindows(value: () => Boolean): Self = StObject.set(x, "isMobileWindows", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsOpera(value: () => Boolean): Self = StObject.set(x, "isOpera", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsSafari(value: () => Boolean): Self = StObject.set(x, "isSafari", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsSessionStorage(value: () => Boolean): Self = StObject.set(x, "isSessionStorage", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsSilverlight(value: () => Boolean): Self = StObject.set(x, "isSilverlight", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsSolaris(value: () => Boolean): Self = StObject.set(x, "isSolaris", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsUbuntu(value: () => Boolean): Self = StObject.set(x, "isUbuntu", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsWindows(value: () => Boolean): Self = StObject.set(x, "isWindows", js.Any.fromFunction0(value))
    }
  }
}
