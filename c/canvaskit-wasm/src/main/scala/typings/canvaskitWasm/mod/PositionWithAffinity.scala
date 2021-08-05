package typings.canvaskitWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PositionWithAffinity extends StObject {
  
  var affinity: Affinity
  
  var pos: Double
}
object PositionWithAffinity {
  
  inline def apply(affinity: Affinity, pos: Double): PositionWithAffinity = {
    val __obj = js.Dynamic.literal(affinity = affinity.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any])
    __obj.asInstanceOf[PositionWithAffinity]
  }
  
  extension [Self <: PositionWithAffinity](x: Self) {
    
    inline def setAffinity(value: Affinity): Self = StObject.set(x, "affinity", value.asInstanceOf[js.Any])
    
    inline def setPos(value: Double): Self = StObject.set(x, "pos", value.asInstanceOf[js.Any])
  }
}
