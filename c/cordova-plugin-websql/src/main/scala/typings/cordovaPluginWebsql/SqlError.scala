package typings.cordovaPluginWebsql

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SqlError extends js.Object {
  var code: Double
  var message: String
}

@JSGlobal("SqlError")
@js.native
object SqlError extends js.Object {
  var CONSTRAINT_ERR: Double = js.native
  var DATABASE_ERR: Double = js.native
  var QUOTA_ERR: Double = js.native
  var SYNTAX_ERR: Double = js.native
  var TIMEOUT_ERR: Double = js.native
  var TOO_LARGE_ERR: Double = js.native
  // Error code constants from http://www.w3.org/TR/webdatabase/#sqlerror
  var UNKNOWN_ERR: Double = js.native
  var VERSION_ERR: Double = js.native
}

