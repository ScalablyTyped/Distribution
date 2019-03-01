package typings
package atCarbonLayoutLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Columns extends js.Object {
  var columns: scala.Double
  var margin: java.lang.String
  var width: java.lang.String
}

object Anon_Columns {
  @scala.inline
  def apply(columns: scala.Double, margin: java.lang.String, width: java.lang.String): Anon_Columns = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("columns")(columns)
    __obj.updateDynamic("margin")(margin)
    __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[Anon_Columns]
  }
}

