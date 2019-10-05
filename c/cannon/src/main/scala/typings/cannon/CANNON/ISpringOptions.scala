package typings.cannon.CANNON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISpringOptions extends js.Object {
  var damping: js.UndefOr[Double] = js.undefined
  var localAnchorA: js.UndefOr[Vec3] = js.undefined
  var localAnchorB: js.UndefOr[Vec3] = js.undefined
  var restLength: js.UndefOr[Double] = js.undefined
  var stiffness: js.UndefOr[Double] = js.undefined
  var worldAnchorA: js.UndefOr[Vec3] = js.undefined
  var worldAnchorB: js.UndefOr[Vec3] = js.undefined
}

object ISpringOptions {
  @scala.inline
  def apply(
    damping: Int | Double = null,
    localAnchorA: Vec3 = null,
    localAnchorB: Vec3 = null,
    restLength: Int | Double = null,
    stiffness: Int | Double = null,
    worldAnchorA: Vec3 = null,
    worldAnchorB: Vec3 = null
  ): ISpringOptions = {
    val __obj = js.Dynamic.literal()
    if (damping != null) __obj.updateDynamic("damping")(damping.asInstanceOf[js.Any])
    if (localAnchorA != null) __obj.updateDynamic("localAnchorA")(localAnchorA)
    if (localAnchorB != null) __obj.updateDynamic("localAnchorB")(localAnchorB)
    if (restLength != null) __obj.updateDynamic("restLength")(restLength.asInstanceOf[js.Any])
    if (stiffness != null) __obj.updateDynamic("stiffness")(stiffness.asInstanceOf[js.Any])
    if (worldAnchorA != null) __obj.updateDynamic("worldAnchorA")(worldAnchorA)
    if (worldAnchorB != null) __obj.updateDynamic("worldAnchorB")(worldAnchorB)
    __obj.asInstanceOf[ISpringOptions]
  }
}

