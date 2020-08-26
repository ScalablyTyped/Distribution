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
  def apply(Name: GameSessionQueueNameOrArn): UpdateGameSessionQueueInput = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateGameSessionQueueInput]
  }
  @scala.inline
  implicit class UpdateGameSessionQueueInputOps[Self <: UpdateGameSessionQueueInput] (val x: Self) extends AnyVal {
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
    def setName(value: GameSessionQueueNameOrArn): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setDestinationsVarargs(value: GameSessionQueueDestination*): Self = this.set("Destinations", js.Array(value :_*))
    @scala.inline
    def setDestinations(value: GameSessionQueueDestinationList): Self = this.set("Destinations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDestinations: Self = this.set("Destinations", js.undefined)
    @scala.inline
    def setPlayerLatencyPoliciesVarargs(value: PlayerLatencyPolicy*): Self = this.set("PlayerLatencyPolicies", js.Array(value :_*))
    @scala.inline
    def setPlayerLatencyPolicies(value: PlayerLatencyPolicyList): Self = this.set("PlayerLatencyPolicies", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlayerLatencyPolicies: Self = this.set("PlayerLatencyPolicies", js.undefined)
    @scala.inline
    def setTimeoutInSeconds(value: WholeNumber): Self = this.set("TimeoutInSeconds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeoutInSeconds: Self = this.set("TimeoutInSeconds", js.undefined)
  }
  
}

