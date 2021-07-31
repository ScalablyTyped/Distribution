package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentDescription extends StObject {
  
  /**
    * Details about the document attachments, including names, locations, sizes, and so on.
    */
  var AttachmentsInformation: js.UndefOr[AttachmentInformationList] = js.undefined
  
  /**
    * The date when the document was created.
    */
  var CreatedDate: js.UndefOr[DateTime] = js.undefined
  
  /**
    * The default version.
    */
  var DefaultVersion: js.UndefOr[DocumentVersion] = js.undefined
  
  /**
    * A description of the document. 
    */
  var Description: js.UndefOr[DescriptionInDocument] = js.undefined
  
  /**
    * The document format, either JSON or YAML.
    */
  var DocumentFormat: js.UndefOr[typings.awsSdk.ssmMod.DocumentFormat] = js.undefined
  
  /**
    * The type of document.
    */
  var DocumentType: js.UndefOr[typings.awsSdk.ssmMod.DocumentType] = js.undefined
  
  /**
    * The document version.
    */
  var DocumentVersion: js.UndefOr[typings.awsSdk.ssmMod.DocumentVersion] = js.undefined
  
  /**
    * The Sha256 or Sha1 hash created by the system when the document was created.   Sha1 hashes have been deprecated. 
    */
  var Hash: js.UndefOr[DocumentHash] = js.undefined
  
  /**
    * The hash type of the document. Valid values include Sha256 or Sha1.  Sha1 hashes have been deprecated. 
    */
  var HashType: js.UndefOr[DocumentHashType] = js.undefined
  
  /**
    * The latest version of the document.
    */
  var LatestVersion: js.UndefOr[DocumentVersion] = js.undefined
  
  /**
    * The name of the Systems Manager document.
    */
  var Name: js.UndefOr[DocumentARN] = js.undefined
  
  /**
    * The AWS user account that created the document.
    */
  var Owner: js.UndefOr[DocumentOwner] = js.undefined
  
  /**
    * A description of the parameters for a document.
    */
  var Parameters: js.UndefOr[DocumentParameterList] = js.undefined
  
  /**
    * The list of OS platforms compatible with this Systems Manager document. 
    */
  var PlatformTypes: js.UndefOr[PlatformTypeList] = js.undefined
  
  /**
    * A list of SSM documents required by a document. For example, an ApplicationConfiguration document requires an ApplicationConfigurationSchema document.
    */
  var Requires: js.UndefOr[DocumentRequiresList] = js.undefined
  
  /**
    * The schema version.
    */
  var SchemaVersion: js.UndefOr[DocumentSchemaVersion] = js.undefined
  
  /**
    * The SHA1 hash of the document, which you can use for verification.
    */
  var Sha1: js.UndefOr[DocumentSha1] = js.undefined
  
  /**
    * The status of the Systems Manager document.
    */
  var Status: js.UndefOr[DocumentStatus] = js.undefined
  
  /**
    * A message returned by AWS Systems Manager that explains the Status value. For example, a Failed status might be explained by the StatusInformation message, "The specified S3 bucket does not exist. Verify that the URL of the S3 bucket is correct."
    */
  var StatusInformation: js.UndefOr[DocumentStatusInformation] = js.undefined
  
  /**
    * The tags, or metadata, that have been applied to the document.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * The target type which defines the kinds of resources the document can run on. For example, /AWS::EC2::Instance. For a list of valid resource types, see AWS resource and property types reference in the AWS CloudFormation User Guide. 
    */
  var TargetType: js.UndefOr[typings.awsSdk.ssmMod.TargetType] = js.undefined
  
  /**
    * The version of the artifact associated with the document.
    */
  var VersionName: js.UndefOr[DocumentVersionName] = js.undefined
}
object DocumentDescription {
  
  @scala.inline
  def apply(): DocumentDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentDescription]
  }
  
  @scala.inline
  implicit class DocumentDescriptionMutableBuilder[Self <: DocumentDescription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttachmentsInformation(value: AttachmentInformationList): Self = StObject.set(x, "AttachmentsInformation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttachmentsInformationUndefined: Self = StObject.set(x, "AttachmentsInformation", js.undefined)
    
    @scala.inline
    def setAttachmentsInformationVarargs(value: AttachmentInformation*): Self = StObject.set(x, "AttachmentsInformation", js.Array(value :_*))
    
    @scala.inline
    def setCreatedDate(value: DateTime): Self = StObject.set(x, "CreatedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedDateUndefined: Self = StObject.set(x, "CreatedDate", js.undefined)
    
    @scala.inline
    def setDefaultVersion(value: DocumentVersion): Self = StObject.set(x, "DefaultVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultVersionUndefined: Self = StObject.set(x, "DefaultVersion", js.undefined)
    
    @scala.inline
    def setDescription(value: DescriptionInDocument): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
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
    def setHash(value: DocumentHash): Self = StObject.set(x, "Hash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHashType(value: DocumentHashType): Self = StObject.set(x, "HashType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHashTypeUndefined: Self = StObject.set(x, "HashType", js.undefined)
    
    @scala.inline
    def setHashUndefined: Self = StObject.set(x, "Hash", js.undefined)
    
    @scala.inline
    def setLatestVersion(value: DocumentVersion): Self = StObject.set(x, "LatestVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatestVersionUndefined: Self = StObject.set(x, "LatestVersion", js.undefined)
    
    @scala.inline
    def setName(value: DocumentARN): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setOwner(value: DocumentOwner): Self = StObject.set(x, "Owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "Owner", js.undefined)
    
    @scala.inline
    def setParameters(value: DocumentParameterList): Self = StObject.set(x, "Parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParametersUndefined: Self = StObject.set(x, "Parameters", js.undefined)
    
    @scala.inline
    def setParametersVarargs(value: DocumentParameter*): Self = StObject.set(x, "Parameters", js.Array(value :_*))
    
    @scala.inline
    def setPlatformTypes(value: PlatformTypeList): Self = StObject.set(x, "PlatformTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatformTypesUndefined: Self = StObject.set(x, "PlatformTypes", js.undefined)
    
    @scala.inline
    def setPlatformTypesVarargs(value: PlatformType*): Self = StObject.set(x, "PlatformTypes", js.Array(value :_*))
    
    @scala.inline
    def setRequires(value: DocumentRequiresList): Self = StObject.set(x, "Requires", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiresUndefined: Self = StObject.set(x, "Requires", js.undefined)
    
    @scala.inline
    def setRequiresVarargs(value: DocumentRequires*): Self = StObject.set(x, "Requires", js.Array(value :_*))
    
    @scala.inline
    def setSchemaVersion(value: DocumentSchemaVersion): Self = StObject.set(x, "SchemaVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaVersionUndefined: Self = StObject.set(x, "SchemaVersion", js.undefined)
    
    @scala.inline
    def setSha1(value: DocumentSha1): Self = StObject.set(x, "Sha1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSha1Undefined: Self = StObject.set(x, "Sha1", js.undefined)
    
    @scala.inline
    def setStatus(value: DocumentStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusInformation(value: DocumentStatusInformation): Self = StObject.set(x, "StatusInformation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusInformationUndefined: Self = StObject.set(x, "StatusInformation", js.undefined)
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
    
    @scala.inline
    def setTargetType(value: TargetType): Self = StObject.set(x, "TargetType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetTypeUndefined: Self = StObject.set(x, "TargetType", js.undefined)
    
    @scala.inline
    def setVersionName(value: DocumentVersionName): Self = StObject.set(x, "VersionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionNameUndefined: Self = StObject.set(x, "VersionName", js.undefined)
  }
}
