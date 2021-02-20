package typings.chartJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChartTooltipLabelColor extends StObject {
  
  var backgroundColor: ChartColor = js.native
  
  var borderColor: ChartColor = js.native
}
object ChartTooltipLabelColor {
  
  @scala.inline
  def apply(backgroundColor: ChartColor, borderColor: ChartColor): ChartTooltipLabelColor = {
    val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any], borderColor = borderColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartTooltipLabelColor]
  }
  
  @scala.inline
  implicit class ChartTooltipLabelColorMutableBuilder[Self <: ChartTooltipLabelColor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackgroundColor(value: ChartColor): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundColorVarargs(value: String*): Self = StObject.set(x, "backgroundColor", js.Array(value :_*))
    
    @scala.inline
    def setBorderColor(value: ChartColor): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderColorVarargs(value: String*): Self = StObject.set(x, "borderColor", js.Array(value :_*))
  }
}
