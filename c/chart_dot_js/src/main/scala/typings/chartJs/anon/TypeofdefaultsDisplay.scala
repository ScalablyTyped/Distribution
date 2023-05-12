package typings.chartJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofdefaultsDisplay extends StObject {
  
  val align: String
  
  val display: Boolean
  
  val font: Typeoffont
  
  val fullSize: Boolean
  
  val padding: Double
  
  val position: String
  
  val text: String
  
  val weight_1: Double
}
object TypeofdefaultsDisplay {
  
  inline def apply(
    align: String,
    display: Boolean,
    font: Typeoffont,
    fullSize: Boolean,
    padding: Double,
    position: String,
    text: String,
    weight_1: Double
  ): TypeofdefaultsDisplay = {
    val __obj = js.Dynamic.literal(align = align.asInstanceOf[js.Any], display = display.asInstanceOf[js.Any], font = font.asInstanceOf[js.Any], fullSize = fullSize.asInstanceOf[js.Any], padding = padding.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], weight_1 = weight_1.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofdefaultsDisplay]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofdefaultsDisplay] (val x: Self) extends AnyVal {
    
    inline def setAlign(value: String): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    inline def setDisplay(value: Boolean): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    inline def setFont(value: Typeoffont): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    inline def setFullSize(value: Boolean): Self = StObject.set(x, "fullSize", value.asInstanceOf[js.Any])
    
    inline def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setWeight_1(value: Double): Self = StObject.set(x, "weight_1", value.asInstanceOf[js.Any])
  }
}
