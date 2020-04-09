package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateGameSessionQueueInput extends js.Object {
  /**
    * A list of fleets that can be used to fulfill game session placement requests in the queue. Fleets are identified by either a fleet ARN or a fleet alias ARN. Destinations are listed in default preference order. When updating this list, provide a complete list of destinations.
    */
  var Destinations: js.UndefOr[GameSessionQueueDestinationList] = js.native
  /**
    * A descriptive label that is associated with game session queue. Queue names must be unique within each Region. You can use either the queue ID or ARN value. 
    */
  var Name: GameSessionQueueNameOrArn = js.native
  /**
    * A collection of latency policies to apply when processing game sessions placement requests with player latency information. Multiple policies are evaluated in order of the maximum latency value, starting with the lowest latency values. With just one policy, the policy is enforced at the start of the game session placement for the duration period. With multiple policies, each policy is enforced consecutively for its duration period. For example, a queue might enforce a 60-second policy followed by a 120-second policy, and then no policy for the remainder of the placement. When updating policies, provide a complete collection of policies.
    */
  var PlayerLatencyPolicies: js.UndefOr[PlayerLatencyPolicyList] = js.native
  /**
    * The maximum time, in seconds, that a new game session placement request remains in the queue. When a request exceeds this time, the game session placement changes to a TIMED_OUT status.
    */
  var TimeoutInSeconds: js.UndefOr[WholeNumber] = js.native
}

object UpdateGameSessionQueueInput {
  @scala.inline
  def apply(
    Name: GameSessionQueueNameOrArn,
    Destinations: GameSessionQueueDestinationList = null,
    PlayerLatencyPolicies: PlayerLatencyPolicyList = null,
    TimeoutInSeconds: Int | scala.Double = null
  ): UpdateGameSessionQueueInput = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    if (Destinations != null) __obj.updateDynamic("Destinations")(Destinations.asInstanceOf[js.Any])
    if (PlayerLatencyPolicies != null) __obj.updateDynamic("PlayerLatencyPolicies")(PlayerLatencyPolicies.asInstanceOf[js.Any])
    if (TimeoutInSeconds != null) __obj.updateDynamic("TimeoutInSeconds")(TimeoutInSeconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateGameSessionQueueInput]
  }
}

