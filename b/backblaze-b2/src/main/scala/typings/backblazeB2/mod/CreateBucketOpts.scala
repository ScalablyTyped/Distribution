package typings.backblazeB2.mod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateBucketOpts extends CommonArgs {
  var bucketName: String
  var bucketType: BucketType
}

object CreateBucketOpts {
  @scala.inline
  def apply(
    bucketName: String,
    bucketType: BucketType,
    axios: Record[String, _] = null,
    axiosOverride: Record[String, _] = null
  ): CreateBucketOpts = {
    val __obj = js.Dynamic.literal(bucketName = bucketName.asInstanceOf[js.Any], bucketType = bucketType.asInstanceOf[js.Any])
    if (axios != null) __obj.updateDynamic("axios")(axios.asInstanceOf[js.Any])
    if (axiosOverride != null) __obj.updateDynamic("axiosOverride")(axiosOverride.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateBucketOpts]
  }
}

