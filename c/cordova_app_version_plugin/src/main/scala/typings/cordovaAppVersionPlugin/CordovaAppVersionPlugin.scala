package typings.cordovaAppVersionPlugin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Keep the type global namespace clean by using a module
  */
object CordovaAppVersionPlugin {
  
  trait CordovaAppVersionPlugin extends StObject {
    
    /**
      * App version from config.xml's version (e.g. <widget id="my.app.id" version="1.5.0">)
      * @example window.cordova.plugins.version.getAppVersion() // e.g: "1.5.0"
      */
    def getAppVersion(): String
  }
  object CordovaAppVersionPlugin {
    
    inline def apply(getAppVersion: () => String): typings.cordovaAppVersionPlugin.CordovaAppVersionPlugin.CordovaAppVersionPlugin = {
      val __obj = js.Dynamic.literal(getAppVersion = js.Any.fromFunction0(getAppVersion))
      __obj.asInstanceOf[typings.cordovaAppVersionPlugin.CordovaAppVersionPlugin.CordovaAppVersionPlugin]
    }
    
    extension [Self <: typings.cordovaAppVersionPlugin.CordovaAppVersionPlugin.CordovaAppVersionPlugin](x: Self) {
      
      inline def setGetAppVersion(value: () => String): Self = StObject.set(x, "getAppVersion", js.Any.fromFunction0(value))
    }
  }
}
