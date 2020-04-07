package typings.babylonjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFriction extends js.Object {
  /**
    * Friction definitions
    */
  var friction: js.UndefOr[Double] = js.undefined
  /**
    * the size of the impostor. Defaults to 10cm
    */
  var impostorSize: js.UndefOr[Double | AnonDepthHeight] = js.undefined
  /**
    * The type of impostor to create. Default is sphere
    */
  var impostorType: Double
  /**
    * Restitution
    */
  var restitution: js.UndefOr[Double] = js.undefined
}

object AnonFriction {
  @scala.inline
  def apply(
    impostorType: Double,
    friction: Int | Double = null,
    impostorSize: Double | AnonDepthHeight = null,
    restitution: Int | Double = null
  ): AnonFriction = {
    val __obj = js.Dynamic.literal(impostorType = impostorType.asInstanceOf[js.Any])
    if (friction != null) __obj.updateDynamic("friction")(friction.asInstanceOf[js.Any])
    if (impostorSize != null) __obj.updateDynamic("impostorSize")(impostorSize.asInstanceOf[js.Any])
    if (restitution != null) __obj.updateDynamic("restitution")(restitution.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFriction]
  }
}

