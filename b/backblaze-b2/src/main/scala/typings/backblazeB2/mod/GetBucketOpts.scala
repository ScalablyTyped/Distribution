package typings.backblazeB2.mod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBucketOpts extends CommonArgs {
  var bucketId: js.UndefOr[String] = js.undefined
  var bucketName: String
}

object GetBucketOpts {
  @scala.inline
  def apply(
    bucketName: String,
    axios: Record[String, _] = null,
    axiosOverride: Record[String, _] = null,
    bucketId: String = null
  ): GetBucketOpts = {
    val __obj = js.Dynamic.literal(bucketName = bucketName.asInstanceOf[js.Any])
    if (axios != null) __obj.updateDynamic("axios")(axios.asInstanceOf[js.Any])
    if (axiosOverride != null) __obj.updateDynamic("axiosOverride")(axiosOverride.asInstanceOf[js.Any])
    if (bucketId != null) __obj.updateDynamic("bucketId")(bucketId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBucketOpts]
  }
}

