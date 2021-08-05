package typings.awsSdk.ioteventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClearTimerAction extends StObject {
  
  /**
    * The name of the timer to clear.
    */
  var timerName: TimerName
}
object ClearTimerAction {
  
  inline def apply(timerName: TimerName): ClearTimerAction = {
    val __obj = js.Dynamic.literal(timerName = timerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClearTimerAction]
  }
  
  extension [Self <: ClearTimerAction](x: Self) {
    
    inline def setTimerName(value: TimerName): Self = StObject.set(x, "timerName", value.asInstanceOf[js.Any])
  }
}
