package typings.backblazeB2.mod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListFileVersionsOpts extends CommonArgs {
  var bucketId: String
  var maxFileCount: Double
  var startFileId: String
  var startFileName: String
}

object ListFileVersionsOpts {
  @scala.inline
  def apply(
    bucketId: String,
    maxFileCount: Double,
    startFileId: String,
    startFileName: String,
    axios: Record[String, _] = null,
    axiosOverride: Record[String, _] = null
  ): ListFileVersionsOpts = {
    val __obj = js.Dynamic.literal(bucketId = bucketId.asInstanceOf[js.Any], maxFileCount = maxFileCount.asInstanceOf[js.Any], startFileId = startFileId.asInstanceOf[js.Any], startFileName = startFileName.asInstanceOf[js.Any])
    if (axios != null) __obj.updateDynamic("axios")(axios.asInstanceOf[js.Any])
    if (axiosOverride != null) __obj.updateDynamic("axiosOverride")(axiosOverride.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListFileVersionsOpts]
  }
}

