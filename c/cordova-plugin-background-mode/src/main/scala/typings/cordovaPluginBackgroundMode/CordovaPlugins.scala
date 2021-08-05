package typings.cordovaPluginBackgroundMode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CordovaPlugins extends StObject {
  
  var backgroundMode: CordovaPluginBackgroundMode
}
object CordovaPlugins {
  
  inline def apply(backgroundMode: CordovaPluginBackgroundMode): CordovaPlugins = {
    val __obj = js.Dynamic.literal(backgroundMode = backgroundMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[CordovaPlugins]
  }
  
  extension [Self <: CordovaPlugins](x: Self) {
    
    inline def setBackgroundMode(value: CordovaPluginBackgroundMode): Self = StObject.set(x, "backgroundMode", value.asInstanceOf[js.Any])
  }
}
