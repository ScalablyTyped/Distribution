package typings.awsSdk.signerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait S3Destination extends js.Object {
  /**
    * Name of the S3 bucket.
    */
  var bucketName: js.UndefOr[BucketName] = js.native
  /**
    * An Amazon S3 prefix that you can use to limit responses to those that begin with the specified prefix.
    */
  var prefix: js.UndefOr[Prefix] = js.native
}

object S3Destination {
  @scala.inline
  def apply(bucketName: BucketName = null, prefix: Prefix = null): S3Destination = {
    val __obj = js.Dynamic.literal()
    if (bucketName != null) __obj.updateDynamic("bucketName")(bucketName.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3Destination]
  }
}

