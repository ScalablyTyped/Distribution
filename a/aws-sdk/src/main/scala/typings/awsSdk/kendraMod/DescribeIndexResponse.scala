package typings.awsSdk.kendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeIndexResponse extends js.Object {
  
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
  implicit class DescribeIndexResponseOps[Self <: DescribeIndexResponse] (val x: Self) extends AnyVal {
    
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
    def setCapacityUnits(value: CapacityUnitsConfiguration): Self = this.set("CapacityUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCapacityUnits: Self = this.set("CapacityUnits", js.undefined)
    
    @scala.inline
    def setCreatedAt(value: Timestamp): Self = this.set("CreatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedAt: Self = this.set("CreatedAt", js.undefined)
    
    @scala.inline
    def setDescription(value: Description): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    
    @scala.inline
    def setDocumentMetadataConfigurationsVarargs(value: DocumentMetadataConfiguration*): Self = this.set("DocumentMetadataConfigurations", js.Array(value :_*))
    
    @scala.inline
    def setDocumentMetadataConfigurations(value: DocumentMetadataConfigurationList): Self = this.set("DocumentMetadataConfigurations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocumentMetadataConfigurations: Self = this.set("DocumentMetadataConfigurations", js.undefined)
    
    @scala.inline
    def setEdition(value: IndexEdition): Self = this.set("Edition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEdition: Self = this.set("Edition", js.undefined)
    
    @scala.inline
    def setErrorMessage(value: ErrorMessage): Self = this.set("ErrorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorMessage: Self = this.set("ErrorMessage", js.undefined)
    
    @scala.inline
    def setId(value: IndexId): Self = this.set("Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("Id", js.undefined)
    
    @scala.inline
    def setIndexStatistics(value: IndexStatistics): Self = this.set("IndexStatistics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndexStatistics: Self = this.set("IndexStatistics", js.undefined)
    
    @scala.inline
    def setName(value: IndexName): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    
    @scala.inline
    def setRoleArn(value: RoleArn): Self = this.set("RoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoleArn: Self = this.set("RoleArn", js.undefined)
    
    @scala.inline
    def setServerSideEncryptionConfiguration(value: ServerSideEncryptionConfiguration): Self = this.set("ServerSideEncryptionConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServerSideEncryptionConfiguration: Self = this.set("ServerSideEncryptionConfiguration", js.undefined)
    
    @scala.inline
    def setStatus(value: IndexStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    
    @scala.inline
    def setUpdatedAt(value: Timestamp): Self = this.set("UpdatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdatedAt: Self = this.set("UpdatedAt", js.undefined)
    
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
