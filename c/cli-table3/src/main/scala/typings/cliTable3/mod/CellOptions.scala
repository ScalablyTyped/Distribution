package typings.cliTable3.mod

import typings.cliTable3.anon.Head
import typings.cliTable3.anon.PartialRecordCharNamestri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CellOptions extends js.Object {
  var chars: js.UndefOr[PartialRecordCharNamestri] = js.native
  var colSpan: js.UndefOr[Double] = js.native
  var content: CellValue = js.native
  var hAlign: js.UndefOr[HorizontalAlignment] = js.native
  var rowSpan: js.UndefOr[Double] = js.native
  var style: js.UndefOr[Head] = js.native
  var truncate: js.UndefOr[String] = js.native
  var vAlign: js.UndefOr[VerticalAlignment] = js.native
}

object CellOptions {
  @scala.inline
  def apply(): CellOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CellOptions]
  }
  @scala.inline
  implicit class CellOptionsOps[Self <: CellOptions] (val x: Self) extends AnyVal {
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
    def setChars(value: PartialRecordCharNamestri): Self = this.set("chars", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChars: Self = this.set("chars", js.undefined)
    @scala.inline
    def setColSpan(value: Double): Self = this.set("colSpan", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColSpan: Self = this.set("colSpan", js.undefined)
    @scala.inline
    def setContent(value: CellValue): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    @scala.inline
    def setContentNull: Self = this.set("content", null)
    @scala.inline
    def setHAlign(value: HorizontalAlignment): Self = this.set("hAlign", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHAlign: Self = this.set("hAlign", js.undefined)
    @scala.inline
    def setRowSpan(value: Double): Self = this.set("rowSpan", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowSpan: Self = this.set("rowSpan", js.undefined)
    @scala.inline
    def setStyle(value: Head): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setTruncate(value: String): Self = this.set("truncate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTruncate: Self = this.set("truncate", js.undefined)
    @scala.inline
    def setVAlign(value: VerticalAlignment): Self = this.set("vAlign", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVAlign: Self = this.set("vAlign", js.undefined)
  }
  
}

