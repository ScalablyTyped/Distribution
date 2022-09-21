package typings.babylonjs.BABYLON

import typings.babylonjs.anon.ImpostorType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebXRControllerPhysics
  extends StObject
     with WebXRAbstractFeature {
  
  /* private */ var _attachController: Any = js.native
  
  /* private */ var _controllers: Any = js.native
  
  /* private */ var _createPhysicsImpostor: Any = js.native
  
  /* private */ var _debugMode: Any = js.native
  
  /* private */ var _delta: Any = js.native
  
  /* private */ var _detachController: Any = js.native
  
  /**
    * @hidden
    * enable debugging - will show console outputs and the impostor mesh
    */
  def _enablePhysicsDebug(): Unit = js.native
  
  /* private */ var _headsetImpostor: Any = js.native
  
  /* private */ var _headsetMesh: Any = js.native
  
  /* private */ var _lastTimestamp: Any = js.native
  
  /* protected */ def _onXRFrame(_xrFrame: Any): Unit = js.native
  
  /* private */ val _options: Any = js.native
  
  /* private */ var _tmpQuaternion: Any = js.native
  
  /* private */ var _tmpVector: Any = js.native
  
  /**
    * Manually add a controller (if no xrInput was provided or physics engine was not enabled)
    * @param xrController the controller to add
    */
  def addController(xrController: WebXRInputSource): Unit = js.native
  
  /**
    * Get the headset impostor, if enabled
    * @returns the impostor
    */
  def getHeadsetImpostor(): js.UndefOr[PhysicsImpostor] = js.native
  
  def getImpostorForController(controller: String): Nullable[PhysicsImpostor] = js.native
  /**
    * Get the physics impostor of a specific controller.
    * The impostor is not attached to a mesh because a mesh for each controller is not obligatory
    * @param controller the controller or the controller id of which to get the impostor
    * @returns the impostor or null
    */
  def getImpostorForController(controller: WebXRInputSource): Nullable[PhysicsImpostor] = js.native
  
  /**
    * Update the physics properties provided in the constructor
    * @param newProperties the new properties object
    * @param newProperties.impostorType
    * @param newProperties.impostorSize
    * @param newProperties.friction
    * @param newProperties.restitution
    */
  def setPhysicsProperties(newProperties: ImpostorType): Unit = js.native
}
