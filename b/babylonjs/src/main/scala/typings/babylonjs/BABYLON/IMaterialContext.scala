package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMaterialContext extends StObject {
  
  def reset(): Unit
  
  var uniqueId: Double
}
object IMaterialContext {
  
  inline def apply(reset: () => Unit, uniqueId: Double): IMaterialContext = {
    val __obj = js.Dynamic.literal(reset = js.Any.fromFunction0(reset), uniqueId = uniqueId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMaterialContext]
  }
  
  extension [Self <: IMaterialContext](x: Self) {
    
    inline def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
    
    inline def setUniqueId(value: Double): Self = StObject.set(x, "uniqueId", value.asInstanceOf[js.Any])
  }
}
