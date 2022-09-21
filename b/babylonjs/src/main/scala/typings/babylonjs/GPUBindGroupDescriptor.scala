package typings.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GPUBindGroupDescriptor
  extends StObject
     with GPUObjectDescriptorBase {
  
  var entries: js.Array[GPUBindGroupEntry]
  
  var layout: GPUBindGroupLayout
}
object GPUBindGroupDescriptor {
  
  inline def apply(entries: js.Array[GPUBindGroupEntry], layout: GPUBindGroupLayout): GPUBindGroupDescriptor = {
    val __obj = js.Dynamic.literal(entries = entries.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any])
    __obj.asInstanceOf[GPUBindGroupDescriptor]
  }
  
  extension [Self <: GPUBindGroupDescriptor](x: Self) {
    
    inline def setEntries(value: js.Array[GPUBindGroupEntry]): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
    
    inline def setEntriesVarargs(value: GPUBindGroupEntry*): Self = StObject.set(x, "entries", js.Array(value*))
    
    inline def setLayout(value: GPUBindGroupLayout): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
  }
}
