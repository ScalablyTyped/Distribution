package typings.awsSdk.storagegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotifyWhenUploadedInput extends StObject {
  
  var FileShareARN: typings.awsSdk.storagegatewayMod.FileShareARN
}
object NotifyWhenUploadedInput {
  
  @scala.inline
  def apply(FileShareARN: FileShareARN): NotifyWhenUploadedInput = {
    val __obj = js.Dynamic.literal(FileShareARN = FileShareARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotifyWhenUploadedInput]
  }
  
  @scala.inline
  implicit class NotifyWhenUploadedInputMutableBuilder[Self <: NotifyWhenUploadedInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFileShareARN(value: FileShareARN): Self = StObject.set(x, "FileShareARN", value.asInstanceOf[js.Any])
  }
}
