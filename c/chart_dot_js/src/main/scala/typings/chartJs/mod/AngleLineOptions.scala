package typings.chartJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AngleLineOptions extends js.Object {
  
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
  implicit class AngleLineOptionsOps[Self <: AngleLineOptions] (val x: Self) extends AnyVal {
    
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
    def setBorderDashVarargs(value: Double*): Self = this.set("borderDash", js.Array(value :_*))
    
    @scala.inline
    def setBorderDash(value: js.Array[Double]): Self = this.set("borderDash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderDash: Self = this.set("borderDash", js.undefined)
    
    @scala.inline
    def setBorderDashOffset(value: Double): Self = this.set("borderDashOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderDashOffset: Self = this.set("borderDashOffset", js.undefined)
    
    @scala.inline
    def setColorVarargs(value: String*): Self = this.set("color", js.Array(value :_*))
    
    @scala.inline
    def setColor(value: ChartColor): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setDisplay(value: Boolean): Self = this.set("display", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplay: Self = this.set("display", js.undefined)
    
    @scala.inline
    def setLineWidth(value: Double): Self = this.set("lineWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineWidth: Self = this.set("lineWidth", js.undefined)
  }
}
