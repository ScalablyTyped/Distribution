package typings.baidumapWebSdk.BMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ViewportOptions extends js.Object {
  
  var delay: js.UndefOr[Double] = js.native
  
  var enableAnimation: js.UndefOr[Boolean] = js.native
  
  var margins: js.UndefOr[js.Array[Double]] = js.native
  
  var zoomFactor: js.UndefOr[Double] = js.native
}
object ViewportOptions {
  
  @scala.inline
  def apply(): ViewportOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ViewportOptions]
  }
  
  @scala.inline
  implicit class ViewportOptionsOps[Self <: ViewportOptions] (val x: Self) extends AnyVal {
    
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
    def setDelay(value: Double): Self = this.set("delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelay: Self = this.set("delay", js.undefined)
    
    @scala.inline
    def setEnableAnimation(value: Boolean): Self = this.set("enableAnimation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableAnimation: Self = this.set("enableAnimation", js.undefined)
    
    @scala.inline
    def setMarginsVarargs(value: Double*): Self = this.set("margins", js.Array(value :_*))
    
    @scala.inline
    def setMargins(value: js.Array[Double]): Self = this.set("margins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMargins: Self = this.set("margins", js.undefined)
    
    @scala.inline
    def setZoomFactor(value: Double): Self = this.set("zoomFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZoomFactor: Self = this.set("zoomFactor", js.undefined)
  }
}
