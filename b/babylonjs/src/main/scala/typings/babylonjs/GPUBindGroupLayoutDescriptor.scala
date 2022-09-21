package typings.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GPUBindGroupLayoutDescriptor
  extends StObject
     with GPUObjectDescriptorBase {
  
  var entries: js.Array[GPUBindGroupLayoutEntry]
}
object GPUBindGroupLayoutDescriptor {
  
  inline def apply(entries: js.Array[GPUBindGroupLayoutEntry]): GPUBindGroupLayoutDescriptor = {
    val __obj = js.Dynamic.literal(entries = entries.asInstanceOf[js.Any])
    __obj.asInstanceOf[GPUBindGroupLayoutDescriptor]
  }
  
  extension [Self <: GPUBindGroupLayoutDescriptor](x: Self) {
    
    inline def setEntries(value: js.Array[GPUBindGroupLayoutEntry]): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
    
    inline def setEntriesVarargs(value: GPUBindGroupLayoutEntry*): Self = StObject.set(x, "entries", js.Array(value*))
  }
}
