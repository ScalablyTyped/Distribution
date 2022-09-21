package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpotLight
  extends StObject
     with ShadowLight {
  
  /* private */ var _angle: Any = js.native
  
  /* private */ var _computeAngleValues: Any = js.native
  
  /**
    * Main function for light texture projection matrix computing.
    */
  /* protected */ def _computeProjectionTextureMatrix(): Unit = js.native
  
  /* protected */ def _computeProjectionTextureProjectionLightMatrix(): Unit = js.native
  
  /* protected */ def _computeProjectionTextureViewLightMatrix(): Unit = js.native
  
  /* private */ var _cosHalfAngle: Any = js.native
  
  /* private */ var _innerAngle: Any = js.native
  
  /* private */ var _lightAngleOffset: Any = js.native
  
  /* private */ var _lightAngleScale: Any = js.native
  
  /* private */ var _projectionTexture: Any = js.native
  
  /* private */ var _projectionTextureDirty: Any = js.native
  
  /* protected */ var _projectionTextureLightFar: Double = js.native
  
  /* protected */ var _projectionTextureLightNear: Double = js.native
  
  /* private */ var _projectionTextureMatrix: Any = js.native
  
  /* private */ var _projectionTextureProjectionLightDirty: Any = js.native
  
  /* private */ var _projectionTextureProjectionLightMatrix: Any = js.native
  
  /* private */ var _projectionTextureScalingMatrix: Any = js.native
  
  /* protected */ var _projectionTextureUpDirection: Vector3 = js.native
  
  /* private */ var _projectionTextureViewLightDirty: Any = js.native
  
  /* private */ var _projectionTextureViewLightMatrix: Any = js.native
  
  /* private */ var _projectionTextureViewTargetVector: Any = js.native
  
  /* private */ var _shadowAngleScale: Any = js.native
  
  /**
    * Gets the cone angle of the spot light in Radians.
    */
  def angle: Double = js.native
  /**
    * Sets the cone angle of the spot light in Radians.
    */
  def angle_=(value: Double): Unit = js.native
  
  /**
    * The light decay speed with the distance from the emission spot.
    */
  var exponent: Double = js.native
  
  /**
    * Only used in gltf falloff mode, this defines the angle where
    * the directional falloff will start before cutting at angle which could be seen
    * as outer angle.
    */
  def innerAngle: Double = js.native
  /**
    * Only used in gltf falloff mode, this defines the angle where
    * the directional falloff will start before cutting at angle which could be seen
    * as outer angle.
    */
  def innerAngle_=(value: Double): Unit = js.native
  
  /**
    * Gets the projection texture of the light.
    */
  def projectionTexture: Nullable[BaseTexture] = js.native
  
  /**
    * Gets the far clip of the Spotlight for texture projection.
    */
  def projectionTextureLightFar: Double = js.native
  /**
    * Sets the far clip of the Spotlight for texture projection.
    */
  def projectionTextureLightFar_=(value: Double): Unit = js.native
  
  /**
    * Gets the near clip of the Spotlight for texture projection.
    */
  def projectionTextureLightNear: Double = js.native
  /**
    * Sets the near clip of the Spotlight for texture projection.
    */
  def projectionTextureLightNear_=(value: Double): Unit = js.native
  
  /**
    * Allows reading the projection texture
    */
  def projectionTextureMatrix: Matrix = js.native
  
  /**
    * Gets or sets the light projection matrix as used by the projection texture
    */
  def projectionTextureProjectionLightMatrix: Matrix = js.native
  def projectionTextureProjectionLightMatrix_=(projection: Matrix): Unit = js.native
  
  /**
    * Gets the Up vector of the Spotlight for texture projection.
    */
  def projectionTextureUpDirection: Vector3 = js.native
  /**
    * Sets the Up vector of the Spotlight for texture projection.
    */
  def projectionTextureUpDirection_=(value: Vector3): Unit = js.native
  
  /**
    * Sets the projection texture of the light.
    */
  def projectionTexture_=(value: Nullable[BaseTexture]): Unit = js.native
  
  /**
    * Allows scaling the angle of the light for shadow generation only.
    */
  def shadowAngleScale: Double = js.native
  /**
    * Allows scaling the angle of the light for shadow generation only.
    */
  def shadowAngleScale_=(value: Double): Unit = js.native
}
