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
  
  inline def apply(): NativeKeyboardHideOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NativeKeyboardHideOptions]
  }
  
  extension [Self <: NativeKeyboardHideOptions](x: Self) {
    
    inline def setAnimated(value: Boolean): Self = StObject.set(x, "animated", value.asInstanceOf[js.Any])
    
    inline def setAnimatedUndefined: Self = StObject.set(x, "animated", js.undefined)
  }
}
