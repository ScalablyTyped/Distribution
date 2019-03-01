package typings
package dbDotJsLib.DbJsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenOptions extends js.Object {
  var schema: js.UndefOr[js.Any] = js.undefined
  var server: java.lang.String
  var version: scala.Double
}

object OpenOptions {
  @scala.inline
  def apply(server: java.lang.String, version: scala.Double, schema: js.Any = null): OpenOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("server")(server)
    __obj.updateDynamic("version")(version)
    if (schema != null) __obj.updateDynamic("schema")(schema)
    __obj.asInstanceOf[OpenOptions]
  }
}

