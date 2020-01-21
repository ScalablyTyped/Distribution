package typings.backstopjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewportNext extends Viewport {
  var height: Double
  var label: String
  var width: Double
}

object ViewportNext {
  @scala.inline
  def apply(height: Double, label: String, width: Double): ViewportNext = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ViewportNext]
  }
}

