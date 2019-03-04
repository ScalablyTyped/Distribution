package typings
package atBabelCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Loc extends js.Object {
  var loc: js.Object
  var message: java.lang.String
  var `type`: java.lang.String
}

object Anon_Loc {
  @scala.inline
  def apply(loc: js.Object, message: java.lang.String, `type`: java.lang.String): Anon_Loc = {
    val __obj = js.Dynamic.literal(loc = loc, message = message)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Loc]
  }
}

