package typings.cordovaPluginNativeKeyboard

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NativeKeyboardHideOptions extends StObject {
  
  /**
    * A boolean flag inidicating if the keyboard should be shown/hidden with an animation
    */
  var animated: js.UndefOr[Boolean] = js.undefined
}
object NativeKeyboardHideOptions {
  
  @scala.inline
  def apply(): NativeKeyboardHideOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NativeKeyboardHideOptions]
  }
  
  @scala.inline
  implicit class NativeKeyboardHideOptionsMutableBuilder[Self <: NativeKeyboardHideOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimated(value: Boolean): Self = StObject.set(x, "animated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimatedUndefined: Self = StObject.set(x, "animated", js.undefined)
  }
}
