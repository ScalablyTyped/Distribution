package typings.babylonjs

import org.scalablytyped.runtime.StringDictionary
import typings.babylonjs.abstractMeshMod.AbstractMesh
import typings.babylonjs.anon.Filename
import typings.babylonjs.anon.GamepadIndices
import typings.babylonjs.anon.Pressed
import typings.babylonjs.anon.Pulse
import typings.babylonjs.babylonjsStrings._empty
import typings.babylonjs.babylonjsStrings.`xr-standard`
import typings.babylonjs.observableMod.Observable
import typings.babylonjs.sceneMod.IDisposable
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Nullable
import typings.babylonjs.webXRControllerComponentMod.WebXRControllerComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webXRAbstractMotionControllerMod {
  
  @JSImport("babylonjs/XR/motionController/webXRAbstractMotionController", "WebXRAbstractMotionController")
  @js.native
  abstract class WebXRAbstractMotionController protected () extends IDisposable {
    /**
      * constructs a new abstract motion controller
      * @param scene the scene to which the model of the controller will be added
      * @param layout The profile layout to load
      * @param gamepadObject The gamepad object correlating to this controller
      * @param handedness handedness (left/right/none) of this controller
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
      * handedness (left/right/none) of this controller
      */
    handedness: MotionControllerHandedness
    ) = this()
    def this(
      scene: Scene,
      layout: IMotionControllerLayout,
      /**
      * The gamepad object correlating to this controller
      */
    gamepadObject: IMinimalMotionControllerObject,
      /**
      * handedness (left/right/none) of this controller
      */
    handedness: MotionControllerHandedness,
      _doNotLoadControllerMesh: Boolean
    ) = this()
    
    /* protected */ def _getChildByName(node: AbstractMesh, name: String): js.UndefOr[AbstractMesh] = js.native
    
    /**
      * Get the filename and path for this controller's model
      * @returns a map of filename and path
      */
    /* protected */ def _getFilenameAndPath(): Filename = js.native
    
    var _getGenericFilenameAndPath: js.Any = js.native
    
    var _getGenericParentMesh: js.Any = js.native
    
    /* protected */ def _getImmediateChildByName(node: AbstractMesh, name: String): js.UndefOr[AbstractMesh] = js.native
    
    /**
      * This function is called before the mesh is loaded. It checks for loading constraints.
      * For example, this function can check if the GLB loader is available
      * If this function returns false, the generic controller will be loaded instead
      * @returns Is the client ready to load the mesh
      */
    /* protected */ def _getModelLoadingConstraints(): Boolean = js.native
    
    var _initComponent: js.Any = js.native
    
    /**
      * Moves the axis on the controller mesh based on its current state
      * @param axis the index of the axis
      * @param axisValue the value of the axis which determines the meshes new position
      * @hidden
      */
    /* protected */ def _lerpTransform(axisMap: IMotionControllerMeshMap, axisValue: Double): Unit = js.native
    /* protected */ def _lerpTransform(axisMap: IMotionControllerMeshMap, axisValue: Double, fixValueCoordinates: Boolean): Unit = js.native
    
    var _modelReady: js.Any = js.native
    
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
      * handedness (left/right/none) of this controller
      */
    var handedness: MotionControllerHandedness = js.native
    
    /**
      * Backwards compatibility due to a deeply-integrated typo
      */
    def handness: XREye = js.native
    
    var layout: IMotionControllerLayout = js.native
    
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
    
    var scene: Scene = js.native
    
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
  
  @js.native
  trait IMinimalMotionControllerObject extends StObject {
    
    /**
      * Available axes of this controller
      */
    var axes: js.Array[Double] = js.native
    
    /**
      * An array of available buttons
      */
    var buttons: js.Array[Pressed] = js.native
    
    /**
      * EXPERIMENTAL haptic support.
      */
    var hapticActuators: js.UndefOr[js.Array[Pulse]] = js.native
  }
  object IMinimalMotionControllerObject {
    
    @scala.inline
    def apply(axes: js.Array[Double], buttons: js.Array[Pressed]): IMinimalMotionControllerObject = {
      val __obj = js.Dynamic.literal(axes = axes.asInstanceOf[js.Any], buttons = buttons.asInstanceOf[js.Any])
      __obj.asInstanceOf[IMinimalMotionControllerObject]
    }
    
    @scala.inline
    implicit class IMinimalMotionControllerObjectMutableBuilder[Self <: IMinimalMotionControllerObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAxes(value: js.Array[Double]): Self = StObject.set(x, "axes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAxesVarargs(value: Double*): Self = StObject.set(x, "axes", js.Array(value :_*))
      
      @scala.inline
      def setButtons(value: js.Array[Pressed]): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonsVarargs(value: Pressed*): Self = StObject.set(x, "buttons", js.Array(value :_*))
      
      @scala.inline
      def setHapticActuators(value: js.Array[Pulse]): Self = StObject.set(x, "hapticActuators", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHapticActuatorsUndefined: Self = StObject.set(x, "hapticActuators", js.undefined)
      
      @scala.inline
      def setHapticActuatorsVarargs(value: Pulse*): Self = StObject.set(x, "hapticActuators", js.Array(value :_*))
    }
  }
  
  @js.native
  trait IMotionControllerButtonMeshMap extends StObject {
    
    /**
      * the mesh that defines the pressed value mesh position.
      * This is used to find the max-position of this button
      */
    var pressedMesh: AbstractMesh = js.native
    
    /**
      * the mesh that defines the unpressed value mesh position.
      * This is used to find the min (or initial) position of this button
      */
    var unpressedMesh: AbstractMesh = js.native
    
    /**
      * The mesh that will be changed when value changes
      */
    var valueMesh: AbstractMesh = js.native
  }
  object IMotionControllerButtonMeshMap {
    
    @scala.inline
    def apply(pressedMesh: AbstractMesh, unpressedMesh: AbstractMesh, valueMesh: AbstractMesh): IMotionControllerButtonMeshMap = {
      val __obj = js.Dynamic.literal(pressedMesh = pressedMesh.asInstanceOf[js.Any], unpressedMesh = unpressedMesh.asInstanceOf[js.Any], valueMesh = valueMesh.asInstanceOf[js.Any])
      __obj.asInstanceOf[IMotionControllerButtonMeshMap]
    }
    
    @scala.inline
    implicit class IMotionControllerButtonMeshMapMutableBuilder[Self <: IMotionControllerButtonMeshMap] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPressedMesh(value: AbstractMesh): Self = StObject.set(x, "pressedMesh", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnpressedMesh(value: AbstractMesh): Self = StObject.set(x, "unpressedMesh", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueMesh(value: AbstractMesh): Self = StObject.set(x, "valueMesh", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IMotionControllerLayout extends StObject {
    
    /**
      * Path to load the assets. Usually relative to the base path
      */
    var assetPath: String = js.native
    
    /**
      * Available components (unsorted)
      */
    var components: /**
      * A map of component Ids
      */
    StringDictionary[GamepadIndices] = js.native
    
    /**
      * Is it xr standard mapping or not
      */
    var gamepadMapping: _empty | `xr-standard` = js.native
    
    /**
      * Base root node of this entire model
      */
    var rootNodeName: String = js.native
    
    /**
      * Defines the main button component id
      */
    var selectComponentId: String = js.native
  }
  object IMotionControllerLayout {
    
    @scala.inline
    def apply(
      assetPath: String,
      components: /**
      * A map of component Ids
      */
    StringDictionary[GamepadIndices],
      gamepadMapping: _empty | `xr-standard`,
      rootNodeName: String,
      selectComponentId: String
    ): IMotionControllerLayout = {
      val __obj = js.Dynamic.literal(assetPath = assetPath.asInstanceOf[js.Any], components = components.asInstanceOf[js.Any], gamepadMapping = gamepadMapping.asInstanceOf[js.Any], rootNodeName = rootNodeName.asInstanceOf[js.Any], selectComponentId = selectComponentId.asInstanceOf[js.Any])
      __obj.asInstanceOf[IMotionControllerLayout]
    }
    
    @scala.inline
    implicit class IMotionControllerLayoutMutableBuilder[Self <: IMotionControllerLayout] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAssetPath(value: String): Self = StObject.set(x, "assetPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponents(value: /**
        * A map of component Ids
        */
      StringDictionary[GamepadIndices]): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGamepadMapping(value: _empty | `xr-standard`): Self = StObject.set(x, "gamepadMapping", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootNodeName(value: String): Self = StObject.set(x, "rootNodeName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectComponentId(value: String): Self = StObject.set(x, "selectComponentId", value.asInstanceOf[js.Any])
    }
  }
  
  type IMotionControllerLayoutMap = /**
    * Layouts with handedness type as a key
    */
  StringDictionary[IMotionControllerLayout]
  
  @js.native
  trait IMotionControllerMeshMap extends StObject {
    
    /**
      * the mesh that defines the maximum value mesh position.
      */
    var maxMesh: js.UndefOr[AbstractMesh] = js.native
    
    /**
      * the mesh that defines the minimum value mesh position.
      */
    var minMesh: js.UndefOr[AbstractMesh] = js.native
    
    /**
      * The mesh that will be changed when axis value changes
      */
    var valueMesh: js.UndefOr[AbstractMesh] = js.native
  }
  object IMotionControllerMeshMap {
    
    @scala.inline
    def apply(): IMotionControllerMeshMap = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IMotionControllerMeshMap]
    }
    
    @scala.inline
    implicit class IMotionControllerMeshMapMutableBuilder[Self <: IMotionControllerMeshMap] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMaxMesh(value: AbstractMesh): Self = StObject.set(x, "maxMesh", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxMeshUndefined: Self = StObject.set(x, "maxMesh", js.undefined)
      
      @scala.inline
      def setMinMesh(value: AbstractMesh): Self = StObject.set(x, "minMesh", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinMeshUndefined: Self = StObject.set(x, "minMesh", js.undefined)
      
      @scala.inline
      def setValueMesh(value: AbstractMesh): Self = StObject.set(x, "valueMesh", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueMeshUndefined: Self = StObject.set(x, "valueMesh", js.undefined)
    }
  }
  
  @js.native
  trait IMotionControllerProfile extends StObject {
    
    /**
      * fallback profiles for this profileId
      */
    var fallbackProfileIds: js.Array[String] = js.native
    
    /**
      * The layout map, with handedness as key
      */
    var layouts: IMotionControllerLayoutMap = js.native
    
    /**
      * The id of this profile
      * correlates to the profile(s) in the xrInput.profiles array
      */
    var profileId: String = js.native
  }
  object IMotionControllerProfile {
    
    @scala.inline
    def apply(fallbackProfileIds: js.Array[String], layouts: IMotionControllerLayoutMap, profileId: String): IMotionControllerProfile = {
      val __obj = js.Dynamic.literal(fallbackProfileIds = fallbackProfileIds.asInstanceOf[js.Any], layouts = layouts.asInstanceOf[js.Any], profileId = profileId.asInstanceOf[js.Any])
      __obj.asInstanceOf[IMotionControllerProfile]
    }
    
    @scala.inline
    implicit class IMotionControllerProfileMutableBuilder[Self <: IMotionControllerProfile] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFallbackProfileIds(value: js.Array[String]): Self = StObject.set(x, "fallbackProfileIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFallbackProfileIdsVarargs(value: String*): Self = StObject.set(x, "fallbackProfileIds", js.Array(value :_*))
      
      @scala.inline
      def setLayouts(value: IMotionControllerLayoutMap): Self = StObject.set(x, "layouts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProfileId(value: String): Self = StObject.set(x, "profileId", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.babylonjs.babylonjsStrings.default
    - typings.babylonjs.babylonjsStrings.touched
    - typings.babylonjs.babylonjsStrings.pressed
  */
  trait MotionControllerComponentStateType extends StObject
  object MotionControllerComponentStateType {
    
    @scala.inline
    def default: typings.babylonjs.babylonjsStrings.default = "default".asInstanceOf[typings.babylonjs.babylonjsStrings.default]
    
    @scala.inline
    def pressed: typings.babylonjs.babylonjsStrings.pressed = "pressed".asInstanceOf[typings.babylonjs.babylonjsStrings.pressed]
    
    @scala.inline
    def touched: typings.babylonjs.babylonjsStrings.touched = "touched".asInstanceOf[typings.babylonjs.babylonjsStrings.touched]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.babylonjs.babylonjsStrings.trigger
    - typings.babylonjs.babylonjsStrings.squeeze
    - typings.babylonjs.babylonjsStrings.touchpad
    - typings.babylonjs.babylonjsStrings.thumbstick
    - typings.babylonjs.babylonjsStrings.button
  */
  trait MotionControllerComponentType extends StObject
  object MotionControllerComponentType {
    
    @scala.inline
    def button: typings.babylonjs.babylonjsStrings.button = "button".asInstanceOf[typings.babylonjs.babylonjsStrings.button]
    
    @scala.inline
    def squeeze: typings.babylonjs.babylonjsStrings.squeeze = "squeeze".asInstanceOf[typings.babylonjs.babylonjsStrings.squeeze]
    
    @scala.inline
    def thumbstick: typings.babylonjs.babylonjsStrings.thumbstick = "thumbstick".asInstanceOf[typings.babylonjs.babylonjsStrings.thumbstick]
    
    @scala.inline
    def touchpad: typings.babylonjs.babylonjsStrings.touchpad = "touchpad".asInstanceOf[typings.babylonjs.babylonjsStrings.touchpad]
    
    @scala.inline
    def trigger: typings.babylonjs.babylonjsStrings.trigger = "trigger".asInstanceOf[typings.babylonjs.babylonjsStrings.trigger]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.babylonjs.babylonjsStrings.none
    - typings.babylonjs.babylonjsStrings.left
    - typings.babylonjs.babylonjsStrings.right
  */
  trait MotionControllerHandedness extends StObject
  object MotionControllerHandedness {
    
    @scala.inline
    def left: typings.babylonjs.babylonjsStrings.left = "left".asInstanceOf[typings.babylonjs.babylonjsStrings.left]
    
    @scala.inline
    def none: typings.babylonjs.babylonjsStrings.none = "none".asInstanceOf[typings.babylonjs.babylonjsStrings.none]
    
    @scala.inline
    def right: typings.babylonjs.babylonjsStrings.right = "right".asInstanceOf[typings.babylonjs.babylonjsStrings.right]
  }
}
