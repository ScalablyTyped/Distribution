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
    damping: js.UndefOr[Double] = js.undefined,
    localAnchorA: Vec3 = null,
    localAnchorB: Vec3 = null,
    restLength: js.UndefOr[Double] = js.undefined,
    stiffness: js.UndefOr[Double] = js.undefined,
    worldAnchorA: Vec3 = null,
    worldAnchorB: Vec3 = null
  ): ISpringOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(damping)) __obj.updateDynamic("damping")(damping.get.asInstanceOf[js.Any])
    if (localAnchorA != null) __obj.updateDynamic("localAnchorA")(localAnchorA.asInstanceOf[js.Any])
    if (localAnchorB != null) __obj.updateDynamic("localAnchorB")(localAnchorB.asInstanceOf[js.Any])
    if (!js.isUndefined(restLength)) __obj.updateDynamic("restLength")(restLength.get.asInstanceOf[js.Any])
    if (!js.isUndefined(stiffness)) __obj.updateDynamic("stiffness")(stiffness.get.asInstanceOf[js.Any])
    if (worldAnchorA != null) __obj.updateDynamic("worldAnchorA")(worldAnchorA.asInstanceOf[js.Any])
    if (worldAnchorB != null) __obj.updateDynamic("worldAnchorB")(worldAnchorB.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISpringOptions]
  }
}

