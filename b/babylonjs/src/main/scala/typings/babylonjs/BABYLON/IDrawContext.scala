package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDrawContext extends StObject {
  
  def dispose(): Unit
  
  def reset(): Unit
  
  var uniqueId: Double
  
  var useInstancing: Boolean
}
object IDrawContext {
  
  inline def apply(dispose: () => Unit, reset: () => Unit, uniqueId: Double, useInstancing: Boolean): IDrawContext = {
    val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose), reset = js.Any.fromFunction0(reset), uniqueId = uniqueId.asInstanceOf[js.Any], useInstancing = useInstancing.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDrawContext]
  }
  
  extension [Self <: IDrawContext](x: Self) {
    
    inline def setDispose(value: () => Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction0(value))
    
    inline def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
    
    inline def setUniqueId(value: Double): Self = StObject.set(x, "uniqueId", value.asInstanceOf[js.Any])
    
    inline def setUseInstancing(value: Boolean): Self = StObject.set(x, "useInstancing", value.asInstanceOf[js.Any])
  }
}
