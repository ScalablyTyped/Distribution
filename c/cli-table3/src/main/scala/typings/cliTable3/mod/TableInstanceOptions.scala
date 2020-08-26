package typings.cliTable3.mod

import typings.cliTable3.anon.Border
import typings.cliTable3.anon.RecordCharNamestring
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableInstanceOptions extends TableOptions {
  var chars: RecordCharNamestring = js.native
  var style: Border = js.native
}

object TableInstanceOptions {
  @scala.inline
  def apply(
    chars: RecordCharNamestring,
    colAligns: js.Array[HorizontalAlignment],
    colWidths: js.Array[Double | Null],
    head: js.Array[String],
    rowAligns: js.Array[VerticalAlignment],
    rowHeights: js.Array[Double | Null],
    style: Border,
    truncate: String,
    wordWrap: Boolean
  ): TableInstanceOptions = {
    val __obj = js.Dynamic.literal(chars = chars.asInstanceOf[js.Any], colAligns = colAligns.asInstanceOf[js.Any], colWidths = colWidths.asInstanceOf[js.Any], head = head.asInstanceOf[js.Any], rowAligns = rowAligns.asInstanceOf[js.Any], rowHeights = rowHeights.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], truncate = truncate.asInstanceOf[js.Any], wordWrap = wordWrap.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableInstanceOptions]
  }
  @scala.inline
  implicit class TableInstanceOptionsOps[Self <: TableInstanceOptions] (val x: Self) extends AnyVal {
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
    def setChars(value: RecordCharNamestring): Self = this.set("chars", value.asInstanceOf[js.Any])
    @scala.inline
    def setStyle(value: Border): Self = this.set("style", value.asInstanceOf[js.Any])
  }
  
}

