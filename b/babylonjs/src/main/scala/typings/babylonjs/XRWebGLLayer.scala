package typings.babylonjs

import typings.std.WebGLFramebuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XRWebGLLayer extends StObject {
  
  val antialias: Boolean
  
  val framebuffer: WebGLFramebuffer
  
  val framebufferHeight: Double
  
  val framebufferWidth: Double
  
  def getViewport(view: XRView): XRViewport
  
  val ignoreDepthValues: Boolean
}
object XRWebGLLayer {
  
  inline def apply(
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
  
  extension [Self <: XRWebGLLayer](x: Self) {
    
    inline def setAntialias(value: Boolean): Self = StObject.set(x, "antialias", value.asInstanceOf[js.Any])
    
    inline def setFramebuffer(value: WebGLFramebuffer): Self = StObject.set(x, "framebuffer", value.asInstanceOf[js.Any])
    
    inline def setFramebufferHeight(value: Double): Self = StObject.set(x, "framebufferHeight", value.asInstanceOf[js.Any])
    
    inline def setFramebufferWidth(value: Double): Self = StObject.set(x, "framebufferWidth", value.asInstanceOf[js.Any])
    
    inline def setGetViewport(value: XRView => XRViewport): Self = StObject.set(x, "getViewport", js.Any.fromFunction1(value))
    
    inline def setIgnoreDepthValues(value: Boolean): Self = StObject.set(x, "ignoreDepthValues", value.asInstanceOf[js.Any])
  }
}
