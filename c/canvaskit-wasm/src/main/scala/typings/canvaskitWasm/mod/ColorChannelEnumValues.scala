package typings.canvaskitWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColorChannelEnumValues
  extends StObject
     with EmbindEnum {
  
  var Alpha: ColorChannel
  
  var Blue: ColorChannel
  
  var Green: ColorChannel
  
  var Red: ColorChannel
}
object ColorChannelEnumValues {
  
  inline def apply(
    Alpha: ColorChannel,
    Blue: ColorChannel,
    Green: ColorChannel,
    Red: ColorChannel,
    values: js.Array[Double]
  ): ColorChannelEnumValues = {
    val __obj = js.Dynamic.literal(Alpha = Alpha.asInstanceOf[js.Any], Blue = Blue.asInstanceOf[js.Any], Green = Green.asInstanceOf[js.Any], Red = Red.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorChannelEnumValues]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ColorChannelEnumValues] (val x: Self) extends AnyVal {
    
    inline def setAlpha(value: ColorChannel): Self = StObject.set(x, "Alpha", value.asInstanceOf[js.Any])
    
    inline def setBlue(value: ColorChannel): Self = StObject.set(x, "Blue", value.asInstanceOf[js.Any])
    
    inline def setGreen(value: ColorChannel): Self = StObject.set(x, "Green", value.asInstanceOf[js.Any])
    
    inline def setRed(value: ColorChannel): Self = StObject.set(x, "Red", value.asInstanceOf[js.Any])
  }
}
