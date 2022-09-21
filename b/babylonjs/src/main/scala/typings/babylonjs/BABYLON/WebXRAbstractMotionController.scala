package typings.babylonjs.BABYLON

import typings.babylonjs.XRFrame
import typings.babylonjs.anon.Path
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebXRAbstractMotionController
  extends StObject
     with IDisposable {
  
  /* private */ var _controllerCache: Any = js.native
  
  /**
    * @hidden
    */
  var _doNotLoadControllerMesh: Boolean = js.native
  
  /* protected */ def _getChildByName(node: AbstractMesh, name: String): js.UndefOr[AbstractMesh] = js.native
  
  /**
    * Get the filename and path for this controller's model
    * @returns a map of filename and path
    */
  /* protected */ def _getFilenameAndPath(): Path = js.native
  
  /* private */ var _getGenericFilenameAndPath: Any = js.native
  
  /* private */ var _getGenericParentMesh: Any = js.native
  
  /* protected */ def _getImmediateChildByName(node: AbstractMesh, name: String): js.UndefOr[AbstractMesh] = js.native
  
  /**
    * This function is called before the mesh is loaded. It checks for loading constraints.
    * For example, this function can check if the GLB loader is available
    * If this function returns false, the generic controller will be loaded instead
    * @returns Is the client ready to load the mesh
    */
  /* protected */ def _getModelLoadingConstraints(): Boolean = js.native
  
  /* private */ var _initComponent: Any = js.native
  
  /**
    * Moves the axis on the controller mesh based on its current state
    * @param axisMap
    * @param axisValue the value of the axis which determines the meshes new position
    * @param fixValueCoordinates
    * @hidden
    */
  /* protected */ def _lerpTransform(axisMap: IMotionControllerMeshMap, axisValue: Double): Unit = js.native
  /* protected */ def _lerpTransform(axisMap: IMotionControllerMeshMap, axisValue: Double, fixValueCoordinates: Boolean): Unit = js.native
  
  /* private */ var _modelReady: Any = js.native
  
  /**
    * This function will be called after the model was successfully loaded and can be used
    * for mesh transformations before it is available for the user
    * @param meshes the loaded meshes
    */
  /* protected */ def _processLoadedModel(meshes: js.Array[AbstractMesh]): Unit = js.native
  
  /**
    * Set the root mesh for this controller. Important for the WebXR controller class
    * @param meshes the loaded meshes
    */
  /* protected */ def _setRootMesh(meshes: js.Array[AbstractMesh]): Unit = js.native
  
  /**
    * A function executed each frame that updates the mesh (if needed)
    * @param xrFrame the current xrFrame
    */
  /* protected */ def _updateModel(xrFrame: XRFrame): Unit = js.native
  
  /**
    * A map of components (WebXRControllerComponent) in this motion controller
    * Components have a ComponentType and can also have both button and axis definitions
    */
  val components: org.scalablytyped.runtime.StringDictionary[WebXRControllerComponent] = js.native
  
  /**
    * Disable the model's animation. Can be set at any time.
    */
  var disableAnimation: Boolean = js.native
  
  /**
    * The gamepad object correlating to this controller
    */
  var gamepadObject: IMinimalMotionControllerObject = js.native
  
  /**
    * Returns all components of specific type
    * @param type the type to search for
    * @returns an array of components with this type
    */
  def getAllComponentsOfType(`type`: MotionControllerComponentType): js.Array[WebXRControllerComponent] = js.native
  
  /**
    * get a component based an its component id as defined in layout.components
    * @param id the id of the component
    * @returns the component correlates to the id or undefined if not found
    */
  def getComponent(id: String): WebXRControllerComponent = js.native
  
  /**
    * Get the list of components available in this motion controller
    * @returns an array of strings correlating to available components
    */
  def getComponentIds(): js.Array[String] = js.native
  
  /**
    * Get the first component of specific type
    * @param type type of component to find
    * @returns a controller component or null if not found
    */
  def getComponentOfType(`type`: MotionControllerComponentType): Nullable[WebXRControllerComponent] = js.native
  
  /**
    * Get the main (Select) component of this controller as defined in the layout
    * @returns the main component of this controller
    */
  def getMainComponent(): WebXRControllerComponent = js.native
  
  /**
    * handedness (left/right/none) of this controller
    */
  var handedness: MotionControllerHandedness = js.native
  
  /**
    * Backwards compatibility due to a deeply-integrated typo
    */
  def handness: MotionControllerHandedness = js.native
  
  /* protected */ var layout: IMotionControllerLayout = js.native
  
  /**
    * Loads the model correlating to this controller
    * When the mesh is loaded, the onModelLoadedObservable will be triggered
    * @returns A promise fulfilled with the result of the model loading
    */
  def loadModel(): js.Promise[Boolean] = js.native
  
  /**
    * Observers registered here will be triggered when the model of this controller is done loading
    */
  var onModelLoadedObservable: Observable[WebXRAbstractMotionController] = js.native
  
  /**
    * The profile id of this motion controller
    */
  var profileId: String = js.native
  
  /**
    * Pulse (vibrate) this controller
    * If the controller does not support pulses, this function will fail silently and return Promise<false> directly after called
    * Consecutive calls to this function will cancel the last pulse call
    *
    * @param value the strength of the pulse in 0.0...1.0 range
    * @param duration Duration of the pulse in milliseconds
    * @param hapticActuatorIndex optional index of actuator (will usually be 0)
    * @returns a promise that will send true when the pulse has ended and false if the device doesn't support pulse or an error accrued
    */
  def pulse(value: Double, duration: Double): js.Promise[Boolean] = js.native
  def pulse(value: Double, duration: Double, hapticActuatorIndex: Double): js.Promise[Boolean] = js.native
  
  /**
    * The root mesh of the model. It is null if the model was not yet initialized
    */
  var rootMesh: Nullable[AbstractMesh] = js.native
  
  /* protected */ var scene: Scene = js.native
  
  /**
    * Update this model using the current XRFrame
    * @param xrFrame the current xr frame to use and update the model
    */
  def updateFromXRFrame(xrFrame: XRFrame): Unit = js.native
  
  /**
    * Update the model itself with the current frame data
    * @param xrFrame the frame to use for updating the model mesh
    */
  /* protected */ def updateModel(xrFrame: XRFrame): Unit = js.native
}
