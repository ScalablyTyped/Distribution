package typings.cliTable.mod

import typings.cliTable.anon.PartialRecordtoptopmidtop
import typings.cliTable.anon.Partialpaddingleftnumberp
import typings.cliTable.cliTableStrings.left
import typings.cliTable.cliTableStrings.middle
import typings.cliTable.cliTableStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableOptions extends js.Object {
  var chars: PartialRecordtoptopmidtop = js.native
  var colAligns: js.Array[left | middle | right] = js.native
  var colWidths: js.Array[Double] = js.native
  var colors: Boolean = js.native
  var head: js.Array[String] = js.native
  var style: Partialpaddingleftnumberp = js.native
  var truncate: String = js.native
}

object TableOptions {
  @scala.inline
  def apply(
    chars: PartialRecordtoptopmidtop,
    colAligns: js.Array[left | middle | right],
    colWidths: js.Array[Double],
    colors: Boolean,
    head: js.Array[String],
    style: Partialpaddingleftnumberp,
    truncate: String
  ): TableOptions = {
    val __obj = js.Dynamic.literal(chars = chars.asInstanceOf[js.Any], colAligns = colAligns.asInstanceOf[js.Any], colWidths = colWidths.asInstanceOf[js.Any], colors = colors.asInstanceOf[js.Any], head = head.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], truncate = truncate.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableOptions]
  }
  @scala.inline
  implicit class TableOptionsOps[Self <: TableOptions] (val x: Self) extends AnyVal {
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
    def setChars(value: PartialRecordtoptopmidtop): Self = this.set("chars", value.asInstanceOf[js.Any])
    @scala.inline
    def setColAlignsVarargs(value: (left | middle | right)*): Self = this.set("colAligns", js.Array(value :_*))
    @scala.inline
    def setColAligns(value: js.Array[left | middle | right]): Self = this.set("colAligns", value.asInstanceOf[js.Any])
    @scala.inline
    def setColWidthsVarargs(value: Double*): Self = this.set("colWidths", js.Array(value :_*))
    @scala.inline
    def setColWidths(value: js.Array[Double]): Self = this.set("colWidths", value.asInstanceOf[js.Any])
    @scala.inline
    def setColors(value: Boolean): Self = this.set("colors", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeadVarargs(value: String*): Self = this.set("head", js.Array(value :_*))
    @scala.inline
    def setHead(value: js.Array[String]): Self = this.set("head", value.asInstanceOf[js.Any])
    @scala.inline
    def setStyle(value: Partialpaddingleftnumberp): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def setTruncate(value: String): Self = this.set("truncate", value.asInstanceOf[js.Any])
  }
  
}

