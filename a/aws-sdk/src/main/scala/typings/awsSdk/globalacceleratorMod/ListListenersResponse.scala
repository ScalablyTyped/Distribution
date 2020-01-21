package typings.awsSdk.globalacceleratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListListenersResponse extends js.Object {
  /**
    * The list of listeners for an accelerator.
    */
  var Listeners: js.UndefOr[typings.awsSdk.globalacceleratorMod.Listeners] = js.native
  /**
    * The token for the next set of results. You receive this token from a previous call.
    */
  var NextToken: js.UndefOr[GenericString] = js.native
}

object ListListenersResponse {
  @scala.inline
  def apply(Listeners: Listeners = null, NextToken: GenericString = null): ListListenersResponse = {
    val __obj = js.Dynamic.literal()
    if (Listeners != null) __obj.updateDynamic("Listeners")(Listeners.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListListenersResponse]
  }
}

