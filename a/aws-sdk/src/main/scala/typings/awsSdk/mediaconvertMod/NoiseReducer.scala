package typings.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NoiseReducer extends js.Object {
  /**
    * Use Noise reducer filter (NoiseReducerFilter) to select one of the following spatial image filtering functions. To use this setting, you must also enable Noise reducer (NoiseReducer). * Bilateral preserves edges while reducing noise. * Mean (softest), Gaussian, Lanczos, and Sharpen (sharpest) do convolution filtering. * Conserve does min/max noise reduction. * Spatial does frequency-domain filtering based on JND principles. * Temporal optimizes video quality for complex motion.
    */
  var Filter: js.UndefOr[NoiseReducerFilter] = js.native
  /**
    * Settings for a noise reducer filter
    */
  var FilterSettings: js.UndefOr[NoiseReducerFilterSettings] = js.native
  /**
    * Noise reducer filter settings for spatial filter.
    */
  var SpatialFilterSettings: js.UndefOr[NoiseReducerSpatialFilterSettings] = js.native
  /**
    * Noise reducer filter settings for temporal filter.
    */
  var TemporalFilterSettings: js.UndefOr[NoiseReducerTemporalFilterSettings] = js.native
}

object NoiseReducer {
  @scala.inline
  def apply(
    Filter: NoiseReducerFilter = null,
    FilterSettings: NoiseReducerFilterSettings = null,
    SpatialFilterSettings: NoiseReducerSpatialFilterSettings = null,
    TemporalFilterSettings: NoiseReducerTemporalFilterSettings = null
  ): NoiseReducer = {
    val __obj = js.Dynamic.literal()
    if (Filter != null) __obj.updateDynamic("Filter")(Filter.asInstanceOf[js.Any])
    if (FilterSettings != null) __obj.updateDynamic("FilterSettings")(FilterSettings.asInstanceOf[js.Any])
    if (SpatialFilterSettings != null) __obj.updateDynamic("SpatialFilterSettings")(SpatialFilterSettings.asInstanceOf[js.Any])
    if (TemporalFilterSettings != null) __obj.updateDynamic("TemporalFilterSettings")(TemporalFilterSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[NoiseReducer]
  }
}

