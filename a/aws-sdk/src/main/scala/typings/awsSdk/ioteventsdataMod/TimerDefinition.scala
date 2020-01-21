package typings.awsSdk.ioteventsdataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimerDefinition extends js.Object {
  /**
    * The name of the timer.
    */
  var name: TimerName = js.native
  /**
    * The new setting of the timer (the number of seconds before the timer elapses).
    */
  var seconds: Seconds = js.native
}

object TimerDefinition {
  @scala.inline
  def apply(name: TimerName, seconds: Seconds): TimerDefinition = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], seconds = seconds.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TimerDefinition]
  }
}

