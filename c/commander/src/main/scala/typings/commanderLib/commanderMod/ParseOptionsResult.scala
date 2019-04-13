package typings
package commanderLib.commanderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParseOptionsResult extends js.Object {
  var args: js.Array[java.lang.String]
  var unknown: js.Array[java.lang.String]
}

object ParseOptionsResult {
  @scala.inline
  def apply(args: js.Array[java.lang.String], unknown: js.Array[java.lang.String]): ParseOptionsResult = {
    val __obj = js.Dynamic.literal(args = args, unknown = unknown)
  
    __obj.asInstanceOf[ParseOptionsResult]
  }
}

