package typings.awsSdk.cloudsearchdomainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UploadDocumentsResponse extends js.Object {
  
  /**
    * The number of documents that were added to the search domain.
    */
  var adds: js.UndefOr[Adds] = js.native
  
  /**
    * The number of documents that were deleted from the search domain.
    */
  var deletes: js.UndefOr[Deletes] = js.native
  
  /**
    * The status of an UploadDocumentsRequest.
    */
  var status: js.UndefOr[String] = js.native
  
  /**
    * Any warnings returned by the document service about the documents being uploaded.
    */
  var warnings: js.UndefOr[DocumentServiceWarnings] = js.native
}
object UploadDocumentsResponse {
  
  @scala.inline
  def apply(): UploadDocumentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UploadDocumentsResponse]
  }
  
  @scala.inline
  implicit class UploadDocumentsResponseOps[Self <: UploadDocumentsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAdds(value: Adds): Self = this.set("adds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdds: Self = this.set("adds", js.undefined)
    
    @scala.inline
    def setDeletes(value: Deletes): Self = this.set("deletes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeletes: Self = this.set("deletes", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setWarningsVarargs(value: DocumentServiceWarning*): Self = this.set("warnings", js.Array(value :_*))
    
    @scala.inline
    def setWarnings(value: DocumentServiceWarnings): Self = this.set("warnings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWarnings: Self = this.set("warnings", js.undefined)
  }
}
