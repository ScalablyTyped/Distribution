package typings.chartist.mod

import typings.chartist.chartistStrings.label
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IChartDrawLabelData extends ChartDrawData {
  
  var axis: IChartAxis = js.native
  
  var element: IChartistSvg = js.native
  
  var group: IChartistSvg = js.native
  
  var height: Double = js.native
  
  var index: Double = js.native
  
  var text: Double = js.native
  
  var `type`: label = js.native
  
  var width: Double = js.native
  
  var x: Double = js.native
  
  var y: Double = js.native
}
object IChartDrawLabelData {
  
  @scala.inline
  def apply(
    axis: IChartAxis,
    element: IChartistSvg,
    group: IChartistSvg,
    height: Double,
    index: Double,
    text: Double,
    `type`: label,
    width: Double,
    x: Double,
    y: Double
  ): IChartDrawLabelData = {
    val __obj = js.Dynamic.literal(axis = axis.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], group = group.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IChartDrawLabelData]
  }
  
  @scala.inline
  implicit class IChartDrawLabelDataMutableBuilder[Self <: IChartDrawLabelData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAxis(value: IChartAxis): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElement(value: IChartistSvg): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroup(value: IChartistSvg): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: Double): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: label): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
