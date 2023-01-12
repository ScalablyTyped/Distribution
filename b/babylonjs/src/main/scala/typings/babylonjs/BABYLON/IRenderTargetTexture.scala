package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IRenderTargetTexture extends StObject {
  
  /**
    * Entry point to access the wrapper on a texture.
    */
  var renderTarget: Nullable[RenderTargetWrapper]
}
object IRenderTargetTexture {
  
  inline def apply(): IRenderTargetTexture = {
    val __obj = js.Dynamic.literal(renderTarget = null)
    __obj.asInstanceOf[IRenderTargetTexture]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IRenderTargetTexture] (val x: Self) extends AnyVal {
    
    inline def setRenderTarget(value: Nullable[RenderTargetWrapper]): Self = StObject.set(x, "renderTarget", value.asInstanceOf[js.Any])
    
    inline def setRenderTargetNull: Self = StObject.set(x, "renderTarget", null)
  }
}
