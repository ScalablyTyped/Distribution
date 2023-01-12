package typings.cordovaPluginNativeKeyboard

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ButtonOptions extends StObject {
  
  /**
    * The color of the button in HEX
    *
    * Default: #000
    */
  var color: String
  
  /**
    * A callback being executed as soon as the button is clicked
    */
  def onPress(): Unit
  
  /**
    * If type is "text" you can set this to either "normal", "bold" or "italic".
    *
    * Default: "normal"
    */
  var textStyle: js.UndefOr[String] = js.undefined
  
  /**
    * The type of the button.
    * Either "text", "fontawesome" or "ionicon".
    *
    * Default: "text"
    */
  var `type`: js.UndefOr[String] = js.undefined
  
  /**
    * The value of the button. On "text" the string is used as label
    * On fonatawesome or ionicon the icon name is used (e.g. fa-rocket)
    *
    * Default: "Send"
    */
  var value: js.UndefOr[String] = js.undefined
}
object ButtonOptions {
  
  inline def apply(color: String, onPress: () => Unit): ButtonOptions = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], onPress = js.Any.fromFunction0(onPress))
    __obj.asInstanceOf[ButtonOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ButtonOptions] (val x: Self) extends AnyVal {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setOnPress(value: () => Unit): Self = StObject.set(x, "onPress", js.Any.fromFunction0(value))
    
    inline def setTextStyle(value: String): Self = StObject.set(x, "textStyle", value.asInstanceOf[js.Any])
    
    inline def setTextStyleUndefined: Self = StObject.set(x, "textStyle", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
