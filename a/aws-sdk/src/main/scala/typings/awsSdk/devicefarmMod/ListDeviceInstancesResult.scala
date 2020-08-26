package typings.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDeviceInstancesResult extends js.Object {
  /**
    * An object that contains information about your device instances.
    */
  var deviceInstances: js.UndefOr[DeviceInstances] = js.native
  /**
    * An identifier that can be used in the next call to this operation to return the next set of items in the list.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
}

object ListDeviceInstancesResult {
  @scala.inline
  def apply(): ListDeviceInstancesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDeviceInstancesResult]
  }
  @scala.inline
  implicit class ListDeviceInstancesResultOps[Self <: ListDeviceInstancesResult] (val x: Self) extends AnyVal {
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
    def setDeviceInstancesVarargs(value: DeviceInstance*): Self = this.set("deviceInstances", js.Array(value :_*))
    @scala.inline
    def setDeviceInstances(value: DeviceInstances): Self = this.set("deviceInstances", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeviceInstances: Self = this.set("deviceInstances", js.undefined)
    @scala.inline
    def setNextToken(value: PaginationToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
  
}

