package typings.atBabelCore

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
    val __obj = js.Dynamic.literal(loc = loc, message = message)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Loc]
  }
}

