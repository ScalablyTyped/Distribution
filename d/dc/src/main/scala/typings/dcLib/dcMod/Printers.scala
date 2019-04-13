package typings
package dcLib.dcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Printers extends js.Object {
  def filter(filter: js.Any): java.lang.String
  def filters(filters: js.Array[_]): java.lang.String
}

object Printers {
  @scala.inline
  def apply(filter: js.Any => java.lang.String, filters: js.Array[_] => java.lang.String): Printers = {
    val __obj = js.Dynamic.literal(filter = js.Any.fromFunction1(filter), filters = js.Any.fromFunction1(filters))
  
    __obj.asInstanceOf[Printers]
  }
}

