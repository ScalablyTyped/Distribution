package typings
package coreDashJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Escape extends js.Object {
  def escape(str: java.lang.String): java.lang.String
}

object Anon_Escape {
  @scala.inline
  def apply(escape: js.Function1[java.lang.String, java.lang.String]): Anon_Escape = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("escape")(escape)
    __obj.asInstanceOf[Anon_Escape]
  }
}

