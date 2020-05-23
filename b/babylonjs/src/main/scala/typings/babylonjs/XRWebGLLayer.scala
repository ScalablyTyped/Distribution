package typings.babylonjs

import typings.std.WebGLFramebuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XRWebGLLayer extends js.Object {
  var framebuffer: WebGLFramebuffer
  var framebufferHeight: Double
  var framebufferWidth: Double
  var getViewport: js.Function
}

object XRWebGLLayer {
  @scala.inline
  def apply(
    framebuffer: WebGLFramebuffer,
    framebufferHeight: Double,
    framebufferWidth: Double,
    getViewport: js.Function
  ): XRWebGLLayer = {
    val __obj = js.Dynamic.literal(framebuffer = framebuffer.asInstanceOf[js.Any], framebufferHeight = framebufferHeight.asInstanceOf[js.Any], framebufferWidth = framebufferWidth.asInstanceOf[js.Any], getViewport = getViewport.asInstanceOf[js.Any])
    __obj.asInstanceOf[XRWebGLLayer]
  }
}

