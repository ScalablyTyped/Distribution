package typings.bizcharts.mod

import typings.bizcharts.bizchartsStrings.x
import typings.bizcharts.bizchartsStrings.y
import typings.react.mod.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CoordProps
  extends Props[js.Any] {
  
  var endAngle: js.UndefOr[Double] = js.native
  
  var innerRadius: js.UndefOr[Double] = js.native
  
  var radius: js.UndefOr[Double] = js.native
  
  var reflect: js.UndefOr[x | y] = js.native
  
  var rotate: js.UndefOr[Double] = js.native
  
  var scale: js.UndefOr[js.Tuple2[Double, Double]] = js.native
  
  var startAngle: js.UndefOr[Double] = js.native
  
  var transpose: js.UndefOr[Boolean] = js.native
  
  var `type`: js.UndefOr[CoordType] = js.native
}
object CoordProps {
  
  @scala.inline
  def apply(): CoordProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CoordProps]
  }
  
  @scala.inline
  implicit class CoordPropsOps[Self <: CoordProps] (val x: Self) extends AnyVal {
    
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
    def setEndAngle(value: Double): Self = this.set("endAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndAngle: Self = this.set("endAngle", js.undefined)
    
    @scala.inline
    def setInnerRadius(value: Double): Self = this.set("innerRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInnerRadius: Self = this.set("innerRadius", js.undefined)
    
    @scala.inline
    def setRadius(value: Double): Self = this.set("radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRadius: Self = this.set("radius", js.undefined)
    
    @scala.inline
    def setReflect(value: typings.bizcharts.bizchartsStrings.x | y): Self = this.set("reflect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReflect: Self = this.set("reflect", js.undefined)
    
    @scala.inline
    def setRotate(value: Double): Self = this.set("rotate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRotate: Self = this.set("rotate", js.undefined)
    
    @scala.inline
    def setScale(value: js.Tuple2[Double, Double]): Self = this.set("scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScale: Self = this.set("scale", js.undefined)
    
    @scala.inline
    def setStartAngle(value: Double): Self = this.set("startAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartAngle: Self = this.set("startAngle", js.undefined)
    
    @scala.inline
    def setTranspose(value: Boolean): Self = this.set("transpose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTranspose: Self = this.set("transpose", js.undefined)
    
    @scala.inline
    def setType(value: CoordType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
