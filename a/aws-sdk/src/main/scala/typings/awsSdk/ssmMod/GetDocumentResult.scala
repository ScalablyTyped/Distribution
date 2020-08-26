package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDocumentResult extends js.Object {
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
  implicit class GetDocumentResultOps[Self <: GetDocumentResult] (val x: Self) extends AnyVal {
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
    def setAttachmentsContentVarargs(value: AttachmentContent*): Self = this.set("AttachmentsContent", js.Array(value :_*))
    @scala.inline
    def setAttachmentsContent(value: AttachmentContentList): Self = this.set("AttachmentsContent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttachmentsContent: Self = this.set("AttachmentsContent", js.undefined)
    @scala.inline
    def setContent(value: DocumentContent): Self = this.set("Content", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContent: Self = this.set("Content", js.undefined)
    @scala.inline
    def setDocumentFormat(value: DocumentFormat): Self = this.set("DocumentFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDocumentFormat: Self = this.set("DocumentFormat", js.undefined)
    @scala.inline
    def setDocumentType(value: DocumentType): Self = this.set("DocumentType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDocumentType: Self = this.set("DocumentType", js.undefined)
    @scala.inline
    def setDocumentVersion(value: DocumentVersion): Self = this.set("DocumentVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDocumentVersion: Self = this.set("DocumentVersion", js.undefined)
    @scala.inline
    def setName(value: DocumentARN): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    @scala.inline
    def setRequiresVarargs(value: DocumentRequires*): Self = this.set("Requires", js.Array(value :_*))
    @scala.inline
    def setRequires(value: DocumentRequiresList): Self = this.set("Requires", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequires: Self = this.set("Requires", js.undefined)
    @scala.inline
    def setStatus(value: DocumentStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    @scala.inline
    def setStatusInformation(value: DocumentStatusInformation): Self = this.set("StatusInformation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatusInformation: Self = this.set("StatusInformation", js.undefined)
    @scala.inline
    def setVersionName(value: DocumentVersionName): Self = this.set("VersionName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersionName: Self = this.set("VersionName", js.undefined)
  }
  
}

