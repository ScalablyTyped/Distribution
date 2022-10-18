package typings.awsSdk.clientsSwfMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelTimerDecisionAttributes extends StObject {
  
  /**
    *  The unique ID of the timer to cancel.
    */
  var timerId: TimerId
}
object CancelTimerDecisionAttributes {
  
  inline def apply(timerId: TimerId): CancelTimerDecisionAttributes = {
    val __obj = js.Dynamic.literal(timerId = timerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelTimerDecisionAttributes]
  }
  
  extension [Self <: CancelTimerDecisionAttributes](x: Self) {
    
    inline def setTimerId(value: TimerId): Self = StObject.set(x, "timerId", value.asInstanceOf[js.Any])
  }
}
