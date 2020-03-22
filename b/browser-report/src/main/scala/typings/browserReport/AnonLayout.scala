package typings.browserReport

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLayout extends js.Object {
  var height: Double
  var layout: AnonHeight
  var width: Double
  var zoom: Double
}

object AnonLayout {
  @scala.inline
  def apply(height: Double, layout: AnonHeight, width: Double, zoom: Double): AnonLayout = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], zoom = zoom.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonLayout]
  }
}

