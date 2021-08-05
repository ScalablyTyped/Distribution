package typings.cordovaAppVersionPlugin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CordovaPlugins extends StObject {
  
  /**
    * cordova_app_version_plugin interface
    */
  var version: typings.cordovaAppVersionPlugin.CordovaAppVersionPlugin.CordovaAppVersionPlugin
}
object CordovaPlugins {
  
  inline def apply(version: typings.cordovaAppVersionPlugin.CordovaAppVersionPlugin.CordovaAppVersionPlugin): CordovaPlugins = {
    val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[CordovaPlugins]
  }
  
  extension [Self <: CordovaPlugins](x: Self) {
    
    inline def setVersion(value: typings.cordovaAppVersionPlugin.CordovaAppVersionPlugin.CordovaAppVersionPlugin): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
