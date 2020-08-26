package typings.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDevicePoolResult extends js.Object {
  /**
    * The newly created device pool.
    */
  var devicePool: js.UndefOr[DevicePool] = js.native
}

object CreateDevicePoolResult {
  @scala.inline
  def apply(): CreateDevicePoolResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateDevicePoolResult]
  }
  @scala.inline
  implicit class CreateDevicePoolResultOps[Self <: CreateDevicePoolResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDevicePool(value: DevicePool): Self = this.set("devicePool", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDevicePool: Self = this.set("devicePool", js.undefined)
  }
  
}

