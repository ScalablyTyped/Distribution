package typings.awsSdk.mgnMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChangeServerLifeCycleStateSourceServerLifecycle extends StObject {
  
  /**
    * The request to change the source server migration lifecycle state.
    */
  var state: ChangeServerLifeCycleStateSourceServerLifecycleState
}
object ChangeServerLifeCycleStateSourceServerLifecycle {
  
  inline def apply(state: ChangeServerLifeCycleStateSourceServerLifecycleState): ChangeServerLifeCycleStateSourceServerLifecycle = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeServerLifeCycleStateSourceServerLifecycle]
  }
  
  extension [Self <: ChangeServerLifeCycleStateSourceServerLifecycle](x: Self) {
    
    inline def setState(value: ChangeServerLifeCycleStateSourceServerLifecycleState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
