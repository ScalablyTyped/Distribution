package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateGameSessionQueueInput extends js.Object {
  /**
    * A list of fleets that can be used to fulfill game session placement requests in the queue. Fleets are identified by either a fleet ARN or a fleet alias ARN. Destinations are listed in default preference order.
    */
  var Destinations: js.UndefOr[GameSessionQueueDestinationList] = js.native
  /**
    * A descriptive label that is associated with game session queue. Queue names must be unique within each Region.
    */
  var Name: GameSessionQueueName = js.native
  /**
    * A collection of latency policies to apply when processing game sessions placement requests with player latency information. Multiple policies are evaluated in order of the maximum latency value, starting with the lowest latency values. With just one policy, the policy is enforced at the start of the game session placement for the duration period. With multiple policies, each policy is enforced consecutively for its duration period. For example, a queue might enforce a 60-second policy followed by a 120-second policy, and then no policy for the remainder of the placement. A player latency policy must set a value for MaximumIndividualPlayerLatencyMilliseconds. If none is set, this API request fails.
    */
  var PlayerLatencyPolicies: js.UndefOr[PlayerLatencyPolicyList] = js.native
  /**
    * A list of labels to assign to the new game session queue resource. Tags are developer-defined key-value pairs. Tagging AWS resources are useful for resource management, access management and cost allocation. For more information, see  Tagging AWS Resources in the AWS General Reference. Once the resource is created, you can use TagResource, UntagResource, and ListTagsForResource to add, remove, and view tags. The maximum tag limit may be lower than stated. See the AWS General Reference for actual tagging limits.
    */
  var Tags: js.UndefOr[TagList] = js.native
  /**
    * The maximum time, in seconds, that a new game session placement request remains in the queue. When a request exceeds this time, the game session placement changes to a TIMED_OUT status.
    */
  var TimeoutInSeconds: js.UndefOr[WholeNumber] = js.native
}

object CreateGameSessionQueueInput {
  @scala.inline
  def apply(
    Name: GameSessionQueueName,
    Destinations: GameSessionQueueDestinationList = null,
    PlayerLatencyPolicies: PlayerLatencyPolicyList = null,
    Tags: TagList = null,
    TimeoutInSeconds: Int | scala.Double = null
  ): CreateGameSessionQueueInput = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    if (Destinations != null) __obj.updateDynamic("Destinations")(Destinations.asInstanceOf[js.Any])
    if (PlayerLatencyPolicies != null) __obj.updateDynamic("PlayerLatencyPolicies")(PlayerLatencyPolicies.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    if (TimeoutInSeconds != null) __obj.updateDynamic("TimeoutInSeconds")(TimeoutInSeconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateGameSessionQueueInput]
  }
}

