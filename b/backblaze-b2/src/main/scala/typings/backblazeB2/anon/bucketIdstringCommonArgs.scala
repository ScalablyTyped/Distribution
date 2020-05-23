package typings.backblazeB2.anon

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  bucketId  :string} & backblaze-b2.backblaze-b2.CommonArgs */
trait bucketIdstringCommonArgs extends js.Object {
  var axios: js.UndefOr[Record[String, _]] = js.undefined
  var axiosOverride: js.UndefOr[Record[String, _]] = js.undefined
  var bucketId: String
}

object bucketIdstringCommonArgs {
  @scala.inline
  def apply(bucketId: String, axios: Record[String, _] = null, axiosOverride: Record[String, _] = null): bucketIdstringCommonArgs = {
    val __obj = js.Dynamic.literal(bucketId = bucketId.asInstanceOf[js.Any])
    if (axios != null) __obj.updateDynamic("axios")(axios.asInstanceOf[js.Any])
    if (axiosOverride != null) __obj.updateDynamic("axiosOverride")(axiosOverride.asInstanceOf[js.Any])
    __obj.asInstanceOf[bucketIdstringCommonArgs]
  }
}

