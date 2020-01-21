package typings.babelCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLoc extends js.Object {
  var loc: js.Object
  var message: String
  var `type`: String
}

object AnonLoc {
  @scala.inline
  def apply(loc: js.Object, message: String, `type`: String): AnonLoc = {
    val __obj = js.Dynamic.literal(loc = loc.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLoc]
  }
}

