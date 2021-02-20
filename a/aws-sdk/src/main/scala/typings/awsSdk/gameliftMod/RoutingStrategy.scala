package typings.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RoutingStrategy extends StObject {
  
  /**
    * The unique identifier for a fleet that the alias points to. This value is the fleet ID, not the fleet ARN.
    */
  var FleetId: js.UndefOr[typings.awsSdk.gameliftMod.FleetId] = js.native
  
  /**
    * The message text to be used with a terminal routing strategy.
    */
  var Message: js.UndefOr[FreeText] = js.native
  
  /**
    * The type of routing strategy for the alias. Possible routing types include the following:    SIMPLE - The alias resolves to one specific fleet. Use this type when routing to active fleets.    TERMINAL - The alias does not resolve to a fleet but instead can be used to display a message to the user. A terminal alias throws a TerminalRoutingStrategyException with the RoutingStrategy message embedded.  
    */
  var Type: js.UndefOr[RoutingStrategyType] = js.native
}
object RoutingStrategy {
  
  @scala.inline
  def apply(): RoutingStrategy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RoutingStrategy]
  }
  
  @scala.inline
  implicit class RoutingStrategyMutableBuilder[Self <: RoutingStrategy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFleetId(value: FleetId): Self = StObject.set(x, "FleetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFleetIdUndefined: Self = StObject.set(x, "FleetId", js.undefined)
    
    @scala.inline
    def setMessage(value: FreeText): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
    
    @scala.inline
    def setType(value: RoutingStrategyType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
