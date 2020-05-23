package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnimationPropertiesOverride extends js.Object {
  /**
    * Gets or sets the blending speed to use when enableBlending is true
    */
  var blendingSpeed: Double
  /**
    * Gets or sets a value indicating if animation blending must be used
    */
  var enableBlending: Boolean
  /**
    * Gets or sets the default loop mode to use
    */
  var loopMode: Double
}

object AnimationPropertiesOverride {
  @scala.inline
  def apply(blendingSpeed: Double, enableBlending: Boolean, loopMode: Double): AnimationPropertiesOverride = {
    val __obj = js.Dynamic.literal(blendingSpeed = blendingSpeed.asInstanceOf[js.Any], enableBlending = enableBlending.asInstanceOf[js.Any], loopMode = loopMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationPropertiesOverride]
  }
}

