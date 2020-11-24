package typings.chartist.mod

import typings.chartist.chartistStrings.label
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
  implicit class IChartDrawLabelDataOps[Self <: IChartDrawLabelData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAxis(value: IChartAxis): Self = this.set("axis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElement(value: IChartistSvg): Self = this.set("element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroup(value: IChartistSvg): Self = this.set("group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: Double): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: label): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
  }
}
