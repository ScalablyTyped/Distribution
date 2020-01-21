package typings.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotifyWhenUploadedOutput extends js.Object {
  var FileShareARN: js.UndefOr[typings.awsSdk.storagegatewayMod.FileShareARN] = js.native
  var NotificationId: js.UndefOr[typings.awsSdk.storagegatewayMod.NotificationId] = js.native
}

object NotifyWhenUploadedOutput {
  @scala.inline
  def apply(FileShareARN: FileShareARN = null, NotificationId: NotificationId = null): NotifyWhenUploadedOutput = {
    val __obj = js.Dynamic.literal()
    if (FileShareARN != null) __obj.updateDynamic("FileShareARN")(FileShareARN.asInstanceOf[js.Any])
    if (NotificationId != null) __obj.updateDynamic("NotificationId")(NotificationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotifyWhenUploadedOutput]
  }
}

