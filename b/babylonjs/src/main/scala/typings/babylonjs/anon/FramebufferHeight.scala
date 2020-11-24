package typings.babylonjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FramebufferHeight extends js.Object {
  
  var framebufferHeight: Double = js.native
  
  var framebufferWidth: Double = js.native
}
object FramebufferHeight {
  
  @scala.inline
  def apply(framebufferHeight: Double, framebufferWidth: Double): FramebufferHeight = {
    val __obj = js.Dynamic.literal(framebufferHeight = framebufferHeight.asInstanceOf[js.Any], framebufferWidth = framebufferWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[FramebufferHeight]
  }
  
  @scala.inline
  implicit class FramebufferHeightOps[Self <: FramebufferHeight] (val x: Self) extends AnyVal {
    
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
    def setFramebufferHeight(value: Double): Self = this.set("framebufferHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFramebufferWidth(value: Double): Self = this.set("framebufferWidth", value.asInstanceOf[js.Any])
  }
}
