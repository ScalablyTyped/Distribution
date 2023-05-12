package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a physics radial explosion event
  */
@js.native
trait PhysicsRadialExplosionEvent extends StObject {
  
  /* private */ var _dataFetched: Any = js.native
  
  /* private */ var _getHitData: Any = js.native
  
  /* private */ var _intersectsWithSphere: Any = js.native
  
  /* private */ var _options: Any = js.native
  
  /*** Helpers ***/
  /* private */ var _prepareSphere: Any = js.native
  
  /* private */ var _scene: Any = js.native
  
  /* private */ var _sphere: Any = js.native
  
  /**
    * Disposes the sphere.
    * @param force Specifies if the sphere should be disposed by force
    */
  def dispose(): Unit = js.native
  def dispose(force: Boolean): Unit = js.native
  
  /**
    * Returns the force and contact point of the body or false, if the body is not affected by the force/impulse.
    * @param body A physics body where the transform node is an AbstractMesh
    * @param origin the origin of the explosion
    * @param data the data of the hit
    * @param instanceIndex the instance index of the body
    * @returns if there was a hit
    */
  def getBodyHitData(body: PhysicsBody, origin: Vector3, data: PhysicsHitData): Boolean = js.native
  def getBodyHitData(body: PhysicsBody, origin: Vector3, data: PhysicsHitData, instanceIndex: Double): Boolean = js.native
  
  /**
    * Returns the data related to the radial explosion event (sphere).
    * @returns The radial explosion event data
    */
  def getData(): PhysicsRadialExplosionEventData = js.native
  
  /**
    * Returns the force and contact point of the impostor or false, if the impostor is not affected by the force/impulse.
    * @param impostor A physics imposter
    * @param origin the origin of the explosion
    * @returns A physics force and contact point, or null
    */
  def getImpostorHitData(impostor: PhysicsImpostor, origin: Vector3, data: PhysicsHitData): Boolean = js.native
  
  /**
    * Triggers affected bodies callbacks
    * @param affectedBodiesWithData defines the list of affected bodies (including associated data)
    */
  def triggerAffectedBodiesCallback(affectedBodiesWithData: js.Array[PhysicsAffectedBodyWithData]): Unit = js.native
  
  /**
    * Triggers affected impostors callbacks
    * @param affectedImpostorsWithData defines the list of affected impostors (including associated data)
    */
  def triggerAffectedImpostorsCallback(affectedImpostorsWithData: js.Array[PhysicsAffectedImpostorWithData]): Unit = js.native
}
