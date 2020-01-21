package typings.bdfjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Size extends js.Object {
  var points: Double
  var resolutionX: Double
  var resolutionY: Double
}

object Size {
  @scala.inline
  def apply(points: Double, resolutionX: Double, resolutionY: Double): Size = {
    val __obj = js.Dynamic.literal(points = points.asInstanceOf[js.Any], resolutionX = resolutionX.asInstanceOf[js.Any], resolutionY = resolutionY.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Size]
  }
}

