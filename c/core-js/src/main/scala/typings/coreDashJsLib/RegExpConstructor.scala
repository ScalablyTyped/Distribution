package typings
package coreDashJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegExpConstructor extends js.Object {
  def escape(str: java.lang.String): java.lang.String
}

object RegExpConstructor {
  @scala.inline
  def apply(escape: js.Function1[java.lang.String, java.lang.String]): RegExpConstructor = {
    val __obj = js.Dynamic.literal(escape = escape)
  
    __obj.asInstanceOf[RegExpConstructor]
  }
}

