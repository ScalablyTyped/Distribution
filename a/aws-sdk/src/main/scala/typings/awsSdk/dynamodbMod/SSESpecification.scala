package typings.awsSdk.dynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SSESpecification extends js.Object {
  /**
    * Indicates whether server-side encryption is done using an AWS managed CMK or an AWS owned CMK. If enabled (true), server-side encryption type is set to KMS and an AWS managed CMK is used (AWS KMS charges apply). If disabled (false) or not specified, server-side encryption is set to AWS owned CMK.
    */
  var Enabled: js.UndefOr[SSEEnabled] = js.native
  /**
    * The AWS KMS customer master key (CMK) that should be used for the AWS KMS encryption. To specify a CMK, use its key ID, Amazon Resource Name (ARN), alias name, or alias ARN. Note that you should only provide this parameter if the key is different from the default DynamoDB customer master key alias/aws/dynamodb.
    */
  var KMSMasterKeyId: js.UndefOr[typings.awsSdk.dynamodbMod.KMSMasterKeyId] = js.native
  /**
    * Server-side encryption type. The only supported value is:    KMS - Server-side encryption that uses AWS Key Management Service. The key is stored in your account and is managed by AWS KMS (AWS KMS charges apply).  
    */
  var SSEType: js.UndefOr[typings.awsSdk.dynamodbMod.SSEType] = js.native
}

object SSESpecification {
  @scala.inline
  def apply(
    Enabled: js.UndefOr[SSEEnabled] = js.undefined,
    KMSMasterKeyId: KMSMasterKeyId = null,
    SSEType: SSEType = null
  ): SSESpecification = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Enabled)) __obj.updateDynamic("Enabled")(Enabled.get.asInstanceOf[js.Any])
    if (KMSMasterKeyId != null) __obj.updateDynamic("KMSMasterKeyId")(KMSMasterKeyId.asInstanceOf[js.Any])
    if (SSEType != null) __obj.updateDynamic("SSEType")(SSEType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SSESpecification]
  }
}

