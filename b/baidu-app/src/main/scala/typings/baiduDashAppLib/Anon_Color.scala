package typings
package baiduDashAppLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Color extends js.Object {
  var color: scala.Double | java.lang.String
  var text: java.lang.String
}

object Anon_Color {
  @scala.inline
  def apply(color: scala.Double | java.lang.String, text: java.lang.String): Anon_Color = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[Anon_Color]
  }
}

