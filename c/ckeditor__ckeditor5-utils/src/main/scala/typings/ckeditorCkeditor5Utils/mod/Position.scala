package typings.ckeditorCkeditor5Utils.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Position extends js.Object {
  var left: Double
  var name: String
  var top: Double
}

object Position {
  @scala.inline
  def apply(left: Double, name: String, top: Double): Position = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Position]
  }
}

