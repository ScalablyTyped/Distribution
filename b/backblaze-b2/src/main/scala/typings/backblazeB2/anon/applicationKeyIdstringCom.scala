package typings.backblazeB2.anon

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  applicationKeyId  :string} & backblaze-b2.backblaze-b2.CommonArgs */
trait applicationKeyIdstringCom extends js.Object {
  var applicationKeyId: String
  var axios: js.UndefOr[Record[String, _]] = js.undefined
  var axiosOverride: js.UndefOr[Record[String, _]] = js.undefined
}

object applicationKeyIdstringCom {
  @scala.inline
  def apply(applicationKeyId: String, axios: Record[String, _] = null, axiosOverride: Record[String, _] = null): applicationKeyIdstringCom = {
    val __obj = js.Dynamic.literal(applicationKeyId = applicationKeyId.asInstanceOf[js.Any])
    if (axios != null) __obj.updateDynamic("axios")(axios.asInstanceOf[js.Any])
    if (axiosOverride != null) __obj.updateDynamic("axiosOverride")(axiosOverride.asInstanceOf[js.Any])
    __obj.asInstanceOf[applicationKeyIdstringCom]
  }
}

