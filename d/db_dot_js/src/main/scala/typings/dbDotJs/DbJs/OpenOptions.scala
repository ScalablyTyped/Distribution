package typings.dbDotJs.DbJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenOptions extends js.Object {
  var schema: js.UndefOr[js.Any] = js.undefined
  var server: String
  var version: Double
}

object OpenOptions {
  @scala.inline
  def apply(server: String, version: Double, schema: js.Any = null): OpenOptions = {
    val __obj = js.Dynamic.literal(server = server, version = version)
    if (schema != null) __obj.updateDynamic("schema")(schema)
    __obj.asInstanceOf[OpenOptions]
  }
}

