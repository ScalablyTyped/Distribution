package typings.clientjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("clientjs", JSImport.Namespace)
@js.native
class ^ () extends ClientJS {
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

