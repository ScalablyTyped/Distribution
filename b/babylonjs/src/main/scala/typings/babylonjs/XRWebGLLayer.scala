package typings.babylonjs

import typings.std.WebGLFramebuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XRWebGLLayer extends js.Object {
  
  val antialias: Boolean = js.native
  
  val framebuffer: WebGLFramebuffer = js.native
  
  val framebufferHeight: Double = js.native
  
  val framebufferWidth: Double = js.native
  
  def getViewport(view: XRView): XRViewport = js.native
  
  val ignoreDepthValues: Boolean = js.native
}
object XRWebGLLayer {
  
  @scala.inline
  def apply(
    antialias: Boolean,
    framebuffer: WebGLFramebuffer,
    framebufferHeight: Double,
    framebufferWidth: Double,
    getViewport: XRView => XRViewport,
    ignoreDepthValues: Boolean
  ): XRWebGLLayer = {
    val __obj = js.Dynamic.literal(antialias = antialias.asInstanceOf[js.Any], framebuffer = framebuffer.asInstanceOf[js.Any], framebufferHeight = framebufferHeight.asInstanceOf[js.Any], framebufferWidth = framebufferWidth.asInstanceOf[js.Any], getViewport = js.Any.fromFunction1(getViewport), ignoreDepthValues = ignoreDepthValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[XRWebGLLayer]
  }
  
  @scala.inline
  implicit class XRWebGLLayerOps[Self <: XRWebGLLayer] (val x: Self) extends AnyVal {
    
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
    def setAntialias(value: Boolean): Self = this.set("antialias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFramebuffer(value: WebGLFramebuffer): Self = this.set("framebuffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFramebufferHeight(value: Double): Self = this.set("framebufferHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFramebufferWidth(value: Double): Self = this.set("framebufferWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetViewport(value: XRView => XRViewport): Self = this.set("getViewport", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIgnoreDepthValues(value: Boolean): Self = this.set("ignoreDepthValues", value.asInstanceOf[js.Any])
  }
}
