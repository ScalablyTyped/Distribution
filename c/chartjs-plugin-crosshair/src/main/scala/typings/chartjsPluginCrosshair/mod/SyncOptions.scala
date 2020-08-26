package typings.chartjsPluginCrosshair.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SyncOptions extends js.Object {
  var enabled: js.UndefOr[Boolean] = js.native
  var group: js.UndefOr[Double] = js.native
  var suppressTooltips: js.UndefOr[Boolean] = js.native
}

object SyncOptions {
  @scala.inline
  def apply(): SyncOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SyncOptions]
  }
  @scala.inline
  implicit class SyncOptionsOps[Self <: SyncOptions] (val x: Self) extends AnyVal {
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
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    @scala.inline
    def setGroup(value: Double): Self = this.set("group", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroup: Self = this.set("group", js.undefined)
    @scala.inline
    def setSuppressTooltips(value: Boolean): Self = this.set("suppressTooltips", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuppressTooltips: Self = this.set("suppressTooltips", js.undefined)
  }
  
}

