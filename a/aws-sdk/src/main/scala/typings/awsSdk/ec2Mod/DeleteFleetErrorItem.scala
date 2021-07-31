package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteFleetErrorItem extends StObject {
  
  /**
    * The error.
    */
  var Error: js.UndefOr[DeleteFleetError] = js.undefined
  
  /**
    * The ID of the EC2 Fleet.
    */
  var FleetId: js.UndefOr[typings.awsSdk.ec2Mod.FleetId] = js.undefined
}
object DeleteFleetErrorItem {
  
  @scala.inline
  def apply(): DeleteFleetErrorItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteFleetErrorItem]
  }
  
  @scala.inline
  implicit class DeleteFleetErrorItemMutableBuilder[Self <: DeleteFleetErrorItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: DeleteFleetError): Self = StObject.set(x, "Error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "Error", js.undefined)
    
    @scala.inline
    def setFleetId(value: FleetId): Self = StObject.set(x, "FleetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFleetIdUndefined: Self = StObject.set(x, "FleetId", js.undefined)
  }
}
