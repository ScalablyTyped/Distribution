package typings.awsSdk.codepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait S3Location extends js.Object {
  /**
    * The Amazon S3 artifact bucket for an action's artifacts.
    */
  var bucket: js.UndefOr[S3Bucket] = js.native
  /**
    * The artifact name.
    */
  var key: js.UndefOr[S3Key] = js.native
}

object S3Location {
  @scala.inline
  def apply(bucket: S3Bucket = null, key: S3Key = null): S3Location = {
    val __obj = js.Dynamic.literal()
    if (bucket != null) __obj.updateDynamic("bucket")(bucket.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3Location]
  }
}

