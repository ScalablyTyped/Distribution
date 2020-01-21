package typings.datatablesNet.DataTables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StaticUtilFunctions extends js.Object {
  /**
    * Escape special characters in a regular expression string. Since: 1.10.4
    *
    * @param str String to escape
    */
  def escapeRegex(str: String): String = js.native
  /**
    * Throttle the calls to a method to reduce call frequency. Since: 1.10.3
    *
    * @param fn Function
    * @param period ms
    */
  def throttle(fn: FunctionThrottle): js.Function0[Unit] = js.native
  def throttle(fn: FunctionThrottle, period: Double): js.Function0[Unit] = js.native
}

