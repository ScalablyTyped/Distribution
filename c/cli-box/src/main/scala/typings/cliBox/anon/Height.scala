package typings.cliBox.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Height extends js.Object {
  var height: Double
  var lines: js.Array[Offset]
  var marks: typings.cliBox.mod.Marks
  var width: Double
}

object Height {
  @scala.inline
  def apply(height: Double, lines: js.Array[Offset], marks: typings.cliBox.mod.Marks, width: Double): Height = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], lines = lines.asInstanceOf[js.Any], marks = marks.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Height]
  }
}

