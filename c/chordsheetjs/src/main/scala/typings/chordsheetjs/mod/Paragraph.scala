package typings.chordsheetjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("chordsheetjs", "Paragraph")
@js.native
class Paragraph () extends js.Object {
  /**
    * The Line items of which the paragraph consists
    */
  var lines: js.Array[Line] = js.native
  /**
    * Tries to determine the common type for all lines. If the types for all lines are equal, it returns that type.
    * If not, it returns 'indeterminate'.
    */
  var `type`: String = js.native
  def addLine(line: Line): Unit = js.native
}

