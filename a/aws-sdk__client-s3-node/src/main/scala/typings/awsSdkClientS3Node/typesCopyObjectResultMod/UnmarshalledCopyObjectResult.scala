package typings.awsSdkClientS3Node.typesCopyObjectResultMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnmarshalledCopyObjectResult extends CopyObjectResult {
  
  /**
    * _LastModified shape
    */
  @JSName("LastModified")
  var LastModified_UnmarshalledCopyObjectResult: js.UndefOr[Date] = js.native
}
object UnmarshalledCopyObjectResult {
  
  @scala.inline
  def apply(): UnmarshalledCopyObjectResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledCopyObjectResult]
  }
  
  @scala.inline
  implicit class UnmarshalledCopyObjectResultOps[Self <: UnmarshalledCopyObjectResult] (val x: Self) extends AnyVal {
    
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
    def setLastModified(value: Date): Self = this.set("LastModified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastModified: Self = this.set("LastModified", js.undefined)
  }
}
