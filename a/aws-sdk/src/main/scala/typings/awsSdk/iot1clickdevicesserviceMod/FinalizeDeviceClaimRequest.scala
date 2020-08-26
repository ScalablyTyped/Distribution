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
  def apply(DeviceId: string): FinalizeDeviceClaimRequest = {
    val __obj = js.Dynamic.literal(DeviceId = DeviceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[FinalizeDeviceClaimRequest]
  }
  @scala.inline
  implicit class FinalizeDeviceClaimRequestOps[Self <: FinalizeDeviceClaimRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDeviceId(value: string): Self = this.set("DeviceId", value.asInstanceOf[js.Any])
    @scala.inline
    def setTags(value: mapOfString): Self = this.set("Tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
  
}

