package typings.backblazeB2.mod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListFileNamesOpts extends CommonArgs {
  var bucketId: String
  var delimiter: String
  var maxFileCount: Double
  var prefix: String
  var startFileName: String
}

object ListFileNamesOpts {
  @scala.inline
  def apply(
    bucketId: String,
    delimiter: String,
    maxFileCount: Double,
    prefix: String,
    startFileName: String,
    axios: Record[String, _] = null,
    axiosOverride: Record[String, _] = null
  ): ListFileNamesOpts = {
    val __obj = js.Dynamic.literal(bucketId = bucketId.asInstanceOf[js.Any], delimiter = delimiter.asInstanceOf[js.Any], maxFileCount = maxFileCount.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], startFileName = startFileName.asInstanceOf[js.Any])
    if (axios != null) __obj.updateDynamic("axios")(axios.asInstanceOf[js.Any])
    if (axiosOverride != null) __obj.updateDynamic("axiosOverride")(axiosOverride.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListFileNamesOpts]
  }
}

