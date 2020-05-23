package typings.babylonjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImpostorSize extends js.Object {
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

object ImpostorSize {
  @scala.inline
  def apply(
    friction: js.UndefOr[Double] = js.undefined,
    impostorSize: Double | DepthHeight = null,
    impostorType: js.UndefOr[Double] = js.undefined,
    restitution: js.UndefOr[Double] = js.undefined,
    useControllerMesh: js.UndefOr[Boolean] = js.undefined
  ): ImpostorSize = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(friction)) __obj.updateDynamic("friction")(friction.get.asInstanceOf[js.Any])
    if (impostorSize != null) __obj.updateDynamic("impostorSize")(impostorSize.asInstanceOf[js.Any])
    if (!js.isUndefined(impostorType)) __obj.updateDynamic("impostorType")(impostorType.get.asInstanceOf[js.Any])
    if (!js.isUndefined(restitution)) __obj.updateDynamic("restitution")(restitution.get.asInstanceOf[js.Any])
    if (!js.isUndefined(useControllerMesh)) __obj.updateDynamic("useControllerMesh")(useControllerMesh.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImpostorSize]
  }
}

