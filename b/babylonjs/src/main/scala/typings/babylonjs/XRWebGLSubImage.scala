package typings.babylonjs

import typings.std.WebGLTexture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XRWebGLSubImage
  extends StObject
     with XRSubImage {
  
  val colorTexture: WebGLTexture
  
  val depthStencilTexture: WebGLTexture
  
  val imageIndex: Double
  
  val textureHeight: Double
  
  val textureWidth: Double
}
object XRWebGLSubImage {
  
  inline def apply(
    colorTexture: WebGLTexture,
    depthStencilTexture: WebGLTexture,
    imageIndex: Double,
    textureHeight: Double,
    textureWidth: Double,
    viewport: XRViewport
  ): XRWebGLSubImage = {
    val __obj = js.Dynamic.literal(colorTexture = colorTexture.asInstanceOf[js.Any], depthStencilTexture = depthStencilTexture.asInstanceOf[js.Any], imageIndex = imageIndex.asInstanceOf[js.Any], textureHeight = textureHeight.asInstanceOf[js.Any], textureWidth = textureWidth.asInstanceOf[js.Any], viewport = viewport.asInstanceOf[js.Any])
    __obj.asInstanceOf[XRWebGLSubImage]
  }
  
  extension [Self <: XRWebGLSubImage](x: Self) {
    
    inline def setColorTexture(value: WebGLTexture): Self = StObject.set(x, "colorTexture", value.asInstanceOf[js.Any])
    
    inline def setDepthStencilTexture(value: WebGLTexture): Self = StObject.set(x, "depthStencilTexture", value.asInstanceOf[js.Any])
    
    inline def setImageIndex(value: Double): Self = StObject.set(x, "imageIndex", value.asInstanceOf[js.Any])
    
    inline def setTextureHeight(value: Double): Self = StObject.set(x, "textureHeight", value.asInstanceOf[js.Any])
    
    inline def setTextureWidth(value: Double): Self = StObject.set(x, "textureWidth", value.asInstanceOf[js.Any])
  }
}
