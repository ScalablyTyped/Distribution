package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutObjectLockConfigurationRequest extends js.Object {
  /**
    * The bucket whose Object Lock configuration you want to create or replace.
    */
  var Bucket: BucketName = js.native
  /**
    * The MD5 hash for the request body.
    */
  var ContentMD5: js.UndefOr[typings.awsSdk.s3Mod.ContentMD5] = js.native
  /**
    * The Object Lock configuration that you want to apply to the specified bucket.
    */
  var ObjectLockConfiguration: js.UndefOr[typings.awsSdk.s3Mod.ObjectLockConfiguration] = js.native
  var RequestPayer: js.UndefOr[typings.awsSdk.s3Mod.RequestPayer] = js.native
  /**
    * A token to allow Object Lock to be enabled for an existing bucket.
    */
  var Token: js.UndefOr[ObjectLockToken] = js.native
}

object PutObjectLockConfigurationRequest {
  @scala.inline
  def apply(
    Bucket: BucketName,
    ContentMD5: ContentMD5 = null,
    ObjectLockConfiguration: ObjectLockConfiguration = null,
    RequestPayer: RequestPayer = null,
    Token: ObjectLockToken = null
  ): PutObjectLockConfigurationRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
    if (ContentMD5 != null) __obj.updateDynamic("ContentMD5")(ContentMD5.asInstanceOf[js.Any])
    if (ObjectLockConfiguration != null) __obj.updateDynamic("ObjectLockConfiguration")(ObjectLockConfiguration.asInstanceOf[js.Any])
    if (RequestPayer != null) __obj.updateDynamic("RequestPayer")(RequestPayer.asInstanceOf[js.Any])
    if (Token != null) __obj.updateDynamic("Token")(Token.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutObjectLockConfigurationRequest]
  }
}

