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
  def apply(): NoiseReducer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NoiseReducer]
  }
  @scala.inline
  implicit class NoiseReducerOps[Self <: NoiseReducer] (val x: Self) extends AnyVal {
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
    def setFilter(value: NoiseReducerFilter): Self = this.set("Filter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilter: Self = this.set("Filter", js.undefined)
    @scala.inline
    def setFilterSettings(value: NoiseReducerFilterSettings): Self = this.set("FilterSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilterSettings: Self = this.set("FilterSettings", js.undefined)
    @scala.inline
    def setSpatialFilterSettings(value: NoiseReducerSpatialFilterSettings): Self = this.set("SpatialFilterSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpatialFilterSettings: Self = this.set("SpatialFilterSettings", js.undefined)
    @scala.inline
    def setTemporalFilterSettings(value: NoiseReducerTemporalFilterSettings): Self = this.set("TemporalFilterSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemporalFilterSettings: Self = this.set("TemporalFilterSettings", js.undefined)
  }
  
}

