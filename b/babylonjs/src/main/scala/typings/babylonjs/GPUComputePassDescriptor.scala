package typings.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GPUComputePassDescriptor
  extends StObject
     with GPUObjectDescriptorBase {
  
  var timestampWrites: js.UndefOr[GPUComputePassTimestampWrites] = js.undefined
}
object GPUComputePassDescriptor {
  
  inline def apply(): GPUComputePassDescriptor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GPUComputePassDescriptor]
  }
  
  extension [Self <: GPUComputePassDescriptor](x: Self) {
    
    inline def setTimestampWrites(value: GPUComputePassTimestampWrites): Self = StObject.set(x, "timestampWrites", value.asInstanceOf[js.Any])
    
    inline def setTimestampWritesUndefined: Self = StObject.set(x, "timestampWrites", js.undefined)
    
    inline def setTimestampWritesVarargs(value: GPUComputePassTimestampWrite*): Self = StObject.set(x, "timestampWrites", js.Array(value*))
  }
}
