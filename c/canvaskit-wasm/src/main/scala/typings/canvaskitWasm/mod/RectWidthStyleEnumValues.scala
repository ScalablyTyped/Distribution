package typings.canvaskitWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RectWidthStyleEnumValues extends EmbindEnum {
  
  var Max: RectWidthStyle = js.native
  
  var Tight: RectWidthStyle = js.native
}
object RectWidthStyleEnumValues {
  
  @scala.inline
  def apply(Max: RectWidthStyle, Tight: RectWidthStyle, values: js.Array[Double]): RectWidthStyleEnumValues = {
    val __obj = js.Dynamic.literal(Max = Max.asInstanceOf[js.Any], Tight = Tight.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[RectWidthStyleEnumValues]
  }
  
  @scala.inline
  implicit class RectWidthStyleEnumValuesMutableBuilder[Self <: RectWidthStyleEnumValues] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMax(value: RectWidthStyle): Self = StObject.set(x, "Max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTight(value: RectWidthStyle): Self = StObject.set(x, "Tight", value.asInstanceOf[js.Any])
  }
}
