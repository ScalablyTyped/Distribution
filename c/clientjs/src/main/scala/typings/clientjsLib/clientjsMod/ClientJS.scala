package typings
package clientjsLib.clientjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ClientJS extends js.Object {
  /** @return A string containing the available resolution. */
  def getAvailableResolution(): java.lang.String
  // Browser methods
  /** @return A string containing the browser name */
  def getBrowser(): java.lang.String
  /** @return A string containing the major browser version. */
  def getBrowserMajorVersion(): java.lang.String
  /** @return A string containing the browser version. */
  def getBrowserVersion(): java.lang.String
  // CPU methods
  /** @return A string containing the CPU architecture. */
  def getCPU(): java.lang.String
  /** @return A string containing canvas image information */
  def getCanvasPrint(): java.lang.String
  /** @return A string containing the color depth. */
  def getColorDepth(): java.lang.String
  /** @return A string containing the current resolution. */
  def getCurrentResolution(): java.lang.String
  /**
       * @param datapoints Any number of datapoints that are (or can be coerced to
       *                   be) strings.
       * @return A 32-bit integer representing the cumulative fingerprint.
       */
  def getCustomFingerprint(datapoints: (java.lang.String | scala.Double)*): scala.Double
  // Device methods
  /** @return A string containing the device. */
  def getDevice(): java.lang.String
  /** @return A string containing the device type. */
  def getDeviceType(): java.lang.String
  /** @return A string containing the device vendor. */
  def getDeviceVendor(): java.lang.String
  /** @return A string containing the device horizontal DPI. */
  def getDeviceXDPI(): java.lang.String
  /** @return A string containing the device vertical DPI. */
  def getDeviceYDPI(): java.lang.String
  // Engine methods
  /** @return A string containing the browser engine. */
  def getEngine(): java.lang.String
  /** @return A string containing the browser engine version. */
  def getEngineVersion(): java.lang.String
  // Fingerprint methods
  /** @return A 32-bit integer representing the browser's fingerprint. */
  def getFingerprint(): scala.Double
  /** @return A string containing the Flash Version. */
  def getFlashVersion(): java.lang.String
  /** A string containing a comma-separated list of installed fonts. */
  def getFonts(): java.lang.String
  /** @return A string containing the Java Version. */
  def getJavaVersion(): java.lang.String
  // Language methods
  /** A lowercase string containing the user language. */
  def getLanguage(): java.lang.String
  /** A string containing a list of installed MIME types. */
  def getMimeTypes(): java.lang.String
  // OS methods
  /** @return A string containing the OS. */
  def getOS(): java.lang.String
  /** @return A string containing the OS version. */
  def getOSVersion(): java.lang.String
  // Plugin methods
  /** @return A string containing a list of installed plugins. */
  def getPlugins(): java.lang.String
  // Screen methods
  /** @return A string containing screen information. */
  def getScreenPrint(): java.lang.String
  /** @return A string containing the Silverlight Version. */
  def getSilverlightVersion(): java.lang.String
  /** @return A string containing this software version number. */
  def getSoftwareVersion(): java.lang.String
  /** A lowercase string containing the system language. */
  def getSystemLanguage(): java.lang.String
  // Time methods
  /** A lowercase string containing the time zone. */
  def getTimeZone(): java.lang.String
  // User agent methods
  /** @return A string containing unparsed user agent. */
  def getUserAgent(): java.lang.String
  /** @return A lowercase string containing the user agent. */
  def getUserAgentLowerCase(): java.lang.String
  // Canvas methods
  /** Check if the canvas element is available. */
  def isCanvas(): scala.Boolean
  /** Check if the browser is Chrome. */
  def isChrome(): scala.Boolean
  /** Check if cookies are avaliable. */
  def isCookie(): scala.Boolean
  /** Check if the browser is Firefox. */
  def isFirefox(): scala.Boolean
  /** Check if Flash is installed. */
  def isFlash(): scala.Boolean
  // Font methods
  /** Check if `font` is installed. */
  def isFont(font: java.lang.String): scala.Boolean
  /** Check if the browser is IE. */
  def isIE(): scala.Boolean
  /** Check if the browser is on an Apple iPad. */
  def isIpad(): scala.Boolean
  /** Check if the browser is on an Apple iPhone. */
  def isIphone(): scala.Boolean
  /** Check if the browser is on an Apple iPod. */
  def isIpod(): scala.Boolean
  /** Check if Java is installed. */
  def isJava(): scala.Boolean
  /** Check if the OS is Linux. */
  def isLinux(): scala.Boolean
  // Storage methods
  /** Check if local storage is avaliable. */
  def isLocalStorage(): scala.Boolean
  /** Check if the OS is Mac. */
  def isMac(): scala.Boolean
  // MIME type methods
  /** Check if MIME types are installed. */
  def isMimeTypes(): scala.Boolean
  // Mobile methods
  /** Check if the browser is on a mobile device. */
  def isMobile(): scala.Boolean
  /** Check if the browser is on an Android mobile device. */
  def isMobileAndroid(): scala.Boolean
  /** Check if the browser is on a Blackberry mobile device. */
  def isMobileBlackBerry(): scala.Boolean
  // iOS methods
  /** Check if the browser is on an Apple iOS device. */
  def isMobileIOS(): scala.Boolean
  /** Check if the browser is on a major mobile device. */
  def isMobileMajor(): scala.Boolean
  /** Check if the browser is on an Opera mobile device. */
  def isMobileOpera(): scala.Boolean
  /** Check if the browser is mobile Safari. */
  def isMobileSafari(): scala.Boolean
  /** Check if the browser is on a Windows mobile device. */
  def isMobileWindows(): scala.Boolean
  /** Check if the browser is Opera. */
  def isOpera(): scala.Boolean
  /** Check if the browser is Safari. */
  def isSafari(): scala.Boolean
  /** Check if session storage is avaliable. */
  def isSessionStorage(): scala.Boolean
  /** Check if Silverlight is installed. */
  def isSilverlight(): scala.Boolean
  /** Check if the OS is Solaris. */
  def isSolaris(): scala.Boolean
  /** Check if the OS is Ubuntu. */
  def isUbuntu(): scala.Boolean
  /** Check if the OS is Windows. */
  def isWindows(): scala.Boolean
}

