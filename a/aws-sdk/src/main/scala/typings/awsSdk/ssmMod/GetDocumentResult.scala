package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetDocumentResult extends StObject {
  
  /**
    * A description of the document attachments, including names, locations, sizes, and so on.
    */
  var AttachmentsContent: js.UndefOr[AttachmentContentList] = js.native
  
  /**
    * The contents of the Systems Manager document.
    */
  var Content: js.UndefOr[DocumentContent] = js.native
  
  /**
    * The document format, either JSON or YAML.
    */
  var DocumentFormat: js.UndefOr[typings.awsSdk.ssmMod.DocumentFormat] = js.native
  
  /**
    * The document type.
    */
  var DocumentType: js.UndefOr[typings.awsSdk.ssmMod.DocumentType] = js.native
  
  /**
    * The document version.
    */
  var DocumentVersion: js.UndefOr[typings.awsSdk.ssmMod.DocumentVersion] = js.native
  
  /**
    * The name of the Systems Manager document.
    */
  var Name: js.UndefOr[DocumentARN] = js.native
  
  /**
    * A list of SSM documents required by a document. For example, an ApplicationConfiguration document requires an ApplicationConfigurationSchema document.
    */
  var Requires: js.UndefOr[DocumentRequiresList] = js.native
  
  /**
    * The status of the Systems Manager document, such as Creating, Active, Updating, Failed, and Deleting.
    */
  var Status: js.UndefOr[DocumentStatus] = js.native
  
  /**
    * A message returned by AWS Systems Manager that explains the Status value. For example, a Failed status might be explained by the StatusInformation message, "The specified S3 bucket does not exist. Verify that the URL of the S3 bucket is correct."
    */
  var StatusInformation: js.UndefOr[DocumentStatusInformation] = js.native
  
  /**
    * The version of the artifact associated with the document. For example, "Release 12, Update 6". This value is unique across all versions of a document, and cannot be changed.
    */
  var VersionName: js.UndefOr[DocumentVersionName] = js.native
}
object GetDocumentResult {
  
  @scala.inline
  def apply(): GetDocumentResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDocumentResult]
  }
  
  @scala.inline
  implicit class GetDocumentResultMutableBuilder[Self <: GetDocumentResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttachmentsContent(value: AttachmentContentList): Self = StObject.set(x, "AttachmentsContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttachmentsContentUndefined: Self = StObject.set(x, "AttachmentsContent", js.undefined)
    
    @scala.inline
    def setAttachmentsContentVarargs(value: AttachmentContent*): Self = StObject.set(x, "AttachmentsContent", js.Array(value :_*))
    
    @scala.inline
    def setContent(value: DocumentContent): Self = StObject.set(x, "Content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentUndefined: Self = StObject.set(x, "Content", js.undefined)
    
    @scala.inline
    def setDocumentFormat(value: DocumentFormat): Self = StObject.set(x, "DocumentFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentFormatUndefined: Self = StObject.set(x, "DocumentFormat", js.undefined)
    
    @scala.inline
    def setDocumentType(value: DocumentType): Self = StObject.set(x, "DocumentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentTypeUndefined: Self = StObject.set(x, "DocumentType", js.undefined)
    
    @scala.inline
    def setDocumentVersion(value: DocumentVersion): Self = StObject.set(x, "DocumentVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentVersionUndefined: Self = StObject.set(x, "DocumentVersion", js.undefined)
    
    @scala.inline
    def setName(value: DocumentARN): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setRequires(value: DocumentRequiresList): Self = StObject.set(x, "Requires", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiresUndefined: Self = StObject.set(x, "Requires", js.undefined)
    
    @scala.inline
    def setRequiresVarargs(value: DocumentRequires*): Self = StObject.set(x, "Requires", js.Array(value :_*))
    
    @scala.inline
    def setStatus(value: DocumentStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusInformation(value: DocumentStatusInformation): Self = StObject.set(x, "StatusInformation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusInformationUndefined: Self = StObject.set(x, "StatusInformation", js.undefined)
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    @scala.inline
    def setVersionName(value: DocumentVersionName): Self = StObject.set(x, "VersionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionNameUndefined: Self = StObject.set(x, "VersionName", js.undefined)
  }
}
