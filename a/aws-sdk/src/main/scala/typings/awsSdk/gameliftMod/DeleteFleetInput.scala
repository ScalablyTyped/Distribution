package typings.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteFleetInput extends StObject {
  
  /**
    * A unique identifier for a fleet to be deleted. You can use either the fleet ID or ARN value.
    */
  var FleetId: FleetIdOrArn = js.native
}
object DeleteFleetInput {
  
  @scala.inline
  def apply(FleetId: FleetIdOrArn): DeleteFleetInput = {
    val __obj = js.Dynamic.literal(FleetId = FleetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteFleetInput]
  }
  
  @scala.inline
  implicit class DeleteFleetInputMutableBuilder[Self <: DeleteFleetInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFleetId(value: FleetIdOrArn): Self = StObject.set(x, "FleetId", value.asInstanceOf[js.Any])
  }
}
