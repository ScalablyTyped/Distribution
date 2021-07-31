package typings.awsSdk.worklinkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDeviceRequest extends StObject {
  
  /**
    * A unique identifier for a registered user's device.
    */
  var DeviceId: Id
  
  /**
    * The ARN of the fleet.
    */
  var FleetArn: typings.awsSdk.worklinkMod.FleetArn
}
object DescribeDeviceRequest {
  
  @scala.inline
  def apply(DeviceId: Id, FleetArn: FleetArn): DescribeDeviceRequest = {
    val __obj = js.Dynamic.literal(DeviceId = DeviceId.asInstanceOf[js.Any], FleetArn = FleetArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDeviceRequest]
  }
  
  @scala.inline
  implicit class DescribeDeviceRequestMutableBuilder[Self <: DescribeDeviceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeviceId(value: Id): Self = StObject.set(x, "DeviceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFleetArn(value: FleetArn): Self = StObject.set(x, "FleetArn", value.asInstanceOf[js.Any])
  }
}
