package typings.blueprintjsCore.collapseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICollapseState extends js.Object {
  /** The state the element is currently in. */
  var animationState: AnimationStates
  /** The height that should be used for the content animations. This is a CSS value, not just a number. */
  var height: js.UndefOr[String] = js.undefined
  /**
    * The most recent non-zero height (once a height has been measured upon first open; it is undefined until then)
    */
  var heightWhenOpen: js.UndefOr[Double] = js.undefined
}

object ICollapseState {
  @scala.inline
  def apply(
    animationState: AnimationStates,
    height: String = null,
    heightWhenOpen: js.UndefOr[Double] = js.undefined
  ): ICollapseState = {
    val __obj = js.Dynamic.literal(animationState = animationState.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(heightWhenOpen)) __obj.updateDynamic("heightWhenOpen")(heightWhenOpen.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICollapseState]
  }
}

