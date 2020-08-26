package typings.awsSdk.codepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransitionState extends js.Object {
  /**
    * The user-specified reason why the transition between two stages of a pipeline was disabled.
    */
  var disabledReason: js.UndefOr[DisabledReason] = js.native
  /**
    * Whether the transition between stages is enabled (true) or disabled (false).
    */
  var enabled: js.UndefOr[Enabled] = js.native
  /**
    * The timestamp when the transition state was last changed.
    */
  var lastChangedAt: js.UndefOr[LastChangedAt] = js.native
  /**
    * The ID of the user who last changed the transition state.
    */
  var lastChangedBy: js.UndefOr[LastChangedBy] = js.native
}

object TransitionState {
  @scala.inline
  def apply(): TransitionState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransitionState]
  }
  @scala.inline
  implicit class TransitionStateOps[Self <: TransitionState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDisabledReason(value: DisabledReason): Self = this.set("disabledReason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabledReason: Self = this.set("disabledReason", js.undefined)
    @scala.inline
    def setEnabled(value: Enabled): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    @scala.inline
    def setLastChangedAt(value: LastChangedAt): Self = this.set("lastChangedAt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastChangedAt: Self = this.set("lastChangedAt", js.undefined)
    @scala.inline
    def setLastChangedBy(value: LastChangedBy): Self = this.set("lastChangedBy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastChangedBy: Self = this.set("lastChangedBy", js.undefined)
  }
  
}

