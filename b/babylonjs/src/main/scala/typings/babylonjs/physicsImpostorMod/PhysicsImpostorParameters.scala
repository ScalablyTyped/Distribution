package typings.babylonjs.physicsImpostorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PhysicsImpostorParameters extends js.Object {
  /**
    * The collision margin around a soft object
    */
  var damping: js.UndefOr[Double] = js.undefined
  /**
    * Specifies if bi-directional transformations should be disabled
    */
  var disableBidirectionalTransformation: js.UndefOr[Boolean] = js.undefined
  /**
    * The number used to fix points on a cloth (0, 1, 2, 4, 8) or rope (0, 1, 2) only
    * 0 None, 1, back left or top, 2, back right or bottom, 4, front left, 8, front right
    * Add to fix multiple points
    */
  var fixedPoints: js.UndefOr[Double] = js.undefined
  /**
    * The friction of the physics imposter
    */
  var friction: js.UndefOr[Double] = js.undefined
  /**
    * Specifies if the parent should be ignored
    */
  var ignoreParent: js.UndefOr[Boolean] = js.undefined
  /**
    * The collision margin around a soft object
    */
  var margin: js.UndefOr[Double] = js.undefined
  /**
    * The mass of the physics imposter
    */
  var mass: Double
  /**
    * The native options of the physics imposter
    */
  var nativeOptions: js.UndefOr[js.Any] = js.undefined
  /**
    * The path for a rope based on an extrusion
    */
  var path: js.UndefOr[js.Any] = js.undefined
  /**
    * The number of iterations used in maintaining consistent vertex positions, soft object only
    */
  var positionIterations: js.UndefOr[Double] = js.undefined
  /**
    * The pressure inside the physics imposter, soft object only
    */
  var pressure: js.UndefOr[Double] = js.undefined
  /**
    * The coefficient of restitution of the physics imposter
    */
  var restitution: js.UndefOr[Double] = js.undefined
  /**
    * The shape of an extrusion used for a rope based on an extrusion
    */
  var shape: js.UndefOr[js.Any] = js.undefined
  /**
    * The stiffness the physics imposter, soft object only
    */
  var stiffness: js.UndefOr[Double] = js.undefined
  /**
    * The number of iterations used in maintaining consistent vertex velocities, soft object only
    */
  var velocityIterations: js.UndefOr[Double] = js.undefined
}

object PhysicsImpostorParameters {
  @scala.inline
  def apply(
    mass: Double,
    damping: js.UndefOr[Double] = js.undefined,
    disableBidirectionalTransformation: js.UndefOr[Boolean] = js.undefined,
    fixedPoints: js.UndefOr[Double] = js.undefined,
    friction: js.UndefOr[Double] = js.undefined,
    ignoreParent: js.UndefOr[Boolean] = js.undefined,
    margin: js.UndefOr[Double] = js.undefined,
    nativeOptions: js.Any = null,
    path: js.Any = null,
    positionIterations: js.UndefOr[Double] = js.undefined,
    pressure: js.UndefOr[Double] = js.undefined,
    restitution: js.UndefOr[Double] = js.undefined,
    shape: js.Any = null,
    stiffness: js.UndefOr[Double] = js.undefined,
    velocityIterations: js.UndefOr[Double] = js.undefined
  ): PhysicsImpostorParameters = {
    val __obj = js.Dynamic.literal(mass = mass.asInstanceOf[js.Any])
    if (!js.isUndefined(damping)) __obj.updateDynamic("damping")(damping.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disableBidirectionalTransformation)) __obj.updateDynamic("disableBidirectionalTransformation")(disableBidirectionalTransformation.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fixedPoints)) __obj.updateDynamic("fixedPoints")(fixedPoints.get.asInstanceOf[js.Any])
    if (!js.isUndefined(friction)) __obj.updateDynamic("friction")(friction.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreParent)) __obj.updateDynamic("ignoreParent")(ignoreParent.get.asInstanceOf[js.Any])
    if (!js.isUndefined(margin)) __obj.updateDynamic("margin")(margin.get.asInstanceOf[js.Any])
    if (nativeOptions != null) __obj.updateDynamic("nativeOptions")(nativeOptions.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (!js.isUndefined(positionIterations)) __obj.updateDynamic("positionIterations")(positionIterations.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pressure)) __obj.updateDynamic("pressure")(pressure.get.asInstanceOf[js.Any])
    if (!js.isUndefined(restitution)) __obj.updateDynamic("restitution")(restitution.get.asInstanceOf[js.Any])
    if (shape != null) __obj.updateDynamic("shape")(shape.asInstanceOf[js.Any])
    if (!js.isUndefined(stiffness)) __obj.updateDynamic("stiffness")(stiffness.get.asInstanceOf[js.Any])
    if (!js.isUndefined(velocityIterations)) __obj.updateDynamic("velocityIterations")(velocityIterations.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhysicsImpostorParameters]
  }
}

