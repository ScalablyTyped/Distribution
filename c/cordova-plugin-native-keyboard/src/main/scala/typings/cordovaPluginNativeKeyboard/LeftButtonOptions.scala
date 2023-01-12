package typings.cordovaPluginNativeKeyboard

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LeftButtonOptions
  extends StObject
     with ButtonOptions {
  
  /**
    * Set to true to disable the button once text has been entered.
    *
    * Default: false
    */
  var disabledWhenTextEntered: js.UndefOr[Boolean] = js.undefined
}
object LeftButtonOptions {
  
  inline def apply(color: String, onPress: () => Unit): LeftButtonOptions = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], onPress = js.Any.fromFunction0(onPress))
    __obj.asInstanceOf[LeftButtonOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LeftButtonOptions] (val x: Self) extends AnyVal {
    
    inline def setDisabledWhenTextEntered(value: Boolean): Self = StObject.set(x, "disabledWhenTextEntered", value.asInstanceOf[js.Any])
    
    inline def setDisabledWhenTextEnteredUndefined: Self = StObject.set(x, "disabledWhenTextEntered", js.undefined)
  }
}
