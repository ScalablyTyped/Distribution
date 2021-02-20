package typings.chartJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChartRectangleOptions extends StObject {
  
  var backgroundColor: js.UndefOr[ChartColor] = js.native
  
  var borderColor: js.UndefOr[ChartColor] = js.native
  
  var borderSkipped: js.UndefOr[String] = js.native
  
  var borderWidth: js.UndefOr[Double] = js.native
}
object ChartRectangleOptions {
  
  @scala.inline
  def apply(): ChartRectangleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartRectangleOptions]
  }
  
  @scala.inline
  implicit class ChartRectangleOptionsMutableBuilder[Self <: ChartRectangleOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackgroundColor(value: ChartColor): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    @scala.inline
    def setBackgroundColorVarargs(value: String*): Self = StObject.set(x, "backgroundColor", js.Array(value :_*))
    
    @scala.inline
    def setBorderColor(value: ChartColor): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
    
    @scala.inline
    def setBorderColorVarargs(value: String*): Self = StObject.set(x, "borderColor", js.Array(value :_*))
    
    @scala.inline
    def setBorderSkipped(value: String): Self = StObject.set(x, "borderSkipped", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderSkippedUndefined: Self = StObject.set(x, "borderSkipped", js.undefined)
    
    @scala.inline
    def setBorderWidth(value: Double): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderWidthUndefined: Self = StObject.set(x, "borderWidth", js.undefined)
  }
}
