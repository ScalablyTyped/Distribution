package typings.commander.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParseOptionsResult extends js.Object {
  var args: js.Array[String]
  var unknown: js.Array[String]
}

object ParseOptionsResult {
  @scala.inline
  def apply(args: js.Array[String], unknown: js.Array[String]): ParseOptionsResult = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], unknown = unknown.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ParseOptionsResult]
  }
}

