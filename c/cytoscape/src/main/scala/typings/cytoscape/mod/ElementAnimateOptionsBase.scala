package typings.cytoscape.mod

import org.scalablytyped.runtime.StringDictionary
import typings.cytoscape.mod.Css.TransitionTimingFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * http://js.cytoscape.org/#collection/animation
  */
@js.native
trait ElementAnimateOptionsBase extends js.Object {
  /** A function to call when the animation is done. */
  var complete: js.UndefOr[js.Function0[Unit]] = js.native
  /** The duration of the animation in milliseconds. */
  var duration: js.UndefOr[Double] = js.native
  /** A transition-timing-function easing style string that shapes the animation progress curve. */
  var easing: js.UndefOr[TransitionTimingFunction] = js.native
  /** A boolean indicating whether to queue the animation. */
  var queue: js.UndefOr[Boolean] = js.native
  /** A function to call each time the animation steps. */
  var step: js.UndefOr[js.Function0[Unit]] = js.native
  /** An object containing name-value pairs of style properties to animate. */
  var style: js.UndefOr[StringDictionary[js.Any]] = js.native
}

object ElementAnimateOptionsBase {
  @scala.inline
  def apply(): ElementAnimateOptionsBase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ElementAnimateOptionsBase]
  }
  @scala.inline
  implicit class ElementAnimateOptionsBaseOps[Self <: ElementAnimateOptionsBase] (val x: Self) extends AnyVal {
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
    def setComplete(value: () => Unit): Self = this.set("complete", js.Any.fromFunction0(value))
    @scala.inline
    def deleteComplete: Self = this.set("complete", js.undefined)
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    @scala.inline
    def setEasing(value: TransitionTimingFunction): Self = this.set("easing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEasing: Self = this.set("easing", js.undefined)
    @scala.inline
    def setQueue(value: Boolean): Self = this.set("queue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQueue: Self = this.set("queue", js.undefined)
    @scala.inline
    def setStep(value: () => Unit): Self = this.set("step", js.Any.fromFunction0(value))
    @scala.inline
    def deleteStep: Self = this.set("step", js.undefined)
    @scala.inline
    def setStyle(value: StringDictionary[js.Any]): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
  
}

