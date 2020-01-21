package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdminGetDeviceResponse extends js.Object {
  /**
    * The device.
    */
  var Device: DeviceType = js.native
}

object AdminGetDeviceResponse {
  @scala.inline
  def apply(Device: DeviceType): AdminGetDeviceResponse = {
    val __obj = js.Dynamic.literal(Device = Device.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AdminGetDeviceResponse]
  }
}

