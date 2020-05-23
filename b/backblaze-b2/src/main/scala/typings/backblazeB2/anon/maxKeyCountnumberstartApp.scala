package typings.backblazeB2.anon

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  maxKeyCount  :number,   startApplicationKeyId  :string} & backblaze-b2.backblaze-b2.CommonArgs */
trait maxKeyCountnumberstartApp extends js.Object {
  var axios: js.UndefOr[Record[String, _]] = js.undefined
  var axiosOverride: js.UndefOr[Record[String, _]] = js.undefined
  var maxKeyCount: Double
  var startApplicationKeyId: String
}

object maxKeyCountnumberstartApp {
  @scala.inline
  def apply(
    maxKeyCount: Double,
    startApplicationKeyId: String,
    axios: Record[String, _] = null,
    axiosOverride: Record[String, _] = null
  ): maxKeyCountnumberstartApp = {
    val __obj = js.Dynamic.literal(maxKeyCount = maxKeyCount.asInstanceOf[js.Any], startApplicationKeyId = startApplicationKeyId.asInstanceOf[js.Any])
    if (axios != null) __obj.updateDynamic("axios")(axios.asInstanceOf[js.Any])
    if (axiosOverride != null) __obj.updateDynamic("axiosOverride")(axiosOverride.asInstanceOf[js.Any])
    __obj.asInstanceOf[maxKeyCountnumberstartApp]
  }
}

