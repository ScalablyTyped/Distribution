package typings.babylonjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Indices extends StObject {
  
  var indices: js.Array[scala.Nothing]
  
  var positions: js.Array[scala.Nothing]
}
object Indices {
  
  inline def apply(indices: js.Array[scala.Nothing], positions: js.Array[scala.Nothing]): Indices = {
    val __obj = js.Dynamic.literal(indices = indices.asInstanceOf[js.Any], positions = positions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Indices]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Indices] (val x: Self) extends AnyVal {
    
    inline def setIndices(value: js.Array[scala.Nothing]): Self = StObject.set(x, "indices", value.asInstanceOf[js.Any])
    
    inline def setIndicesVarargs(value: scala.Nothing*): Self = StObject.set(x, "indices", js.Array(value*))
    
    inline def setPositions(value: js.Array[scala.Nothing]): Self = StObject.set(x, "positions", value.asInstanceOf[js.Any])
    
    inline def setPositionsVarargs(value: scala.Nothing*): Self = StObject.set(x, "positions", js.Array(value*))
  }
}
