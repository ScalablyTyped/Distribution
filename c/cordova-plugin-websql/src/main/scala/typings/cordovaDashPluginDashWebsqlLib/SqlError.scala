package typings
package cordovaDashPluginDashWebsqlLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait SqlError extends js.Object {
  var code: scala.Double
  var message: java.lang.String
}

@JSGlobal("SqlError")
@js.native
object SqlError extends js.Object {
  var CONSTRAINT_ERR: scala.Double = js.native
  var DATABASE_ERR: scala.Double = js.native
  var QUOTA_ERR: scala.Double = js.native
  var SYNTAX_ERR: scala.Double = js.native
  var TIMEOUT_ERR: scala.Double = js.native
  var TOO_LARGE_ERR: scala.Double = js.native
  // Error code constants from http://www.w3.org/TR/webdatabase/#sqlerror
  var UNKNOWN_ERR: scala.Double = js.native
  var VERSION_ERR: scala.Double = js.native
}

