package typings
package dcLib.dcMod.dcNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Logger extends js.Object {
  var enableDebugLog: scala.Boolean
  def debug(msg: java.lang.String): scala.Unit
  def deprecate(fn: js.Function, msg: java.lang.String): scala.Unit
  def warn(msg: java.lang.String): scala.Unit
}

