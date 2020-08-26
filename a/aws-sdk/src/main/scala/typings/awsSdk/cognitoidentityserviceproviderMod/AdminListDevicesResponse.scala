package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdminListDevicesResponse extends js.Object {
  /**
    * The devices in the list of devices response.
    */
  var Devices: js.UndefOr[DeviceListType] = js.native
  /**
    * The pagination token.
    */
  var PaginationToken: js.UndefOr[SearchPaginationTokenType] = js.native
}

object AdminListDevicesResponse {
  @scala.inline
  def apply(): AdminListDevicesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdminListDevicesResponse]
  }
  @scala.inline
  implicit class AdminListDevicesResponseOps[Self <: AdminListDevicesResponse] (val x: Self) extends AnyVal {
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
    def setDevicesVarargs(value: DeviceType*): Self = this.set("Devices", js.Array(value :_*))
    @scala.inline
    def setDevices(value: DeviceListType): Self = this.set("Devices", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDevices: Self = this.set("Devices", js.undefined)
    @scala.inline
    def setPaginationToken(value: SearchPaginationTokenType): Self = this.set("PaginationToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaginationToken: Self = this.set("PaginationToken", js.undefined)
  }
  
}

