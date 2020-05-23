package typings.backblazeB2.mod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateBucketOpts extends CommonArgs {
  var bucketId: String
  var bucketType: BucketType
}

object UpdateBucketOpts {
  @scala.inline
  def apply(
    bucketId: String,
    bucketType: BucketType,
    axios: Record[String, _] = null,
    axiosOverride: Record[String, _] = null
  ): UpdateBucketOpts = {
    val __obj = js.Dynamic.literal(bucketId = bucketId.asInstanceOf[js.Any], bucketType = bucketType.asInstanceOf[js.Any])
    if (axios != null) __obj.updateDynamic("axios")(axios.asInstanceOf[js.Any])
    if (axiosOverride != null) __obj.updateDynamic("axiosOverride")(axiosOverride.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateBucketOpts]
  }
}

