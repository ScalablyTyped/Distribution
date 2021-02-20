package typings.awsSdk.kendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeIndexResponse extends StObject {
  
  /**
    * For enterprise edtion indexes, you can choose to use additional capacity to meet the needs of your application. This contains the capacity units used for the index. A 0 for the query capacity or the storage capacity indicates that the index is using the default capacity for the index.
    */
  var CapacityUnits: js.UndefOr[CapacityUnitsConfiguration] = js.native
  
  /**
    * The Unix datetime that the index was created.
    */
  var CreatedAt: js.UndefOr[Timestamp] = js.native
  
  /**
    * The description of the index.
    */
  var Description: js.UndefOr[typings.awsSdk.kendraMod.Description] = js.native
  
  /**
    * Configuration settings for any metadata applied to the documents in the index.
    */
  var DocumentMetadataConfigurations: js.UndefOr[DocumentMetadataConfigurationList] = js.native
  
  /**
    * The Amazon Kendra edition used for the index. You decide the edition when you create the index.
    */
  var Edition: js.UndefOr[IndexEdition] = js.native
  
  /**
    * When th eStatus field value is FAILED, the ErrorMessage field contains a message that explains why.
    */
  var ErrorMessage: js.UndefOr[typings.awsSdk.kendraMod.ErrorMessage] = js.native
  
  /**
    * the name of the index.
    */
  var Id: js.UndefOr[IndexId] = js.native
  
  /**
    * Provides information about the number of FAQ questions and answers and the number of text documents indexed.
    */
  var IndexStatistics: js.UndefOr[typings.awsSdk.kendraMod.IndexStatistics] = js.native
  
  /**
    * The name of the index.
    */
  var Name: js.UndefOr[IndexName] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the IAM role that gives Amazon Kendra permission to write to your Amazon Cloudwatch logs.
    */
  var RoleArn: js.UndefOr[typings.awsSdk.kendraMod.RoleArn] = js.native
  
  /**
    * The identifier of the AWS KMS customer master key (CMK) used to encrypt your data. Amazon Kendra doesn't support asymmetric CMKs.
    */
  var ServerSideEncryptionConfiguration: js.UndefOr[typings.awsSdk.kendraMod.ServerSideEncryptionConfiguration] = js.native
  
  /**
    * The current status of the index. When the value is ACTIVE, the index is ready for use. If the Status field value is FAILED, the ErrorMessage field contains a message that explains why.
    */
  var Status: js.UndefOr[IndexStatus] = js.native
  
  /**
    * The Unix datetime that the index was last updated.
    */
  var UpdatedAt: js.UndefOr[Timestamp] = js.native
  
  /**
    * The user context policy for the Amazon Kendra index.
    */
  var UserContextPolicy: js.UndefOr[typings.awsSdk.kendraMod.UserContextPolicy] = js.native
  
  /**
    * The user token configuration for the Amazon Kendra index.
    */
  var UserTokenConfigurations: js.UndefOr[UserTokenConfigurationList] = js.native
}
object DescribeIndexResponse {
  
  @scala.inline
  def apply(): DescribeIndexResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeIndexResponse]
  }
  
  @scala.inline
  implicit class DescribeIndexResponseMutableBuilder[Self <: DescribeIndexResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCapacityUnits(value: CapacityUnitsConfiguration): Self = StObject.set(x, "CapacityUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCapacityUnitsUndefined: Self = StObject.set(x, "CapacityUnits", js.undefined)
    
    @scala.inline
    def setCreatedAt(value: Timestamp): Self = StObject.set(x, "CreatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedAtUndefined: Self = StObject.set(x, "CreatedAt", js.undefined)
    
    @scala.inline
    def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setDocumentMetadataConfigurations(value: DocumentMetadataConfigurationList): Self = StObject.set(x, "DocumentMetadataConfigurations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentMetadataConfigurationsUndefined: Self = StObject.set(x, "DocumentMetadataConfigurations", js.undefined)
    
    @scala.inline
    def setDocumentMetadataConfigurationsVarargs(value: DocumentMetadataConfiguration*): Self = StObject.set(x, "DocumentMetadataConfigurations", js.Array(value :_*))
    
    @scala.inline
    def setEdition(value: IndexEdition): Self = StObject.set(x, "Edition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditionUndefined: Self = StObject.set(x, "Edition", js.undefined)
    
    @scala.inline
    def setErrorMessage(value: ErrorMessage): Self = StObject.set(x, "ErrorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorMessageUndefined: Self = StObject.set(x, "ErrorMessage", js.undefined)
    
    @scala.inline
    def setId(value: IndexId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    @scala.inline
    def setIndexStatistics(value: IndexStatistics): Self = StObject.set(x, "IndexStatistics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexStatisticsUndefined: Self = StObject.set(x, "IndexStatistics", js.undefined)
    
    @scala.inline
    def setName(value: IndexName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setRoleArn(value: RoleArn): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleArnUndefined: Self = StObject.set(x, "RoleArn", js.undefined)
    
    @scala.inline
    def setServerSideEncryptionConfiguration(value: ServerSideEncryptionConfiguration): Self = StObject.set(x, "ServerSideEncryptionConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerSideEncryptionConfigurationUndefined: Self = StObject.set(x, "ServerSideEncryptionConfiguration", js.undefined)
    
    @scala.inline
    def setStatus(value: IndexStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    @scala.inline
    def setUpdatedAt(value: Timestamp): Self = StObject.set(x, "UpdatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedAtUndefined: Self = StObject.set(x, "UpdatedAt", js.undefined)
    
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
