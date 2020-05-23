package typings.chartjsPluginCrosshair.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CrosshairOptions extends js.Object {
  var callbacks: js.UndefOr[CallbackOptions] = js.undefined
  var line: js.UndefOr[LineOptions] = js.undefined
  var snap: js.UndefOr[SnapOptions] = js.undefined
  var sync: js.UndefOr[SyncOptions] = js.undefined
  var zoom: js.UndefOr[ZoomOptions] = js.undefined
}

object CrosshairOptions {
  @scala.inline
  def apply(
    callbacks: CallbackOptions = null,
    line: LineOptions = null,
    snap: SnapOptions = null,
    sync: SyncOptions = null,
    zoom: ZoomOptions = null
  ): CrosshairOptions = {
    val __obj = js.Dynamic.literal()
    if (callbacks != null) __obj.updateDynamic("callbacks")(callbacks.asInstanceOf[js.Any])
    if (line != null) __obj.updateDynamic("line")(line.asInstanceOf[js.Any])
    if (snap != null) __obj.updateDynamic("snap")(snap.asInstanceOf[js.Any])
    if (sync != null) __obj.updateDynamic("sync")(sync.asInstanceOf[js.Any])
    if (zoom != null) __obj.updateDynamic("zoom")(zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[CrosshairOptions]
  }
}

