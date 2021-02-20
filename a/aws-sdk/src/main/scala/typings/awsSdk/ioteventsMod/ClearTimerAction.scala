package typings.awsSdk.ioteventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClearTimerAction extends StObject {
  
  /**
    * The name of the timer to clear.
    */
  var timerName: TimerName = js.native
}
object ClearTimerAction {
  
  @scala.inline
  def apply(timerName: TimerName): ClearTimerAction = {
    val __obj = js.Dynamic.literal(timerName = timerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClearTimerAction]
  }
  
  @scala.inline
  implicit class ClearTimerActionMutableBuilder[Self <: ClearTimerAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTimerName(value: TimerName): Self = StObject.set(x, "timerName", value.asInstanceOf[js.Any])
  }
}
