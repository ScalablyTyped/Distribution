package typings.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GPUExternalTextureDescriptor
  extends StObject
     with GPUObjectDescriptorBase {
  
  var colorSpace: js.UndefOr[GPUPredefinedColorSpace] = js.undefined
  
  var source: HTMLVideoElement
}
object GPUExternalTextureDescriptor {
  
  inline def apply(source: HTMLVideoElement): GPUExternalTextureDescriptor = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[GPUExternalTextureDescriptor]
  }
  
  extension [Self <: GPUExternalTextureDescriptor](x: Self) {
    
    inline def setColorSpace(value: GPUPredefinedColorSpace): Self = StObject.set(x, "colorSpace", value.asInstanceOf[js.Any])
    
    inline def setColorSpaceUndefined: Self = StObject.set(x, "colorSpace", js.undefined)
    
    inline def setSource(value: HTMLVideoElement): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
