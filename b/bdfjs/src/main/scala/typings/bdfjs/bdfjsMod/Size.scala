package typings.bdfjs.bdfjsMod

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
    val __obj = js.Dynamic.literal(points = points, resolutionX = resolutionX, resolutionY = resolutionY)
  
    __obj.asInstanceOf[Size]
  }
}

