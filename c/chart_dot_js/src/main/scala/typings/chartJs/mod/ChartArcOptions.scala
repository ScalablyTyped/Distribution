package typings.chartJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChartArcOptions extends StObject {
  
  var angle: js.UndefOr[Double] = js.native
  
  var backgroundColor: js.UndefOr[ChartColor] = js.native
  
  var borderAlign: js.UndefOr[BorderAlignment] = js.native
  
  var borderColor: js.UndefOr[ChartColor] = js.native
  
  var borderWidth: js.UndefOr[Double] = js.native
}
object ChartArcOptions {
  
  @scala.inline
  def apply(): ChartArcOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartArcOptions]
  }
  
  @scala.inline
  implicit class ChartArcOptionsMutableBuilder[Self <: ChartArcOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAngleUndefined: Self = StObject.set(x, "angle", js.undefined)
    
    @scala.inline
    def setBackgroundColor(value: ChartColor): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    @scala.inline
    def setBackgroundColorVarargs(value: String*): Self = StObject.set(x, "backgroundColor", js.Array(value :_*))
    
    @scala.inline
    def setBorderAlign(value: BorderAlignment): Self = StObject.set(x, "borderAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderAlignUndefined: Self = StObject.set(x, "borderAlign", js.undefined)
    
    @scala.inline
    def setBorderColor(value: ChartColor): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
    
    @scala.inline
    def setBorderColorVarargs(value: String*): Self = StObject.set(x, "borderColor", js.Array(value :_*))
    
    @scala.inline
    def setBorderWidth(value: Double): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderWidthUndefined: Self = StObject.set(x, "borderWidth", js.undefined)
  }
}
