package typings.awsSdk.imagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentState extends StObject {
  
  /**
    * Describes how or why the component changed state.
    */
  var reason: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The current state of the component.
    */
  var status: js.UndefOr[ComponentStatus] = js.undefined
}
object ComponentState {
  
  inline def apply(): ComponentState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComponentState]
  }
  
  extension [Self <: ComponentState](x: Self) {
    
    inline def setReason(value: NonEmptyString): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
    
    inline def setStatus(value: ComponentStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
