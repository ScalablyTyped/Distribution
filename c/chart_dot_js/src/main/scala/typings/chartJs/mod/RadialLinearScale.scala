package typings.chartJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RadialLinearScale extends StObject {
  
  var angleLines: js.UndefOr[AngleLineOptions] = js.native
  
  var animate: js.UndefOr[Boolean] = js.native
  
  var display: js.UndefOr[Boolean] = js.native
  
  var gridLines: js.UndefOr[GridLineOptions] = js.native
  
  var pointLabels: js.UndefOr[PointLabelOptions] = js.native
  
  var position: js.UndefOr[PositionType] = js.native
  
  var ticks: js.UndefOr[LinearTickOptions] = js.native
}
object RadialLinearScale {
  
  @scala.inline
  def apply(): RadialLinearScale = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RadialLinearScale]
  }
  
  @scala.inline
  implicit class RadialLinearScaleMutableBuilder[Self <: RadialLinearScale] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAngleLines(value: AngleLineOptions): Self = StObject.set(x, "angleLines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAngleLinesUndefined: Self = StObject.set(x, "angleLines", js.undefined)
    
    @scala.inline
    def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
    
    @scala.inline
    def setDisplay(value: Boolean): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
    
    @scala.inline
    def setGridLines(value: GridLineOptions): Self = StObject.set(x, "gridLines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGridLinesUndefined: Self = StObject.set(x, "gridLines", js.undefined)
    
    @scala.inline
    def setPointLabels(value: PointLabelOptions): Self = StObject.set(x, "pointLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointLabelsUndefined: Self = StObject.set(x, "pointLabels", js.undefined)
    
    @scala.inline
    def setPosition(value: PositionType): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    @scala.inline
    def setTicks(value: LinearTickOptions): Self = StObject.set(x, "ticks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTicksUndefined: Self = StObject.set(x, "ticks", js.undefined)
  }
}
