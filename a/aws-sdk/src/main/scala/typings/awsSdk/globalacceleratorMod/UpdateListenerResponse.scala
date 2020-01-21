package typings.awsSdk.globalacceleratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateListenerResponse extends js.Object {
  /**
    * Information for the updated listener.
    */
  var Listener: js.UndefOr[typings.awsSdk.globalacceleratorMod.Listener] = js.native
}

object UpdateListenerResponse {
  @scala.inline
  def apply(Listener: Listener = null): UpdateListenerResponse = {
    val __obj = js.Dynamic.literal()
    if (Listener != null) __obj.updateDynamic("Listener")(Listener.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateListenerResponse]
  }
}

