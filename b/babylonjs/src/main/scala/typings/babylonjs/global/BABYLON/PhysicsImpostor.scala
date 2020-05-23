package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.IPhysicsEnabledObject
import typings.babylonjs.BABYLON.PhysicsImpostorParameters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.PhysicsImpostor")
@js.native
class PhysicsImpostor protected ()
  extends typings.babylonjs.BABYLON.PhysicsImpostor {
  /**
    * Initializes the physics imposter
    * @param object The physics-enabled object used as the physics imposter
    * @param type The type of the physics imposter
    * @param _options The options for the physics imposter
    * @param _scene The Babylon scene
    */
  def this(
    /**
    * The physics-enabled object used as the physics imposter
    */
  `object`: IPhysicsEnabledObject,
    /**
    * The type of the physics imposter
    */
  `type`: Double
  ) = this()
  def this(
    /**
    * The physics-enabled object used as the physics imposter
    */
  `object`: IPhysicsEnabledObject,
    /**
    * The type of the physics imposter
    */
  `type`: Double,
    _options: PhysicsImpostorParameters
  ) = this()
  def this(
    /**
    * The physics-enabled object used as the physics imposter
    */
  `object`: IPhysicsEnabledObject,
    /**
    * The type of the physics imposter
    */
  `type`: Double,
    _options: PhysicsImpostorParameters,
    _scene: typings.babylonjs.BABYLON.Scene
  ) = this()
}

/* static members */
@JSGlobal("BABYLON.PhysicsImpostor")
@js.native
object PhysicsImpostor extends js.Object {
  /**
    * Box-Imposter type
    */
  var BoxImpostor: Double = js.native
  /**
    * Capsule-Impostor type (Ammo.js plugin only)
    */
  var CapsuleImpostor: Double = js.native
  /**
    * Cloth-Imposter type
    */
  var ClothImpostor: Double = js.native
  /**
    * ConvexHull-Impostor type (Ammo.js plugin only)
    */
  var ConvexHullImpostor: Double = js.native
  /**
    * Custom-Imposter type (Ammo.js plugin only)
    */
  var CustomImpostor: Double = js.native
  /**
    * Cylinder-Imposter type
    */
  var CylinderImpostor: Double = js.native
  /**
    * The default object size of the imposter
    */
  var DEFAULT_OBJECT_SIZE: typings.babylonjs.BABYLON.Vector3 = js.native
  /**
    * Heightmap-Imposter type
    */
  var HeightmapImpostor: Double = js.native
  /**
    * The identity quaternion of the imposter
    */
  var IDENTITY_QUATERNION: typings.babylonjs.BABYLON.Quaternion = js.native
  /**
    * Mesh-imposter type
    */
  var MeshImpostor: Double = js.native
  /**
    * No-Imposter type
    */
  var NoImpostor: Double = js.native
  /**
    * Particle-Imposter type
    */
  var ParticleImpostor: Double = js.native
  /**
    * Plane-Imposter type
    */
  var PlaneImpostor: Double = js.native
  /**
    * Rope-Imposter type
    */
  var RopeImpostor: Double = js.native
  /**
    * Softbody-Imposter type
    */
  var SoftbodyImpostor: Double = js.native
  /**
    * Sphere-Imposter type
    */
  var SphereImpostor: Double = js.native
  var _tmpQuat: js.Any = js.native
  var _tmpVecs: js.Any = js.native
}

