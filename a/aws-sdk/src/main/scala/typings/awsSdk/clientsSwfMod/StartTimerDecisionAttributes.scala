package typings.awsSdk.clientsSwfMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartTimerDecisionAttributes extends StObject {
  
  /**
    * The data attached to the event that can be used by the decider in subsequent workflow tasks.
    */
  var control: js.UndefOr[Data] = js.undefined
  
  /**
    *  The duration to wait before firing the timer. The duration is specified in seconds, an integer greater than or equal to 0.
    */
  var startToFireTimeout: DurationInSeconds
  
  /**
    *  The unique ID of the timer. The specified string must not contain a : (colon), / (slash), | (vertical bar), or any control characters (\\u0000-\\u001f | \\u007f-\\u009f). Also, it must not be the literal string arn.
    */
  var timerId: TimerId
}
object StartTimerDecisionAttributes {
  
  inline def apply(startToFireTimeout: DurationInSeconds, timerId: TimerId): StartTimerDecisionAttributes = {
    val __obj = js.Dynamic.literal(startToFireTimeout = startToFireTimeout.asInstanceOf[js.Any], timerId = timerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartTimerDecisionAttributes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartTimerDecisionAttributes] (val x: Self) extends AnyVal {
    
    inline def setControl(value: Data): Self = StObject.set(x, "control", value.asInstanceOf[js.Any])
    
    inline def setControlUndefined: Self = StObject.set(x, "control", js.undefined)
    
    inline def setStartToFireTimeout(value: DurationInSeconds): Self = StObject.set(x, "startToFireTimeout", value.asInstanceOf[js.Any])
    
    inline def setTimerId(value: TimerId): Self = StObject.set(x, "timerId", value.asInstanceOf[js.Any])
  }
}
