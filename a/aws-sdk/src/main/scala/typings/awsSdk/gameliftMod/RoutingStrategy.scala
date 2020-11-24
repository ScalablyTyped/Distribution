package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RoutingStrategy extends js.Object {
  
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
  implicit class RoutingStrategyOps[Self <: RoutingStrategy] (val x: Self) extends AnyVal {
    
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
    def setFleetId(value: FleetId): Self = this.set("FleetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFleetId: Self = this.set("FleetId", js.undefined)
    
    @scala.inline
    def setMessage(value: FreeText): Self = this.set("Message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessage: Self = this.set("Message", js.undefined)
    
    @scala.inline
    def setType(value: RoutingStrategyType): Self = this.set("Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("Type", js.undefined)
  }
}
