package typings.backstopjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Bitmapsreference extends js.Object {
  var bitmaps_reference: js.UndefOr[String] = js.native
  var bitmaps_test: js.UndefOr[String] = js.native
  var ci_report: js.UndefOr[String] = js.native
  var engine_scripts: js.UndefOr[String] = js.native
  var html_report: js.UndefOr[String] = js.native
  var json_report: js.UndefOr[String] = js.native
}

object Bitmapsreference {
  @scala.inline
  def apply(): Bitmapsreference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Bitmapsreference]
  }
  @scala.inline
  implicit class BitmapsreferenceOps[Self <: Bitmapsreference] (val x: Self) extends AnyVal {
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
    def setBitmaps_reference(value: String): Self = this.set("bitmaps_reference", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBitmaps_reference: Self = this.set("bitmaps_reference", js.undefined)
    @scala.inline
    def setBitmaps_test(value: String): Self = this.set("bitmaps_test", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBitmaps_test: Self = this.set("bitmaps_test", js.undefined)
    @scala.inline
    def setCi_report(value: String): Self = this.set("ci_report", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCi_report: Self = this.set("ci_report", js.undefined)
    @scala.inline
    def setEngine_scripts(value: String): Self = this.set("engine_scripts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEngine_scripts: Self = this.set("engine_scripts", js.undefined)
    @scala.inline
    def setHtml_report(value: String): Self = this.set("html_report", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHtml_report: Self = this.set("html_report", js.undefined)
    @scala.inline
    def setJson_report(value: String): Self = this.set("json_report", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJson_report: Self = this.set("json_report", js.undefined)
  }
  
}

