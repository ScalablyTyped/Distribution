package typings.cliBox

import typings.cliBox.mod.Marks
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFullscreen extends js.Object {
  var fullscreen: Boolean
  var height: Double
  var marks: Marks
  var stringify: Boolean
  var width: Double
}

object AnonFullscreen {
  @scala.inline
  def apply(fullscreen: Boolean, height: Double, marks: Marks, stringify: Boolean, width: Double): AnonFullscreen = {
    val __obj = js.Dynamic.literal(fullscreen = fullscreen.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], marks = marks.asInstanceOf[js.Any], stringify = stringify.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFullscreen]
  }
}

