package typings.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateGameSessionQueueInput extends StObject {
  
  /**
    *  Information to be added to all events that are related to this game session queue. 
    */
  var CustomEventData: js.UndefOr[QueueCustomEventData] = js.undefined
  
  /**
    * A list of fleets and/or fleet aliases that can be used to fulfill game session placement requests in the queue. Destinations are identified by either a fleet ARN or a fleet alias ARN, and are listed in order of placement preference. When updating this list, provide a complete list of destinations.
    */
  var Destinations: js.UndefOr[GameSessionQueueDestinationList] = js.undefined
  
  /**
    * A list of locations where a queue is allowed to place new game sessions. Locations are specified in the form of Amazon Web Services Region codes, such as us-west-2. If this parameter is not set, game sessions can be placed in any queue location. To remove an existing filter configuration, pass in an empty set.
    */
  var FilterConfiguration: js.UndefOr[typings.awsSdk.gameliftMod.FilterConfiguration] = js.undefined
  
  /**
    * A descriptive label that is associated with game session queue. Queue names must be unique within each Region. You can use either the queue ID or ARN value. 
    */
  var Name: GameSessionQueueNameOrArn
  
  /**
    * An SNS topic ARN that is set up to receive game session placement notifications. See  Setting up notifications for game session placement.
    */
  var NotificationTarget: js.UndefOr[QueueSnsArnStringModel] = js.undefined
  
  /**
    * A set of policies that act as a sliding cap on player latency. FleetIQ works to deliver low latency for most players in a game session. These policies ensure that no individual player can be placed into a game with unreasonably high latency. Use multiple policies to gradually relax latency requirements a step at a time. Multiple policies are applied based on their maximum allowed latency, starting with the lowest value. When updating policies, provide a complete collection of policies.
    */
  var PlayerLatencyPolicies: js.UndefOr[PlayerLatencyPolicyList] = js.undefined
  
  /**
    * Custom settings to use when prioritizing destinations and locations for game session placements. This configuration replaces the FleetIQ default prioritization process. Priority types that are not explicitly named will be automatically applied at the end of the prioritization process. To remove an existing priority configuration, pass in an empty set.
    */
  var PriorityConfiguration: js.UndefOr[typings.awsSdk.gameliftMod.PriorityConfiguration] = js.undefined
  
  /**
    * The maximum time, in seconds, that a new game session placement request remains in the queue. When a request exceeds this time, the game session placement changes to a TIMED_OUT status.
    */
  var TimeoutInSeconds: js.UndefOr[WholeNumber] = js.undefined
}
object UpdateGameSessionQueueInput {
  
  inline def apply(Name: GameSessionQueueNameOrArn): UpdateGameSessionQueueInput = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateGameSessionQueueInput]
  }
  
  extension [Self <: UpdateGameSessionQueueInput](x: Self) {
    
    inline def setCustomEventData(value: QueueCustomEventData): Self = StObject.set(x, "CustomEventData", value.asInstanceOf[js.Any])
    
    inline def setCustomEventDataUndefined: Self = StObject.set(x, "CustomEventData", js.undefined)
    
    inline def setDestinations(value: GameSessionQueueDestinationList): Self = StObject.set(x, "Destinations", value.asInstanceOf[js.Any])
    
    inline def setDestinationsUndefined: Self = StObject.set(x, "Destinations", js.undefined)
    
    inline def setDestinationsVarargs(value: GameSessionQueueDestination*): Self = StObject.set(x, "Destinations", js.Array(value*))
    
    inline def setFilterConfiguration(value: FilterConfiguration): Self = StObject.set(x, "FilterConfiguration", value.asInstanceOf[js.Any])
    
    inline def setFilterConfigurationUndefined: Self = StObject.set(x, "FilterConfiguration", js.undefined)
    
    inline def setName(value: GameSessionQueueNameOrArn): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNotificationTarget(value: QueueSnsArnStringModel): Self = StObject.set(x, "NotificationTarget", value.asInstanceOf[js.Any])
    
    inline def setNotificationTargetUndefined: Self = StObject.set(x, "NotificationTarget", js.undefined)
    
    inline def setPlayerLatencyPolicies(value: PlayerLatencyPolicyList): Self = StObject.set(x, "PlayerLatencyPolicies", value.asInstanceOf[js.Any])
    
    inline def setPlayerLatencyPoliciesUndefined: Self = StObject.set(x, "PlayerLatencyPolicies", js.undefined)
    
    inline def setPlayerLatencyPoliciesVarargs(value: PlayerLatencyPolicy*): Self = StObject.set(x, "PlayerLatencyPolicies", js.Array(value*))
    
    inline def setPriorityConfiguration(value: PriorityConfiguration): Self = StObject.set(x, "PriorityConfiguration", value.asInstanceOf[js.Any])
    
    inline def setPriorityConfigurationUndefined: Self = StObject.set(x, "PriorityConfiguration", js.undefined)
    
    inline def setTimeoutInSeconds(value: WholeNumber): Self = StObject.set(x, "TimeoutInSeconds", value.asInstanceOf[js.Any])
    
    inline def setTimeoutInSecondsUndefined: Self = StObject.set(x, "TimeoutInSeconds", js.undefined)
  }
}
