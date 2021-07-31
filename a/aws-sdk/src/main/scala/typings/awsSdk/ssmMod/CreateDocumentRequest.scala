package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDocumentRequest extends StObject {
  
  /**
    * A list of key and value pairs that describe attachments to a version of a document.
    */
  var Attachments: js.UndefOr[AttachmentsSourceList] = js.undefined
  
  /**
    * The content for the new SSM document in JSON or YAML format. We recommend storing the contents for your new document in an external JSON or YAML file and referencing the file in a command. For examples, see the following topics in the AWS Systems Manager User Guide.    Create an SSM document (AWS API)     Create an SSM document (AWS CLI)     Create an SSM document (API)   
    */
  var Content: DocumentContent
  
  /**
    * Specify the document format for the request. The document format can be JSON, YAML, or TEXT. JSON is the default format.
    */
  var DocumentFormat: js.UndefOr[typings.awsSdk.ssmMod.DocumentFormat] = js.undefined
  
  /**
    * The type of document to create.
    */
  var DocumentType: js.UndefOr[typings.awsSdk.ssmMod.DocumentType] = js.undefined
  
  /**
    * A name for the Systems Manager document.  You can't use the following strings as document name prefixes. These are reserved by AWS for use as document name prefixes:    aws-     amazon     amzn    
    */
  var Name: DocumentName
  
  /**
    * A list of SSM documents required by a document. This parameter is used exclusively by AWS AppConfig. When a user creates an AppConfig configuration in an SSM document, the user must also specify a required document for validation purposes. In this case, an ApplicationConfiguration document requires an ApplicationConfigurationSchema document for validation purposes. For more information, see AWS AppConfig in the AWS Systems Manager User Guide.
    */
  var Requires: js.UndefOr[DocumentRequiresList] = js.undefined
  
  /**
    * Optional metadata that you assign to a resource. Tags enable you to categorize a resource in different ways, such as by purpose, owner, or environment. For example, you might want to tag an SSM document to identify the types of targets or the environment where it will run. In this case, you could specify the following key name/value pairs:    Key=OS,Value=Windows     Key=Environment,Value=Production     To add tags to an existing SSM document, use the AddTagsToResource action. 
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * Specify a target type to define the kinds of resources the document can run on. For example, to run a document on EC2 instances, specify the following value: /AWS::EC2::Instance. If you specify a value of '/' the document can run on all types of resources. If you don't specify a value, the document can't run on any resources. For a list of valid resource types, see AWS resource and property types reference in the AWS CloudFormation User Guide. 
    */
  var TargetType: js.UndefOr[typings.awsSdk.ssmMod.TargetType] = js.undefined
  
  /**
    * An optional field specifying the version of the artifact you are creating with the document. For example, "Release 12, Update 6". This value is unique across all versions of a document, and cannot be changed.
    */
  var VersionName: js.UndefOr[DocumentVersionName] = js.undefined
}
object CreateDocumentRequest {
  
  @scala.inline
  def apply(Content: DocumentContent, Name: DocumentName): CreateDocumentRequest = {
    val __obj = js.Dynamic.literal(Content = Content.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDocumentRequest]
  }
  
  @scala.inline
  implicit class CreateDocumentRequestMutableBuilder[Self <: CreateDocumentRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttachments(value: AttachmentsSourceList): Self = StObject.set(x, "Attachments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttachmentsUndefined: Self = StObject.set(x, "Attachments", js.undefined)
    
    @scala.inline
    def setAttachmentsVarargs(value: AttachmentsSource*): Self = StObject.set(x, "Attachments", js.Array(value :_*))
    
    @scala.inline
    def setContent(value: DocumentContent): Self = StObject.set(x, "Content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentFormat(value: DocumentFormat): Self = StObject.set(x, "DocumentFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentFormatUndefined: Self = StObject.set(x, "DocumentFormat", js.undefined)
    
    @scala.inline
    def setDocumentType(value: DocumentType): Self = StObject.set(x, "DocumentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentTypeUndefined: Self = StObject.set(x, "DocumentType", js.undefined)
    
    @scala.inline
    def setName(value: DocumentName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequires(value: DocumentRequiresList): Self = StObject.set(x, "Requires", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiresUndefined: Self = StObject.set(x, "Requires", js.undefined)
    
    @scala.inline
    def setRequiresVarargs(value: DocumentRequires*): Self = StObject.set(x, "Requires", js.Array(value :_*))
    
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
