package typings.chromeApps.chrome.system.display

import typings.chromeApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @since Chrome 57
  */
@js.native
trait Point extends js.Object {
  /** The x-coordinate of the point. */
  var x: integer = js.native
  /** The y-coordinate of the point. */
  var y: integer = js.native
}

object Point {
  @scala.inline
  def apply(x: integer, y: integer): Point = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Point]
  }
  @scala.inline
  implicit class PointOps[Self <: Point] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setX(value: integer): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def setY(value: integer): Self = this.set("y", value.asInstanceOf[js.Any])
  }
  
}

