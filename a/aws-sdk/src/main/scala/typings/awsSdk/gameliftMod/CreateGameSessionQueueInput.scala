package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(Name: GameSessionQueueName): CreateGameSessionQueueInput = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateGameSessionQueueInput]
  }
  
  @scala.inline
  implicit class CreateGameSessionQueueInputOps[Self <: CreateGameSessionQueueInput] (val x: Self) extends AnyVal {
    
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
    def setName(value: GameSessionQueueName): Self = this.set("Name", value.asInstanceOf[js.Any])
    
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
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: TagList): Self = this.set("Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
    
    @scala.inline
    def setTimeoutInSeconds(value: WholeNumber): Self = this.set("TimeoutInSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeoutInSeconds: Self = this.set("TimeoutInSeconds", js.undefined)
  }
}
