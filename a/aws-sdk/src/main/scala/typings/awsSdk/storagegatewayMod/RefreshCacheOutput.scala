package typings.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RefreshCacheOutput extends js.Object {
  
  var FileShareARN: js.UndefOr[typings.awsSdk.storagegatewayMod.FileShareARN] = js.native
  
  var NotificationId: js.UndefOr[typings.awsSdk.storagegatewayMod.NotificationId] = js.native
}
object RefreshCacheOutput {
  
  @scala.inline
  def apply(): RefreshCacheOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RefreshCacheOutput]
  }
  
  @scala.inline
  implicit class RefreshCacheOutputOps[Self <: RefreshCacheOutput] (val x: Self) extends AnyVal {
    
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
