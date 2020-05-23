package typings.babelCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Loc extends js.Object {
  var loc: js.Object
  var message: String
  var `type`: String
}

object Loc {
  @scala.inline
  def apply(loc: js.Object, message: String, `type`: String): Loc = {
    val __obj = js.Dynamic.literal(loc = loc.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Loc]
  }
}

