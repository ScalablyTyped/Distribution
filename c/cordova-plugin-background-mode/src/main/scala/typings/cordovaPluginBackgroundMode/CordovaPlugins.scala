package typings.cordovaPluginBackgroundMode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CordovaPlugins extends StObject {
  
  var backgroundMode: CordovaPluginBackgroundMode
}
object CordovaPlugins {
  
  @scala.inline
  def apply(backgroundMode: CordovaPluginBackgroundMode): CordovaPlugins = {
    val __obj = js.Dynamic.literal(backgroundMode = backgroundMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[CordovaPlugins]
  }
  
  @scala.inline
  implicit class CordovaPluginsMutableBuilder[Self <: CordovaPlugins] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackgroundMode(value: CordovaPluginBackgroundMode): Self = StObject.set(x, "backgroundMode", value.asInstanceOf[js.Any])
  }
}
