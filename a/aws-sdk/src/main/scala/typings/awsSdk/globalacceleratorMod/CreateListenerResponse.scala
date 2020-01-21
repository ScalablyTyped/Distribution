package typings.awsSdk.globalacceleratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateListenerResponse extends js.Object {
  /**
    * The listener that you've created.
    */
  var Listener: js.UndefOr[typings.awsSdk.globalacceleratorMod.Listener] = js.native
}

object CreateListenerResponse {
  @scala.inline
  def apply(Listener: Listener = null): CreateListenerResponse = {
    val __obj = js.Dynamic.literal()
    if (Listener != null) __obj.updateDynamic("Listener")(Listener.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateListenerResponse]
  }
}

