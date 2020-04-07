package typings.babylonjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonImpostorType extends js.Object {
  var friction: js.UndefOr[Double] = js.undefined
  var impostorSize: js.UndefOr[Double | AnonDepthHeight] = js.undefined
  var impostorType: js.UndefOr[Double] = js.undefined
  var restitution: js.UndefOr[Double] = js.undefined
}

object AnonImpostorType {
  @scala.inline
  def apply(
    friction: Int | Double = null,
    impostorSize: Double | AnonDepthHeight = null,
    impostorType: Int | Double = null,
    restitution: Int | Double = null
  ): AnonImpostorType = {
    val __obj = js.Dynamic.literal()
    if (friction != null) __obj.updateDynamic("friction")(friction.asInstanceOf[js.Any])
    if (impostorSize != null) __obj.updateDynamic("impostorSize")(impostorSize.asInstanceOf[js.Any])
    if (impostorType != null) __obj.updateDynamic("impostorType")(impostorType.asInstanceOf[js.Any])
    if (restitution != null) __obj.updateDynamic("restitution")(restitution.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonImpostorType]
  }
}

