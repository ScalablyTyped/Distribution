package typings.babylonjs

import typings.std.WebGLFramebuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XRWebGLLayer extends StObject {
  
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
  implicit class XRWebGLLayerMutableBuilder[Self <: XRWebGLLayer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAntialias(value: Boolean): Self = StObject.set(x, "antialias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFramebuffer(value: WebGLFramebuffer): Self = StObject.set(x, "framebuffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFramebufferHeight(value: Double): Self = StObject.set(x, "framebufferHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFramebufferWidth(value: Double): Self = StObject.set(x, "framebufferWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetViewport(value: XRView => XRViewport): Self = StObject.set(x, "getViewport", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIgnoreDepthValues(value: Boolean): Self = StObject.set(x, "ignoreDepthValues", value.asInstanceOf[js.Any])
  }
}
