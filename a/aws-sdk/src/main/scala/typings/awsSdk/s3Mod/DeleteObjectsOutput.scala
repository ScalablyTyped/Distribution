package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteObjectsOutput extends js.Object {
  
  /**
    * Container element for a successful delete. It identifies the object that was successfully deleted.
    */
  var Deleted: js.UndefOr[DeletedObjects] = js.native
  
  /**
    * Container for a failed delete operation that describes the object that Amazon S3 attempted to delete and the error it encountered.
    */
  var Errors: js.UndefOr[typings.awsSdk.s3Mod.Errors] = js.native
  
  var RequestCharged: js.UndefOr[typings.awsSdk.s3Mod.RequestCharged] = js.native
}
object DeleteObjectsOutput {
  
  @scala.inline
  def apply(): DeleteObjectsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteObjectsOutput]
  }
  
  @scala.inline
  implicit class DeleteObjectsOutputOps[Self <: DeleteObjectsOutput] (val x: Self) extends AnyVal {
    
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
    def setDeletedVarargs(value: DeletedObject*): Self = this.set("Deleted", js.Array(value :_*))
    
    @scala.inline
    def setDeleted(value: DeletedObjects): Self = this.set("Deleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeleted: Self = this.set("Deleted", js.undefined)
    
    @scala.inline
    def setErrorsVarargs(value: Error*): Self = this.set("Errors", js.Array(value :_*))
    
    @scala.inline
    def setErrors(value: Errors): Self = this.set("Errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrors: Self = this.set("Errors", js.undefined)
    
    @scala.inline
    def setRequestCharged(value: RequestCharged): Self = this.set("RequestCharged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestCharged: Self = this.set("RequestCharged", js.undefined)
  }
}
