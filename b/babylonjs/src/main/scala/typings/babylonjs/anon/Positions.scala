package typings.babylonjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Positions extends StObject {
  
  var indices: js.typedarray.Uint32Array
  
  var positions: js.typedarray.Float32Array
}
object Positions {
  
  inline def apply(indices: js.typedarray.Uint32Array, positions: js.typedarray.Float32Array): Positions = {
    val __obj = js.Dynamic.literal(indices = indices.asInstanceOf[js.Any], positions = positions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Positions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Positions] (val x: Self) extends AnyVal {
    
    inline def setIndices(value: js.typedarray.Uint32Array): Self = StObject.set(x, "indices", value.asInstanceOf[js.Any])
    
    inline def setPositions(value: js.typedarray.Float32Array): Self = StObject.set(x, "positions", value.asInstanceOf[js.Any])
  }
}
