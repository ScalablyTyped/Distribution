package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LogEvent extends js.Object {
  /**
    * The timestamp when the database log event was created.
    */
  var createdAt: js.UndefOr[IsoDate] = js.native
  /**
    * The message of the database log event.
    */
  var message: js.UndefOr[String] = js.native
}

object LogEvent {
  @scala.inline
  def apply(createdAt: IsoDate = null, message: String = null): LogEvent = {
    val __obj = js.Dynamic.literal()
    if (createdAt != null) __obj.updateDynamic("createdAt")(createdAt.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogEvent]
  }
}

