package typings.awsSdk.robomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait S3Object extends js.Object {
  /**
    * The bucket containing the object.
    */
  var bucket: S3Bucket = js.native
  /**
    * The etag of the object.
    */
  var etag: js.UndefOr[S3Etag] = js.native
  /**
    * The key of the object.
    */
  var key: S3Key = js.native
}

object S3Object {
  @scala.inline
  def apply(bucket: S3Bucket, key: S3Key, etag: S3Etag = null): S3Object = {
    val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3Object]
  }
}

