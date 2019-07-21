package typings
package atBabelTypesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cooked extends js.Object {
  var cooked: js.UndefOr[java.lang.String] = js.undefined
  var raw: java.lang.String
}

object Anon_Cooked {
  @scala.inline
  def apply(raw: java.lang.String, cooked: java.lang.String = null): Anon_Cooked = {
    val __obj = js.Dynamic.literal(raw = raw)
    if (cooked != null) __obj.updateDynamic("cooked")(cooked)
    __obj.asInstanceOf[Anon_Cooked]
  }
}

