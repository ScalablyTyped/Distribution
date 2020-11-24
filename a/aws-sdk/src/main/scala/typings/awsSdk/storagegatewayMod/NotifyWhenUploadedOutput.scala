package typings.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NotifyWhenUploadedOutput extends js.Object {
  
  var FileShareARN: js.UndefOr[typings.awsSdk.storagegatewayMod.FileShareARN] = js.native
  
  var NotificationId: js.UndefOr[typings.awsSdk.storagegatewayMod.NotificationId] = js.native
}
object NotifyWhenUploadedOutput {
  
  @scala.inline
  def apply(): NotifyWhenUploadedOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotifyWhenUploadedOutput]
  }
  
  @scala.inline
  implicit class NotifyWhenUploadedOutputOps[Self <: NotifyWhenUploadedOutput] (val x: Self) extends AnyVal {
    
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
    def setNotificationId(value: NotificationId): Self = this.set("NotificationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotificationId: Self = this.set("NotificationId", js.undefined)
  }
}
