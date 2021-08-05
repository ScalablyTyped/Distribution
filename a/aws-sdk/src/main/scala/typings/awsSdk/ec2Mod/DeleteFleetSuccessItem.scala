package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteFleetSuccessItem extends StObject {
  
  /**
    * The current state of the EC2 Fleet.
    */
  var CurrentFleetState: js.UndefOr[FleetStateCode] = js.undefined
  
  /**
    * The ID of the EC2 Fleet.
    */
  var FleetId: js.UndefOr[typings.awsSdk.ec2Mod.FleetId] = js.undefined
  
  /**
    * The previous state of the EC2 Fleet.
    */
  var PreviousFleetState: js.UndefOr[FleetStateCode] = js.undefined
}
object DeleteFleetSuccessItem {
  
  inline def apply(): DeleteFleetSuccessItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteFleetSuccessItem]
  }
  
  extension [Self <: DeleteFleetSuccessItem](x: Self) {
    
    inline def setCurrentFleetState(value: FleetStateCode): Self = StObject.set(x, "CurrentFleetState", value.asInstanceOf[js.Any])
    
    inline def setCurrentFleetStateUndefined: Self = StObject.set(x, "CurrentFleetState", js.undefined)
    
    inline def setFleetId(value: FleetId): Self = StObject.set(x, "FleetId", value.asInstanceOf[js.Any])
    
    inline def setFleetIdUndefined: Self = StObject.set(x, "FleetId", js.undefined)
    
    inline def setPreviousFleetState(value: FleetStateCode): Self = StObject.set(x, "PreviousFleetState", value.asInstanceOf[js.Any])
    
    inline def setPreviousFleetStateUndefined: Self = StObject.set(x, "PreviousFleetState", js.undefined)
  }
}
