package typings.chrome.chromeNs.systemNs.displayNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Point extends js.Object {
  /** The x-coordinate of the point. */
  var x: Double
  /** The y-coordinate of the point. */
  var y: Double
}

object Point {
  @scala.inline
  def apply(x: Double, y: Double): Point = {
    val __obj = js.Dynamic.literal(x = x, y = y)
  
    __obj.asInstanceOf[Point]
  }
}

