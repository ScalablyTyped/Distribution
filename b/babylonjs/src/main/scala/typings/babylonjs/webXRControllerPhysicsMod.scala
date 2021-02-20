package typings.babylonjs

import typings.babylonjs.anon.Friction
import typings.babylonjs.anon.ImpostorSize
import typings.babylonjs.anon.ImpostorType
import typings.babylonjs.physicsImpostorMod.PhysicsImpostor
import typings.babylonjs.typesMod.Nullable
import typings.babylonjs.webXRAbstractFeatureMod.WebXRAbstractFeature
import typings.babylonjs.webXRInputMod.WebXRInput
import typings.babylonjs.webXRInputSourceMod.WebXRInputSource
import typings.babylonjs.webXRSessionManagerMod.WebXRSessionManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webXRControllerPhysicsMod {
  
  @JSImport("babylonjs/XR/features/WebXRControllerPhysics", "IWebXRControllerPhysicsOptions")
  @js.native
  class IWebXRControllerPhysicsOptions () extends StObject {
    
    /**
      * Should the headset get its own impostor
      */
    var enableHeadsetImpostor: js.UndefOr[Boolean] = js.native
    
    /**
      * Optional parameters for the headset impostor
      */
    var headsetImpostorParams: js.UndefOr[Friction] = js.native
    
    /**
      * The physics properties of the future impostors
      */
    var physicsProperties: js.UndefOr[ImpostorSize] = js.native
    
    /**
      * the xr input to use with this pointer selection
      */
    var xrInput: WebXRInput = js.native
  }
  
  @JSImport("babylonjs/XR/features/WebXRControllerPhysics", "WebXRControllerPhysics")
  @js.native
  class WebXRControllerPhysics protected () extends WebXRAbstractFeature {
    /**
      * Construct a new Controller Physics Feature
      * @param _xrSessionManager the corresponding xr session manager
      * @param _options options to create this feature with
      */
    def this(_xrSessionManager: WebXRSessionManager, _options: IWebXRControllerPhysicsOptions) = this()
    
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
  /* static members */
  object WebXRControllerPhysics {
    
    /**
      * The module's name
      */
    @JSImport("babylonjs/XR/features/WebXRControllerPhysics", "WebXRControllerPhysics.Name")
    @js.native
    val Name: String = js.native
    
    /**
      * The (Babylon) version of this module.
      * This is an integer representing the implementation version.
      * This number does not correspond to the webxr specs version
      */
    @JSImport("babylonjs/XR/features/WebXRControllerPhysics", "WebXRControllerPhysics.Version")
    @js.native
    val Version: Double = js.native
  }
}
