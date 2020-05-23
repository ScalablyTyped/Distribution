package typings.backblazeB2.anon

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  bucketId  :string,   fileName  :string} & backblaze-b2.backblaze-b2.CommonArgs */
trait bucketIdstringfileNamestr extends js.Object {
  var axios: js.UndefOr[Record[String, _]] = js.undefined
  var axiosOverride: js.UndefOr[Record[String, _]] = js.undefined
  var bucketId: String
  var fileName: String
}

object bucketIdstringfileNamestr {
  @scala.inline
  def apply(
    bucketId: String,
    fileName: String,
    axios: Record[String, _] = null,
    axiosOverride: Record[String, _] = null
  ): bucketIdstringfileNamestr = {
    val __obj = js.Dynamic.literal(bucketId = bucketId.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any])
    if (axios != null) __obj.updateDynamic("axios")(axios.asInstanceOf[js.Any])
    if (axiosOverride != null) __obj.updateDynamic("axiosOverride")(axiosOverride.asInstanceOf[js.Any])
    __obj.asInstanceOf[bucketIdstringfileNamestr]
  }
}

