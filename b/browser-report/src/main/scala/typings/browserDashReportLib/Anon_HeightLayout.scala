package typings
package browserDashReportLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HeightLayout extends js.Object {
  var height: scala.Double
  var layout: Anon_Height
  var width: scala.Double
  var zoom: scala.Double
}

object Anon_HeightLayout {
  @scala.inline
  def apply(height: scala.Double, layout: Anon_Height, width: scala.Double, zoom: scala.Double): Anon_HeightLayout = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("height")(height)
    __obj.updateDynamic("layout")(layout)
    __obj.updateDynamic("width")(width)
    __obj.updateDynamic("zoom")(zoom)
    __obj.asInstanceOf[Anon_HeightLayout]
  }
}

