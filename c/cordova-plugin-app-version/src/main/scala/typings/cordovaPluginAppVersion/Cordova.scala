package typings.cordovaPluginAppVersion

import typings.cordovaPluginAppVersion.anon.GetAppName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cordova extends StObject {
  
  var getAppVersion: GetAppName
}
object Cordova {
  
  inline def apply(getAppVersion: GetAppName): Cordova = {
    val __obj = js.Dynamic.literal(getAppVersion = getAppVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cordova]
  }
  
  extension [Self <: Cordova](x: Self) {
    
    inline def setGetAppVersion(value: GetAppName): Self = StObject.set(x, "getAppVersion", value.asInstanceOf[js.Any])
  }
}
