package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @internal */
trait IWebGPUMaterialContextTextureCache extends StObject {
  
  var isExternalTexture: Boolean
  
  var isFloatTexture: Boolean
  
  var texture: Nullable[InternalTexture | ExternalTexture]
}
object IWebGPUMaterialContextTextureCache {
  
  inline def apply(isExternalTexture: Boolean, isFloatTexture: Boolean): IWebGPUMaterialContextTextureCache = {
    val __obj = js.Dynamic.literal(isExternalTexture = isExternalTexture.asInstanceOf[js.Any], isFloatTexture = isFloatTexture.asInstanceOf[js.Any], texture = null)
    __obj.asInstanceOf[IWebGPUMaterialContextTextureCache]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IWebGPUMaterialContextTextureCache] (val x: Self) extends AnyVal {
    
    inline def setIsExternalTexture(value: Boolean): Self = StObject.set(x, "isExternalTexture", value.asInstanceOf[js.Any])
    
    inline def setIsFloatTexture(value: Boolean): Self = StObject.set(x, "isFloatTexture", value.asInstanceOf[js.Any])
    
    inline def setTexture(value: Nullable[InternalTexture | ExternalTexture]): Self = StObject.set(x, "texture", value.asInstanceOf[js.Any])
    
    inline def setTextureNull: Self = StObject.set(x, "texture", null)
  }
}
