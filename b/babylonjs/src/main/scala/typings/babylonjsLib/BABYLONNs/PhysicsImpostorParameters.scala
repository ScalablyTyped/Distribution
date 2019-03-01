package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The interface for the physics imposter parameters
  * @see https://doc.babylonjs.com/how_to/using_the_physics_engine
  */
trait PhysicsImpostorParameters extends js.Object {
  /**
    * Specifies if bi-directional transformations should be disabled
    */
  var disableBidirectionalTransformation: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The friction of the physics imposter
    */
  var friction: js.UndefOr[scala.Double] = js.undefined
  /**
    * Specifies if the parent should be ignored
    */
  var ignoreParent: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The mass of the physics imposter
    */
  var mass: scala.Double
  /**
    * The native options of the physics imposter
    */
  var nativeOptions: js.UndefOr[js.Any] = js.undefined
  /**
    * The coefficient of restitution of the physics imposter
    */
  var restitution: js.UndefOr[scala.Double] = js.undefined
}

object PhysicsImpostorParameters {
  @scala.inline
  def apply(
    mass: scala.Double,
    disableBidirectionalTransformation: js.UndefOr[scala.Boolean] = js.undefined,
    friction: scala.Int | scala.Double = null,
    ignoreParent: js.UndefOr[scala.Boolean] = js.undefined,
    nativeOptions: js.Any = null,
    restitution: scala.Int | scala.Double = null
  ): PhysicsImpostorParameters = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("mass")(mass)
    if (!js.isUndefined(disableBidirectionalTransformation)) __obj.updateDynamic("disableBidirectionalTransformation")(disableBidirectionalTransformation)
    if (friction != null) __obj.updateDynamic("friction")(friction.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreParent)) __obj.updateDynamic("ignoreParent")(ignoreParent)
    if (nativeOptions != null) __obj.updateDynamic("nativeOptions")(nativeOptions)
    if (restitution != null) __obj.updateDynamic("restitution")(restitution.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhysicsImpostorParameters]
  }
}

