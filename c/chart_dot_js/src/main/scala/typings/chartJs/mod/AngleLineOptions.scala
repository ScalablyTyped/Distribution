package typings.chartJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AngleLineOptions extends StObject {
  
  var borderDash: js.UndefOr[js.Array[Double]] = js.native
  
  var borderDashOffset: js.UndefOr[Double] = js.native
  
  var color: js.UndefOr[ChartColor] = js.native
  
  var display: js.UndefOr[Boolean] = js.native
  
  var lineWidth: js.UndefOr[Double] = js.native
}
object AngleLineOptions {
  
  @scala.inline
  def apply(): AngleLineOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AngleLineOptions]
  }
  
  @scala.inline
  implicit class AngleLineOptionsMutableBuilder[Self <: AngleLineOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBorderDash(value: js.Array[Double]): Self = StObject.set(x, "borderDash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderDashOffset(value: Double): Self = StObject.set(x, "borderDashOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderDashOffsetUndefined: Self = StObject.set(x, "borderDashOffset", js.undefined)
    
    @scala.inline
    def setBorderDashUndefined: Self = StObject.set(x, "borderDash", js.undefined)
    
    @scala.inline
    def setBorderDashVarargs(value: Double*): Self = StObject.set(x, "borderDash", js.Array(value :_*))
    
    @scala.inline
    def setColor(value: ChartColor): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setColorVarargs(value: String*): Self = StObject.set(x, "color", js.Array(value :_*))
    
    @scala.inline
    def setDisplay(value: Boolean): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
    
    @scala.inline
    def setLineWidth(value: Double): Self = StObject.set(x, "lineWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineWidthUndefined: Self = StObject.set(x, "lineWidth", js.undefined)
  }
}
