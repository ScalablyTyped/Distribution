package typings.atAwsDashSdkClientDashS3DashBrowser.typesCompleteMultipartUploadOutputMod

import typings.atAwsDashSdkClientDashS3DashBrowser.atAwsDashSdkClientDashS3DashBrowserStrings.AES256
import typings.atAwsDashSdkClientDashS3DashBrowser.atAwsDashSdkClientDashS3DashBrowserStrings.`aws:kms`
import typings.atAwsDashSdkClientDashS3DashBrowser.atAwsDashSdkClientDashS3DashBrowserStrings.requester
import typings.atAwsDashSdkClientDashS3DashBrowser.typesOutputTypesUnionMod._OutputTypesUnion
import typings.atAwsDashSdkTypes.buildResponseMod.MetadataBearer
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompleteMultipartUploadOutput
  extends MetadataBearer
     with _OutputTypesUnion {
  /**
    * _BucketName shape
    */
  var Bucket: js.UndefOr[String] = js.undefined
  /**
    * <p>Entity tag of the object.</p>
    */
  var ETag: js.UndefOr[String] = js.undefined
  /**
    * <p>If the object expiration is configured, this will contain the expiration date (expiry-date) and rule ID (rule-id). The value of rule-id is URL encoded.</p>
    */
  var Expiration: js.UndefOr[String] = js.undefined
  /**
    * _ObjectKey shape
    */
  var Key: js.UndefOr[String] = js.undefined
  /**
    * _Location shape
    */
  var Location: js.UndefOr[String] = js.undefined
  /**
    * <p>If present, indicates that the requester was successfully charged for the request.</p>
    */
  var RequestCharged: js.UndefOr[requester | String] = js.undefined
  /**
    * <p>If present, specifies the ID of the AWS Key Management Service (KMS) master encryption key that was used for the object.</p>
    */
  var SSEKMSKeyId: js.UndefOr[String] = js.undefined
  /**
    * <p>The Server-side encryption algorithm used when storing this object in S3 (e.g., AES256, aws:kms).</p>
    */
  var ServerSideEncryption: js.UndefOr[AES256 | `aws:kms` | String] = js.undefined
  /**
    * <p>Version of the object.</p>
    */
  var VersionId: js.UndefOr[String] = js.undefined
}

object CompleteMultipartUploadOutput {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    Bucket: String = null,
    ETag: String = null,
    Expiration: String = null,
    Key: String = null,
    Location: String = null,
    RequestCharged: requester | String = null,
    SSEKMSKeyId: String = null,
    ServerSideEncryption: AES256 | `aws:kms` | String = null,
    VersionId: String = null
  ): CompleteMultipartUploadOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata)
    if (Bucket != null) __obj.updateDynamic("Bucket")(Bucket)
    if (ETag != null) __obj.updateDynamic("ETag")(ETag)
    if (Expiration != null) __obj.updateDynamic("Expiration")(Expiration)
    if (Key != null) __obj.updateDynamic("Key")(Key)
    if (Location != null) __obj.updateDynamic("Location")(Location)
    if (RequestCharged != null) __obj.updateDynamic("RequestCharged")(RequestCharged.asInstanceOf[js.Any])
    if (SSEKMSKeyId != null) __obj.updateDynamic("SSEKMSKeyId")(SSEKMSKeyId)
    if (ServerSideEncryption != null) __obj.updateDynamic("ServerSideEncryption")(ServerSideEncryption.asInstanceOf[js.Any])
    if (VersionId != null) __obj.updateDynamic("VersionId")(VersionId)
    __obj.asInstanceOf[CompleteMultipartUploadOutput]
  }
}

