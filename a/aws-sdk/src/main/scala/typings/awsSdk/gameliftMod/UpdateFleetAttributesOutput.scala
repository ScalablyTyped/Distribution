package typings.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateFleetAttributesOutput extends StObject {
  
  /**
    * A unique identifier for a fleet that was updated. Use either the fleet ID or ARN value.
    */
  var FleetId: js.UndefOr[typings.awsSdk.gameliftMod.FleetId] = js.native
}
object UpdateFleetAttributesOutput {
  
  @scala.inline
  def apply(): UpdateFleetAttributesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateFleetAttributesOutput]
  }
  
  @scala.inline
  implicit class UpdateFleetAttributesOutputMutableBuilder[Self <: UpdateFleetAttributesOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFleetId(value: FleetId): Self = StObject.set(x, "FleetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFleetIdUndefined: Self = StObject.set(x, "FleetId", js.undefined)
  }
}
