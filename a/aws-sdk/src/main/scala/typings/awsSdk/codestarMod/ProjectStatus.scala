package typings.awsSdk.codestarMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProjectStatus extends StObject {
  
  /**
    * In the case of a project creation or deletion failure, a reason for the failure.
    */
  var reason: js.UndefOr[Reason] = js.undefined
  
  /**
    * The phase of completion for a project creation or deletion.
    */
  var state: State
}
object ProjectStatus {
  
  inline def apply(state: State): ProjectStatus = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectStatus]
  }
  
  extension [Self <: ProjectStatus](x: Self) {
    
    inline def setReason(value: Reason): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
    
    inline def setState(value: State): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
