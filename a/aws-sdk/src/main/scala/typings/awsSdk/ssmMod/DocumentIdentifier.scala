package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentIdentifier extends StObject {
  
  /**
    * The document format, either JSON or YAML.
    */
  var DocumentFormat: js.UndefOr[typings.awsSdk.ssmMod.DocumentFormat] = js.undefined
  
  /**
    * The document type.
    */
  var DocumentType: js.UndefOr[typings.awsSdk.ssmMod.DocumentType] = js.undefined
  
  /**
    * The document version.
    */
  var DocumentVersion: js.UndefOr[typings.awsSdk.ssmMod.DocumentVersion] = js.undefined
  
  /**
    * The name of the Systems Manager document.
    */
  var Name: js.UndefOr[DocumentARN] = js.undefined
  
  /**
    * The AWS user account that created the document.
    */
  var Owner: js.UndefOr[DocumentOwner] = js.undefined
  
  /**
    * The operating system platform. 
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
    * The tags, or metadata, that have been applied to the document.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * The target type which defines the kinds of resources the document can run on. For example, /AWS::EC2::Instance. For a list of valid resource types, see AWS resource and property types reference in the AWS CloudFormation User Guide. 
    */
  var TargetType: js.UndefOr[typings.awsSdk.ssmMod.TargetType] = js.undefined
  
  /**
    * An optional field specifying the version of the artifact associated with the document. For example, "Release 12, Update 6". This value is unique across all versions of a document, and cannot be changed.
    */
  var VersionName: js.UndefOr[DocumentVersionName] = js.undefined
}
object DocumentIdentifier {
  
  @scala.inline
  def apply(): DocumentIdentifier = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentIdentifier]
  }
  
  @scala.inline
  implicit class DocumentIdentifierMutableBuilder[Self <: DocumentIdentifier] (val x: Self) extends AnyVal {
    
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
    def setOwner(value: DocumentOwner): Self = StObject.set(x, "Owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "Owner", js.undefined)
    
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
