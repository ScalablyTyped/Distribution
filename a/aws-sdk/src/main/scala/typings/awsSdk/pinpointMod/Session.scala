package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Session extends js.Object {
  /**
    * The duration of the session, in milliseconds.
    */
  var Duration: js.UndefOr[integer] = js.native
  /**
    * The unique identifier for the session.
    */
  var Id: string = js.native
  /**
    * The date and time when the session began.
    */
  var StartTimestamp: string = js.native
  /**
    * The date and time when the session ended.
    */
  var StopTimestamp: js.UndefOr[string] = js.native
}

object Session {
  @scala.inline
  def apply(Id: string, StartTimestamp: string, Duration: Int | Double = null, StopTimestamp: string = null): Session = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], StartTimestamp = StartTimestamp.asInstanceOf[js.Any])
    if (Duration != null) __obj.updateDynamic("Duration")(Duration.asInstanceOf[js.Any])
    if (StopTimestamp != null) __obj.updateDynamic("StopTimestamp")(StopTimestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[Session]
  }
}

