package typings.atAwsDashSdkClientDashS3DashNode.typesUploadPartCopyOutputMod

import typings.atAwsDashSdkClientDashS3DashNode.atAwsDashSdkClientDashS3DashNodeStrings.AES256
import typings.atAwsDashSdkClientDashS3DashNode.atAwsDashSdkClientDashS3DashNodeStrings.`aws:kms`
import typings.atAwsDashSdkClientDashS3DashNode.atAwsDashSdkClientDashS3DashNodeStrings.requester
import typings.atAwsDashSdkClientDashS3DashNode.typesOutputTypesUnionMod._OutputTypesUnion
import typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreCopyPartResultMod._UnmarshalledCopyPartResult
import typings.atAwsDashSdkTypes.buildResponseMod.MetadataBearer
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadPartCopyOutput
  extends MetadataBearer
     with _OutputTypesUnion {
  /**
    * _CopyPartResult shape
    */
  var CopyPartResult: js.UndefOr[_UnmarshalledCopyPartResult] = js.undefined
  /**
    * <p>The version of the source object that was copied, if you have enabled versioning on the source bucket.</p>
    */
  var CopySourceVersionId: js.UndefOr[String] = js.undefined
  /**
    * <p>If present, indicates that the requester was successfully charged for the request.</p>
    */
  var RequestCharged: js.UndefOr[requester | String] = js.undefined
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
  var ServerSideEncryption: js.UndefOr[AES256 | `aws:kms` | String] = js.undefined
}

object UploadPartCopyOutput {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    CopyPartResult: _UnmarshalledCopyPartResult = null,
    CopySourceVersionId: String = null,
    RequestCharged: requester | String = null,
    SSECustomerAlgorithm: String = null,
    SSECustomerKeyMD5: String = null,
    SSEKMSKeyId: String = null,
    ServerSideEncryption: AES256 | `aws:kms` | String = null
  ): UploadPartCopyOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata)
    if (CopyPartResult != null) __obj.updateDynamic("CopyPartResult")(CopyPartResult)
    if (CopySourceVersionId != null) __obj.updateDynamic("CopySourceVersionId")(CopySourceVersionId)
    if (RequestCharged != null) __obj.updateDynamic("RequestCharged")(RequestCharged.asInstanceOf[js.Any])
    if (SSECustomerAlgorithm != null) __obj.updateDynamic("SSECustomerAlgorithm")(SSECustomerAlgorithm)
    if (SSECustomerKeyMD5 != null) __obj.updateDynamic("SSECustomerKeyMD5")(SSECustomerKeyMD5)
    if (SSEKMSKeyId != null) __obj.updateDynamic("SSEKMSKeyId")(SSEKMSKeyId)
    if (ServerSideEncryption != null) __obj.updateDynamic("ServerSideEncryption")(ServerSideEncryption.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadPartCopyOutput]
  }
}

