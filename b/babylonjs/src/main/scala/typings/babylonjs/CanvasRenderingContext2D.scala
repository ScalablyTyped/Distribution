package typings.babylonjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CanvasRenderingContext2D extends js.Object {
  
  var msImageSmoothingEnabled: Boolean = js.native
}
object CanvasRenderingContext2D {
  
  @scala.inline
  def apply(msImageSmoothingEnabled: Boolean): CanvasRenderingContext2D = {
    val __obj = js.Dynamic.literal(msImageSmoothingEnabled = msImageSmoothingEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanvasRenderingContext2D]
  }
  
  @scala.inline
  implicit class CanvasRenderingContext2DOps[Self <: CanvasRenderingContext2D] (val x: Self) extends AnyVal {
    
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
    def setMsImageSmoothingEnabled(value: Boolean): Self = this.set("msImageSmoothingEnabled", value.asInstanceOf[js.Any])
  }
}
