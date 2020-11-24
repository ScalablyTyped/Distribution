package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DocumentDescription extends js.Object {
  
  /**
    * Details about the document attachments, including names, locations, sizes, and so on.
    */
  var AttachmentsInformation: js.UndefOr[AttachmentInformationList] = js.native
  
  /**
    * The date when the document was created.
    */
  var CreatedDate: js.UndefOr[DateTime] = js.native
  
  /**
    * The default version.
    */
  var DefaultVersion: js.UndefOr[DocumentVersion] = js.native
  
  /**
    * A description of the document. 
    */
  var Description: js.UndefOr[DescriptionInDocument] = js.native
  
  /**
    * The document format, either JSON or YAML.
    */
  var DocumentFormat: js.UndefOr[typings.awsSdk.ssmMod.DocumentFormat] = js.native
  
  /**
    * The type of document.
    */
  var DocumentType: js.UndefOr[typings.awsSdk.ssmMod.DocumentType] = js.native
  
  /**
    * The document version.
    */
  var DocumentVersion: js.UndefOr[typings.awsSdk.ssmMod.DocumentVersion] = js.native
  
  /**
    * The Sha256 or Sha1 hash created by the system when the document was created.   Sha1 hashes have been deprecated. 
    */
  var Hash: js.UndefOr[DocumentHash] = js.native
  
  /**
    * The hash type of the document. Valid values include Sha256 or Sha1.  Sha1 hashes have been deprecated. 
    */
  var HashType: js.UndefOr[DocumentHashType] = js.native
  
  /**
    * The latest version of the document.
    */
  var LatestVersion: js.UndefOr[DocumentVersion] = js.native
  
  /**
    * The name of the Systems Manager document.
    */
  var Name: js.UndefOr[DocumentARN] = js.native
  
  /**
    * The AWS user account that created the document.
    */
  var Owner: js.UndefOr[DocumentOwner] = js.native
  
  /**
    * A description of the parameters for a document.
    */
  var Parameters: js.UndefOr[DocumentParameterList] = js.native
  
  /**
    * The list of OS platforms compatible with this Systems Manager document. 
    */
  var PlatformTypes: js.UndefOr[PlatformTypeList] = js.native
  
  /**
    * A list of SSM documents required by a document. For example, an ApplicationConfiguration document requires an ApplicationConfigurationSchema document.
    */
  var Requires: js.UndefOr[DocumentRequiresList] = js.native
  
  /**
    * The schema version.
    */
  var SchemaVersion: js.UndefOr[DocumentSchemaVersion] = js.native
  
  /**
    * The SHA1 hash of the document, which you can use for verification.
    */
  var Sha1: js.UndefOr[DocumentSha1] = js.native
  
  /**
    * The status of the Systems Manager document.
    */
  var Status: js.UndefOr[DocumentStatus] = js.native
  
  /**
    * A message returned by AWS Systems Manager that explains the Status value. For example, a Failed status might be explained by the StatusInformation message, "The specified S3 bucket does not exist. Verify that the URL of the S3 bucket is correct."
    */
  var StatusInformation: js.UndefOr[DocumentStatusInformation] = js.native
  
  /**
    * The tags, or metadata, that have been applied to the document.
    */
  var Tags: js.UndefOr[TagList] = js.native
  
  /**
    * The target type which defines the kinds of resources the document can run on. For example, /AWS::EC2::Instance. For a list of valid resource types, see AWS resource and property types reference in the AWS CloudFormation User Guide. 
    */
  var TargetType: js.UndefOr[typings.awsSdk.ssmMod.TargetType] = js.native
  
  /**
    * The version of the artifact associated with the document.
    */
  var VersionName: js.UndefOr[DocumentVersionName] = js.native
}
object DocumentDescription {
  
  @scala.inline
  def apply(): DocumentDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentDescription]
  }
  
  @scala.inline
  implicit class DocumentDescriptionOps[Self <: DocumentDescription] (val x: Self) extends AnyVal {
    
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
    def setAttachmentsInformationVarargs(value: AttachmentInformation*): Self = this.set("AttachmentsInformation", js.Array(value :_*))
    
    @scala.inline
    def setAttachmentsInformation(value: AttachmentInformationList): Self = this.set("AttachmentsInformation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttachmentsInformation: Self = this.set("AttachmentsInformation", js.undefined)
    
    @scala.inline
    def setCreatedDate(value: DateTime): Self = this.set("CreatedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedDate: Self = this.set("CreatedDate", js.undefined)
    
    @scala.inline
    def setDefaultVersion(value: DocumentVersion): Self = this.set("DefaultVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultVersion: Self = this.set("DefaultVersion", js.undefined)
    
    @scala.inline
    def setDescription(value: DescriptionInDocument): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    
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
    def setHash(value: DocumentHash): Self = this.set("Hash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHash: Self = this.set("Hash", js.undefined)
    
    @scala.inline
    def setHashType(value: DocumentHashType): Self = this.set("HashType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHashType: Self = this.set("HashType", js.undefined)
    
    @scala.inline
    def setLatestVersion(value: DocumentVersion): Self = this.set("LatestVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLatestVersion: Self = this.set("LatestVersion", js.undefined)
    
    @scala.inline
    def setName(value: DocumentARN): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    
    @scala.inline
    def setOwner(value: DocumentOwner): Self = this.set("Owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwner: Self = this.set("Owner", js.undefined)
    
    @scala.inline
    def setParametersVarargs(value: DocumentParameter*): Self = this.set("Parameters", js.Array(value :_*))
    
    @scala.inline
    def setParameters(value: DocumentParameterList): Self = this.set("Parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParameters: Self = this.set("Parameters", js.undefined)
    
    @scala.inline
    def setPlatformTypesVarargs(value: PlatformType*): Self = this.set("PlatformTypes", js.Array(value :_*))
    
    @scala.inline
    def setPlatformTypes(value: PlatformTypeList): Self = this.set("PlatformTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlatformTypes: Self = this.set("PlatformTypes", js.undefined)
    
    @scala.inline
    def setRequiresVarargs(value: DocumentRequires*): Self = this.set("Requires", js.Array(value :_*))
    
    @scala.inline
    def setRequires(value: DocumentRequiresList): Self = this.set("Requires", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequires: Self = this.set("Requires", js.undefined)
    
    @scala.inline
    def setSchemaVersion(value: DocumentSchemaVersion): Self = this.set("SchemaVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSchemaVersion: Self = this.set("SchemaVersion", js.undefined)
    
    @scala.inline
    def setSha1(value: DocumentSha1): Self = this.set("Sha1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSha1: Self = this.set("Sha1", js.undefined)
    
    @scala.inline
    def setStatus(value: DocumentStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    
    @scala.inline
    def setStatusInformation(value: DocumentStatusInformation): Self = this.set("StatusInformation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatusInformation: Self = this.set("StatusInformation", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: TagList): Self = this.set("Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
    
    @scala.inline
    def setTargetType(value: TargetType): Self = this.set("TargetType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetType: Self = this.set("TargetType", js.undefined)
    
    @scala.inline
    def setVersionName(value: DocumentVersionName): Self = this.set("VersionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersionName: Self = this.set("VersionName", js.undefined)
  }
}
