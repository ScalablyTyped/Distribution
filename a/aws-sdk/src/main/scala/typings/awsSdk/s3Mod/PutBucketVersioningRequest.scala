package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutBucketVersioningRequest extends js.Object {
  /**
    * The bucket name.
    */
  var Bucket: BucketName = js.native
  /**
    * &gt;The base64-encoded 128-bit MD5 digest of the data. You must use this header as a message integrity check to verify that the request body was not corrupted in transit. For more information, see RFC 1864.
    */
  var ContentMD5: js.UndefOr[typings.awsSdk.s3Mod.ContentMD5] = js.native
  /**
    * The concatenation of the authentication device's serial number, a space, and the value that is displayed on your authentication device.
    */
  var MFA: js.UndefOr[typings.awsSdk.s3Mod.MFA] = js.native
  /**
    * Container for setting the versioning state.
    */
  var VersioningConfiguration: typings.awsSdk.s3Mod.VersioningConfiguration = js.native
}

object PutBucketVersioningRequest {
  @scala.inline
  def apply(
    Bucket: BucketName,
    VersioningConfiguration: VersioningConfiguration,
    ContentMD5: ContentMD5 = null,
    MFA: MFA = null
  ): PutBucketVersioningRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], VersioningConfiguration = VersioningConfiguration.asInstanceOf[js.Any])
    if (ContentMD5 != null) __obj.updateDynamic("ContentMD5")(ContentMD5.asInstanceOf[js.Any])
    if (MFA != null) __obj.updateDynamic("MFA")(MFA.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutBucketVersioningRequest]
  }
}

