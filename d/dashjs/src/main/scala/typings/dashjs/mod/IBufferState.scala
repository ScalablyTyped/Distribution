package typings.dashjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IBufferState extends StObject {
  
  var state: String
  
  var target: Double
}
object IBufferState {
  
  inline def apply(state: String, target: Double): IBufferState = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBufferState]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IBufferState] (val x: Self) extends AnyVal {
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: Double): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
