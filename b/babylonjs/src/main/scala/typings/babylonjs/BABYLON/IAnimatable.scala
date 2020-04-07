package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAnimatable extends js.Object {
  /**
    * Array of animations
    */
  var animations: Nullable[js.Array[Animation]]
}

object IAnimatable {
  @scala.inline
  def apply(animations: Nullable[js.Array[Animation]] = null): IAnimatable = {
    val __obj = js.Dynamic.literal()
    if (animations != null) __obj.updateDynamic("animations")(animations.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAnimatable]
  }
}

