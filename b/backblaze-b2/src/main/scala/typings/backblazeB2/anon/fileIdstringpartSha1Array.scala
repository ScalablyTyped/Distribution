package typings.backblazeB2.anon

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  fileId  :string,   partSha1Array  :std.Array<string>} & backblaze-b2.backblaze-b2.CommonArgs */
trait fileIdstringpartSha1Array extends js.Object {
  var axios: js.UndefOr[Record[String, _]] = js.undefined
  var axiosOverride: js.UndefOr[Record[String, _]] = js.undefined
  var fileId: String
  var partSha1Array: js.Array[String]
}

object fileIdstringpartSha1Array {
  @scala.inline
  def apply(
    fileId: String,
    partSha1Array: js.Array[String],
    axios: Record[String, _] = null,
    axiosOverride: Record[String, _] = null
  ): fileIdstringpartSha1Array = {
    val __obj = js.Dynamic.literal(fileId = fileId.asInstanceOf[js.Any], partSha1Array = partSha1Array.asInstanceOf[js.Any])
    if (axios != null) __obj.updateDynamic("axios")(axios.asInstanceOf[js.Any])
    if (axiosOverride != null) __obj.updateDynamic("axiosOverride")(axiosOverride.asInstanceOf[js.Any])
    __obj.asInstanceOf[fileIdstringpartSha1Array]
  }
}

