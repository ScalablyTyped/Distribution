package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A spot light is defined by a position, a direction, an angle, and an exponent.
  * These values define a cone of light starting from the position, emitting toward the direction.
  * The angle, in radians, defines the size (field of illumination) of the spotlight's conical beam,
  * and the exponent defines the speed of the decay of the light with distance (reach).
  * Documentation: https://doc.babylonjs.com/babylon101/lights
  */
@JSGlobal("BABYLON.SpotLight")
@js.native
class SpotLight protected () extends ShadowLight {
  /**
    * Creates a SpotLight object in the scene. A spot light is a simply light oriented cone.
    * It can cast shadows.
    * Documentation : http://doc.babylonjs.com/tutorials/lights
    * @param name The light friendly name
    * @param position The position of the spot light in the scene
    * @param direction The direction of the light in the scene
    * @param angle The cone angle of the light in Radians
    * @param exponent The light decay speed with the distance from the emission spot
    * @param scene The scene the lights belongs to
    */
  def this(name: java.lang.String, position: Vector3, direction: Vector3, angle: scala.Double, exponent: scala.Double, scene: Scene) = this()
  var _angle: js.Any = js.native
  var _computeAngleValues: js.Any = js.native
  var _cosHalfAngle: js.Any = js.native
  var _innerAngle: js.Any = js.native
  var _lightAngleOffset: js.Any = js.native
  var _lightAngleScale: js.Any = js.native
  var _projectionTexture: js.Any = js.native
  var _projectionTextureDirty: js.Any = js.native
  var _projectionTextureLightFar: scala.Double = js.native
  var _projectionTextureLightNear: scala.Double = js.native
  var _projectionTextureMatrix: js.Any = js.native
  var _projectionTextureProjectionLightDirty: js.Any = js.native
  var _projectionTextureProjectionLightMatrix: js.Any = js.native
  var _projectionTextureScalingMatrix: js.Any = js.native
  var _projectionTextureUpDirection: Vector3 = js.native
  var _projectionTextureViewLightDirty: js.Any = js.native
  var _projectionTextureViewLightMatrix: js.Any = js.native
  var _projectionTextureViewTargetVector: js.Any = js.native
  var _shadowAngleScale: js.Any = js.native
  /**
    * Gets the cone angle of the spot light in Radians.
    */
  /**
    * Sets the cone angle of the spot light in Radians.
    */
  var angle: scala.Double = js.native
  /**
    * The light decay speed with the distance from the emission spot.
    */
  var exponent: scala.Double = js.native
  /**
    * Only used in gltf falloff mode, this defines the angle where
    * the directional falloff will start before cutting at angle which could be seen
    * as outer angle.
    */
  /**
    * Only used in gltf falloff mode, this defines the angle where
    * the directional falloff will start before cutting at angle which could be seen
    * as outer angle.
    */
  var innerAngle: scala.Double = js.native
  /**
    * Gets the projection texture of the light.
    */
  /**
    * Sets the projection texture of the light.
    */
  var projectionTexture: Nullable[BaseTexture] = js.native
  /**
    * Gets the far clip of the Spotlight for texture projection.
    */
  /**
    * Sets the far clip of the Spotlight for texture projection.
    */
  var projectionTextureLightFar: scala.Double = js.native
  /**
    * Gets the near clip of the Spotlight for texture projection.
    */
  /**
    * Sets the near clip of the Spotlight for texture projection.
    */
  var projectionTextureLightNear: scala.Double = js.native
  /**
    * Allows reading the projecton texture
    */
  val projectionTextureMatrix: Matrix = js.native
  /**
    * Gets the Up vector of the Spotlight for texture projection.
    */
  /**
    * Sets the Up vector of the Spotlight for texture projection.
    */
  var projectionTextureUpDirection: Vector3 = js.native
  /**
    * Allows scaling the angle of the light for shadow generation only.
    */
  /**
    * Allows scaling the angle of the light for shadow generation only.
    */
  var shadowAngleScale: scala.Double = js.native
  /**
    * Main function for light texture projection matrix computing.
    */
  /* protected */ def _computeProjectionTextureMatrix(): scala.Unit = js.native
  /* protected */ def _computeProjectionTextureProjectionLightMatrix(): scala.Unit = js.native
  /* protected */ def _computeProjectionTextureViewLightMatrix(): scala.Unit = js.native
}

