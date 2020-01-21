package typings.awsSdk.globalacceleratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeListenerResponse extends js.Object {
  /**
    * The description of a listener.
    */
  var Listener: js.UndefOr[typings.awsSdk.globalacceleratorMod.Listener] = js.native
}

object DescribeListenerResponse {
  @scala.inline
  def apply(Listener: Listener = null): DescribeListenerResponse = {
    val __obj = js.Dynamic.literal()
    if (Listener != null) __obj.updateDynamic("Listener")(Listener.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeListenerResponse]
  }
}

