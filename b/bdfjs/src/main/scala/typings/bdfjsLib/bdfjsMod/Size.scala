package typings
package bdfjsLib.bdfjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Size extends js.Object {
  var points: scala.Double
  var resolutionX: scala.Double
  var resolutionY: scala.Double
}

object Size {
  @scala.inline
  def apply(points: scala.Double, resolutionX: scala.Double, resolutionY: scala.Double): Size = {
    val __obj = js.Dynamic.literal(points = points, resolutionX = resolutionX, resolutionY = resolutionY)
  
    __obj.asInstanceOf[Size]
  }
}

