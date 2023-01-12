package typings.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GPUImageCopyTexture extends StObject {
  
  var aspect: js.UndefOr[GPUTextureAspect] = js.undefined
  
  var mipLevel: js.UndefOr[GPUIntegerCoordinate] = js.undefined
  
  var origin: js.UndefOr[GPUOrigin3D] = js.undefined
  
  var texture: GPUTexture
}
object GPUImageCopyTexture {
  
  inline def apply(texture: GPUTexture): GPUImageCopyTexture = {
    val __obj = js.Dynamic.literal(texture = texture.asInstanceOf[js.Any])
    __obj.asInstanceOf[GPUImageCopyTexture]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GPUImageCopyTexture] (val x: Self) extends AnyVal {
    
    inline def setAspect(value: GPUTextureAspect): Self = StObject.set(x, "aspect", value.asInstanceOf[js.Any])
    
    inline def setAspectUndefined: Self = StObject.set(x, "aspect", js.undefined)
    
    inline def setMipLevel(value: GPUIntegerCoordinate): Self = StObject.set(x, "mipLevel", value.asInstanceOf[js.Any])
    
    inline def setMipLevelUndefined: Self = StObject.set(x, "mipLevel", js.undefined)
    
    inline def setOrigin(value: GPUOrigin3D): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    inline def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
    
    inline def setTexture(value: GPUTexture): Self = StObject.set(x, "texture", value.asInstanceOf[js.Any])
  }
}
