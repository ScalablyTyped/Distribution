package typings.browserReport.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Layout extends js.Object {
  var height: Double
  var layout: Height
  var width: Double
  var zoom: Double
}

object Layout {
  @scala.inline
  def apply(height: Double, layout: Height, width: Double, zoom: Double): Layout = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], zoom = zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[Layout]
  }
}

