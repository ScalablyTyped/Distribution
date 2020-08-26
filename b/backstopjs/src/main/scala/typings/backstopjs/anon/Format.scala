package typings.backstopjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Format extends js.Object {
  var format: js.UndefOr[String] = js.native
  var testReportFileName: js.UndefOr[String] = js.native
  var testSuiteName: js.UndefOr[String] = js.native
}

object Format {
  @scala.inline
  def apply(): Format = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Format]
  }
  @scala.inline
  implicit class FormatOps[Self <: Format] (val x: Self) extends AnyVal {
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
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    @scala.inline
    def setTestReportFileName(value: String): Self = this.set("testReportFileName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTestReportFileName: Self = this.set("testReportFileName", js.undefined)
    @scala.inline
    def setTestSuiteName(value: String): Self = this.set("testSuiteName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTestSuiteName: Self = this.set("testSuiteName", js.undefined)
  }
  
}

