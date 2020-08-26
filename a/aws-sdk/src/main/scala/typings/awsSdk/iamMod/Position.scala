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
  def apply(): Position = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Position]
  }
  @scala.inline
  implicit class PositionOps[Self <: Position] (val x: Self) extends AnyVal {
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
    def setColumn(value: ColumnNumber): Self = this.set("Column", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumn: Self = this.set("Column", js.undefined)
    @scala.inline
    def setLine(value: LineNumber): Self = this.set("Line", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLine: Self = this.set("Line", js.undefined)
  }
  
}

