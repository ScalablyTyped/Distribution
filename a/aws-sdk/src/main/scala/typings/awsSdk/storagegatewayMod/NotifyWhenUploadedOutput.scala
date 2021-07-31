package typings.awsSdk.storagegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotifyWhenUploadedOutput extends StObject {
  
  var FileShareARN: js.UndefOr[typings.awsSdk.storagegatewayMod.FileShareARN] = js.undefined
  
  var NotificationId: js.UndefOr[typings.awsSdk.storagegatewayMod.NotificationId] = js.undefined
}
object NotifyWhenUploadedOutput {
  
  @scala.inline
  def apply(): NotifyWhenUploadedOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotifyWhenUploadedOutput]
  }
  
  @scala.inline
  implicit class NotifyWhenUploadedOutputMutableBuilder[Self <: NotifyWhenUploadedOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFileShareARN(value: FileShareARN): Self = StObject.set(x, "FileShareARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileShareARNUndefined: Self = StObject.set(x, "FileShareARN", js.undefined)
    
    @scala.inline
    def setNotificationId(value: NotificationId): Self = StObject.set(x, "NotificationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotificationIdUndefined: Self = StObject.set(x, "NotificationId", js.undefined)
  }
}
