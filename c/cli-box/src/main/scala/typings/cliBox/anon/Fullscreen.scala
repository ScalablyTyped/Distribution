package typings.cliBox.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Fullscreen extends js.Object {
  var fullscreen: Boolean
  var height: Double
  var marks: typings.cliBox.mod.Marks
  var stringify: Boolean
  var width: Double
}

object Fullscreen {
  @scala.inline
  def apply(
    fullscreen: Boolean,
    height: Double,
    marks: typings.cliBox.mod.Marks,
    stringify: Boolean,
    width: Double
  ): Fullscreen = {
    val __obj = js.Dynamic.literal(fullscreen = fullscreen.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], marks = marks.asInstanceOf[js.Any], stringify = stringify.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fullscreen]
  }
}

