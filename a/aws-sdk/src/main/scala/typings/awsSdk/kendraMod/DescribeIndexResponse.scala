package typings.awsSdk.kendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeIndexResponse extends StObject {
  
  /**
    * For Enterprise Edition indexes, you can choose to use additional capacity to meet the needs of your application. This contains the capacity units used for the index. A query or document storage capacity of zero indicates that the index is using the default capacity. For more information on the default capacity for an index and adjusting this, see Adjusting capacity.
    */
  var CapacityUnits: js.UndefOr[CapacityUnitsConfiguration] = js.undefined
  
  /**
    * The Unix datetime that the index was created.
    */
  var CreatedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The description for the index.
    */
  var Description: js.UndefOr[typings.awsSdk.kendraMod.Description] = js.undefined
  
  /**
    * Configuration information for document metadata or fields. Document metadata are fields or attributes associated with your documents. For example, the company department name associated with each document.
    */
  var DocumentMetadataConfigurations: js.UndefOr[DocumentMetadataConfigurationList] = js.undefined
  
  /**
    * The Amazon Kendra edition used for the index. You decide the edition when you create the index.
    */
  var Edition: js.UndefOr[IndexEdition] = js.undefined
  
  /**
    * When the Status field value is FAILED, the ErrorMessage field contains a message that explains why.
    */
  var ErrorMessage: js.UndefOr[typings.awsSdk.kendraMod.ErrorMessage] = js.undefined
  
  /**
    * The identifier of the index.
    */
  var Id: js.UndefOr[IndexId] = js.undefined
  
  /**
    * Provides information about the number of FAQ questions and answers and the number of text documents indexed.
    */
  var IndexStatistics: js.UndefOr[typings.awsSdk.kendraMod.IndexStatistics] = js.undefined
  
  /**
    * The name of the index.
    */
  var Name: js.UndefOr[IndexName] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the IAM role that gives Amazon Kendra permission to write to your Amazon Cloudwatch logs.
    */
  var RoleArn: js.UndefOr[typings.awsSdk.kendraMod.RoleArn] = js.undefined
  
  /**
    * The identifier of the KMScustomer master key (CMK) that is used to encrypt your data. Amazon Kendra doesn't support asymmetric CMKs.
    */
  var ServerSideEncryptionConfiguration: js.UndefOr[typings.awsSdk.kendraMod.ServerSideEncryptionConfiguration] = js.undefined
  
  /**
    * The current status of the index. When the value is ACTIVE, the index is ready for use. If the Status field value is FAILED, the ErrorMessage field contains a message that explains why.
    */
  var Status: js.UndefOr[IndexStatus] = js.undefined
  
  /**
    * The Unix datetime that the index was last updated.
    */
  var UpdatedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The user context policy for the Amazon Kendra index.
    */
  var UserContextPolicy: js.UndefOr[typings.awsSdk.kendraMod.UserContextPolicy] = js.undefined
  
  /**
    * Whether you have enabled the configuration for fetching access levels of groups and users from an Amazon Web Services Single Sign On identity source.
    */
  var UserGroupResolutionConfiguration: js.UndefOr[typings.awsSdk.kendraMod.UserGroupResolutionConfiguration] = js.undefined
  
  /**
    * The user token configuration for the Amazon Kendra index.
    */
  var UserTokenConfigurations: js.UndefOr[UserTokenConfigurationList] = js.undefined
}
object DescribeIndexResponse {
  
  inline def apply(): DescribeIndexResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeIndexResponse]
  }
  
  extension [Self <: DescribeIndexResponse](x: Self) {
    
    inline def setCapacityUnits(value: CapacityUnitsConfiguration): Self = StObject.set(x, "CapacityUnits", value.asInstanceOf[js.Any])
    
    inline def setCapacityUnitsUndefined: Self = StObject.set(x, "CapacityUnits", js.undefined)
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "CreatedAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "CreatedAt", js.undefined)
    
    inline def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setDocumentMetadataConfigurations(value: DocumentMetadataConfigurationList): Self = StObject.set(x, "DocumentMetadataConfigurations", value.asInstanceOf[js.Any])
    
    inline def setDocumentMetadataConfigurationsUndefined: Self = StObject.set(x, "DocumentMetadataConfigurations", js.undefined)
    
    inline def setDocumentMetadataConfigurationsVarargs(value: DocumentMetadataConfiguration*): Self = StObject.set(x, "DocumentMetadataConfigurations", js.Array(value*))
    
    inline def setEdition(value: IndexEdition): Self = StObject.set(x, "Edition", value.asInstanceOf[js.Any])
    
    inline def setEditionUndefined: Self = StObject.set(x, "Edition", js.undefined)
    
    inline def setErrorMessage(value: ErrorMessage): Self = StObject.set(x, "ErrorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "ErrorMessage", js.undefined)
    
    inline def setId(value: IndexId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setIndexStatistics(value: IndexStatistics): Self = StObject.set(x, "IndexStatistics", value.asInstanceOf[js.Any])
    
    inline def setIndexStatisticsUndefined: Self = StObject.set(x, "IndexStatistics", js.undefined)
    
    inline def setName(value: IndexName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setRoleArn(value: RoleArn): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    inline def setRoleArnUndefined: Self = StObject.set(x, "RoleArn", js.undefined)
    
    inline def setServerSideEncryptionConfiguration(value: ServerSideEncryptionConfiguration): Self = StObject.set(x, "ServerSideEncryptionConfiguration", value.asInstanceOf[js.Any])
    
    inline def setServerSideEncryptionConfigurationUndefined: Self = StObject.set(x, "ServerSideEncryptionConfiguration", js.undefined)
    
    inline def setStatus(value: IndexStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setUpdatedAt(value: js.Date): Self = StObject.set(x, "UpdatedAt", value.asInstanceOf[js.Any])
    
    inline def setUpdatedAtUndefined: Self = StObject.set(x, "UpdatedAt", js.undefined)
    
    inline def setUserContextPolicy(value: UserContextPolicy): Self = StObject.set(x, "UserContextPolicy", value.asInstanceOf[js.Any])
    
    inline def setUserContextPolicyUndefined: Self = StObject.set(x, "UserContextPolicy", js.undefined)
    
    inline def setUserGroupResolutionConfiguration(value: UserGroupResolutionConfiguration): Self = StObject.set(x, "UserGroupResolutionConfiguration", value.asInstanceOf[js.Any])
    
    inline def setUserGroupResolutionConfigurationUndefined: Self = StObject.set(x, "UserGroupResolutionConfiguration", js.undefined)
    
    inline def setUserTokenConfigurations(value: UserTokenConfigurationList): Self = StObject.set(x, "UserTokenConfigurations", value.asInstanceOf[js.Any])
    
    inline def setUserTokenConfigurationsUndefined: Self = StObject.set(x, "UserTokenConfigurations", js.undefined)
    
    inline def setUserTokenConfigurationsVarargs(value: UserTokenConfiguration*): Self = StObject.set(x, "UserTokenConfigurations", js.Array(value*))
  }
}
