package typings.bootstrapColorpicker

import typings.bootstrapColorpicker.anon.A
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Color extends StObject {
  
  var fallbackFormat: String = js.native
  
  var fallbackValue: String = js.native
  
  var hexNumberSignPrefix: Boolean = js.native
  
  var origFormat: String = js.native
  
  /**
    * Set the transparency with a value between 0 and 1.
    */
  def setAlpha(value: Double): Unit = js.native
  
  /**
    * Set the brightness with a value between 0 and 1.
    */
  def setBrightness(value: Double): Unit = js.native
  
  /**
    * Set a new color. The value is parsed and tries to do a quess on the format.
    */
  def setColor(value: String): Unit = js.native
  
  /**
    * Set the HUE with a value between 0 and 1.
    */
  def setHue(value: Double): Unit = js.native
  
  /**
    * Set the saturation with a value between 0 and 1.
    */
  def setSaturation(value: Double): Unit = js.native
  
  /**
    * Returns a hash with HSLA values.
    */
  def toHSL(): String = js.native
  
  /**
    * Returns a string with HEX format for the current color.
    */
  def toHex(): String = js.native
  
  /**
    * Returns a hash with red, green, blue and alpha.
    */
  def toRGB(): String = js.native
  
  /**
    * Returns current color as string in specified format.
    */
  def toString(format: ColorFormat): String = js.native
  
  var value: A = js.native
}
object Color {
  
  @scala.inline
  def apply(
    fallbackFormat: String,
    fallbackValue: String,
    hexNumberSignPrefix: Boolean,
    origFormat: String,
    setAlpha: Double => Unit,
    setBrightness: Double => Unit,
    setColor: String => Unit,
    setHue: Double => Unit,
    setSaturation: Double => Unit,
    toHSL: () => String,
    toHex: () => String,
    toRGB: () => String,
    toString_ : ColorFormat => String,
    value: A
  ): Color = {
    val __obj = js.Dynamic.literal(fallbackFormat = fallbackFormat.asInstanceOf[js.Any], fallbackValue = fallbackValue.asInstanceOf[js.Any], hexNumberSignPrefix = hexNumberSignPrefix.asInstanceOf[js.Any], origFormat = origFormat.asInstanceOf[js.Any], setAlpha = js.Any.fromFunction1(setAlpha), setBrightness = js.Any.fromFunction1(setBrightness), setColor = js.Any.fromFunction1(setColor), setHue = js.Any.fromFunction1(setHue), setSaturation = js.Any.fromFunction1(setSaturation), toHSL = js.Any.fromFunction0(toHSL), toHex = js.Any.fromFunction0(toHex), toRGB = js.Any.fromFunction0(toRGB), value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("toString")(js.Any.fromFunction1(toString_))
    __obj.asInstanceOf[Color]
  }
  
  @scala.inline
  implicit class ColorMutableBuilder[Self <: Color] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFallbackFormat(value: String): Self = StObject.set(x, "fallbackFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFallbackValue(value: String): Self = StObject.set(x, "fallbackValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHexNumberSignPrefix(value: Boolean): Self = StObject.set(x, "hexNumberSignPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrigFormat(value: String): Self = StObject.set(x, "origFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetAlpha(value: Double => Unit): Self = StObject.set(x, "setAlpha", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetBrightness(value: Double => Unit): Self = StObject.set(x, "setBrightness", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetColor(value: String => Unit): Self = StObject.set(x, "setColor", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetHue(value: Double => Unit): Self = StObject.set(x, "setHue", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetSaturation(value: Double => Unit): Self = StObject.set(x, "setSaturation", js.Any.fromFunction1(value))
    
    @scala.inline
    def setToHSL(value: () => String): Self = StObject.set(x, "toHSL", js.Any.fromFunction0(value))
    
    @scala.inline
    def setToHex(value: () => String): Self = StObject.set(x, "toHex", js.Any.fromFunction0(value))
    
    @scala.inline
    def setToRGB(value: () => String): Self = StObject.set(x, "toRGB", js.Any.fromFunction0(value))
    
    @scala.inline
    def setToString_(value: ColorFormat => String): Self = StObject.set(x, "toString", js.Any.fromFunction1(value))
    
    @scala.inline
    def setValue(value: A): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
