package typings.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NoiseReducerFilterSettings extends js.Object {
  /**
    * Relative strength of noise reducing filter. Higher values produce stronger filtering.
    */
  var Strength: js.UndefOr[integerMin0Max3] = js.native
}

object NoiseReducerFilterSettings {
  @scala.inline
  def apply(): NoiseReducerFilterSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NoiseReducerFilterSettings]
  }
  @scala.inline
  implicit class NoiseReducerFilterSettingsOps[Self <: NoiseReducerFilterSettings] (val x: Self) extends AnyVal {
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
    def setStrength(value: integerMin0Max3): Self = this.set("Strength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrength: Self = this.set("Strength", js.undefined)
  }
  
}

