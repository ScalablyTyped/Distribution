package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlayerLatencyPolicy extends js.Object {
  /**
    * The maximum latency value that is allowed for any player, in milliseconds. All policies must have a value set for this property.
    */
  var MaximumIndividualPlayerLatencyMilliseconds: js.UndefOr[WholeNumber] = js.native
  /**
    * The length of time, in seconds, that the policy is enforced while placing a new game session. A null value for this property means that the policy is enforced until the queue times out.
    */
  var PolicyDurationSeconds: js.UndefOr[WholeNumber] = js.native
}

object PlayerLatencyPolicy {
  @scala.inline
  def apply(
    MaximumIndividualPlayerLatencyMilliseconds: js.UndefOr[WholeNumber] = js.undefined,
    PolicyDurationSeconds: js.UndefOr[WholeNumber] = js.undefined
  ): PlayerLatencyPolicy = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(MaximumIndividualPlayerLatencyMilliseconds)) __obj.updateDynamic("MaximumIndividualPlayerLatencyMilliseconds")(MaximumIndividualPlayerLatencyMilliseconds.get.asInstanceOf[js.Any])
    if (!js.isUndefined(PolicyDurationSeconds)) __obj.updateDynamic("PolicyDurationSeconds")(PolicyDurationSeconds.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlayerLatencyPolicy]
  }
}

