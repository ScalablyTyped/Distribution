package typings.awsSdk.efsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LifecyclePolicy extends js.Object {
  /**
    *  A value that describes the period of time that a file is not accessed, after which it transitions to the IA storage class. Metadata operations such as listing the contents of a directory don't count as file access events.
    */
  var TransitionToIA: js.UndefOr[TransitionToIARules] = js.native
}

object LifecyclePolicy {
  @scala.inline
  def apply(TransitionToIA: TransitionToIARules = null): LifecyclePolicy = {
    val __obj = js.Dynamic.literal()
    if (TransitionToIA != null) __obj.updateDynamic("TransitionToIA")(TransitionToIA.asInstanceOf[js.Any])
    __obj.asInstanceOf[LifecyclePolicy]
  }
}

