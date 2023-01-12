package typings.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GPURenderPassTimestampWrite extends StObject {
  
  var location: GPURenderPassTimestampLocation
  
  var queryIndex: GPUSize32
  
  var querySet: GPUQuerySet
}
object GPURenderPassTimestampWrite {
  
  inline def apply(location: GPURenderPassTimestampLocation, queryIndex: GPUSize32, querySet: GPUQuerySet): GPURenderPassTimestampWrite = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], queryIndex = queryIndex.asInstanceOf[js.Any], querySet = querySet.asInstanceOf[js.Any])
    __obj.asInstanceOf[GPURenderPassTimestampWrite]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GPURenderPassTimestampWrite] (val x: Self) extends AnyVal {
    
    inline def setLocation(value: GPURenderPassTimestampLocation): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setQueryIndex(value: GPUSize32): Self = StObject.set(x, "queryIndex", value.asInstanceOf[js.Any])
    
    inline def setQuerySet(value: GPUQuerySet): Self = StObject.set(x, "querySet", value.asInstanceOf[js.Any])
  }
}
