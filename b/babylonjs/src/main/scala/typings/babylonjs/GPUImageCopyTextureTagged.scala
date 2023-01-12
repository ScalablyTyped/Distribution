package typings.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GPUImageCopyTextureTagged
  extends StObject
     with GPUImageCopyTexture {
  
  var colorSpace: js.UndefOr[GPUPredefinedColorSpace] = js.undefined
  
  var premultipliedAlpha: js.UndefOr[Boolean] = js.undefined
}
object GPUImageCopyTextureTagged {
  
  inline def apply(texture: GPUTexture): GPUImageCopyTextureTagged = {
    val __obj = js.Dynamic.literal(texture = texture.asInstanceOf[js.Any])
    __obj.asInstanceOf[GPUImageCopyTextureTagged]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GPUImageCopyTextureTagged] (val x: Self) extends AnyVal {
    
    inline def setColorSpace(value: GPUPredefinedColorSpace): Self = StObject.set(x, "colorSpace", value.asInstanceOf[js.Any])
    
    inline def setColorSpaceUndefined: Self = StObject.set(x, "colorSpace", js.undefined)
    
    inline def setPremultipliedAlpha(value: Boolean): Self = StObject.set(x, "premultipliedAlpha", value.asInstanceOf[js.Any])
    
    inline def setPremultipliedAlphaUndefined: Self = StObject.set(x, "premultipliedAlpha", js.undefined)
  }
}
