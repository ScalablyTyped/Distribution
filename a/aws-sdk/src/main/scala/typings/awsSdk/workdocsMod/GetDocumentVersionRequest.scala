package typings.awsSdk.workdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetDocumentVersionRequest extends js.Object {
  
  /**
    * Amazon WorkDocs authentication token. Not required when using AWS administrator credentials to access the API.
    */
  var AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.native
  
  /**
    * The ID of the document.
    */
  var DocumentId: ResourceIdType = js.native
  
  /**
    * A comma-separated list of values. Specify "SOURCE" to include a URL for the source document.
    */
  var Fields: js.UndefOr[FieldNamesType] = js.native
  
  /**
    * Set this to TRUE to include custom metadata in the response.
    */
  var IncludeCustomMetadata: js.UndefOr[BooleanType] = js.native
  
  /**
    * The version ID of the document.
    */
  var VersionId: DocumentVersionIdType = js.native
}
object GetDocumentVersionRequest {
  
  @scala.inline
  def apply(DocumentId: ResourceIdType, VersionId: DocumentVersionIdType): GetDocumentVersionRequest = {
    val __obj = js.Dynamic.literal(DocumentId = DocumentId.asInstanceOf[js.Any], VersionId = VersionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDocumentVersionRequest]
  }
  
  @scala.inline
  implicit class GetDocumentVersionRequestOps[Self <: GetDocumentVersionRequest] (val x: Self) extends AnyVal {
    
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
    def setDocumentId(value: ResourceIdType): Self = this.set("DocumentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionId(value: DocumentVersionIdType): Self = this.set("VersionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthenticationToken(value: AuthenticationHeaderType): Self = this.set("AuthenticationToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthenticationToken: Self = this.set("AuthenticationToken", js.undefined)
    
    @scala.inline
    def setFields(value: FieldNamesType): Self = this.set("Fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFields: Self = this.set("Fields", js.undefined)
    
    @scala.inline
    def setIncludeCustomMetadata(value: BooleanType): Self = this.set("IncludeCustomMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeCustomMetadata: Self = this.set("IncludeCustomMetadata", js.undefined)
  }
}
