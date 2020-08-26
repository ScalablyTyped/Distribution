package typings.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddCacheInput extends js.Object {
  /**
    * An array of strings that identify disks that are to be configured as working storage. Each string has a minimum length of 1 and maximum length of 300. You can get the disk IDs from the ListLocalDisks API.
    */
  var DiskIds: typings.awsSdk.storagegatewayMod.DiskIds = js.native
  var GatewayARN: typings.awsSdk.storagegatewayMod.GatewayARN = js.native
}

object AddCacheInput {
  @scala.inline
  def apply(DiskIds: DiskIds, GatewayARN: GatewayARN): AddCacheInput = {
    val __obj = js.Dynamic.literal(DiskIds = DiskIds.asInstanceOf[js.Any], GatewayARN = GatewayARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddCacheInput]
  }
  @scala.inline
  implicit class AddCacheInputOps[Self <: AddCacheInput] (val x: Self) extends AnyVal {
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
    def setDiskIdsVarargs(value: DiskId*): Self = this.set("DiskIds", js.Array(value :_*))
    @scala.inline
    def setDiskIds(value: DiskIds): Self = this.set("DiskIds", value.asInstanceOf[js.Any])
    @scala.inline
    def setGatewayARN(value: GatewayARN): Self = this.set("GatewayARN", value.asInstanceOf[js.Any])
  }
  
}

