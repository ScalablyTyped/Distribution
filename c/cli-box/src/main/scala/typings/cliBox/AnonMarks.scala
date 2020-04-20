package typings.cliBox

import typings.cliBox.mod.Marks
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMarks extends js.Object {
  var marks: Marks
}

object AnonMarks {
  @scala.inline
  def apply(marks: Marks): AnonMarks = {
    val __obj = js.Dynamic.literal(marks = marks.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMarks]
  }
}

