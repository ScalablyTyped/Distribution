package typings.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GPUBufferBinding
  extends StObject
     with GPUBindingResource {
  
  var buffer: GPUBuffer
  
  var offset: js.UndefOr[GPUSize64] = js.undefined
  
  var size: js.UndefOr[GPUSize64] = js.undefined
}
object GPUBufferBinding {
  
  inline def apply(buffer: GPUBuffer): GPUBufferBinding = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any])
    __obj.asInstanceOf[GPUBufferBinding]
  }
  
  extension [Self <: GPUBufferBinding](x: Self) {
    
    inline def setBuffer(value: GPUBuffer): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
    
    inline def setOffset(value: GPUSize64): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setSize(value: GPUSize64): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
