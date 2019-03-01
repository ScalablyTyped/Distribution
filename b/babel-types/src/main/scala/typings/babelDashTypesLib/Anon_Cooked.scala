package typings
package babelDashTypesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cooked extends js.Object {
  var cooked: java.lang.String
  var raw: java.lang.String
}

object Anon_Cooked {
  @scala.inline
  def apply(cooked: java.lang.String, raw: java.lang.String): Anon_Cooked = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cooked")(cooked)
    __obj.updateDynamic("raw")(raw)
    __obj.asInstanceOf[Anon_Cooked]
  }
}

