package typings.cordovaIonic

import typings.cordovaIonic.Ionic.Keyboard
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CordovaPlugins extends StObject {
  
  var Keyboard: typings.cordovaIonic.Ionic.Keyboard
}
object CordovaPlugins {
  
  inline def apply(Keyboard: Keyboard): CordovaPlugins = {
    val __obj = js.Dynamic.literal(Keyboard = Keyboard.asInstanceOf[js.Any])
    __obj.asInstanceOf[CordovaPlugins]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CordovaPlugins] (val x: Self) extends AnyVal {
    
    inline def setKeyboard(value: Keyboard): Self = StObject.set(x, "Keyboard", value.asInstanceOf[js.Any])
  }
}
