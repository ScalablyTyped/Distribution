package typings
package clientjsLib.clientjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("clientjs", JSImport.Namespace)
@js.native
class ^ () extends ClientJS {
  /** @return A string containing the available resolution. */
  /* CompleteClass */
  override def getAvailableResolution(): java.lang.String = js.native
  // Browser methods
  /** @return A string containing the browser name */
  /* CompleteClass */
  override def getBrowser(): java.lang.String = js.native
  /** @return A string containing the major browser version. */
  /* CompleteClass */
  override def getBrowserMajorVersion(): java.lang.String = js.native
  /** @return A string containing the browser version. */
  /* CompleteClass */
  override def getBrowserVersion(): java.lang.String = js.native
  // CPU methods
  /** @return A string containing the CPU architecture. */
  /* CompleteClass */
  override def getCPU(): java.lang.String = js.native
  /** @return A string containing canvas image information */
  /* CompleteClass */
  override def getCanvasPrint(): java.lang.String = js.native
  /** @return A string containing the color depth. */
  /* CompleteClass */
  override def getColorDepth(): java.lang.String = js.native
  /** @return A string containing the current resolution. */
  /* CompleteClass */
  override def getCurrentResolution(): java.lang.String = js.native
  /**
    * @param datapoints Any number of datapoints that are (or can be coerced to
    *                   be) strings.
    * @return A 32-bit integer representing the cumulative fingerprint.
    */
  /* CompleteClass */
  override def getCustomFingerprint(datapoints: (java.lang.String | scala.Double)*): scala.Double = js.native
  // Device methods
  /** @return A string containing the device. */
  /* CompleteClass */
  override def getDevice(): java.lang.String = js.native
  /** @return A string containing the device type. */
  /* CompleteClass */
  override def getDeviceType(): java.lang.String = js.native
  /** @return A string containing the device vendor. */
  /* CompleteClass */
  override def getDeviceVendor(): java.lang.String = js.native
  /** @return A string containing the device horizontal DPI. */
  /* CompleteClass */
  override def getDeviceXDPI(): java.lang.String = js.native
  /** @return A string containing the device vertical DPI. */
  /* CompleteClass */
  override def getDeviceYDPI(): java.lang.String = js.native
  // Engine methods
  /** @return A string containing the browser engine. */
  /* CompleteClass */
  override def getEngine(): java.lang.String = js.native
  /** @return A string containing the browser engine version. */
  /* CompleteClass */
  override def getEngineVersion(): java.lang.String = js.native
  // Fingerprint methods
  /** @return A 32-bit integer representing the browser's fingerprint. */
  /* CompleteClass */
  override def getFingerprint(): scala.Double = js.native
  /** @return A string containing the Flash Version. */
  /* CompleteClass */
  override def getFlashVersion(): java.lang.String = js.native
  /** A string containing a comma-separated list of installed fonts. */
  /* CompleteClass */
  override def getFonts(): java.lang.String = js.native
  /** @return A string containing the Java Version. */
  /* CompleteClass */
  override def getJavaVersion(): java.lang.String = js.native
  // Language methods
  /** A lowercase string containing the user language. */
  /* CompleteClass */
  override def getLanguage(): java.lang.String = js.native
  /** A string containing a list of installed MIME types. */
  /* CompleteClass */
  override def getMimeTypes(): java.lang.String = js.native
  // OS methods
  /** @return A string containing the OS. */
  /* CompleteClass */
  override def getOS(): java.lang.String = js.native
  /** @return A string containing the OS version. */
  /* CompleteClass */
  override def getOSVersion(): java.lang.String = js.native
  // Plugin methods
  /** @return A string containing a list of installed plugins. */
  /* CompleteClass */
  override def getPlugins(): java.lang.String = js.native
  // Screen methods
  /** @return A string containing screen information. */
  /* CompleteClass */
  override def getScreenPrint(): java.lang.String = js.native
  /** @return A string containing the Silverlight Version. */
  /* CompleteClass */
  override def getSilverlightVersion(): java.lang.String = js.native
  /** @return A string containing this software version number. */
  /* CompleteClass */
  override def getSoftwareVersion(): java.lang.String = js.native
  /** A lowercase string containing the system language. */
  /* CompleteClass */
  override def getSystemLanguage(): java.lang.String = js.native
  // Time methods
  /** A lowercase string containing the time zone. */
  /* CompleteClass */
  override def getTimeZone(): java.lang.String = js.native
  // User agent methods
  /** @return A string containing unparsed user agent. */
  /* CompleteClass */
  override def getUserAgent(): java.lang.String = js.native
  /** @return A lowercase string containing the user agent. */
  /* CompleteClass */
  override def getUserAgentLowerCase(): java.lang.String = js.native
  // Canvas methods
  /** Check if the canvas element is available. */
  /* CompleteClass */
  override def isCanvas(): scala.Boolean = js.native
  /** Check if the browser is Chrome. */
  /* CompleteClass */
  override def isChrome(): scala.Boolean = js.native
  /** Check if cookies are avaliable. */
  /* CompleteClass */
  override def isCookie(): scala.Boolean = js.native
  /** Check if the browser is Firefox. */
  /* CompleteClass */
  override def isFirefox(): scala.Boolean = js.native
  /** Check if Flash is installed. */
  /* CompleteClass */
  override def isFlash(): scala.Boolean = js.native
  // Font methods
  /** Check if `font` is installed. */
  /* CompleteClass */
  override def isFont(font: java.lang.String): scala.Boolean = js.native
  /** Check if the browser is IE. */
  /* CompleteClass */
  override def isIE(): scala.Boolean = js.native
  /** Check if the browser is on an Apple iPad. */
  /* CompleteClass */
  override def isIpad(): scala.Boolean = js.native
  /** Check if the browser is on an Apple iPhone. */
  /* CompleteClass */
  override def isIphone(): scala.Boolean = js.native
  /** Check if the browser is on an Apple iPod. */
  /* CompleteClass */
  override def isIpod(): scala.Boolean = js.native
  /** Check if Java is installed. */
  /* CompleteClass */
  override def isJava(): scala.Boolean = js.native
  /** Check if the OS is Linux. */
  /* CompleteClass */
  override def isLinux(): scala.Boolean = js.native
  // Storage methods
  /** Check if local storage is avaliable. */
  /* CompleteClass */
  override def isLocalStorage(): scala.Boolean = js.native
  /** Check if the OS is Mac. */
  /* CompleteClass */
  override def isMac(): scala.Boolean = js.native
  // MIME type methods
  /** Check if MIME types are installed. */
  /* CompleteClass */
  override def isMimeTypes(): scala.Boolean = js.native
  // Mobile methods
  /** Check if the browser is on a mobile device. */
  /* CompleteClass */
  override def isMobile(): scala.Boolean = js.native
  /** Check if the browser is on an Android mobile device. */
  /* CompleteClass */
  override def isMobileAndroid(): scala.Boolean = js.native
  /** Check if the browser is on a Blackberry mobile device. */
  /* CompleteClass */
  override def isMobileBlackBerry(): scala.Boolean = js.native
  // iOS methods
  /** Check if the browser is on an Apple iOS device. */
  /* CompleteClass */
  override def isMobileIOS(): scala.Boolean = js.native
  /** Check if the browser is on a major mobile device. */
  /* CompleteClass */
  override def isMobileMajor(): scala.Boolean = js.native
  /** Check if the browser is on an Opera mobile device. */
  /* CompleteClass */
  override def isMobileOpera(): scala.Boolean = js.native
  /** Check if the browser is mobile Safari. */
  /* CompleteClass */
  override def isMobileSafari(): scala.Boolean = js.native
  /** Check if the browser is on a Windows mobile device. */
  /* CompleteClass */
  override def isMobileWindows(): scala.Boolean = js.native
  /** Check if the browser is Opera. */
  /* CompleteClass */
  override def isOpera(): scala.Boolean = js.native
  /** Check if the browser is Safari. */
  /* CompleteClass */
  override def isSafari(): scala.Boolean = js.native
  /** Check if session storage is avaliable. */
  /* CompleteClass */
  override def isSessionStorage(): scala.Boolean = js.native
  /** Check if Silverlight is installed. */
  /* CompleteClass */
  override def isSilverlight(): scala.Boolean = js.native
  /** Check if the OS is Solaris. */
  /* CompleteClass */
  override def isSolaris(): scala.Boolean = js.native
  /** Check if the OS is Ubuntu. */
  /* CompleteClass */
  override def isUbuntu(): scala.Boolean = js.native
  /** Check if the OS is Windows. */
  /* CompleteClass */
  override def isWindows(): scala.Boolean = js.native
}

