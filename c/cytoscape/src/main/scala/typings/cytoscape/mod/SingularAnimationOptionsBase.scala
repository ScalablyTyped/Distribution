package typings.cytoscape.mod

import typings.cytoscape.mod.Css.TransitionTimingFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SingularAnimationOptionsBase extends js.Object {
  /** The duration of the animation in milliseconds. */
  var duration: Double = js.native
  /** A transition-timing-function easing style string that shapes the animation progress curve. */
  var easing: TransitionTimingFunction = js.native
  /** A position to which the elements will be animated. */
  var position: Position = js.native
  /** A rendered position to which the elements will be animated. */
  var renderedPosition: Position = js.native
  /** An object containing name-value pairs of style properties to animate. */
  var style: js.Any = js.native
}

object SingularAnimationOptionsBase {
  @scala.inline
  def apply(
    duration: Double,
    easing: TransitionTimingFunction,
    position: Position,
    renderedPosition: Position,
    style: js.Any
  ): SingularAnimationOptionsBase = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], easing = easing.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], renderedPosition = renderedPosition.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[SingularAnimationOptionsBase]
  }
  @scala.inline
  implicit class SingularAnimationOptionsBaseOps[Self <: SingularAnimationOptionsBase] (val x: Self) extends AnyVal {
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
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def setEasing(value: TransitionTimingFunction): Self = this.set("easing", value.asInstanceOf[js.Any])
    @scala.inline
    def setPosition(value: Position): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def setRenderedPosition(value: Position): Self = this.set("renderedPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def setStyle(value: js.Any): Self = this.set("style", value.asInstanceOf[js.Any])
  }
  
}

