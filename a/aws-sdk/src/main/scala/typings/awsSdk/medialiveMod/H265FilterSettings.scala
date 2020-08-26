package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait H265FilterSettings extends js.Object {
  var TemporalFilterSettings: js.UndefOr[typings.awsSdk.medialiveMod.TemporalFilterSettings] = js.native
}

object H265FilterSettings {
  @scala.inline
  def apply(): H265FilterSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[H265FilterSettings]
  }
  @scala.inline
  implicit class H265FilterSettingsOps[Self <: H265FilterSettings] (val x: Self) extends AnyVal {
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
    def setTemporalFilterSettings(value: TemporalFilterSettings): Self = this.set("TemporalFilterSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemporalFilterSettings: Self = this.set("TemporalFilterSettings", js.undefined)
  }
  
}

