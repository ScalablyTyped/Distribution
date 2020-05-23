package typings.babylonjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImpostorType extends js.Object {
  var friction: js.UndefOr[Double] = js.undefined
  var impostorSize: js.UndefOr[Double | DepthHeight] = js.undefined
  var impostorType: js.UndefOr[Double] = js.undefined
  var restitution: js.UndefOr[Double] = js.undefined
}

object ImpostorType {
  @scala.inline
  def apply(
    friction: js.UndefOr[Double] = js.undefined,
    impostorSize: Double | DepthHeight = null,
    impostorType: js.UndefOr[Double] = js.undefined,
    restitution: js.UndefOr[Double] = js.undefined
  ): ImpostorType = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(friction)) __obj.updateDynamic("friction")(friction.get.asInstanceOf[js.Any])
    if (impostorSize != null) __obj.updateDynamic("impostorSize")(impostorSize.asInstanceOf[js.Any])
    if (!js.isUndefined(impostorType)) __obj.updateDynamic("impostorType")(impostorType.get.asInstanceOf[js.Any])
    if (!js.isUndefined(restitution)) __obj.updateDynamic("restitution")(restitution.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImpostorType]
  }
}

