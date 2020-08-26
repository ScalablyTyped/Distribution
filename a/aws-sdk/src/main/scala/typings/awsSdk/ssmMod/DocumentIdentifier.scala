package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DocumentIdentifier extends js.Object {
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
    * The AWS user account that created the document.
    */
  var Owner: js.UndefOr[DocumentOwner] = js.native
  /**
    * The operating system platform. 
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
    * The tags, or metadata, that have been applied to the document.
    */
  var Tags: js.UndefOr[TagList] = js.native
  /**
    * The target type which defines the kinds of resources the document can run on. For example, /AWS::EC2::Instance. For a list of valid resource types, see AWS resource and property types reference in the AWS CloudFormation User Guide. 
    */
  var TargetType: js.UndefOr[typings.awsSdk.ssmMod.TargetType] = js.native
  /**
    * An optional field specifying the version of the artifact associated with the document. For example, "Release 12, Update 6". This value is unique across all versions of a document, and cannot be changed.
    */
  var VersionName: js.UndefOr[DocumentVersionName] = js.native
}

object DocumentIdentifier {
  @scala.inline
  def apply(): DocumentIdentifier = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentIdentifier]
  }
  @scala.inline
  implicit class DocumentIdentifierOps[Self <: DocumentIdentifier] (val x: Self) extends AnyVal {
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
    def setOwner(value: DocumentOwner): Self = this.set("Owner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwner: Self = this.set("Owner", js.undefined)
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

