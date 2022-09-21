package typings.clientjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("clientjs", "ClientJS")
  @js.native
  open class ClientJS () extends StObject {
    
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
}
