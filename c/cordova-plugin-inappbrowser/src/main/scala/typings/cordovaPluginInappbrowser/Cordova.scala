package typings.cordovaPluginInappbrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cordova extends StObject {
  
  var InAppBrowser: typings.cordovaPluginInappbrowser.InAppBrowser
}
object Cordova {
  
  inline def apply(InAppBrowser: InAppBrowser): Cordova = {
    val __obj = js.Dynamic.literal(InAppBrowser = InAppBrowser.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cordova]
  }
  
  extension [Self <: Cordova](x: Self) {
    
    inline def setInAppBrowser(value: InAppBrowser): Self = StObject.set(x, "InAppBrowser", value.asInstanceOf[js.Any])
  }
}
