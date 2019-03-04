package typings
package dcLib.dcMod.dcNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Printers extends js.Object {
  def filter(filter: js.Any): java.lang.String
  def filters(filters: js.Array[_]): java.lang.String
}

object Printers {
  @scala.inline
  def apply(
    filter: js.Function1[js.Any, java.lang.String],
    filters: js.Function1[js.Array[_], java.lang.String]
  ): Printers = {
    val __obj = js.Dynamic.literal(filter = filter, filters = filters)
  
    __obj.asInstanceOf[Printers]
  }
}

