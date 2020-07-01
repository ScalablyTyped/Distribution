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
  def apply(FileShareARN: FileShareARN = null): UpdateSMBFileShareOutput = {
    val __obj = js.Dynamic.literal()
    if (FileShareARN != null) __obj.updateDynamic("FileShareARN")(FileShareARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateSMBFileShareOutput]
  }
}

