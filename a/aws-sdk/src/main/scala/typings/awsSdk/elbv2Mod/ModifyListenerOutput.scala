package typings.awsSdk.elbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyListenerOutput extends js.Object {
  /**
    * Information about the modified listener.
    */
  var Listeners: js.UndefOr[typings.awsSdk.elbv2Mod.Listeners] = js.native
}

object ModifyListenerOutput {
  @scala.inline
  def apply(Listeners: Listeners = null): ModifyListenerOutput = {
    val __obj = js.Dynamic.literal()
    if (Listeners != null) __obj.updateDynamic("Listeners")(Listeners.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyListenerOutput]
  }
}

