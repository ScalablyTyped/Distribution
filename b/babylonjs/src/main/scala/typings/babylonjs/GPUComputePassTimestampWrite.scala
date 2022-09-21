package typings.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GPUComputePassTimestampWrite extends StObject {
  
  var location: GPUComputePassTimestampLocation
  
  var queryIndex: GPUSize32
  
  var querySet: GPUQuerySet
}
object GPUComputePassTimestampWrite {
  
  inline def apply(location: GPUComputePassTimestampLocation, queryIndex: GPUSize32, querySet: GPUQuerySet): GPUComputePassTimestampWrite = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], queryIndex = queryIndex.asInstanceOf[js.Any], querySet = querySet.asInstanceOf[js.Any])
    __obj.asInstanceOf[GPUComputePassTimestampWrite]
  }
  
  extension [Self <: GPUComputePassTimestampWrite](x: Self) {
    
    inline def setLocation(value: GPUComputePassTimestampLocation): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setQueryIndex(value: GPUSize32): Self = StObject.set(x, "queryIndex", value.asInstanceOf[js.Any])
    
    inline def setQuerySet(value: GPUQuerySet): Self = StObject.set(x, "querySet", value.asInstanceOf[js.Any])
  }
}
