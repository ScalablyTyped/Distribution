package typings.ckeditorCkeditor5Utils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcEnvMod {
  
  @JSImport("@ckeditor/ckeditor5-utils/src/env", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * A namespace containing environment and browser information.
    */
  @JSImport("@ckeditor/ckeditor5-utils/src/env", JSImport.Default)
  @js.native
  val default: EnvType = js.native
  
  inline def getUserAgent(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getUserAgent")().asInstanceOf[String]
  
  inline def isAndroid(userAgent: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAndroid")(userAgent.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isBlink(userAgent: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBlink")(userAgent.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isGecko(userAgent: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isGecko")(userAgent.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isMac(userAgent: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMac")(userAgent.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isRegExpUnicodePropertySupported(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRegExpUnicodePropertySupported")().asInstanceOf[Boolean]
  
  inline def isSafari(userAgent: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSafari")(userAgent.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isWindows(userAgent: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isWindows")(userAgent.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isiOS(userAgent: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isiOS")(userAgent.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  trait EnvFeaturesType extends StObject {
    
    /**
      * Indicates that the environment supports ES2018 Unicode property escapes — like `\p{P}` or `\p{L}`.
      * More information about unicode properties might be found
      * [in Unicode Standard Annex #44](https://www.unicode.org/reports/tr44/#GC_Values_Table).
      */
    val isRegExpUnicodePropertySupported: Boolean
  }
  object EnvFeaturesType {
    
    inline def apply(isRegExpUnicodePropertySupported: Boolean): EnvFeaturesType = {
      val __obj = js.Dynamic.literal(isRegExpUnicodePropertySupported = isRegExpUnicodePropertySupported.asInstanceOf[js.Any])
      __obj.asInstanceOf[EnvFeaturesType]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EnvFeaturesType] (val x: Self) extends AnyVal {
      
      inline def setIsRegExpUnicodePropertySupported(value: Boolean): Self = StObject.set(x, "isRegExpUnicodePropertySupported", value.asInstanceOf[js.Any])
    }
  }
  
  trait EnvType extends StObject {
    
    /**
      * Environment features information.
      */
    val features: EnvFeaturesType
    
    /**
      * Indicates that the application is running on Android mobile device.
      */
    val isAndroid: Boolean
    
    /**
      * Indicates that the application is running in a browser using the Blink engine.
      */
    val isBlink: Boolean
    
    /**
      * Indicates that the application is running in Firefox (Gecko).
      */
    val isGecko: Boolean
    
    /**
      * Indicates that the application is running on Macintosh.
      */
    val isMac: Boolean
    
    /**
      * Indicates that the application is running in Safari.
      */
    val isSafari: Boolean
    
    /**
      * Indicates that the application is running on Windows.
      */
    val isWindows: Boolean
    
    /**
      * Indicates the the application is running in iOS.
      */
    val isiOS: Boolean
  }
  object EnvType {
    
    inline def apply(
      features: EnvFeaturesType,
      isAndroid: Boolean,
      isBlink: Boolean,
      isGecko: Boolean,
      isMac: Boolean,
      isSafari: Boolean,
      isWindows: Boolean,
      isiOS: Boolean
    ): EnvType = {
      val __obj = js.Dynamic.literal(features = features.asInstanceOf[js.Any], isAndroid = isAndroid.asInstanceOf[js.Any], isBlink = isBlink.asInstanceOf[js.Any], isGecko = isGecko.asInstanceOf[js.Any], isMac = isMac.asInstanceOf[js.Any], isSafari = isSafari.asInstanceOf[js.Any], isWindows = isWindows.asInstanceOf[js.Any], isiOS = isiOS.asInstanceOf[js.Any])
      __obj.asInstanceOf[EnvType]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EnvType] (val x: Self) extends AnyVal {
      
      inline def setFeatures(value: EnvFeaturesType): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
      
      inline def setIsAndroid(value: Boolean): Self = StObject.set(x, "isAndroid", value.asInstanceOf[js.Any])
      
      inline def setIsBlink(value: Boolean): Self = StObject.set(x, "isBlink", value.asInstanceOf[js.Any])
      
      inline def setIsGecko(value: Boolean): Self = StObject.set(x, "isGecko", value.asInstanceOf[js.Any])
      
      inline def setIsMac(value: Boolean): Self = StObject.set(x, "isMac", value.asInstanceOf[js.Any])
      
      inline def setIsSafari(value: Boolean): Self = StObject.set(x, "isSafari", value.asInstanceOf[js.Any])
      
      inline def setIsWindows(value: Boolean): Self = StObject.set(x, "isWindows", value.asInstanceOf[js.Any])
      
      inline def setIsiOS(value: Boolean): Self = StObject.set(x, "isiOS", value.asInstanceOf[js.Any])
    }
  }
}
