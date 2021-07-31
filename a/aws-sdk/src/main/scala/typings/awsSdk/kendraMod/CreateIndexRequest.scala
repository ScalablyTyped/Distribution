package typings.awsSdk.kendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateIndexRequest extends StObject {
  
  /**
    * A token that you provide to identify the request to create an index. Multiple calls to the CreateIndex operation with the same client token will create only one index.
    */
  var ClientToken: js.UndefOr[ClientTokenName] = js.undefined
  
  /**
    * A description for the index.
    */
  var Description: js.UndefOr[typings.awsSdk.kendraMod.Description] = js.undefined
  
  /**
    * The Amazon Kendra edition to use for the index. Choose DEVELOPER_EDITION for indexes intended for development, testing, or proof of concept. Use ENTERPRISE_EDITION for your production databases. Once you set the edition for an index, it can't be changed.  The Edition parameter is optional. If you don't supply a value, the default is ENTERPRISE_EDITION.
    */
  var Edition: js.UndefOr[IndexEdition] = js.undefined
  
  /**
    * The name for the new index.
    */
  var Name: IndexName
  
  /**
    * An AWS Identity and Access Management (IAM) role that gives Amazon Kendra permissions to access your Amazon CloudWatch logs and metrics. This is also the role used when you use the BatchPutDocument operation to index documents from an Amazon S3 bucket.
    */
  var RoleArn: typings.awsSdk.kendraMod.RoleArn
  
  /**
    * The identifier of the AWS KMS customer managed key (CMK) to use to encrypt data indexed by Amazon Kendra. Amazon Kendra doesn't support asymmetric CMKs.
    */
  var ServerSideEncryptionConfiguration: js.UndefOr[typings.awsSdk.kendraMod.ServerSideEncryptionConfiguration] = js.undefined
  
  /**
    * A list of key-value pairs that identify the index. You can use the tags to identify and organize your resources and to control access to resources.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * The user context policy.  ATTRIBUTE_FILTER  All indexed content is searchable and displayable for all users. If there is an access control list, it is ignored. You can filter on user and group attributes.   USER_TOKEN  Enables SSO and token-based user access control. All documents with no access control and all documents accessible to the user will be searchable and displayable.   
    */
  var UserContextPolicy: js.UndefOr[typings.awsSdk.kendraMod.UserContextPolicy] = js.undefined
  
  /**
    * The user token configuration.
    */
  var UserTokenConfigurations: js.UndefOr[UserTokenConfigurationList] = js.undefined
}
object CreateIndexRequest {
  
  @scala.inline
  def apply(Name: IndexName, RoleArn: RoleArn): CreateIndexRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], RoleArn = RoleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateIndexRequest]
  }
  
  @scala.inline
  implicit class CreateIndexRequestMutableBuilder[Self <: CreateIndexRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientToken(value: ClientTokenName): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    @scala.inline
    def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setEdition(value: IndexEdition): Self = StObject.set(x, "Edition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditionUndefined: Self = StObject.set(x, "Edition", js.undefined)
    
    @scala.inline
    def setName(value: IndexName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleArn(value: RoleArn): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerSideEncryptionConfiguration(value: ServerSideEncryptionConfiguration): Self = StObject.set(x, "ServerSideEncryptionConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerSideEncryptionConfigurationUndefined: Self = StObject.set(x, "ServerSideEncryptionConfiguration", js.undefined)
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
    
    @scala.inline
    def setUserContextPolicy(value: UserContextPolicy): Self = StObject.set(x, "UserContextPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserContextPolicyUndefined: Self = StObject.set(x, "UserContextPolicy", js.undefined)
    
    @scala.inline
    def setUserTokenConfigurations(value: UserTokenConfigurationList): Self = StObject.set(x, "UserTokenConfigurations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserTokenConfigurationsUndefined: Self = StObject.set(x, "UserTokenConfigurations", js.undefined)
    
    @scala.inline
    def setUserTokenConfigurationsVarargs(value: UserTokenConfiguration*): Self = StObject.set(x, "UserTokenConfigurations", js.Array(value :_*))
  }
}
