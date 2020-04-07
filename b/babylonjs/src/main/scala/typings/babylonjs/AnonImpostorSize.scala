package typings.babylonjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonImpostorSize extends js.Object {
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
  var impostorType: js.UndefOr[Double] = js.undefined
  /**
    * Restitution
    */
  var restitution: js.UndefOr[Double] = js.undefined
  /**
    * If set to true, a mesh impostor will be created when the controller mesh was loaded
    * Note that this requires a physics engine that supports mesh impostors!
    */
  var useControllerMesh: js.UndefOr[Boolean] = js.undefined
}

object AnonImpostorSize {
  @scala.inline
  def apply(
    friction: Int | Double = null,
    impostorSize: Double | AnonDepthHeight = null,
    impostorType: Int | Double = null,
    restitution: Int | Double = null,
    useControllerMesh: js.UndefOr[Boolean] = js.undefined
  ): AnonImpostorSize = {
    val __obj = js.Dynamic.literal()
    if (friction != null) __obj.updateDynamic("friction")(friction.asInstanceOf[js.Any])
    if (impostorSize != null) __obj.updateDynamic("impostorSize")(impostorSize.asInstanceOf[js.Any])
    if (impostorType != null) __obj.updateDynamic("impostorType")(impostorType.asInstanceOf[js.Any])
    if (restitution != null) __obj.updateDynamic("restitution")(restitution.asInstanceOf[js.Any])
    if (!js.isUndefined(useControllerMesh)) __obj.updateDynamic("useControllerMesh")(useControllerMesh.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonImpostorSize]
  }
}

