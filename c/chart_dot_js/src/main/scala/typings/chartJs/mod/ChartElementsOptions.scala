package typings.chartJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChartElementsOptions extends StObject {
  
  var arc: js.UndefOr[ChartArcOptions] = js.native
  
  var line: js.UndefOr[ChartLineOptions] = js.native
  
  var point: js.UndefOr[ChartPointOptions] = js.native
  
  var rectangle: js.UndefOr[ChartRectangleOptions] = js.native
}
object ChartElementsOptions {
  
  @scala.inline
  def apply(): ChartElementsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartElementsOptions]
  }
  
  @scala.inline
  implicit class ChartElementsOptionsMutableBuilder[Self <: ChartElementsOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArc(value: ChartArcOptions): Self = StObject.set(x, "arc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArcUndefined: Self = StObject.set(x, "arc", js.undefined)
    
    @scala.inline
    def setLine(value: ChartLineOptions): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
    
    @scala.inline
    def setPoint(value: ChartPointOptions): Self = StObject.set(x, "point", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointUndefined: Self = StObject.set(x, "point", js.undefined)
    
    @scala.inline
    def setRectangle(value: ChartRectangleOptions): Self = StObject.set(x, "rectangle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRectangleUndefined: Self = StObject.set(x, "rectangle", js.undefined)
  }
}
