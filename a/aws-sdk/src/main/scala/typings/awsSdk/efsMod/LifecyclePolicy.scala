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
  def apply(): LifecyclePolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LifecyclePolicy]
  }
  @scala.inline
  implicit class LifecyclePolicyOps[Self <: LifecyclePolicy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setTransitionToIA(value: TransitionToIARules): Self = this.set("TransitionToIA", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransitionToIA: Self = this.set("TransitionToIA", js.undefined)
  }
  
}

