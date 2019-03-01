package typings
package browserDashReportLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Colors extends js.Object {
  var colors: scala.Double
  var dppx: scala.Double
  var height: scala.Double
  var width: scala.Double
}

object Anon_Colors {
  @scala.inline
  def apply(colors: scala.Double, dppx: scala.Double, height: scala.Double, width: scala.Double): Anon_Colors = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("colors")(colors)
    __obj.updateDynamic("dppx")(dppx)
    __obj.updateDynamic("height")(height)
    __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[Anon_Colors]
  }
}

