package typings.canvaskitWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RectHeightStyleEnumValues extends EmbindEnum {
  
  var IncludeLineSpacingBottom: RectHeightStyle = js.native
  
  var IncludeLineSpacingMiddle: RectHeightStyle = js.native
  
  var IncludeLineSpacingTop: RectHeightStyle = js.native
  
  var Max: RectHeightStyle = js.native
  
  var Tight: RectHeightStyle = js.native
}
object RectHeightStyleEnumValues {
  
  @scala.inline
  def apply(
    IncludeLineSpacingBottom: RectHeightStyle,
    IncludeLineSpacingMiddle: RectHeightStyle,
    IncludeLineSpacingTop: RectHeightStyle,
    Max: RectHeightStyle,
    Tight: RectHeightStyle,
    values: js.Array[Double]
  ): RectHeightStyleEnumValues = {
    val __obj = js.Dynamic.literal(IncludeLineSpacingBottom = IncludeLineSpacingBottom.asInstanceOf[js.Any], IncludeLineSpacingMiddle = IncludeLineSpacingMiddle.asInstanceOf[js.Any], IncludeLineSpacingTop = IncludeLineSpacingTop.asInstanceOf[js.Any], Max = Max.asInstanceOf[js.Any], Tight = Tight.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[RectHeightStyleEnumValues]
  }
  
  @scala.inline
  implicit class RectHeightStyleEnumValuesMutableBuilder[Self <: RectHeightStyleEnumValues] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIncludeLineSpacingBottom(value: RectHeightStyle): Self = StObject.set(x, "IncludeLineSpacingBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeLineSpacingMiddle(value: RectHeightStyle): Self = StObject.set(x, "IncludeLineSpacingMiddle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeLineSpacingTop(value: RectHeightStyle): Self = StObject.set(x, "IncludeLineSpacingTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMax(value: RectHeightStyle): Self = StObject.set(x, "Max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTight(value: RectHeightStyle): Self = StObject.set(x, "Tight", value.asInstanceOf[js.Any])
  }
}
