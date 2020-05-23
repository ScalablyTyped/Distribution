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
  def apply(Column: js.UndefOr[ColumnNumber] = js.undefined, Line: js.UndefOr[LineNumber] = js.undefined): Position = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Column)) __obj.updateDynamic("Column")(Column.get.asInstanceOf[js.Any])
    if (!js.isUndefined(Line)) __obj.updateDynamic("Line")(Line.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Position]
  }
}

