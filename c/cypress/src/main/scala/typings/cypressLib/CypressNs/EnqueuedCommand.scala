package typings
package cypressLib.CypressNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait EnqueuedCommand extends js.Object {
  var args: js.Array[_]
  var chainerId: java.lang.String
  var name: java.lang.String
  var `type`: java.lang.String
  def fn(args: js.Any*): js.Any
}

