package typings.backblazeB2.anon

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  fileId  :string} & backblaze-b2.backblaze-b2.CommonArgs */
trait fileIdstringCommonArgs extends js.Object {
  var axios: js.UndefOr[Record[String, _]] = js.undefined
  var axiosOverride: js.UndefOr[Record[String, _]] = js.undefined
  var fileId: String
}

object fileIdstringCommonArgs {
  @scala.inline
  def apply(fileId: String, axios: Record[String, _] = null, axiosOverride: Record[String, _] = null): fileIdstringCommonArgs = {
    val __obj = js.Dynamic.literal(fileId = fileId.asInstanceOf[js.Any])
    if (axios != null) __obj.updateDynamic("axios")(axios.asInstanceOf[js.Any])
    if (axiosOverride != null) __obj.updateDynamic("axiosOverride")(axiosOverride.asInstanceOf[js.Any])
    __obj.asInstanceOf[fileIdstringCommonArgs]
  }
}

