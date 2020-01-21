package typings.cliBox

import typings.cliBox.mod.Marks
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHeight extends js.Object {
  var height: Double
  var lines: js.Array[AnonOffset]
  var marks: Marks
  var width: Double
}

object AnonHeight {
  @scala.inline
  def apply(height: Double, lines: js.Array[AnonOffset], marks: Marks, width: Double): AnonHeight = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], lines = lines.asInstanceOf[js.Any], marks = marks.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonHeight]
  }
}

