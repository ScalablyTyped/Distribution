package typings.chartist.mod

import typings.chartist.chartistStrings.grid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IChartDrawGridData extends ChartDrawData {
  
  var axis: IChartAxis = js.native
  
  var element: IChartistSvg = js.native
  
  var group: IChartistSvg = js.native
  
  var index: Double = js.native
  
  var `type`: grid = js.native
  
  var x1: Double = js.native
  
  var x2: Double = js.native
  
  var y1: Double = js.native
  
  var y2: Double = js.native
}
object IChartDrawGridData {
  
  @scala.inline
  def apply(
    axis: IChartAxis,
    element: IChartistSvg,
    group: IChartistSvg,
    index: Double,
    `type`: grid,
    x1: Double,
    x2: Double,
    y1: Double,
    y2: Double
  ): IChartDrawGridData = {
    val __obj = js.Dynamic.literal(axis = axis.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], group = group.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], x1 = x1.asInstanceOf[js.Any], x2 = x2.asInstanceOf[js.Any], y1 = y1.asInstanceOf[js.Any], y2 = y2.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IChartDrawGridData]
  }
  
  @scala.inline
  implicit class IChartDrawGridDataMutableBuilder[Self <: IChartDrawGridData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAxis(value: IChartAxis): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElement(value: IChartistSvg): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroup(value: IChartistSvg): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: grid): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX1(value: Double): Self = StObject.set(x, "x1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX2(value: Double): Self = StObject.set(x, "x2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY1(value: Double): Self = StObject.set(x, "y1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY2(value: Double): Self = StObject.set(x, "y2", value.asInstanceOf[js.Any])
  }
}
