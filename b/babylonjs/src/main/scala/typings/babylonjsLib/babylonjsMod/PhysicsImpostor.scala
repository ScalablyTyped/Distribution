package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Represents a physics imposter
     * @see https://doc.babylonjs.com/how_to/using_the_physics_engine
     */
@JSImport("babylonjs", "PhysicsImpostor")
@js.native
class PhysicsImpostor protected ()
  extends babylonjsLib.BABYLONNs.PhysicsImpostor {
  /**
           * Initializes the physics imposter
           * @param object The physics-enabled object used as the physics imposter
           * @param type The type of the physics imposter
           * @param _options The options for the physics imposter
           * @param _scene The Babylon scene
           */
  def this(/**
           * The physics-enabled object used as the physics imposter
           */
  `object`: babylonjsLib.BABYLONNs.IPhysicsEnabledObject, /**
           * The type of the physics imposter
           */
  `type`: scala.Double) = this()
  /**
           * Initializes the physics imposter
           * @param object The physics-enabled object used as the physics imposter
           * @param type The type of the physics imposter
           * @param _options The options for the physics imposter
           * @param _scene The Babylon scene
           */
  def this(/**
           * The physics-enabled object used as the physics imposter
           */
  `object`: babylonjsLib.BABYLONNs.IPhysicsEnabledObject, /**
           * The type of the physics imposter
           */
  `type`: scala.Double, _options: babylonjsLib.BABYLONNs.PhysicsImpostorParameters) = this()
  /**
           * Initializes the physics imposter
           * @param object The physics-enabled object used as the physics imposter
           * @param type The type of the physics imposter
           * @param _options The options for the physics imposter
           * @param _scene The Babylon scene
           */
  def this(/**
           * The physics-enabled object used as the physics imposter
           */
  `object`: babylonjsLib.BABYLONNs.IPhysicsEnabledObject, /**
           * The type of the physics imposter
           */
  `type`: scala.Double, _options: babylonjsLib.BABYLONNs.PhysicsImpostorParameters, _scene: babylonjsLib.BABYLONNs.Scene) = this()
}

/**
     * Represents a physics imposter
     * @see https://doc.babylonjs.com/how_to/using_the_physics_engine
     */
@JSImport("babylonjs", "PhysicsImpostor")
@js.native
object PhysicsImpostor extends js.Object {
  /**
           * Box-Imposter type
           */
  var BoxImpostor: scala.Double = js.native
  /**
           * Cylinder-Imposter type
           */
  var CylinderImpostor: scala.Double = js.native
  /**
           * The default object size of the imposter
           */
  var DEFAULT_OBJECT_SIZE: babylonjsLib.BABYLONNs.Vector3 = js.native
  /**
           * Heightmap-Imposter type
           */
  var HeightmapImpostor: scala.Double = js.native
  /**
           * The identity quaternion of the imposter
           */
  var IDENTITY_QUATERNION: babylonjsLib.BABYLONNs.Quaternion = js.native
  /**
           * Mesh-imposter type
           */
  var MeshImpostor: scala.Double = js.native
  /**
           * No-Imposter type
           */
  var NoImpostor: scala.Double = js.native
  /**
           * Particle-Imposter type
           */
  var ParticleImpostor: scala.Double = js.native
  /**
           * Plane-Imposter type
           */
  var PlaneImpostor: scala.Double = js.native
  /**
           * Sphere-Imposter type
           */
  var SphereImpostor: scala.Double = js.native
  var _tmpQuat: js.Any = js.native
  var _tmpVecs: js.Any = js.native
}

