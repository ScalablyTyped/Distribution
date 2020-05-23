package typings.backblazeB2.mod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait B2InitOptions extends js.Object {
  var applicationKey: String
  var applicationKeyId: String
  var axios: js.UndefOr[Record[String, _]] = js.undefined
  var retry: js.UndefOr[Record[String, _]] = js.undefined
}

object B2InitOptions {
  @scala.inline
  def apply(
    applicationKey: String,
    applicationKeyId: String,
    axios: Record[String, _] = null,
    retry: Record[String, _] = null
  ): B2InitOptions = {
    val __obj = js.Dynamic.literal(applicationKey = applicationKey.asInstanceOf[js.Any], applicationKeyId = applicationKeyId.asInstanceOf[js.Any])
    if (axios != null) __obj.updateDynamic("axios")(axios.asInstanceOf[js.Any])
    if (retry != null) __obj.updateDynamic("retry")(retry.asInstanceOf[js.Any])
    __obj.asInstanceOf[B2InitOptions]
  }
}

