package typings.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileShareInfo extends js.Object {
  var FileShareARN: js.UndefOr[typings.awsSdk.storagegatewayMod.FileShareARN] = js.native
  var FileShareId: js.UndefOr[typings.awsSdk.storagegatewayMod.FileShareId] = js.native
  var FileShareStatus: js.UndefOr[typings.awsSdk.storagegatewayMod.FileShareStatus] = js.native
  var FileShareType: js.UndefOr[typings.awsSdk.storagegatewayMod.FileShareType] = js.native
  var GatewayARN: js.UndefOr[typings.awsSdk.storagegatewayMod.GatewayARN] = js.native
}

object FileShareInfo {
  @scala.inline
  def apply(): FileShareInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileShareInfo]
  }
  @scala.inline
  implicit class FileShareInfoOps[Self <: FileShareInfo] (val x: Self) extends AnyVal {
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
    def setFileShareARN(value: FileShareARN): Self = this.set("FileShareARN", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFileShareARN: Self = this.set("FileShareARN", js.undefined)
    @scala.inline
    def setFileShareId(value: FileShareId): Self = this.set("FileShareId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFileShareId: Self = this.set("FileShareId", js.undefined)
    @scala.inline
    def setFileShareStatus(value: FileShareStatus): Self = this.set("FileShareStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFileShareStatus: Self = this.set("FileShareStatus", js.undefined)
    @scala.inline
    def setFileShareType(value: FileShareType): Self = this.set("FileShareType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFileShareType: Self = this.set("FileShareType", js.undefined)
    @scala.inline
    def setGatewayARN(value: GatewayARN): Self = this.set("GatewayARN", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGatewayARN: Self = this.set("GatewayARN", js.undefined)
  }
  
}

