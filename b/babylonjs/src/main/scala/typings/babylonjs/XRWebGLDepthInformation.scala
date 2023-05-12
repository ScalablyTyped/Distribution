package typings.babylonjs

import typings.std.WebGLTexture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XRWebGLDepthInformation
  extends StObject
     with XRDepthInformation {
  
  val texture: WebGLTexture
}
object XRWebGLDepthInformation {
  
  inline def apply(
    height: Double,
    normDepthBufferFromNormView: XRRigidTransform,
    rawValueToMeters: Double,
    texture: WebGLTexture,
    width: Double
  ): XRWebGLDepthInformation = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], normDepthBufferFromNormView = normDepthBufferFromNormView.asInstanceOf[js.Any], rawValueToMeters = rawValueToMeters.asInstanceOf[js.Any], texture = texture.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[XRWebGLDepthInformation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XRWebGLDepthInformation] (val x: Self) extends AnyVal {
    
    inline def setTexture(value: WebGLTexture): Self = StObject.set(x, "texture", value.asInstanceOf[js.Any])
  }
}
