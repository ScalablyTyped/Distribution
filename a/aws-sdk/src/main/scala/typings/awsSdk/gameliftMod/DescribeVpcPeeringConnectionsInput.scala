package typings.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeVpcPeeringConnectionsInput extends StObject {
  
  /**
    * A unique identifier for a fleet. You can use either the fleet ID or ARN value.
    */
  var FleetId: js.UndefOr[typings.awsSdk.gameliftMod.FleetId] = js.native
}
object DescribeVpcPeeringConnectionsInput {
  
  @scala.inline
  def apply(): DescribeVpcPeeringConnectionsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeVpcPeeringConnectionsInput]
  }
  
  @scala.inline
  implicit class DescribeVpcPeeringConnectionsInputMutableBuilder[Self <: DescribeVpcPeeringConnectionsInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFleetId(value: FleetId): Self = StObject.set(x, "FleetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFleetIdUndefined: Self = StObject.set(x, "FleetId", js.undefined)
  }
}
