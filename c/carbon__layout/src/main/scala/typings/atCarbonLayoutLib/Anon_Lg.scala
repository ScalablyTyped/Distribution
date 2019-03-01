package typings
package atCarbonLayoutLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Lg extends js.Object {
  var lg: Anon_Columns
  var max: Anon_Columns
  var md: Anon_Columns
  var sm: Anon_Columns
  var xlg: Anon_Columns
}

object Anon_Lg {
  @scala.inline
  def apply(lg: Anon_Columns, max: Anon_Columns, md: Anon_Columns, sm: Anon_Columns, xlg: Anon_Columns): Anon_Lg = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("lg")(lg)
    __obj.updateDynamic("max")(max)
    __obj.updateDynamic("md")(md)
    __obj.updateDynamic("sm")(sm)
    __obj.updateDynamic("xlg")(xlg)
    __obj.asInstanceOf[Anon_Lg]
  }
}

