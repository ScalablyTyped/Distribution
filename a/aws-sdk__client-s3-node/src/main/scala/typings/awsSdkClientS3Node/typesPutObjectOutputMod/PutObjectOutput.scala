package typings.awsSdkClientS3Node.typesPutObjectOutputMod

import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.AES256
import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.awsColonkms
import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.requester_
import typings.awsSdkClientS3Node.outputTypesUnionMod._OutputTypesUnion
import typings.awsSdkTypes.responseMod.MetadataBearer
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutObjectOutput
  extends MetadataBearer
     with _OutputTypesUnion {
  /**
    * <p>Entity tag for the uploaded object.</p>
    */
  var ETag: js.UndefOr[String] = js.undefined
  /**
    * <p>If the object expiration is configured, this will contain the expiration date (expiry-date) and rule ID (rule-id). The value of rule-id is URL encoded.</p>
    */
  var Expiration: js.UndefOr[String] = js.undefined
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
    * <p>Version of the object.</p>
    */
  var VersionId: js.UndefOr[String] = js.undefined
}

object PutObjectOutput {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    ETag: String = null,
    Expiration: String = null,
    RequestCharged: requester_ | String = null,
    SSECustomerAlgorithm: String = null,
    SSECustomerKeyMD5: String = null,
    SSEKMSKeyId: String = null,
    ServerSideEncryption: AES256 | awsColonkms | String = null,
    VersionId: String = null
  ): PutObjectOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    if (ETag != null) __obj.updateDynamic("ETag")(ETag.asInstanceOf[js.Any])
    if (Expiration != null) __obj.updateDynamic("Expiration")(Expiration.asInstanceOf[js.Any])
    if (RequestCharged != null) __obj.updateDynamic("RequestCharged")(RequestCharged.asInstanceOf[js.Any])
    if (SSECustomerAlgorithm != null) __obj.updateDynamic("SSECustomerAlgorithm")(SSECustomerAlgorithm.asInstanceOf[js.Any])
    if (SSECustomerKeyMD5 != null) __obj.updateDynamic("SSECustomerKeyMD5")(SSECustomerKeyMD5.asInstanceOf[js.Any])
    if (SSEKMSKeyId != null) __obj.updateDynamic("SSEKMSKeyId")(SSEKMSKeyId.asInstanceOf[js.Any])
    if (ServerSideEncryption != null) __obj.updateDynamic("ServerSideEncryption")(ServerSideEncryption.asInstanceOf[js.Any])
    if (VersionId != null) __obj.updateDynamic("VersionId")(VersionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutObjectOutput]
  }
}

