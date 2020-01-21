package typings.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Position extends js.Object {
  /**
    * The column in the line containing the specified position in the document.
    */
  var Column: js.UndefOr[ColumnNumber] = js.native
  /**
    * The line containing the specified position in the document.
    */
  var Line: js.UndefOr[LineNumber] = js.native
}

object Position {
  @scala.inline
  def apply(Column: Int | Double = null, Line: Int | Double = null): Position = {
    val __obj = js.Dynamic.literal()
    if (Column != null) __obj.updateDynamic("Column")(Column.asInstanceOf[js.Any])
    if (Line != null) __obj.updateDynamic("Line")(Line.asInstanceOf[js.Any])
    __obj.asInstanceOf[Position]
  }
}

