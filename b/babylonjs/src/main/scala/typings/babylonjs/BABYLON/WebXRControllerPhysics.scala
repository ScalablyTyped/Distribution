package typings.babylonjs.BABYLON

import typings.babylonjs.anon.ImpostorType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebXRControllerPhysics extends WebXRAbstractFeature {
  
  var _attachController: js.Any = js.native
  
  var _controllers: js.Any = js.native
  
  var _debugMode: js.Any = js.native
  
  var _delta: js.Any = js.native
  
  var _detachController: js.Any = js.native
  
  /**
    * @hidden
    * enable debugging - will show console outputs and the impostor mesh
    */
  def _enablePhysicsDebug(): Unit = js.native
  
  var _headsetImpostor: js.Any = js.native
  
  var _headsetMesh: js.Any = js.native
  
  var _lastTimestamp: js.Any = js.native
  
  /* protected */ def _onXRFrame(_xrFrame: js.Any): Unit = js.native
  
  val _options: js.Any = js.native
  
  var _tmpQuaternion: js.Any = js.native
  
  var _tmpVector: js.Any = js.native
  
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
    */
  def setPhysicsProperties(newProperties: ImpostorType): Unit = js.native
}
