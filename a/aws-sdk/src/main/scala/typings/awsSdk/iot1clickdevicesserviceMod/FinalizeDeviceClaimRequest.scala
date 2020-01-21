package typings.awsSdk.iot1clickdevicesserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FinalizeDeviceClaimRequest extends js.Object {
  /**
    * The unique identifier of the device.
    */
  var DeviceId: string = js.native
  /**
    * A collection of key/value pairs defining the resource tags. For example, {
    "tags": {"key1": "value1", "key2": "value2"} }. For more information, see AWS
    Tagging Strategies.
    
    
    */
  var Tags: js.UndefOr[mapOfString] = js.native
}

object FinalizeDeviceClaimRequest {
  @scala.inline
  def apply(DeviceId: string, Tags: mapOfString = null): FinalizeDeviceClaimRequest = {
    val __obj = js.Dynamic.literal(DeviceId = DeviceId.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[FinalizeDeviceClaimRequest]
  }
}

