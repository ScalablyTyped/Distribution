package typings.chartjsPluginCrosshair.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CrosshairOptions extends js.Object {
  var callbacks: js.UndefOr[CallbackOptions] = js.native
  var line: js.UndefOr[LineOptions] = js.native
  var snap: js.UndefOr[SnapOptions] = js.native
  var sync: js.UndefOr[SyncOptions] = js.native
  var zoom: js.UndefOr[ZoomOptions] = js.native
}

object CrosshairOptions {
  @scala.inline
  def apply(): CrosshairOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CrosshairOptions]
  }
  @scala.inline
  implicit class CrosshairOptionsOps[Self <: CrosshairOptions] (val x: Self) extends AnyVal {
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
    def setCallbacks(value: CallbackOptions): Self = this.set("callbacks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCallbacks: Self = this.set("callbacks", js.undefined)
    @scala.inline
    def setLine(value: LineOptions): Self = this.set("line", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLine: Self = this.set("line", js.undefined)
    @scala.inline
    def setSnap(value: SnapOptions): Self = this.set("snap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSnap: Self = this.set("snap", js.undefined)
    @scala.inline
    def setSync(value: SyncOptions): Self = this.set("sync", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSync: Self = this.set("sync", js.undefined)
    @scala.inline
    def setZoom(value: ZoomOptions): Self = this.set("zoom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZoom: Self = this.set("zoom", js.undefined)
  }
  
}

