package typings.cordovaPluginNativeKeyboard

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ButtonOptions extends StObject {
  
  /**
    * The color of the button in HEX
    *
    * Default: #000
    */
  var color: String = js.native
  
  /**
    * A callback being executed as soon as the button is clicked
    */
  def onPress(): Unit = js.native
  
  /**
    * If type is "text" you can set this to either "normal", "bold" or "italic".
    *
    * Default: "normal"
    */
  var textStyle: js.UndefOr[String] = js.native
  
  /**
    * The type of the button.
    * Either "text", "fontawesome" or "ionicon".
    *
    * Default: "text"
    */
  var `type`: js.UndefOr[String] = js.native
  
  /**
    * The value of the button. On "text" the string is used as label
    * On fonatawesome or ionicon the icon name is used (e.g. fa-rocket)
    *
    * Default: "Send"
    */
  var value: js.UndefOr[String] = js.native
}
object ButtonOptions {
  
  @scala.inline
  def apply(color: String, onPress: () => Unit): ButtonOptions = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], onPress = js.Any.fromFunction0(onPress))
    __obj.asInstanceOf[ButtonOptions]
  }
  
  @scala.inline
  implicit class ButtonOptionsMutableBuilder[Self <: ButtonOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnPress(value: () => Unit): Self = StObject.set(x, "onPress", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTextStyle(value: String): Self = StObject.set(x, "textStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextStyleUndefined: Self = StObject.set(x, "textStyle", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
