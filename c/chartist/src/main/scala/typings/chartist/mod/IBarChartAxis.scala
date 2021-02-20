package typings.chartist.mod

import typings.chartist.anon.Y
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IBarChartAxis extends StObject {
  
  var labelInterpolationFnc: js.UndefOr[js.Function] = js.native
  
  var labelOffset: js.UndefOr[Y] = js.native
  
  var offset: js.UndefOr[Double] = js.native
  
  var onlyInteger: js.UndefOr[Boolean] = js.native
  
  var position: js.UndefOr[String] = js.native
  
  var scaleMinSpace: js.UndefOr[Double] = js.native
  
  var showGrid: js.UndefOr[Boolean] = js.native
  
  var showLabel: js.UndefOr[Boolean] = js.native
}
object IBarChartAxis {
  
  @scala.inline
  def apply(): IBarChartAxis = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBarChartAxis]
  }
  
  @scala.inline
  implicit class IBarChartAxisMutableBuilder[Self <: IBarChartAxis] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLabelInterpolationFnc(value: js.Function): Self = StObject.set(x, "labelInterpolationFnc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelInterpolationFncUndefined: Self = StObject.set(x, "labelInterpolationFnc", js.undefined)
    
    @scala.inline
    def setLabelOffset(value: Y): Self = StObject.set(x, "labelOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelOffsetUndefined: Self = StObject.set(x, "labelOffset", js.undefined)
    
    @scala.inline
    def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    @scala.inline
    def setOnlyInteger(value: Boolean): Self = StObject.set(x, "onlyInteger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnlyIntegerUndefined: Self = StObject.set(x, "onlyInteger", js.undefined)
    
    @scala.inline
    def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    @scala.inline
    def setScaleMinSpace(value: Double): Self = StObject.set(x, "scaleMinSpace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleMinSpaceUndefined: Self = StObject.set(x, "scaleMinSpace", js.undefined)
    
    @scala.inline
    def setShowGrid(value: Boolean): Self = StObject.set(x, "showGrid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowGridUndefined: Self = StObject.set(x, "showGrid", js.undefined)
    
    @scala.inline
    def setShowLabel(value: Boolean): Self = StObject.set(x, "showLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowLabelUndefined: Self = StObject.set(x, "showLabel", js.undefined)
  }
}
