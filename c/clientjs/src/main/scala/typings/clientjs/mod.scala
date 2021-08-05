package typings.clientjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("clientjs", JSImport.Namespace)
  @js.native
  class ^ ()
    extends StObject
       with ClientJS {
    
    /** @return A string containing the available resolution. */
    /* CompleteClass */
    override def getAvailableResolution(): String = js.native
    
    // Browser methods
    /** @return A string containing the browser name */
    /* CompleteClass */
    override def getBrowser(): String = js.native
    
    /** @return A string containing the major browser version. */
    /* CompleteClass */
    override def getBrowserMajorVersion(): String = js.native
    
    /** @return A string containing the browser version. */
    /* CompleteClass */
    override def getBrowserVersion(): String = js.native
    
    // CPU methods
    /** @return A string containing the CPU architecture. */
    /* CompleteClass */
    override def getCPU(): String = js.native
    
    /** @return A string containing canvas image information */
    /* CompleteClass */
    override def getCanvasPrint(): String = js.native
    
    /** @return A string containing the color depth. */
    /* CompleteClass */
    override def getColorDepth(): String = js.native
    
    /** @return A string containing the current resolution. */
    /* CompleteClass */
    override def getCurrentResolution(): String = js.native
    
    /**
      * @param datapoints Any number of datapoints that are (or can be coerced to
      *                   be) strings.
      * @return A 32-bit integer representing the cumulative fingerprint.
      */
    /* CompleteClass */
    override def getCustomFingerprint(datapoints: (String | Double)*): Double = js.native
    
    // Device methods
    /** @return A string containing the device. */
    /* CompleteClass */
    override def getDevice(): String = js.native
    
    /** @return A string containing the device type. */
    /* CompleteClass */
    override def getDeviceType(): String = js.native
    
    /** @return A string containing the device vendor. */
    /* CompleteClass */
    override def getDeviceVendor(): String = js.native
    
    /** @return A string containing the device horizontal DPI. */
    /* CompleteClass */
    override def getDeviceXDPI(): String = js.native
    
    /** @return A string containing the device vertical DPI. */
    /* CompleteClass */
    override def getDeviceYDPI(): String = js.native
    
    // Engine methods
    /** @return A string containing the browser engine. */
    /* CompleteClass */
    override def getEngine(): String = js.native
    
    /** @return A string containing the browser engine version. */
    /* CompleteClass */
    override def getEngineVersion(): String = js.native
    
    // Fingerprint methods
    /** @return A 32-bit integer representing the browser's fingerprint. */
    /* CompleteClass */
    override def getFingerprint(): Double = js.native
    
    /** @return A string containing the Flash Version. */
    /* CompleteClass */
    override def getFlashVersion(): String = js.native
    
    /** A string containing a comma-separated list of installed fonts. */
    /* CompleteClass */
    override def getFonts(): String = js.native
    
    /** @return A string containing the Java Version. */
    /* CompleteClass */
    override def getJavaVersion(): String = js.native
    
    // Language methods
    /** A lowercase string containing the user language. */
    /* CompleteClass */
    override def getLanguage(): String = js.native
    
    /** A string containing a list of installed MIME types. */
    /* CompleteClass */
    override def getMimeTypes(): String = js.native
    
    // OS methods
    /** @return A string containing the OS. */
    /* CompleteClass */
    override def getOS(): String = js.native
    
    /** @return A string containing the OS version. */
    /* CompleteClass */
    override def getOSVersion(): String = js.native
    
    // Plugin methods
    /** @return A string containing a list of installed plugins. */
    /* CompleteClass */
    override def getPlugins(): String = js.native
    
    // Screen methods
    /** @return A string containing screen information. */
    /* CompleteClass */
    override def getScreenPrint(): String = js.native
    
    /** @return A string containing the Silverlight Version. */
    /* CompleteClass */
    override def getSilverlightVersion(): String = js.native
    
    /** @return A string containing this software version number. */
    /* CompleteClass */
    override def getSoftwareVersion(): String = js.native
    
    /** A lowercase string containing the system language. */
    /* CompleteClass */
    override def getSystemLanguage(): String = js.native
    
    // Time methods
    /** A lowercase string containing the time zone. */
    /* CompleteClass */
    override def getTimeZone(): String = js.native
    
    // User agent methods
    /** @return A string containing unparsed user agent. */
    /* CompleteClass */
    override def getUserAgent(): String = js.native
    
    /** @return A lowercase string containing the user agent. */
    /* CompleteClass */
    override def getUserAgentLowerCase(): String = js.native
    
    // Canvas methods
    /** Check if the canvas element is available. */
    /* CompleteClass */
    override def isCanvas(): Boolean = js.native
    
    /** Check if the browser is Chrome. */
    /* CompleteClass */
    override def isChrome(): Boolean = js.native
    
    /** Check if cookies are avaliable. */
    /* CompleteClass */
    override def isCookie(): Boolean = js.native
    
    /** Check if the browser is Firefox. */
    /* CompleteClass */
    override def isFirefox(): Boolean = js.native
    
    /** Check if Flash is installed. */
    /* CompleteClass */
    override def isFlash(): Boolean = js.native
    
    // Font methods
    /** Check if `font` is installed. */
    /* CompleteClass */
    override def isFont(font: String): Boolean = js.native
    
    /** Check if the browser is IE. */
    /* CompleteClass */
    override def isIE(): Boolean = js.native
    
    /** Check if the browser is on an Apple iPad. */
    /* CompleteClass */
    override def isIpad(): Boolean = js.native
    
    /** Check if the browser is on an Apple iPhone. */
    /* CompleteClass */
    override def isIphone(): Boolean = js.native
    
    /** Check if the browser is on an Apple iPod. */
    /* CompleteClass */
    override def isIpod(): Boolean = js.native
    
    /** Check if Java is installed. */
    /* CompleteClass */
    override def isJava(): Boolean = js.native
    
    /** Check if the OS is Linux. */
    /* CompleteClass */
    override def isLinux(): Boolean = js.native
    
    // Storage methods
    /** Check if local storage is avaliable. */
    /* CompleteClass */
    override def isLocalStorage(): Boolean = js.native
    
    /** Check if the OS is Mac. */
    /* CompleteClass */
    override def isMac(): Boolean = js.native
    
    // MIME type methods
    /** Check if MIME types are installed. */
    /* CompleteClass */
    override def isMimeTypes(): Boolean = js.native
    
    // Mobile methods
    /** Check if the browser is on a mobile device. */
    /* CompleteClass */
    override def isMobile(): Boolean = js.native
    
    /** Check if the browser is on an Android mobile device. */
    /* CompleteClass */
    override def isMobileAndroid(): Boolean = js.native
    
    /** Check if the browser is on a Blackberry mobile device. */
    /* CompleteClass */
    override def isMobileBlackBerry(): Boolean = js.native
    
    // iOS methods
    /** Check if the browser is on an Apple iOS device. */
    /* CompleteClass */
    override def isMobileIOS(): Boolean = js.native
    
    /** Check if the browser is on a major mobile device. */
    /* CompleteClass */
    override def isMobileMajor(): Boolean = js.native
    
    /** Check if the browser is on an Opera mobile device. */
    /* CompleteClass */
    override def isMobileOpera(): Boolean = js.native
    
    /** Check if the browser is mobile Safari. */
    /* CompleteClass */
    override def isMobileSafari(): Boolean = js.native
    
    /** Check if the browser is on a Windows mobile device. */
    /* CompleteClass */
    override def isMobileWindows(): Boolean = js.native
    
    /** Check if the browser is Opera. */
    /* CompleteClass */
    override def isOpera(): Boolean = js.native
    
    /** Check if the browser is Safari. */
    /* CompleteClass */
    override def isSafari(): Boolean = js.native
    
    /** Check if session storage is avaliable. */
    /* CompleteClass */
    override def isSessionStorage(): Boolean = js.native
    
    /** Check if Silverlight is installed. */
    /* CompleteClass */
    override def isSilverlight(): Boolean = js.native
    
    /** Check if the OS is Solaris. */
    /* CompleteClass */
    override def isSolaris(): Boolean = js.native
    
    /** Check if the OS is Ubuntu. */
    /* CompleteClass */
    override def isUbuntu(): Boolean = js.native
    
    /** Check if the OS is Windows. */
    /* CompleteClass */
    override def isWindows(): Boolean = js.native
  }
  
  trait ClientJS extends StObject {
    
    /** @return A string containing the available resolution. */
    def getAvailableResolution(): String
    
    // Browser methods
    /** @return A string containing the browser name */
    def getBrowser(): String
    
    /** @return A string containing the major browser version. */
    def getBrowserMajorVersion(): String
    
    /** @return A string containing the browser version. */
    def getBrowserVersion(): String
    
    // CPU methods
    /** @return A string containing the CPU architecture. */
    def getCPU(): String
    
    /** @return A string containing canvas image information */
    def getCanvasPrint(): String
    
    /** @return A string containing the color depth. */
    def getColorDepth(): String
    
    /** @return A string containing the current resolution. */
    def getCurrentResolution(): String
    
    /**
      * @param datapoints Any number of datapoints that are (or can be coerced to
      *                   be) strings.
      * @return A 32-bit integer representing the cumulative fingerprint.
      */
    def getCustomFingerprint(datapoints: (String | Double)*): Double
    
    // Device methods
    /** @return A string containing the device. */
    def getDevice(): String
    
    /** @return A string containing the device type. */
    def getDeviceType(): String
    
    /** @return A string containing the device vendor. */
    def getDeviceVendor(): String
    
    /** @return A string containing the device horizontal DPI. */
    def getDeviceXDPI(): String
    
    /** @return A string containing the device vertical DPI. */
    def getDeviceYDPI(): String
    
    // Engine methods
    /** @return A string containing the browser engine. */
    def getEngine(): String
    
    /** @return A string containing the browser engine version. */
    def getEngineVersion(): String
    
    // Fingerprint methods
    /** @return A 32-bit integer representing the browser's fingerprint. */
    def getFingerprint(): Double
    
    /** @return A string containing the Flash Version. */
    def getFlashVersion(): String
    
    /** A string containing a comma-separated list of installed fonts. */
    def getFonts(): String
    
    /** @return A string containing the Java Version. */
    def getJavaVersion(): String
    
    // Language methods
    /** A lowercase string containing the user language. */
    def getLanguage(): String
    
    /** A string containing a list of installed MIME types. */
    def getMimeTypes(): String
    
    // OS methods
    /** @return A string containing the OS. */
    def getOS(): String
    
    /** @return A string containing the OS version. */
    def getOSVersion(): String
    
    // Plugin methods
    /** @return A string containing a list of installed plugins. */
    def getPlugins(): String
    
    // Screen methods
    /** @return A string containing screen information. */
    def getScreenPrint(): String
    
    /** @return A string containing the Silverlight Version. */
    def getSilverlightVersion(): String
    
    /** @return A string containing this software version number. */
    def getSoftwareVersion(): String
    
    /** A lowercase string containing the system language. */
    def getSystemLanguage(): String
    
    // Time methods
    /** A lowercase string containing the time zone. */
    def getTimeZone(): String
    
    // User agent methods
    /** @return A string containing unparsed user agent. */
    def getUserAgent(): String
    
    /** @return A lowercase string containing the user agent. */
    def getUserAgentLowerCase(): String
    
    // Canvas methods
    /** Check if the canvas element is available. */
    def isCanvas(): Boolean
    
    /** Check if the browser is Chrome. */
    def isChrome(): Boolean
    
    /** Check if cookies are avaliable. */
    def isCookie(): Boolean
    
    /** Check if the browser is Firefox. */
    def isFirefox(): Boolean
    
    /** Check if Flash is installed. */
    def isFlash(): Boolean
    
    // Font methods
    /** Check if `font` is installed. */
    def isFont(font: String): Boolean
    
    /** Check if the browser is IE. */
    def isIE(): Boolean
    
    /** Check if the browser is on an Apple iPad. */
    def isIpad(): Boolean
    
    /** Check if the browser is on an Apple iPhone. */
    def isIphone(): Boolean
    
    /** Check if the browser is on an Apple iPod. */
    def isIpod(): Boolean
    
    /** Check if Java is installed. */
    def isJava(): Boolean
    
    /** Check if the OS is Linux. */
    def isLinux(): Boolean
    
    // Storage methods
    /** Check if local storage is avaliable. */
    def isLocalStorage(): Boolean
    
    /** Check if the OS is Mac. */
    def isMac(): Boolean
    
    // MIME type methods
    /** Check if MIME types are installed. */
    def isMimeTypes(): Boolean
    
    // Mobile methods
    /** Check if the browser is on a mobile device. */
    def isMobile(): Boolean
    
    /** Check if the browser is on an Android mobile device. */
    def isMobileAndroid(): Boolean
    
    /** Check if the browser is on a Blackberry mobile device. */
    def isMobileBlackBerry(): Boolean
    
    // iOS methods
    /** Check if the browser is on an Apple iOS device. */
    def isMobileIOS(): Boolean
    
    /** Check if the browser is on a major mobile device. */
    def isMobileMajor(): Boolean
    
    /** Check if the browser is on an Opera mobile device. */
    def isMobileOpera(): Boolean
    
    /** Check if the browser is mobile Safari. */
    def isMobileSafari(): Boolean
    
    /** Check if the browser is on a Windows mobile device. */
    def isMobileWindows(): Boolean
    
    /** Check if the browser is Opera. */
    def isOpera(): Boolean
    
    /** Check if the browser is Safari. */
    def isSafari(): Boolean
    
    /** Check if session storage is avaliable. */
    def isSessionStorage(): Boolean
    
    /** Check if Silverlight is installed. */
    def isSilverlight(): Boolean
    
    /** Check if the OS is Solaris. */
    def isSolaris(): Boolean
    
    /** Check if the OS is Ubuntu. */
    def isUbuntu(): Boolean
    
    /** Check if the OS is Windows. */
    def isWindows(): Boolean
  }
  object ClientJS {
    
    inline def apply(
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
    
    extension [Self <: ClientJS](x: Self) {
      
      inline def setGetAvailableResolution(value: () => String): Self = StObject.set(x, "getAvailableResolution", js.Any.fromFunction0(value))
      
      inline def setGetBrowser(value: () => String): Self = StObject.set(x, "getBrowser", js.Any.fromFunction0(value))
      
      inline def setGetBrowserMajorVersion(value: () => String): Self = StObject.set(x, "getBrowserMajorVersion", js.Any.fromFunction0(value))
      
      inline def setGetBrowserVersion(value: () => String): Self = StObject.set(x, "getBrowserVersion", js.Any.fromFunction0(value))
      
      inline def setGetCPU(value: () => String): Self = StObject.set(x, "getCPU", js.Any.fromFunction0(value))
      
      inline def setGetCanvasPrint(value: () => String): Self = StObject.set(x, "getCanvasPrint", js.Any.fromFunction0(value))
      
      inline def setGetColorDepth(value: () => String): Self = StObject.set(x, "getColorDepth", js.Any.fromFunction0(value))
      
      inline def setGetCurrentResolution(value: () => String): Self = StObject.set(x, "getCurrentResolution", js.Any.fromFunction0(value))
      
      inline def setGetCustomFingerprint(value: /* repeated */ String | Double => Double): Self = StObject.set(x, "getCustomFingerprint", js.Any.fromFunction1(value))
      
      inline def setGetDevice(value: () => String): Self = StObject.set(x, "getDevice", js.Any.fromFunction0(value))
      
      inline def setGetDeviceType(value: () => String): Self = StObject.set(x, "getDeviceType", js.Any.fromFunction0(value))
      
      inline def setGetDeviceVendor(value: () => String): Self = StObject.set(x, "getDeviceVendor", js.Any.fromFunction0(value))
      
      inline def setGetDeviceXDPI(value: () => String): Self = StObject.set(x, "getDeviceXDPI", js.Any.fromFunction0(value))
      
      inline def setGetDeviceYDPI(value: () => String): Self = StObject.set(x, "getDeviceYDPI", js.Any.fromFunction0(value))
      
      inline def setGetEngine(value: () => String): Self = StObject.set(x, "getEngine", js.Any.fromFunction0(value))
      
      inline def setGetEngineVersion(value: () => String): Self = StObject.set(x, "getEngineVersion", js.Any.fromFunction0(value))
      
      inline def setGetFingerprint(value: () => Double): Self = StObject.set(x, "getFingerprint", js.Any.fromFunction0(value))
      
      inline def setGetFlashVersion(value: () => String): Self = StObject.set(x, "getFlashVersion", js.Any.fromFunction0(value))
      
      inline def setGetFonts(value: () => String): Self = StObject.set(x, "getFonts", js.Any.fromFunction0(value))
      
      inline def setGetJavaVersion(value: () => String): Self = StObject.set(x, "getJavaVersion", js.Any.fromFunction0(value))
      
      inline def setGetLanguage(value: () => String): Self = StObject.set(x, "getLanguage", js.Any.fromFunction0(value))
      
      inline def setGetMimeTypes(value: () => String): Self = StObject.set(x, "getMimeTypes", js.Any.fromFunction0(value))
      
      inline def setGetOS(value: () => String): Self = StObject.set(x, "getOS", js.Any.fromFunction0(value))
      
      inline def setGetOSVersion(value: () => String): Self = StObject.set(x, "getOSVersion", js.Any.fromFunction0(value))
      
      inline def setGetPlugins(value: () => String): Self = StObject.set(x, "getPlugins", js.Any.fromFunction0(value))
      
      inline def setGetScreenPrint(value: () => String): Self = StObject.set(x, "getScreenPrint", js.Any.fromFunction0(value))
      
      inline def setGetSilverlightVersion(value: () => String): Self = StObject.set(x, "getSilverlightVersion", js.Any.fromFunction0(value))
      
      inline def setGetSoftwareVersion(value: () => String): Self = StObject.set(x, "getSoftwareVersion", js.Any.fromFunction0(value))
      
      inline def setGetSystemLanguage(value: () => String): Self = StObject.set(x, "getSystemLanguage", js.Any.fromFunction0(value))
      
      inline def setGetTimeZone(value: () => String): Self = StObject.set(x, "getTimeZone", js.Any.fromFunction0(value))
      
      inline def setGetUserAgent(value: () => String): Self = StObject.set(x, "getUserAgent", js.Any.fromFunction0(value))
      
      inline def setGetUserAgentLowerCase(value: () => String): Self = StObject.set(x, "getUserAgentLowerCase", js.Any.fromFunction0(value))
      
      inline def setIsCanvas(value: () => Boolean): Self = StObject.set(x, "isCanvas", js.Any.fromFunction0(value))
      
      inline def setIsChrome(value: () => Boolean): Self = StObject.set(x, "isChrome", js.Any.fromFunction0(value))
      
      inline def setIsCookie(value: () => Boolean): Self = StObject.set(x, "isCookie", js.Any.fromFunction0(value))
      
      inline def setIsFirefox(value: () => Boolean): Self = StObject.set(x, "isFirefox", js.Any.fromFunction0(value))
      
      inline def setIsFlash(value: () => Boolean): Self = StObject.set(x, "isFlash", js.Any.fromFunction0(value))
      
      inline def setIsFont(value: String => Boolean): Self = StObject.set(x, "isFont", js.Any.fromFunction1(value))
      
      inline def setIsIE(value: () => Boolean): Self = StObject.set(x, "isIE", js.Any.fromFunction0(value))
      
      inline def setIsIpad(value: () => Boolean): Self = StObject.set(x, "isIpad", js.Any.fromFunction0(value))
      
      inline def setIsIphone(value: () => Boolean): Self = StObject.set(x, "isIphone", js.Any.fromFunction0(value))
      
      inline def setIsIpod(value: () => Boolean): Self = StObject.set(x, "isIpod", js.Any.fromFunction0(value))
      
      inline def setIsJava(value: () => Boolean): Self = StObject.set(x, "isJava", js.Any.fromFunction0(value))
      
      inline def setIsLinux(value: () => Boolean): Self = StObject.set(x, "isLinux", js.Any.fromFunction0(value))
      
      inline def setIsLocalStorage(value: () => Boolean): Self = StObject.set(x, "isLocalStorage", js.Any.fromFunction0(value))
      
      inline def setIsMac(value: () => Boolean): Self = StObject.set(x, "isMac", js.Any.fromFunction0(value))
      
      inline def setIsMimeTypes(value: () => Boolean): Self = StObject.set(x, "isMimeTypes", js.Any.fromFunction0(value))
      
      inline def setIsMobile(value: () => Boolean): Self = StObject.set(x, "isMobile", js.Any.fromFunction0(value))
      
      inline def setIsMobileAndroid(value: () => Boolean): Self = StObject.set(x, "isMobileAndroid", js.Any.fromFunction0(value))
      
      inline def setIsMobileBlackBerry(value: () => Boolean): Self = StObject.set(x, "isMobileBlackBerry", js.Any.fromFunction0(value))
      
      inline def setIsMobileIOS(value: () => Boolean): Self = StObject.set(x, "isMobileIOS", js.Any.fromFunction0(value))
      
      inline def setIsMobileMajor(value: () => Boolean): Self = StObject.set(x, "isMobileMajor", js.Any.fromFunction0(value))
      
      inline def setIsMobileOpera(value: () => Boolean): Self = StObject.set(x, "isMobileOpera", js.Any.fromFunction0(value))
      
      inline def setIsMobileSafari(value: () => Boolean): Self = StObject.set(x, "isMobileSafari", js.Any.fromFunction0(value))
      
      inline def setIsMobileWindows(value: () => Boolean): Self = StObject.set(x, "isMobileWindows", js.Any.fromFunction0(value))
      
      inline def setIsOpera(value: () => Boolean): Self = StObject.set(x, "isOpera", js.Any.fromFunction0(value))
      
      inline def setIsSafari(value: () => Boolean): Self = StObject.set(x, "isSafari", js.Any.fromFunction0(value))
      
      inline def setIsSessionStorage(value: () => Boolean): Self = StObject.set(x, "isSessionStorage", js.Any.fromFunction0(value))
      
      inline def setIsSilverlight(value: () => Boolean): Self = StObject.set(x, "isSilverlight", js.Any.fromFunction0(value))
      
      inline def setIsSolaris(value: () => Boolean): Self = StObject.set(x, "isSolaris", js.Any.fromFunction0(value))
      
      inline def setIsUbuntu(value: () => Boolean): Self = StObject.set(x, "isUbuntu", js.Any.fromFunction0(value))
      
      inline def setIsWindows(value: () => Boolean): Self = StObject.set(x, "isWindows", js.Any.fromFunction0(value))
    }
  }
}
