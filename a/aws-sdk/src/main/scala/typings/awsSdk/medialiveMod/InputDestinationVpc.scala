package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InputDestinationVpc extends StObject {
  
  /**
    * The availability zone of the Input destination.
    */
  var AvailabilityZone: js.UndefOr[string] = js.native
  
  /**
    * The network interface ID of the Input destination in the VPC.
    */
  var NetworkInterfaceId: js.UndefOr[string] = js.native
}
object InputDestinationVpc {
  
  @scala.inline
  def apply(): InputDestinationVpc = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputDestinationVpc]
  }
  
  @scala.inline
  implicit class InputDestinationVpcMutableBuilder[Self <: InputDestinationVpc] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvailabilityZone(value: string): Self = StObject.set(x, "AvailabilityZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailabilityZoneUndefined: Self = StObject.set(x, "AvailabilityZone", js.undefined)
    
    @scala.inline
    def setNetworkInterfaceId(value: string): Self = StObject.set(x, "NetworkInterfaceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkInterfaceIdUndefined: Self = StObject.set(x, "NetworkInterfaceId", js.undefined)
  }
}
