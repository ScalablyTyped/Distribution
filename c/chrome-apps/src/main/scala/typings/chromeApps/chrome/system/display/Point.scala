package typings.chromeApps.chrome.system.display

import typings.chromeApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @since Chrome 57
  */
trait Point extends js.Object {
  /** The x-coordinate of the point. */
  var x: integer
  /** The y-coordinate of the point. */
  var y: integer
}

object Point {
  @scala.inline
  def apply(x: integer, y: integer): Point = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Point]
  }
}

