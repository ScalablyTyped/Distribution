package typings.awsSdk.xrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RootCauseException extends js.Object {
  /**
    * The message of the exception.
    */
  var Message: js.UndefOr[String] = js.native
  /**
    * The name of the exception.
    */
  var Name: js.UndefOr[String] = js.native
}

object RootCauseException {
  @scala.inline
  def apply(Message: String = null, Name: String = null): RootCauseException = {
    val __obj = js.Dynamic.literal()
    if (Message != null) __obj.updateDynamic("Message")(Message.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[RootCauseException]
  }
}

