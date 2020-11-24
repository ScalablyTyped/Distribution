package typings.awsSdk.iot1clickdevicesserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeDeviceResponse extends js.Object {
  
  /**
    * Device details.
    */
  var DeviceDescription: js.UndefOr[typings.awsSdk.iot1clickdevicesserviceMod.DeviceDescription] = js.native
}
object DescribeDeviceResponse {
  
  @scala.inline
  def apply(): DescribeDeviceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDeviceResponse]
  }
  
  @scala.inline
  implicit class DescribeDeviceResponseOps[Self <: DescribeDeviceResponse] (val x: Self) extends AnyVal {
    
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
    def setDeviceDescription(value: DeviceDescription): Self = this.set("DeviceDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceDescription: Self = this.set("DeviceDescription", js.undefined)
  }
}
