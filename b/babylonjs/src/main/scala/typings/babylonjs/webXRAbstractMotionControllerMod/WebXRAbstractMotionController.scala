package typings.babylonjs.webXRAbstractMotionControllerMod

import org.scalablytyped.runtime.StringDictionary
import typings.babylonjs.XRFrame
import typings.babylonjs.abstractMeshMod.AbstractMesh
import typings.babylonjs.anon.Filename
import typings.babylonjs.observableMod.Observable
import typings.babylonjs.sceneMod.IDisposable
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Nullable
import typings.babylonjs.webXRControllerComponentMod.WebXRControllerComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/XR/motionController/webXRAbstractMotionController", "WebXRAbstractMotionController")
@js.native
abstract class WebXRAbstractMotionController protected () extends IDisposable {
  /**
    * constructs a new abstract motion controller
    * @param scene the scene to which the model of the controller will be added
    * @param layout The profile layout to load
    * @param gamepadObject The gamepad object correlating to this controller
    * @param handness handness (left/right/none) of this controller
    * @param _doNotLoadControllerMesh set this flag to ignore the mesh loading
    */
  def this(
    scene: Scene,
    layout: IMotionControllerLayout,
    /**
    * The gamepad object correlating to this controller
    */
  gamepadObject: IMinimalMotionControllerObject,
    /**
    * handness (left/right/none) of this controller
    */
  handness: MotionControllerHandness
  ) = this()
  def this(
    scene: Scene,
    layout: IMotionControllerLayout,
    /**
    * The gamepad object correlating to this controller
    */
  gamepadObject: IMinimalMotionControllerObject,
    /**
    * handness (left/right/none) of this controller
    */
  handness: MotionControllerHandness,
    _doNotLoadControllerMesh: Boolean
  ) = this()
  var _getGenericFilenameAndPath: js.Any = js.native
  var _getGenericParentMesh: js.Any = js.native
  var _initComponent: js.Any = js.native
  var _modelReady: js.Any = js.native
  /**
    * A map of components (WebXRControllerComponent) in this motion controller
    * Components have a ComponentType and can also have both button and axis definitions
    */
  val components: StringDictionary[WebXRControllerComponent] = js.native
  /**
    * Disable the model's animation. Can be set at any time.
    */
  var disableAnimation: Boolean = js.native
  /**
    * The gamepad object correlating to this controller
    */
  var gamepadObject: IMinimalMotionControllerObject = js.native
  /**
    * handness (left/right/none) of this controller
    */
  var handness: MotionControllerHandness = js.native
  var layout: IMotionControllerLayout = js.native
  /**
    * Observers registered here will be triggered when the model of this controller is done loading
    */
  var onModelLoadedObservable: Observable[WebXRAbstractMotionController] = js.native
  /**
    * The profile id of this motion controller
    */
  var profileId: String = js.native
  /**
    * The root mesh of the model. It is null if the model was not yet initialized
    */
  var rootMesh: Nullable[AbstractMesh] = js.native
  var scene: Scene = js.native
  /* protected */ def _getChildByName(node: AbstractMesh, name: String): AbstractMesh = js.native
  /**
    * Get the filename and path for this controller's model
    * @returns a map of filename and path
    */
  /* protected */ def _getFilenameAndPath(): Filename = js.native
  /* protected */ def _getImmediateChildByName(node: AbstractMesh, name: String): AbstractMesh = js.native
  /**
    * This function is called before the mesh is loaded. It checks for loading constraints.
    * For example, this function can check if the GLB loader is available
    * If this function returns false, the generic controller will be loaded instead
    * @returns Is the client ready to load the mesh
    */
  /* protected */ def _getModelLoadingConstraints(): Boolean = js.native
  /**
    * Moves the axis on the controller mesh based on its current state
    * @param axis the index of the axis
    * @param axisValue the value of the axis which determines the meshes new position
    * @hidden
    */
  /* protected */ def _lerpTransform(axisMap: IMotionControllerMeshMap, axisValue: Double): Unit = js.native
  /* protected */ def _lerpTransform(axisMap: IMotionControllerMeshMap, axisValue: Double, fixValueCoordinates: Boolean): Unit = js.native
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
    * Releases all held resources
    */
  /* CompleteClass */
  override def dispose(): Unit = js.native
  /**
    * Returns all components of specific type
    * @param type the type to search for
    * @return an array of components with this type
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
    * @return a controller component or null if not found
    */
  def getComponentOfType(`type`: MotionControllerComponentType): Nullable[WebXRControllerComponent] = js.native
  /**
    * Get the main (Select) component of this controller as defined in the layout
    * @returns the main component of this controller
    */
  def getMainComponent(): WebXRControllerComponent = js.native
  /**
    * Loads the model correlating to this controller
    * When the mesh is loaded, the onModelLoadedObservable will be triggered
    * @returns A promise fulfilled with the result of the model loading
    */
  def loadModel(): js.Promise[Boolean] = js.native
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

