package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait H264FilterSettings extends js.Object {
  var TemporalFilterSettings: js.UndefOr[typings.awsSdk.medialiveMod.TemporalFilterSettings] = js.native
}

object H264FilterSettings {
  @scala.inline
  def apply(TemporalFilterSettings: TemporalFilterSettings = null): H264FilterSettings = {
    val __obj = js.Dynamic.literal()
    if (TemporalFilterSettings != null) __obj.updateDynamic("TemporalFilterSettings")(TemporalFilterSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[H264FilterSettings]
  }
}

