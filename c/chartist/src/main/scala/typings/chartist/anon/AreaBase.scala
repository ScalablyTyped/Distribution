package typings.chartist.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AreaBase extends js.Object {
  
  var areaBase: js.UndefOr[Double] = js.native
  
  var lineSmooth: js.UndefOr[js.Function | Boolean] = js.native
  
  var showArea: js.UndefOr[Boolean] = js.native
  
  var showLine: js.UndefOr[Boolean] = js.native
  
  var showPoint: js.UndefOr[Boolean] = js.native
}
object AreaBase {
  
  @scala.inline
  def apply(): AreaBase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AreaBase]
  }
  
  @scala.inline
  implicit class AreaBaseOps[Self <: AreaBase] (val x: Self) extends AnyVal {
    
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
    def setAreaBase(value: Double): Self = this.set("areaBase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAreaBase: Self = this.set("areaBase", js.undefined)
    
    @scala.inline
    def setLineSmooth(value: js.Function | Boolean): Self = this.set("lineSmooth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineSmooth: Self = this.set("lineSmooth", js.undefined)
    
    @scala.inline
    def setShowArea(value: Boolean): Self = this.set("showArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowArea: Self = this.set("showArea", js.undefined)
    
    @scala.inline
    def setShowLine(value: Boolean): Self = this.set("showLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowLine: Self = this.set("showLine", js.undefined)
    
    @scala.inline
    def setShowPoint(value: Boolean): Self = this.set("showPoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowPoint: Self = this.set("showPoint", js.undefined)
  }
}
