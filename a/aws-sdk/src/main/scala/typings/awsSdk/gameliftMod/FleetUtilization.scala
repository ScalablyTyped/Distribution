package typings.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FleetUtilization extends StObject {
  
  /**
    * Number of active game sessions currently being hosted on all instances in the fleet.
    */
  var ActiveGameSessionCount: js.UndefOr[WholeNumber] = js.native
  
  /**
    * Number of server processes in an ACTIVE status currently running across all instances in the fleet
    */
  var ActiveServerProcessCount: js.UndefOr[WholeNumber] = js.native
  
  /**
    * Number of active player sessions currently being hosted on all instances in the fleet.
    */
  var CurrentPlayerSessionCount: js.UndefOr[WholeNumber] = js.native
  
  /**
    * A unique identifier for a fleet.
    */
  var FleetId: js.UndefOr[typings.awsSdk.gameliftMod.FleetId] = js.native
  
  /**
    * The maximum number of players allowed across all game sessions currently being hosted on all instances in the fleet.
    */
  var MaximumPlayerSessionCount: js.UndefOr[WholeNumber] = js.native
}
object FleetUtilization {
  
  @scala.inline
  def apply(): FleetUtilization = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FleetUtilization]
  }
  
  @scala.inline
  implicit class FleetUtilizationMutableBuilder[Self <: FleetUtilization] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActiveGameSessionCount(value: WholeNumber): Self = StObject.set(x, "ActiveGameSessionCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveGameSessionCountUndefined: Self = StObject.set(x, "ActiveGameSessionCount", js.undefined)
    
    @scala.inline
    def setActiveServerProcessCount(value: WholeNumber): Self = StObject.set(x, "ActiveServerProcessCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveServerProcessCountUndefined: Self = StObject.set(x, "ActiveServerProcessCount", js.undefined)
    
    @scala.inline
    def setCurrentPlayerSessionCount(value: WholeNumber): Self = StObject.set(x, "CurrentPlayerSessionCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentPlayerSessionCountUndefined: Self = StObject.set(x, "CurrentPlayerSessionCount", js.undefined)
    
    @scala.inline
    def setFleetId(value: FleetId): Self = StObject.set(x, "FleetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFleetIdUndefined: Self = StObject.set(x, "FleetId", js.undefined)
    
    @scala.inline
    def setMaximumPlayerSessionCount(value: WholeNumber): Self = StObject.set(x, "MaximumPlayerSessionCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumPlayerSessionCountUndefined: Self = StObject.set(x, "MaximumPlayerSessionCount", js.undefined)
  }
}
