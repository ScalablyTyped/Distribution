package typings.awsSdkClientS3Browser.typesCreateMultipartUploadOutputMod

import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.AES256
import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.awsColonkms
import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.requester_
import typings.awsSdkClientS3Browser.outputTypesUnionMod._OutputTypesUnion
import typings.awsSdkTypes.responseMod.MetadataBearer
import typings.awsSdkTypes.responseMod.ResponseMetadata
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateMultipartUploadOutput
  extends MetadataBearer
     with _OutputTypesUnion {
  /**
    * <p>Date when multipart upload will become eligible for abort operation by lifecycle.</p>
    */
  var AbortDate: js.UndefOr[Date] = js.undefined
  /**
    * <p>Id of the lifecycle rule that makes a multipart upload eligible for abort operation.</p>
    */
  var AbortRuleId: js.UndefOr[String] = js.undefined
  /**
    * <p>Name of the bucket to which the multipart upload was initiated.</p>
    */
  var Bucket: js.UndefOr[String] = js.undefined
  /**
    * <p>Object key for which the multipart upload was initiated.</p>
    */
  var Key: js.UndefOr[String] = js.undefined
  /**
    * <p>If present, indicates that the requester was successfully charged for the request.</p>
    */
  var RequestCharged: js.UndefOr[requester_ | String] = js.undefined
  /**
    * <p>If server-side encryption with a customer-provided encryption key was requested, the response will include this header confirming the encryption algorithm used.</p>
    */
  var SSECustomerAlgorithm: js.UndefOr[String] = js.undefined
  /**
    * <p>If server-side encryption with a customer-provided encryption key was requested, the response will include this header to provide round trip message integrity verification of the customer-provided encryption key.</p>
    */
  var SSECustomerKeyMD5: js.UndefOr[String] = js.undefined
  /**
    * <p>If present, specifies the ID of the AWS Key Management Service (KMS) master encryption key that was used for the object.</p>
    */
  var SSEKMSKeyId: js.UndefOr[String] = js.undefined
  /**
    * <p>The Server-side encryption algorithm used when storing this object in S3 (e.g., AES256, aws:kms).</p>
    */
  var ServerSideEncryption: js.UndefOr[AES256 | awsColonkms | String] = js.undefined
  /**
    * <p>ID for the initiated multipart upload.</p>
    */
  var UploadId: js.UndefOr[String] = js.undefined
}

object CreateMultipartUploadOutput {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    AbortDate: Date = null,
    AbortRuleId: String = null,
    Bucket: String = null,
    Key: String = null,
    RequestCharged: requester_ | String = null,
    SSECustomerAlgorithm: String = null,
    SSECustomerKeyMD5: String = null,
    SSEKMSKeyId: String = null,
    ServerSideEncryption: AES256 | awsColonkms | String = null,
    UploadId: String = null
  ): CreateMultipartUploadOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    if (AbortDate != null) __obj.updateDynamic("AbortDate")(AbortDate.asInstanceOf[js.Any])
    if (AbortRuleId != null) __obj.updateDynamic("AbortRuleId")(AbortRuleId.asInstanceOf[js.Any])
    if (Bucket != null) __obj.updateDynamic("Bucket")(Bucket.asInstanceOf[js.Any])
    if (Key != null) __obj.updateDynamic("Key")(Key.asInstanceOf[js.Any])
    if (RequestCharged != null) __obj.updateDynamic("RequestCharged")(RequestCharged.asInstanceOf[js.Any])
    if (SSECustomerAlgorithm != null) __obj.updateDynamic("SSECustomerAlgorithm")(SSECustomerAlgorithm.asInstanceOf[js.Any])
    if (SSECustomerKeyMD5 != null) __obj.updateDynamic("SSECustomerKeyMD5")(SSECustomerKeyMD5.asInstanceOf[js.Any])
    if (SSEKMSKeyId != null) __obj.updateDynamic("SSEKMSKeyId")(SSEKMSKeyId.asInstanceOf[js.Any])
    if (ServerSideEncryption != null) __obj.updateDynamic("ServerSideEncryption")(ServerSideEncryption.asInstanceOf[js.Any])
    if (UploadId != null) __obj.updateDynamic("UploadId")(UploadId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateMultipartUploadOutput]
  }
}

