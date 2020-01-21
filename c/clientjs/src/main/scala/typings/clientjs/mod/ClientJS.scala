package typings.clientjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientJS extends js.Object {
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
}

