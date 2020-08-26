package typings.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateSMBFileShareOutput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the updated SMB file share.
    */
  var FileShareARN: js.UndefOr[typings.awsSdk.storagegatewayMod.FileShareARN] = js.native
}

object UpdateSMBFileShareOutput {
  @scala.inline
  def apply(): UpdateSMBFileShareOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateSMBFileShareOutput]
  }
  @scala.inline
  implicit class UpdateSMBFileShareOutputOps[Self <: UpdateSMBFileShareOutput] (val x: Self) extends AnyVal {
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
  }
  
}

