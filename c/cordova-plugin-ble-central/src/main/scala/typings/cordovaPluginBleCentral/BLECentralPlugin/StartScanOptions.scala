package typings.cordovaPluginBleCentral.BLECentralPlugin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartScanOptions extends js.Object {
  var reportDuplicates: js.UndefOr[Boolean] = js.native
}

object StartScanOptions {
  @scala.inline
  def apply(): StartScanOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartScanOptions]
  }
  @scala.inline
  implicit class StartScanOptionsOps[Self <: StartScanOptions] (val x: Self) extends AnyVal {
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
    def setReportDuplicates(value: Boolean): Self = this.set("reportDuplicates", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReportDuplicates: Self = this.set("reportDuplicates", js.undefined)
  }
  
}

