package typings
package cypressLib.CypressNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DebugOptions extends js.Object {
  var verbose: scala.Boolean
}

object DebugOptions {
  @scala.inline
  def apply(verbose: scala.Boolean): DebugOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("verbose")(verbose)
    __obj.asInstanceOf[DebugOptions]
  }
}

