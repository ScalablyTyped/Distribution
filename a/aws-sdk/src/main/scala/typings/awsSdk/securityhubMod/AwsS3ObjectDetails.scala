package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AwsS3ObjectDetails extends js.Object {
  /**
    * A standard MIME type describing the format of the object data.
    */
  var ContentType: js.UndefOr[NonEmptyString] = js.native
  /**
    * The opaque identifier assigned by a web server to a specific version of a resource found at a URL.
    */
  var ETag: js.UndefOr[NonEmptyString] = js.native
  /**
    * The date and time when the object was last modified.
    */
  var LastModified: js.UndefOr[NonEmptyString] = js.native
  /**
    * The identifier of the AWS Key Management Service (AWS KMS) symmetric customer managed customer master key (CMK) that was used for the object.
    */
  var SSEKMSKeyId: js.UndefOr[NonEmptyString] = js.native
  /**
    * If the object is stored using server-side encryption, the value of the server-side encryption algorithm used when storing this object in Amazon S3.
    */
  var ServerSideEncryption: js.UndefOr[NonEmptyString] = js.native
  /**
    * The version of the object.
    */
  var VersionId: js.UndefOr[NonEmptyString] = js.native
}

object AwsS3ObjectDetails {
  @scala.inline
  def apply(
    ContentType: NonEmptyString = null,
    ETag: NonEmptyString = null,
    LastModified: NonEmptyString = null,
    SSEKMSKeyId: NonEmptyString = null,
    ServerSideEncryption: NonEmptyString = null,
    VersionId: NonEmptyString = null
  ): AwsS3ObjectDetails = {
    val __obj = js.Dynamic.literal()
    if (ContentType != null) __obj.updateDynamic("ContentType")(ContentType.asInstanceOf[js.Any])
    if (ETag != null) __obj.updateDynamic("ETag")(ETag.asInstanceOf[js.Any])
    if (LastModified != null) __obj.updateDynamic("LastModified")(LastModified.asInstanceOf[js.Any])
    if (SSEKMSKeyId != null) __obj.updateDynamic("SSEKMSKeyId")(SSEKMSKeyId.asInstanceOf[js.Any])
    if (ServerSideEncryption != null) __obj.updateDynamic("ServerSideEncryption")(ServerSideEncryption.asInstanceOf[js.Any])
    if (VersionId != null) __obj.updateDynamic("VersionId")(VersionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AwsS3ObjectDetails]
  }
}

