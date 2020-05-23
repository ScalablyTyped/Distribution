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
  def apply(
    PostFilterSharpening: TemporalFilterPostFilterSharpening = null,
    Strength: TemporalFilterStrength = null
  ): TemporalFilterSettings = {
    val __obj = js.Dynamic.literal()
    if (PostFilterSharpening != null) __obj.updateDynamic("PostFilterSharpening")(PostFilterSharpening.asInstanceOf[js.Any])
    if (Strength != null) __obj.updateDynamic("Strength")(Strength.asInstanceOf[js.Any])
    __obj.asInstanceOf[TemporalFilterSettings]
  }
}

