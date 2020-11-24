package typings.chartJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RadialLinearScale extends js.Object {
  
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
  implicit class RadialLinearScaleOps[Self <: RadialLinearScale] (val x: Self) extends AnyVal {
    
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
    def setAngleLines(value: AngleLineOptions): Self = this.set("angleLines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAngleLines: Self = this.set("angleLines", js.undefined)
    
    @scala.inline
    def setAnimate(value: Boolean): Self = this.set("animate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimate: Self = this.set("animate", js.undefined)
    
    @scala.inline
    def setDisplay(value: Boolean): Self = this.set("display", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplay: Self = this.set("display", js.undefined)
    
    @scala.inline
    def setGridLines(value: GridLineOptions): Self = this.set("gridLines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGridLines: Self = this.set("gridLines", js.undefined)
    
    @scala.inline
    def setPointLabels(value: PointLabelOptions): Self = this.set("pointLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePointLabels: Self = this.set("pointLabels", js.undefined)
    
    @scala.inline
    def setPosition(value: PositionType): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    
    @scala.inline
    def setTicks(value: LinearTickOptions): Self = this.set("ticks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTicks: Self = this.set("ticks", js.undefined)
  }
}
