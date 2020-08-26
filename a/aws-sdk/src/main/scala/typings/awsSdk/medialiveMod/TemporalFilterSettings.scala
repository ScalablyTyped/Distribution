package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TemporalFilterSettings extends js.Object {
  /**
    * If you enable this filter, the results are the following:
  - If the source content is noisy (it contains excessive digital artifacts), the filter cleans up the source.
  - If the source content is already clean, the filter tends to decrease the bitrate, especially when the rate control mode is QVBR.
    */
  var PostFilterSharpening: js.UndefOr[TemporalFilterPostFilterSharpening] = js.native
  /**
    * Choose a filter strength. We recommend a strength of 1 or 2. A higher strength might take out good information, resulting in an image that is overly soft.
    */
  var Strength: js.UndefOr[TemporalFilterStrength] = js.native
}

object TemporalFilterSettings {
  @scala.inline
  def apply(): TemporalFilterSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TemporalFilterSettings]
  }
  @scala.inline
  implicit class TemporalFilterSettingsOps[Self <: TemporalFilterSettings] (val x: Self) extends AnyVal {
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
    def setPostFilterSharpening(value: TemporalFilterPostFilterSharpening): Self = this.set("PostFilterSharpening", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePostFilterSharpening: Self = this.set("PostFilterSharpening", js.undefined)
    @scala.inline
    def setStrength(value: TemporalFilterStrength): Self = this.set("Strength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrength: Self = this.set("Strength", js.undefined)
  }
  
}

