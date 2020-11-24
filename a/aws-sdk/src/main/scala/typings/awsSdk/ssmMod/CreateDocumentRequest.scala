package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateDocumentRequest extends js.Object {
  
  /**
    * A list of key and value pairs that describe attachments to a version of a document.
    */
  var Attachments: js.UndefOr[AttachmentsSourceList] = js.native
  
  /**
    * The content for the new SSM document in JSON or YAML format. We recommend storing the contents for your new document in an external JSON or YAML file and referencing the file in a command. For examples, see the following topics in the AWS Systems Manager User Guide.    Create an SSM document (AWS API)     Create an SSM document (AWS CLI)     Create an SSM document (API)   
    */
  var Content: DocumentContent = js.native
  
  /**
    * Specify the document format for the request. The document format can be JSON, YAML, or TEXT. JSON is the default format.
    */
  var DocumentFormat: js.UndefOr[typings.awsSdk.ssmMod.DocumentFormat] = js.native
  
  /**
    * The type of document to create.
    */
  var DocumentType: js.UndefOr[typings.awsSdk.ssmMod.DocumentType] = js.native
  
  /**
    * A name for the Systems Manager document.  You can't use the following strings as document name prefixes. These are reserved by AWS for use as document name prefixes:    aws-     amazon     amzn    
    */
  var Name: DocumentName = js.native
  
  /**
    * A list of SSM documents required by a document. This parameter is used exclusively by AWS AppConfig. When a user creates an AppConfig configuration in an SSM document, the user must also specify a required document for validation purposes. In this case, an ApplicationConfiguration document requires an ApplicationConfigurationSchema document for validation purposes. For more information, see AWS AppConfig in the AWS Systems Manager User Guide.
    */
  var Requires: js.UndefOr[DocumentRequiresList] = js.native
  
  /**
    * Optional metadata that you assign to a resource. Tags enable you to categorize a resource in different ways, such as by purpose, owner, or environment. For example, you might want to tag an SSM document to identify the types of targets or the environment where it will run. In this case, you could specify the following key name/value pairs:    Key=OS,Value=Windows     Key=Environment,Value=Production     To add tags to an existing SSM document, use the AddTagsToResource action. 
    */
  var Tags: js.UndefOr[TagList] = js.native
  
  /**
    * Specify a target type to define the kinds of resources the document can run on. For example, to run a document on EC2 instances, specify the following value: /AWS::EC2::Instance. If you specify a value of '/' the document can run on all types of resources. If you don't specify a value, the document can't run on any resources. For a list of valid resource types, see AWS resource and property types reference in the AWS CloudFormation User Guide. 
    */
  var TargetType: js.UndefOr[typings.awsSdk.ssmMod.TargetType] = js.native
  
  /**
    * An optional field specifying the version of the artifact you are creating with the document. For example, "Release 12, Update 6". This value is unique across all versions of a document, and cannot be changed.
    */
  var VersionName: js.UndefOr[DocumentVersionName] = js.native
}
object CreateDocumentRequest {
  
  @scala.inline
  def apply(Content: DocumentContent, Name: DocumentName): CreateDocumentRequest = {
    val __obj = js.Dynamic.literal(Content = Content.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDocumentRequest]
  }
  
  @scala.inline
  implicit class CreateDocumentRequestOps[Self <: CreateDocumentRequest] (val x: Self) extends AnyVal {
    
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
    def setContent(value: DocumentContent): Self = this.set("Content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: DocumentName): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttachmentsVarargs(value: AttachmentsSource*): Self = this.set("Attachments", js.Array(value :_*))
    
    @scala.inline
    def setAttachments(value: AttachmentsSourceList): Self = this.set("Attachments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttachments: Self = this.set("Attachments", js.undefined)
    
    @scala.inline
    def setDocumentFormat(value: DocumentFormat): Self = this.set("DocumentFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocumentFormat: Self = this.set("DocumentFormat", js.undefined)
    
    @scala.inline
    def setDocumentType(value: DocumentType): Self = this.set("DocumentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocumentType: Self = this.set("DocumentType", js.undefined)
    
    @scala.inline
    def setRequiresVarargs(value: DocumentRequires*): Self = this.set("Requires", js.Array(value :_*))
    
    @scala.inline
    def setRequires(value: DocumentRequiresList): Self = this.set("Requires", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequires: Self = this.set("Requires", js.undefined)
    
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
