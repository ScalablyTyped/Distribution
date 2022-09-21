package typings.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GPUQuerySetDescriptor
  extends StObject
     with GPUObjectDescriptorBase {
  
  var count: GPUSize32
  
  var `type`: GPUQueryType
}
object GPUQuerySetDescriptor {
  
  inline def apply(count: GPUSize32, `type`: GPUQueryType): GPUQuerySetDescriptor = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GPUQuerySetDescriptor]
  }
  
  extension [Self <: GPUQuerySetDescriptor](x: Self) {
    
    inline def setCount(value: GPUSize32): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setType(value: GPUQueryType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
