package typings.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GPUBufferDescriptor
  extends StObject
     with GPUObjectDescriptorBase {
  
  var mappedAtCreation: Boolean
  
  var size: GPUSize64
  
  var usage: GPUBufferUsageFlags
}
object GPUBufferDescriptor {
  
  inline def apply(mappedAtCreation: Boolean, size: GPUSize64, usage: GPUBufferUsageFlags): GPUBufferDescriptor = {
    val __obj = js.Dynamic.literal(mappedAtCreation = mappedAtCreation.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], usage = usage.asInstanceOf[js.Any])
    __obj.asInstanceOf[GPUBufferDescriptor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GPUBufferDescriptor] (val x: Self) extends AnyVal {
    
    inline def setMappedAtCreation(value: Boolean): Self = StObject.set(x, "mappedAtCreation", value.asInstanceOf[js.Any])
    
    inline def setSize(value: GPUSize64): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setUsage(value: GPUBufferUsageFlags): Self = StObject.set(x, "usage", value.asInstanceOf[js.Any])
  }
}
