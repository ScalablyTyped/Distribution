package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteFleetSuccessItem extends StObject {
  
  /**
    * The current state of the EC2 Fleet.
    */
  var CurrentFleetState: js.UndefOr[FleetStateCode] = js.native
  
  /**
    * The ID of the EC2 Fleet.
    */
  var FleetId: js.UndefOr[typings.awsSdk.ec2Mod.FleetId] = js.native
  
  /**
    * The previous state of the EC2 Fleet.
    */
  var PreviousFleetState: js.UndefOr[FleetStateCode] = js.native
}
object DeleteFleetSuccessItem {
  
  @scala.inline
  def apply(): DeleteFleetSuccessItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteFleetSuccessItem]
  }
  
  @scala.inline
  implicit class DeleteFleetSuccessItemMutableBuilder[Self <: DeleteFleetSuccessItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrentFleetState(value: FleetStateCode): Self = StObject.set(x, "CurrentFleetState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentFleetStateUndefined: Self = StObject.set(x, "CurrentFleetState", js.undefined)
    
    @scala.inline
    def setFleetId(value: FleetId): Self = StObject.set(x, "FleetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFleetIdUndefined: Self = StObject.set(x, "FleetId", js.undefined)
    
    @scala.inline
    def setPreviousFleetState(value: FleetStateCode): Self = StObject.set(x, "PreviousFleetState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousFleetStateUndefined: Self = StObject.set(x, "PreviousFleetState", js.undefined)
  }
}
