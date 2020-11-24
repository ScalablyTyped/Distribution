package typings.chartJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChartRectangleOptions extends js.Object {
  
  var backgroundColor: js.UndefOr[ChartColor] = js.native
  
  var borderColor: js.UndefOr[ChartColor] = js.native
  
  var borderSkipped: js.UndefOr[String] = js.native
  
  var borderWidth: js.UndefOr[Double] = js.native
}
object ChartRectangleOptions {
  
  @scala.inline
  def apply(): ChartRectangleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartRectangleOptions]
  }
  
  @scala.inline
  implicit class ChartRectangleOptionsOps[Self <: ChartRectangleOptions] (val x: Self) extends AnyVal {
    
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
    def setBackgroundColorVarargs(value: String*): Self = this.set("backgroundColor", js.Array(value :_*))
    
    @scala.inline
    def setBackgroundColor(value: ChartColor): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    
    @scala.inline
    def setBorderColorVarargs(value: String*): Self = this.set("borderColor", js.Array(value :_*))
    
    @scala.inline
    def setBorderColor(value: ChartColor): Self = this.set("borderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderColor: Self = this.set("borderColor", js.undefined)
    
    @scala.inline
    def setBorderSkipped(value: String): Self = this.set("borderSkipped", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderSkipped: Self = this.set("borderSkipped", js.undefined)
    
    @scala.inline
    def setBorderWidth(value: Double): Self = this.set("borderWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderWidth: Self = this.set("borderWidth", js.undefined)
  }
}
