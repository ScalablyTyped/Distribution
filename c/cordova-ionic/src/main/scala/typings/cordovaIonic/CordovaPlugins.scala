package typings.cordovaIonic

import typings.cordovaIonic.Ionic.Keyboard
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CordovaPlugins extends StObject {
  
  var Keyboard: typings.cordovaIonic.Ionic.Keyboard = js.native
}
object CordovaPlugins {
  
  @scala.inline
  def apply(Keyboard: Keyboard): CordovaPlugins = {
    val __obj = js.Dynamic.literal(Keyboard = Keyboard.asInstanceOf[js.Any])
    __obj.asInstanceOf[CordovaPlugins]
  }
  
  @scala.inline
  implicit class CordovaPluginsMutableBuilder[Self <: CordovaPlugins] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKeyboard(value: Keyboard): Self = StObject.set(x, "Keyboard", value.asInstanceOf[js.Any])
  }
}
