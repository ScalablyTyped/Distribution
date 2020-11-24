package typings.awsSdk.kendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateIndexRequest extends js.Object {
  
  /**
    * A token that you provide to identify the request to create an index. Multiple calls to the CreateIndex operation with the same client token will create only one index.
    */
  var ClientToken: js.UndefOr[ClientTokenName] = js.native
  
  /**
    * A description for the index.
    */
  var Description: js.UndefOr[typings.awsSdk.kendraMod.Description] = js.native
  
  /**
    * The Amazon Kendra edition to use for the index. Choose DEVELOPER_EDITION for indexes intended for development, testing, or proof of concept. Use ENTERPRISE_EDITION for your production databases. Once you set the edition for an index, it can't be changed.  The Edition parameter is optional. If you don't supply a value, the default is ENTERPRISE_EDITION.
    */
  var Edition: js.UndefOr[IndexEdition] = js.native
  
  /**
    * The name for the new index.
    */
  var Name: IndexName = js.native
  
  /**
    * An AWS Identity and Access Management (IAM) role that gives Amazon Kendra permissions to access your Amazon CloudWatch logs and metrics. This is also the role used when you use the BatchPutDocument operation to index documents from an Amazon S3 bucket.
    */
  var RoleArn: typings.awsSdk.kendraMod.RoleArn = js.native
  
  /**
    * The identifier of the AWS KMS customer managed key (CMK) to use to encrypt data indexed by Amazon Kendra. Amazon Kendra doesn't support asymmetric CMKs.
    */
  var ServerSideEncryptionConfiguration: js.UndefOr[typings.awsSdk.kendraMod.ServerSideEncryptionConfiguration] = js.native
  
  /**
    * A list of key-value pairs that identify the index. You can use the tags to identify and organize your resources and to control access to resources.
    */
  var Tags: js.UndefOr[TagList] = js.native
  
  /**
    * The user context policy.  ATTRIBUTE_FILTER  All indexed content is searchable and displayable for all users. If there is an access control list, it is ignored. You can filter on user and group attributes.   USER_TOKEN  Enables SSO and token-based user access control. All documents with no access control and all documents accessible to the user will be searchable and displayable.   
    */
  var UserContextPolicy: js.UndefOr[typings.awsSdk.kendraMod.UserContextPolicy] = js.native
  
  /**
    * The user token configuration.
    */
  var UserTokenConfigurations: js.UndefOr[UserTokenConfigurationList] = js.native
}
object CreateIndexRequest {
  
  @scala.inline
  def apply(Name: IndexName, RoleArn: RoleArn): CreateIndexRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], RoleArn = RoleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateIndexRequest]
  }
  
  @scala.inline
  implicit class CreateIndexRequestOps[Self <: CreateIndexRequest] (val x: Self) extends AnyVal {
    
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
    def setName(value: IndexName): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleArn(value: RoleArn): Self = this.set("RoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientToken(value: ClientTokenName): Self = this.set("ClientToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientToken: Self = this.set("ClientToken", js.undefined)
    
    @scala.inline
    def setDescription(value: Description): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    
    @scala.inline
    def setEdition(value: IndexEdition): Self = this.set("Edition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEdition: Self = this.set("Edition", js.undefined)
    
    @scala.inline
    def setServerSideEncryptionConfiguration(value: ServerSideEncryptionConfiguration): Self = this.set("ServerSideEncryptionConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServerSideEncryptionConfiguration: Self = this.set("ServerSideEncryptionConfiguration", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: TagList): Self = this.set("Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
    
    @scala.inline
    def setUserContextPolicy(value: UserContextPolicy): Self = this.set("UserContextPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserContextPolicy: Self = this.set("UserContextPolicy", js.undefined)
    
    @scala.inline
    def setUserTokenConfigurationsVarargs(value: UserTokenConfiguration*): Self = this.set("UserTokenConfigurations", js.Array(value :_*))
    
    @scala.inline
    def setUserTokenConfigurations(value: UserTokenConfigurationList): Self = this.set("UserTokenConfigurations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserTokenConfigurations: Self = this.set("UserTokenConfigurations", js.undefined)
  }
}
