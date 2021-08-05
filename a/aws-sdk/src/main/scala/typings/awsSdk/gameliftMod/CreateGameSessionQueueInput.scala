package typings.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateGameSessionQueueInput extends StObject {
  
  /**
    * A list of fleets that can be used to fulfill game session placement requests in the queue. Fleets are identified by either a fleet ARN or a fleet alias ARN. Destinations are listed in default preference order.
    */
  var Destinations: js.UndefOr[GameSessionQueueDestinationList] = js.undefined
  
  /**
    * A descriptive label that is associated with game session queue. Queue names must be unique within each Region.
    */
  var Name: GameSessionQueueName
  
  /**
    * A collection of latency policies to apply when processing game sessions placement requests with player latency information. Multiple policies are evaluated in order of the maximum latency value, starting with the lowest latency values. With just one policy, the policy is enforced at the start of the game session placement for the duration period. With multiple policies, each policy is enforced consecutively for its duration period. For example, a queue might enforce a 60-second policy followed by a 120-second policy, and then no policy for the remainder of the placement. A player latency policy must set a value for MaximumIndividualPlayerLatencyMilliseconds. If none is set, this API request fails.
    */
  var PlayerLatencyPolicies: js.UndefOr[PlayerLatencyPolicyList] = js.undefined
  
  /**
    * A list of labels to assign to the new game session queue resource. Tags are developer-defined key-value pairs. Tagging AWS resources are useful for resource management, access management and cost allocation. For more information, see  Tagging AWS Resources in the AWS General Reference. Once the resource is created, you can use TagResource, UntagResource, and ListTagsForResource to add, remove, and view tags. The maximum tag limit may be lower than stated. See the AWS General Reference for actual tagging limits.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * The maximum time, in seconds, that a new game session placement request remains in the queue. When a request exceeds this time, the game session placement changes to a TIMED_OUT status.
    */
  var TimeoutInSeconds: js.UndefOr[WholeNumber] = js.undefined
}
object CreateGameSessionQueueInput {
  
  inline def apply(Name: GameSessionQueueName): CreateGameSessionQueueInput = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateGameSessionQueueInput]
  }
  
  extension [Self <: CreateGameSessionQueueInput](x: Self) {
    
    inline def setDestinations(value: GameSessionQueueDestinationList): Self = StObject.set(x, "Destinations", value.asInstanceOf[js.Any])
    
    inline def setDestinationsUndefined: Self = StObject.set(x, "Destinations", js.undefined)
    
    inline def setDestinationsVarargs(value: GameSessionQueueDestination*): Self = StObject.set(x, "Destinations", js.Array(value :_*))
    
    inline def setName(value: GameSessionQueueName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setPlayerLatencyPolicies(value: PlayerLatencyPolicyList): Self = StObject.set(x, "PlayerLatencyPolicies", value.asInstanceOf[js.Any])
    
    inline def setPlayerLatencyPoliciesUndefined: Self = StObject.set(x, "PlayerLatencyPolicies", js.undefined)
    
    inline def setPlayerLatencyPoliciesVarargs(value: PlayerLatencyPolicy*): Self = StObject.set(x, "PlayerLatencyPolicies", js.Array(value :_*))
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
    
    inline def setTimeoutInSeconds(value: WholeNumber): Self = StObject.set(x, "TimeoutInSeconds", value.asInstanceOf[js.Any])
    
    inline def setTimeoutInSecondsUndefined: Self = StObject.set(x, "TimeoutInSeconds", js.undefined)
  }
}
