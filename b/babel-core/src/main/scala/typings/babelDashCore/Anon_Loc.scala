package typings.babelDashCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Loc extends js.Object {
  var loc: js.Object
  var message: String
  var `type`: String
}

object Anon_Loc {
  @scala.inline
  def apply(loc: js.Object, message: String, `type`: String): Anon_Loc = {
    val __obj = js.Dynamic.literal(loc = loc.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Loc]
  }
}

