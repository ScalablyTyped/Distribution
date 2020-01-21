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
  def apply(
    disabledReason: DisabledReason = null,
    enabled: js.UndefOr[scala.Boolean] = js.undefined,
    lastChangedAt: LastChangedAt = null,
    lastChangedBy: LastChangedBy = null
  ): TransitionState = {
    val __obj = js.Dynamic.literal()
    if (disabledReason != null) __obj.updateDynamic("disabledReason")(disabledReason.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (lastChangedAt != null) __obj.updateDynamic("lastChangedAt")(lastChangedAt.asInstanceOf[js.Any])
    if (lastChangedBy != null) __obj.updateDynamic("lastChangedBy")(lastChangedBy.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransitionState]
  }
}

