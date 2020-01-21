package typings.awsSdk.elbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListenerDescription extends js.Object {
  /**
    * The listener.
    */
  var Listener: js.UndefOr[typings.awsSdk.elbMod.Listener] = js.native
  /**
    * The policies. If there are no policies enabled, the list is empty.
    */
  var PolicyNames: js.UndefOr[typings.awsSdk.elbMod.PolicyNames] = js.native
}

object ListenerDescription {
  @scala.inline
  def apply(Listener: Listener = null, PolicyNames: PolicyNames = null): ListenerDescription = {
    val __obj = js.Dynamic.literal()
    if (Listener != null) __obj.updateDynamic("Listener")(Listener.asInstanceOf[js.Any])
    if (PolicyNames != null) __obj.updateDynamic("PolicyNames")(PolicyNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListenerDescription]
  }
}

