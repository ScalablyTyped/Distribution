package typings.babylonjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Friction extends js.Object {
  /**
    * Friction definitions
    */
  var friction: js.UndefOr[Double] = js.undefined
  /**
    * the size of the impostor. Defaults to 10cm
    */
  var impostorSize: js.UndefOr[Double | DepthHeight] = js.undefined
  /**
    * The type of impostor to create. Default is sphere
    */
  var impostorType: Double
  /**
    * Restitution
    */
  var restitution: js.UndefOr[Double] = js.undefined
}

object Friction {
  @scala.inline
  def apply(
    impostorType: Double,
    friction: js.UndefOr[Double] = js.undefined,
    impostorSize: Double | DepthHeight = null,
    restitution: js.UndefOr[Double] = js.undefined
  ): Friction = {
    val __obj = js.Dynamic.literal(impostorType = impostorType.asInstanceOf[js.Any])
    if (!js.isUndefined(friction)) __obj.updateDynamic("friction")(friction.get.asInstanceOf[js.Any])
    if (impostorSize != null) __obj.updateDynamic("impostorSize")(impostorSize.asInstanceOf[js.Any])
    if (!js.isUndefined(restitution)) __obj.updateDynamic("restitution")(restitution.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Friction]
  }
}

