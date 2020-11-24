package typings.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteFileShareInput extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) of the file share to be deleted.
    */
  var FileShareARN: typings.awsSdk.storagegatewayMod.FileShareARN = js.native
  
  /**
    * If this value is set to true, the operation deletes a file share immediately and aborts all data uploads to AWS. Otherwise, the file share is not deleted until all data is uploaded to AWS. This process aborts the data upload process, and the file share enters the FORCE_DELETING status. Valid Values: true | false 
    */
  var ForceDelete: js.UndefOr[scala.Boolean] = js.native
}
object DeleteFileShareInput {
  
  @scala.inline
  def apply(FileShareARN: FileShareARN): DeleteFileShareInput = {
    val __obj = js.Dynamic.literal(FileShareARN = FileShareARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteFileShareInput]
  }
  
  @scala.inline
  implicit class DeleteFileShareInputOps[Self <: DeleteFileShareInput] (val x: Self) extends AnyVal {
    
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
    def setForceDelete(value: scala.Boolean): Self = this.set("ForceDelete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForceDelete: Self = this.set("ForceDelete", js.undefined)
  }
}
