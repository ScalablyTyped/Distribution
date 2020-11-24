package typings.awsSdk.workdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InitiateDocumentVersionUploadRequest extends js.Object {
  
  /**
    * Amazon WorkDocs authentication token. Not required when using AWS administrator credentials to access the API.
    */
  var AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.native
  
  /**
    * The timestamp when the content of the document was originally created.
    */
  var ContentCreatedTimestamp: js.UndefOr[TimestampType] = js.native
  
  /**
    * The timestamp when the content of the document was modified.
    */
  var ContentModifiedTimestamp: js.UndefOr[TimestampType] = js.native
  
  /**
    * The content type of the document.
    */
  var ContentType: js.UndefOr[DocumentContentType] = js.native
  
  /**
    * The size of the document, in bytes.
    */
  var DocumentSizeInBytes: js.UndefOr[SizeType] = js.native
  
  /**
    * The ID of the document.
    */
  var Id: js.UndefOr[ResourceIdType] = js.native
  
  /**
    * The name of the document.
    */
  var Name: js.UndefOr[ResourceNameType] = js.native
  
  /**
    * The ID of the parent folder.
    */
  var ParentFolderId: ResourceIdType = js.native
}
object InitiateDocumentVersionUploadRequest {
  
  @scala.inline
  def apply(ParentFolderId: ResourceIdType): InitiateDocumentVersionUploadRequest = {
    val __obj = js.Dynamic.literal(ParentFolderId = ParentFolderId.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitiateDocumentVersionUploadRequest]
  }
  
  @scala.inline
  implicit class InitiateDocumentVersionUploadRequestOps[Self <: InitiateDocumentVersionUploadRequest] (val x: Self) extends AnyVal {
    
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
    def setParentFolderId(value: ResourceIdType): Self = this.set("ParentFolderId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthenticationToken(value: AuthenticationHeaderType): Self = this.set("AuthenticationToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthenticationToken: Self = this.set("AuthenticationToken", js.undefined)
    
    @scala.inline
    def setContentCreatedTimestamp(value: TimestampType): Self = this.set("ContentCreatedTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentCreatedTimestamp: Self = this.set("ContentCreatedTimestamp", js.undefined)
    
    @scala.inline
    def setContentModifiedTimestamp(value: TimestampType): Self = this.set("ContentModifiedTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentModifiedTimestamp: Self = this.set("ContentModifiedTimestamp", js.undefined)
    
    @scala.inline
    def setContentType(value: DocumentContentType): Self = this.set("ContentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentType: Self = this.set("ContentType", js.undefined)
    
    @scala.inline
    def setDocumentSizeInBytes(value: SizeType): Self = this.set("DocumentSizeInBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocumentSizeInBytes: Self = this.set("DocumentSizeInBytes", js.undefined)
    
    @scala.inline
    def setId(value: ResourceIdType): Self = this.set("Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("Id", js.undefined)
    
    @scala.inline
    def setName(value: ResourceNameType): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
  }
}
