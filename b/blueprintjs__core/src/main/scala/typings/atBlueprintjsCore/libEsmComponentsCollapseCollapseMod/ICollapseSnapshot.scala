package typings.atBlueprintjsCore.libEsmComponentsCollapseCollapseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICollapseSnapshot extends js.Object {
  var animationState: js.UndefOr[AnimationStates] = js.undefined
  var height: js.UndefOr[String] = js.undefined
}

object ICollapseSnapshot {
  @scala.inline
  def apply(animationState: AnimationStates = null, height: String = null): ICollapseSnapshot = {
    val __obj = js.Dynamic.literal()
    if (animationState != null) __obj.updateDynamic("animationState")(animationState)
    if (height != null) __obj.updateDynamic("height")(height)
    __obj.asInstanceOf[ICollapseSnapshot]
  }
}

