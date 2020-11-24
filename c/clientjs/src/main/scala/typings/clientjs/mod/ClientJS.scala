package typings.clientjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClientJS extends js.Object {
  
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
  implicit class ClientJSOps[Self <: ClientJS] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGetAvailableResolution(value: () => String): Self = this.set("getAvailableResolution", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetBrowser(value: () => String): Self = this.set("getBrowser", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetBrowserMajorVersion(value: () => String): Self = this.set("getBrowserMajorVersion", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetBrowserVersion(value: () => String): Self = this.set("getBrowserVersion", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetCPU(value: () => String): Self = this.set("getCPU", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetCanvasPrint(value: () => String): Self = this.set("getCanvasPrint", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetColorDepth(value: () => String): Self = this.set("getColorDepth", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetCurrentResolution(value: () => String): Self = this.set("getCurrentResolution", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetCustomFingerprint(value: /* repeated */ String | Double => Double): Self = this.set("getCustomFingerprint", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetDevice(value: () => String): Self = this.set("getDevice", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetDeviceType(value: () => String): Self = this.set("getDeviceType", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetDeviceVendor(value: () => String): Self = this.set("getDeviceVendor", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetDeviceXDPI(value: () => String): Self = this.set("getDeviceXDPI", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetDeviceYDPI(value: () => String): Self = this.set("getDeviceYDPI", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetEngine(value: () => String): Self = this.set("getEngine", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetEngineVersion(value: () => String): Self = this.set("getEngineVersion", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetFingerprint(value: () => Double): Self = this.set("getFingerprint", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetFlashVersion(value: () => String): Self = this.set("getFlashVersion", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetFonts(value: () => String): Self = this.set("getFonts", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetJavaVersion(value: () => String): Self = this.set("getJavaVersion", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetLanguage(value: () => String): Self = this.set("getLanguage", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetMimeTypes(value: () => String): Self = this.set("getMimeTypes", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetOS(value: () => String): Self = this.set("getOS", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetOSVersion(value: () => String): Self = this.set("getOSVersion", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPlugins(value: () => String): Self = this.set("getPlugins", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetScreenPrint(value: () => String): Self = this.set("getScreenPrint", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSilverlightVersion(value: () => String): Self = this.set("getSilverlightVersion", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSoftwareVersion(value: () => String): Self = this.set("getSoftwareVersion", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSystemLanguage(value: () => String): Self = this.set("getSystemLanguage", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTimeZone(value: () => String): Self = this.set("getTimeZone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetUserAgent(value: () => String): Self = this.set("getUserAgent", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetUserAgentLowerCase(value: () => String): Self = this.set("getUserAgentLowerCase", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsCanvas(value: () => Boolean): Self = this.set("isCanvas", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsChrome(value: () => Boolean): Self = this.set("isChrome", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsCookie(value: () => Boolean): Self = this.set("isCookie", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsFirefox(value: () => Boolean): Self = this.set("isFirefox", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsFlash(value: () => Boolean): Self = this.set("isFlash", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsFont(value: String => Boolean): Self = this.set("isFont", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsIE(value: () => Boolean): Self = this.set("isIE", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsIpad(value: () => Boolean): Self = this.set("isIpad", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsIphone(value: () => Boolean): Self = this.set("isIphone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsIpod(value: () => Boolean): Self = this.set("isIpod", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsJava(value: () => Boolean): Self = this.set("isJava", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsLinux(value: () => Boolean): Self = this.set("isLinux", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsLocalStorage(value: () => Boolean): Self = this.set("isLocalStorage", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsMac(value: () => Boolean): Self = this.set("isMac", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsMimeTypes(value: () => Boolean): Self = this.set("isMimeTypes", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsMobile(value: () => Boolean): Self = this.set("isMobile", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsMobileAndroid(value: () => Boolean): Self = this.set("isMobileAndroid", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsMobileBlackBerry(value: () => Boolean): Self = this.set("isMobileBlackBerry", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsMobileIOS(value: () => Boolean): Self = this.set("isMobileIOS", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsMobileMajor(value: () => Boolean): Self = this.set("isMobileMajor", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsMobileOpera(value: () => Boolean): Self = this.set("isMobileOpera", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsMobileSafari(value: () => Boolean): Self = this.set("isMobileSafari", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsMobileWindows(value: () => Boolean): Self = this.set("isMobileWindows", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsOpera(value: () => Boolean): Self = this.set("isOpera", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsSafari(value: () => Boolean): Self = this.set("isSafari", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsSessionStorage(value: () => Boolean): Self = this.set("isSessionStorage", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsSilverlight(value: () => Boolean): Self = this.set("isSilverlight", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsSolaris(value: () => Boolean): Self = this.set("isSolaris", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsUbuntu(value: () => Boolean): Self = this.set("isUbuntu", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsWindows(value: () => Boolean): Self = this.set("isWindows", js.Any.fromFunction0(value))
  }
}
