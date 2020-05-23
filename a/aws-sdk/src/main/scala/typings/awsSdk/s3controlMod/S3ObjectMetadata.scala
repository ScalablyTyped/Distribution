package typings.awsSdk.s3controlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait S3ObjectMetadata extends js.Object {
  /**
    * 
    */
  var CacheControl: js.UndefOr[NonEmptyMaxLength1024String] = js.native
  /**
    * 
    */
  var ContentDisposition: js.UndefOr[NonEmptyMaxLength1024String] = js.native
  /**
    * 
    */
  var ContentEncoding: js.UndefOr[NonEmptyMaxLength1024String] = js.native
  /**
    * 
    */
  var ContentLanguage: js.UndefOr[NonEmptyMaxLength1024String] = js.native
  /**
    * 
    */
  var ContentLength: js.UndefOr[S3ContentLength] = js.native
  /**
    * 
    */
  var ContentMD5: js.UndefOr[NonEmptyMaxLength1024String] = js.native
  /**
    * 
    */
  var ContentType: js.UndefOr[NonEmptyMaxLength1024String] = js.native
  /**
    * 
    */
  var HttpExpiresDate: js.UndefOr[TimeStamp] = js.native
  /**
    * 
    */
  var RequesterCharged: js.UndefOr[Boolean] = js.native
  /**
    * 
    */
  var SSEAlgorithm: js.UndefOr[S3SSEAlgorithm] = js.native
  /**
    * 
    */
  var UserMetadata: js.UndefOr[S3UserMetadata] = js.native
}

object S3ObjectMetadata {
  @scala.inline
  def apply(
    CacheControl: NonEmptyMaxLength1024String = null,
    ContentDisposition: NonEmptyMaxLength1024String = null,
    ContentEncoding: NonEmptyMaxLength1024String = null,
    ContentLanguage: NonEmptyMaxLength1024String = null,
    ContentLength: js.UndefOr[S3ContentLength] = js.undefined,
    ContentMD5: NonEmptyMaxLength1024String = null,
    ContentType: NonEmptyMaxLength1024String = null,
    HttpExpiresDate: TimeStamp = null,
    RequesterCharged: js.UndefOr[Boolean] = js.undefined,
    SSEAlgorithm: S3SSEAlgorithm = null,
    UserMetadata: S3UserMetadata = null
  ): S3ObjectMetadata = {
    val __obj = js.Dynamic.literal()
    if (CacheControl != null) __obj.updateDynamic("CacheControl")(CacheControl.asInstanceOf[js.Any])
    if (ContentDisposition != null) __obj.updateDynamic("ContentDisposition")(ContentDisposition.asInstanceOf[js.Any])
    if (ContentEncoding != null) __obj.updateDynamic("ContentEncoding")(ContentEncoding.asInstanceOf[js.Any])
    if (ContentLanguage != null) __obj.updateDynamic("ContentLanguage")(ContentLanguage.asInstanceOf[js.Any])
    if (!js.isUndefined(ContentLength)) __obj.updateDynamic("ContentLength")(ContentLength.get.asInstanceOf[js.Any])
    if (ContentMD5 != null) __obj.updateDynamic("ContentMD5")(ContentMD5.asInstanceOf[js.Any])
    if (ContentType != null) __obj.updateDynamic("ContentType")(ContentType.asInstanceOf[js.Any])
    if (HttpExpiresDate != null) __obj.updateDynamic("HttpExpiresDate")(HttpExpiresDate.asInstanceOf[js.Any])
    if (!js.isUndefined(RequesterCharged)) __obj.updateDynamic("RequesterCharged")(RequesterCharged.get.asInstanceOf[js.Any])
    if (SSEAlgorithm != null) __obj.updateDynamic("SSEAlgorithm")(SSEAlgorithm.asInstanceOf[js.Any])
    if (UserMetadata != null) __obj.updateDynamic("UserMetadata")(UserMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3ObjectMetadata]
  }
}

