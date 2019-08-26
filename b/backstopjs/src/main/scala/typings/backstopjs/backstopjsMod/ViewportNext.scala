package typings.backstopjs.backstopjsMod

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
    val __obj = js.Dynamic.literal(height = height, label = label, width = width)
  
    __obj.asInstanceOf[ViewportNext]
  }
}

