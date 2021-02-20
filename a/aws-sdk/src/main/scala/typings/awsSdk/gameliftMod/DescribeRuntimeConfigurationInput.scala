package typings.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeRuntimeConfigurationInput extends StObject {
  
  /**
    * A unique identifier for a fleet to get the runtime configuration for. You can use either the fleet ID or ARN value.
    */
  var FleetId: FleetIdOrArn = js.native
}
object DescribeRuntimeConfigurationInput {
  
  @scala.inline
  def apply(FleetId: FleetIdOrArn): DescribeRuntimeConfigurationInput = {
    val __obj = js.Dynamic.literal(FleetId = FleetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeRuntimeConfigurationInput]
  }
  
  @scala.inline
  implicit class DescribeRuntimeConfigurationInputMutableBuilder[Self <: DescribeRuntimeConfigurationInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFleetId(value: FleetIdOrArn): Self = StObject.set(x, "FleetId", value.asInstanceOf[js.Any])
  }
}
