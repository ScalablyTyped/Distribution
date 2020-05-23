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
  def apply(
    AttachmentsContent: AttachmentContentList = null,
    Content: DocumentContent = null,
    DocumentFormat: DocumentFormat = null,
    DocumentType: DocumentType = null,
    DocumentVersion: DocumentVersion = null,
    Name: DocumentARN = null,
    Requires: DocumentRequiresList = null,
    Status: DocumentStatus = null,
    StatusInformation: DocumentStatusInformation = null,
    VersionName: DocumentVersionName = null
  ): GetDocumentResult = {
    val __obj = js.Dynamic.literal()
    if (AttachmentsContent != null) __obj.updateDynamic("AttachmentsContent")(AttachmentsContent.asInstanceOf[js.Any])
    if (Content != null) __obj.updateDynamic("Content")(Content.asInstanceOf[js.Any])
    if (DocumentFormat != null) __obj.updateDynamic("DocumentFormat")(DocumentFormat.asInstanceOf[js.Any])
    if (DocumentType != null) __obj.updateDynamic("DocumentType")(DocumentType.asInstanceOf[js.Any])
    if (DocumentVersion != null) __obj.updateDynamic("DocumentVersion")(DocumentVersion.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (Requires != null) __obj.updateDynamic("Requires")(Requires.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (StatusInformation != null) __obj.updateDynamic("StatusInformation")(StatusInformation.asInstanceOf[js.Any])
    if (VersionName != null) __obj.updateDynamic("VersionName")(VersionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDocumentResult]
  }
}

