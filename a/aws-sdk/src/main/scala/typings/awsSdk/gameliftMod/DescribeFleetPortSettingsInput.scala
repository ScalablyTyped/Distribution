package typings.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeFleetPortSettingsInput extends StObject {
  
  /**
    * A unique identifier for a fleet to retrieve port settings for. You can use either the fleet ID or ARN value.
    */
  var FleetId: FleetIdOrArn = js.native
}
object DescribeFleetPortSettingsInput {
  
  @scala.inline
  def apply(FleetId: FleetIdOrArn): DescribeFleetPortSettingsInput = {
    val __obj = js.Dynamic.literal(FleetId = FleetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeFleetPortSettingsInput]
  }
  
  @scala.inline
  implicit class DescribeFleetPortSettingsInputMutableBuilder[Self <: DescribeFleetPortSettingsInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFleetId(value: FleetIdOrArn): Self = StObject.set(x, "FleetId", value.asInstanceOf[js.Any])
  }
}
