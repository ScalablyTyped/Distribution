package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutBucketReplicationRequest extends js.Object {
  /**
    * The name of the bucket
    */
  var Bucket: BucketName = js.native
  /**
    * The base64-encoded 128-bit MD5 digest of the data. You must use this header as a message integrity check to verify that the request body was not corrupted in transit. For more information, see RFC 1864.
    */
  var ContentMD5: js.UndefOr[typings.awsSdk.s3Mod.ContentMD5] = js.native
  var ReplicationConfiguration: typings.awsSdk.s3Mod.ReplicationConfiguration = js.native
  /**
    * 
    */
  var Token: js.UndefOr[ObjectLockToken] = js.native
}

object PutBucketReplicationRequest {
  @scala.inline
  def apply(
    Bucket: BucketName,
    ReplicationConfiguration: ReplicationConfiguration,
    ContentMD5: ContentMD5 = null,
    Token: ObjectLockToken = null
  ): PutBucketReplicationRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], ReplicationConfiguration = ReplicationConfiguration.asInstanceOf[js.Any])
    if (ContentMD5 != null) __obj.updateDynamic("ContentMD5")(ContentMD5.asInstanceOf[js.Any])
    if (Token != null) __obj.updateDynamic("Token")(Token.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutBucketReplicationRequest]
  }
}

