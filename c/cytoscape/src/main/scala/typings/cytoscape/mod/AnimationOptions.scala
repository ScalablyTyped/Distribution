package typings.cytoscape.mod

import typings.cytoscape.mod.Css.TransitionTimingFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnimationOptions extends js.Object {
  /** An object containing centring options from which the graph will be animated. */
  var center: js.UndefOr[CenterOptions] = js.native
  /** duration - The duration of the animation in milliseconds. */
  var duration: js.UndefOr[Double] = js.native
  /** easing - A transition-timing-function easing style string that shapes the animation progress curve. */
  var easing: js.UndefOr[TransitionTimingFunction] = js.native
  /** An object containing fitting options from which the graph will be animated. */
  var fit: js.UndefOr[AnimationFitOptions] = js.native
  /** A panning position to which the graph will be animated. */
  var pan: js.UndefOr[Position] = js.native
  /** A relative panning position to which the graph will be animated. */
  var panBy: js.UndefOr[Position] = js.native
  /** A zoom level to which the graph will be animated. */
  var zoom: js.UndefOr[ZoomOptions] = js.native
}

object AnimationOptions {
  @scala.inline
  def apply(): AnimationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnimationOptions]
  }
  @scala.inline
  implicit class AnimationOptionsOps[Self <: AnimationOptions] (val x: Self) extends AnyVal {
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
    def setCenter(value: CenterOptions): Self = this.set("center", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCenter: Self = this.set("center", js.undefined)
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    @scala.inline
    def setEasing(value: TransitionTimingFunction): Self = this.set("easing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEasing: Self = this.set("easing", js.undefined)
    @scala.inline
    def setFit(value: AnimationFitOptions): Self = this.set("fit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFit: Self = this.set("fit", js.undefined)
    @scala.inline
    def setPan(value: Position): Self = this.set("pan", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePan: Self = this.set("pan", js.undefined)
    @scala.inline
    def setPanBy(value: Position): Self = this.set("panBy", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePanBy: Self = this.set("panBy", js.undefined)
    @scala.inline
    def setZoom(value: ZoomOptions): Self = this.set("zoom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZoom: Self = this.set("zoom", js.undefined)
  }
  
}

