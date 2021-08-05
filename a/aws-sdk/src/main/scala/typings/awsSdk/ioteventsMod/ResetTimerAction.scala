package typings.awsSdk.ioteventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResetTimerAction extends StObject {
  
  /**
    * The name of the timer to reset.
    */
  var timerName: TimerName
}
object ResetTimerAction {
  
  inline def apply(timerName: TimerName): ResetTimerAction = {
    val __obj = js.Dynamic.literal(timerName = timerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResetTimerAction]
  }
  
  extension [Self <: ResetTimerAction](x: Self) {
    
    inline def setTimerName(value: TimerName): Self = StObject.set(x, "timerName", value.asInstanceOf[js.Any])
  }
}
