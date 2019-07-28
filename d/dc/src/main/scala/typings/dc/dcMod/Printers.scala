package typings.dc.dcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Printers extends js.Object {
  def filter(filter: js.Any): String
  def filters(filters: js.Array[_]): String
}

object Printers {
  @scala.inline
  def apply(filter: js.Any => String, filters: js.Array[_] => String): Printers = {
    val __obj = js.Dynamic.literal(filter = js.Any.fromFunction1(filter), filters = js.Any.fromFunction1(filters))
  
    __obj.asInstanceOf[Printers]
  }
}

