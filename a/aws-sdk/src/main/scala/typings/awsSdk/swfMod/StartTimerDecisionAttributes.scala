package typings.awsSdk.swfMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartTimerDecisionAttributes extends StObject {
  
  /**
    * The data attached to the event that can be used by the decider in subsequent workflow tasks.
    */
  var control: js.UndefOr[Data] = js.native
  
  /**
    *  The duration to wait before firing the timer. The duration is specified in seconds, an integer greater than or equal to 0.
    */
  var startToFireTimeout: DurationInSeconds = js.native
  
  /**
    *  The unique ID of the timer. The specified string must not start or end with whitespace. It must not contain a : (colon), / (slash), | (vertical bar), or any control characters (\\u0000-\\u001f | \\u007f-\\u009f). Also, it must not contain the literal string arn.
    */
  var timerId: TimerId = js.native
}
object StartTimerDecisionAttributes {
  
  @scala.inline
  def apply(startToFireTimeout: DurationInSeconds, timerId: TimerId): StartTimerDecisionAttributes = {
    val __obj = js.Dynamic.literal(startToFireTimeout = startToFireTimeout.asInstanceOf[js.Any], timerId = timerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartTimerDecisionAttributes]
  }
  
  @scala.inline
  implicit class StartTimerDecisionAttributesMutableBuilder[Self <: StartTimerDecisionAttributes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setControl(value: Data): Self = StObject.set(x, "control", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setControlUndefined: Self = StObject.set(x, "control", js.undefined)
    
    @scala.inline
    def setStartToFireTimeout(value: DurationInSeconds): Self = StObject.set(x, "startToFireTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimerId(value: TimerId): Self = StObject.set(x, "timerId", value.asInstanceOf[js.Any])
  }
}
