package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpotInstanceStateFault extends js.Object {
  /**
    * The reason code for the Spot Instance state change.
    */
  var Code: js.UndefOr[String] = js.native
  /**
    * The message for the Spot Instance state change.
    */
  var Message: js.UndefOr[String] = js.native
}

object SpotInstanceStateFault {
  @scala.inline
  def apply(Code: String = null, Message: String = null): SpotInstanceStateFault = {
    val __obj = js.Dynamic.literal()
    if (Code != null) __obj.updateDynamic("Code")(Code.asInstanceOf[js.Any])
    if (Message != null) __obj.updateDynamic("Message")(Message.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpotInstanceStateFault]
  }
}

