package typings.columnify.mod

import org.scalablytyped.runtime.StringDictionary
import typings.columnify.anon.PickOptionsminWidthmaxWid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GlobalOptions extends Options {
  var columnSplitter: js.UndefOr[String] = js.native
  var columns: js.UndefOr[js.Array[String]] = js.native
  var config: js.UndefOr[StringDictionary[Options]] = js.native
  var maxLineWidth: js.UndefOr[Double] = js.native
  var truncate: js.UndefOr[Boolean] = js.native
  var widths: js.UndefOr[StringDictionary[PickOptionsminWidthmaxWid]] = js.native
}

object GlobalOptions {
  @scala.inline
  def apply(): GlobalOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GlobalOptions]
  }
  @scala.inline
  implicit class GlobalOptionsOps[Self <: GlobalOptions] (val x: Self) extends AnyVal {
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
    def setColumnSplitter(value: String): Self = this.set("columnSplitter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnSplitter: Self = this.set("columnSplitter", js.undefined)
    @scala.inline
    def setColumnsVarargs(value: String*): Self = this.set("columns", js.Array(value :_*))
    @scala.inline
    def setColumns(value: js.Array[String]): Self = this.set("columns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumns: Self = this.set("columns", js.undefined)
    @scala.inline
    def setConfig(value: StringDictionary[Options]): Self = this.set("config", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfig: Self = this.set("config", js.undefined)
    @scala.inline
    def setMaxLineWidth(value: Double): Self = this.set("maxLineWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxLineWidth: Self = this.set("maxLineWidth", js.undefined)
    @scala.inline
    def setTruncate(value: Boolean): Self = this.set("truncate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTruncate: Self = this.set("truncate", js.undefined)
    @scala.inline
    def setWidths(value: StringDictionary[PickOptionsminWidthmaxWid]): Self = this.set("widths", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidths: Self = this.set("widths", js.undefined)
  }
  
}

