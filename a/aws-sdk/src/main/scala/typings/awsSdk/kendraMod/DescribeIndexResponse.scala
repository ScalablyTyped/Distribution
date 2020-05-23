package typings.awsSdk.kendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
}

object DescribeIndexResponse {
  @scala.inline
  def apply(
    CapacityUnits: CapacityUnitsConfiguration = null,
    CreatedAt: Timestamp = null,
    Description: Description = null,
    DocumentMetadataConfigurations: DocumentMetadataConfigurationList = null,
    Edition: IndexEdition = null,
    ErrorMessage: ErrorMessage = null,
    Id: IndexId = null,
    IndexStatistics: IndexStatistics = null,
    Name: IndexName = null,
    RoleArn: RoleArn = null,
    ServerSideEncryptionConfiguration: ServerSideEncryptionConfiguration = null,
    Status: IndexStatus = null,
    UpdatedAt: Timestamp = null
  ): DescribeIndexResponse = {
    val __obj = js.Dynamic.literal()
    if (CapacityUnits != null) __obj.updateDynamic("CapacityUnits")(CapacityUnits.asInstanceOf[js.Any])
    if (CreatedAt != null) __obj.updateDynamic("CreatedAt")(CreatedAt.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (DocumentMetadataConfigurations != null) __obj.updateDynamic("DocumentMetadataConfigurations")(DocumentMetadataConfigurations.asInstanceOf[js.Any])
    if (Edition != null) __obj.updateDynamic("Edition")(Edition.asInstanceOf[js.Any])
    if (ErrorMessage != null) __obj.updateDynamic("ErrorMessage")(ErrorMessage.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    if (IndexStatistics != null) __obj.updateDynamic("IndexStatistics")(IndexStatistics.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (RoleArn != null) __obj.updateDynamic("RoleArn")(RoleArn.asInstanceOf[js.Any])
    if (ServerSideEncryptionConfiguration != null) __obj.updateDynamic("ServerSideEncryptionConfiguration")(ServerSideEncryptionConfiguration.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (UpdatedAt != null) __obj.updateDynamic("UpdatedAt")(UpdatedAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeIndexResponse]
  }
}

