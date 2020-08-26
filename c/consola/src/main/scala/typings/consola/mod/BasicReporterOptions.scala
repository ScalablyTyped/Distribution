package typings.consola.mod

import typings.node.utilMod.InspectOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BasicReporterOptions extends js.Object {
  var dateFormat: js.UndefOr[String] = js.native
  var formatOptions: js.UndefOr[InspectOptions] = js.native
}

object BasicReporterOptions {
  @scala.inline
  def apply(): BasicReporterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BasicReporterOptions]
  }
  @scala.inline
  implicit class BasicReporterOptionsOps[Self <: BasicReporterOptions] (val x: Self) extends AnyVal {
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
    def setDateFormat(value: String): Self = this.set("dateFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDateFormat: Self = this.set("dateFormat", js.undefined)
    @scala.inline
    def setFormatOptions(value: InspectOptions): Self = this.set("formatOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormatOptions: Self = this.set("formatOptions", js.undefined)
  }
  
}

