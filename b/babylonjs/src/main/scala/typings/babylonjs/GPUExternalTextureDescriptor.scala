package typings.babylonjs

import typings.std.PredefinedColorSpace
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GPUExternalTextureDescriptor
  extends StObject
     with GPUObjectDescriptorBase {
  
  var colorSpace: js.UndefOr[PredefinedColorSpace] = js.undefined
  
  var source: HTMLVideoElement
}
object GPUExternalTextureDescriptor {
  
  inline def apply(source: HTMLVideoElement): GPUExternalTextureDescriptor = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[GPUExternalTextureDescriptor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GPUExternalTextureDescriptor] (val x: Self) extends AnyVal {
    
    inline def setColorSpace(value: PredefinedColorSpace): Self = StObject.set(x, "colorSpace", value.asInstanceOf[js.Any])
    
    inline def setColorSpaceUndefined: Self = StObject.set(x, "colorSpace", js.undefined)
    
    inline def setSource(value: HTMLVideoElement): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
