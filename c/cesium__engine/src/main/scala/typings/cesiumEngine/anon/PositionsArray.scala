package typings.cesiumEngine.anon

import typings.cesiumEngine.mod.Cartesian3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PositionsArray extends StObject {
  
  var positions: js.Array[Cartesian3]
}
object PositionsArray {
  
  inline def apply(positions: js.Array[Cartesian3]): PositionsArray = {
    val __obj = js.Dynamic.literal(positions = positions.asInstanceOf[js.Any])
    __obj.asInstanceOf[PositionsArray]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PositionsArray] (val x: Self) extends AnyVal {
    
    inline def setPositions(value: js.Array[Cartesian3]): Self = StObject.set(x, "positions", value.asInstanceOf[js.Any])
    
    inline def setPositionsVarargs(value: Cartesian3*): Self = StObject.set(x, "positions", js.Array(value*))
  }
}
