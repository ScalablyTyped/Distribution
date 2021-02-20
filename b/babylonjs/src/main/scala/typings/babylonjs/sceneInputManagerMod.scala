package typings.babylonjs

import typings.babylonjs.abstractMeshMod.AbstractMesh
import typings.babylonjs.mathVectorMod.Vector2
import typings.babylonjs.pickingInfoMod.PickingInfo
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Nullable
import typings.std.HTMLElement
import typings.std.PointerEventInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sceneInputManagerMod {
  
  @JSImport("babylonjs/Inputs/scene.inputManager", "InputManager")
  @js.native
  class InputManager protected () extends StObject {
    /**
      * Creates a new InputManager
      * @param scene defines the hosting scene
      */
    def this(scene: Scene) = this()
    
    /** This is a defensive check to not allow control attachment prior to an already active one. If already attached, previous control is unattached before attaching the new one. */
    var _alreadyAttached: js.Any = js.native
    
    var _alreadyAttachedTo: js.Any = js.native
    
    var _checkPrePointerObservable: js.Any = js.native
    
    var _currentPickResult: js.Any = js.native
    
    var _delayedSimpleClick: js.Any = js.native
    
    var _delayedSimpleClickTimeout: js.Any = js.native
    
    var _doubleClickOccured: js.Any = js.native
    
    var _initActionManager: js.Any = js.native
    
    var _initClickEvent: js.Any = js.native
    
    /** @hidden */
    def _isPointerSwiping(): Boolean = js.native
    
    var _keyboardIsAttached: js.Any = js.native
    
    var _meshPickProceed: js.Any = js.native
    
    var _meshUnderPointerId: js.Any = js.native
    
    var _onCanvasBlurObserver: js.Any = js.native
    
    var _onCanvasFocusObserver: js.Any = js.native
    
    var _onKeyDown: js.Any = js.native
    
    var _onKeyUp: js.Any = js.native
    
    var _onPointerDown: js.Any = js.native
    
    var _onPointerMove: js.Any = js.native
    
    var _onPointerUp: js.Any = js.native
    
    var _pickedDownMesh: js.Any = js.native
    
    var _pickedUpMesh: js.Any = js.native
    
    var _pointerCaptures: js.Any = js.native
    
    var _pointerOverMesh: js.Any = js.native
    
    var _pointerX: js.Any = js.native
    
    var _pointerY: js.Any = js.native
    
    var _previousButtonPressed: js.Any = js.native
    
    var _previousDelayedSimpleClickTimeout: js.Any = js.native
    
    var _previousPickResult: js.Any = js.native
    
    var _previousStartingPointerPosition: js.Any = js.native
    
    var _previousStartingPointerTime: js.Any = js.native
    
    var _processPointerDown: js.Any = js.native
    
    var _processPointerMove: js.Any = js.native
    
    var _processPointerUp: js.Any = js.native
    
    var _scene: js.Any = js.native
    
    var _setRayOnPointerInfo: js.Any = js.native
    
    var _startingPointerPosition: js.Any = js.native
    
    var _startingPointerTime: js.Any = js.native
    
    var _totalPointersPressed: js.Any = js.native
    
    var _unTranslatedPointerX: js.Any = js.native
    
    var _unTranslatedPointerY: js.Any = js.native
    
    var _updatePointerPosition: js.Any = js.native
    
    var _wheelEventName: js.Any = js.native
    
    /**
      * Attach events to the canvas (To handle actionManagers triggers and raise onPointerMove, onPointerDown and onPointerUp
      * @param attachUp defines if you want to attach events to pointerup
      * @param attachDown defines if you want to attach events to pointerdown
      * @param attachMove defines if you want to attach events to pointermove
      * @param elementToAttachTo defines the target DOM element to attach to (will use the canvas by default)
      */
    def attachControl(): Unit = js.native
    def attachControl(
      attachUp: js.UndefOr[scala.Nothing],
      attachDown: js.UndefOr[scala.Nothing],
      attachMove: js.UndefOr[scala.Nothing],
      elementToAttachTo: Nullable[HTMLElement]
    ): Unit = js.native
    def attachControl(attachUp: js.UndefOr[scala.Nothing], attachDown: js.UndefOr[scala.Nothing], attachMove: Boolean): Unit = js.native
    def attachControl(
      attachUp: js.UndefOr[scala.Nothing],
      attachDown: js.UndefOr[scala.Nothing],
      attachMove: Boolean,
      elementToAttachTo: Nullable[HTMLElement]
    ): Unit = js.native
    def attachControl(attachUp: js.UndefOr[scala.Nothing], attachDown: Boolean): Unit = js.native
    def attachControl(
      attachUp: js.UndefOr[scala.Nothing],
      attachDown: Boolean,
      attachMove: js.UndefOr[scala.Nothing],
      elementToAttachTo: Nullable[HTMLElement]
    ): Unit = js.native
    def attachControl(attachUp: js.UndefOr[scala.Nothing], attachDown: Boolean, attachMove: Boolean): Unit = js.native
    def attachControl(
      attachUp: js.UndefOr[scala.Nothing],
      attachDown: Boolean,
      attachMove: Boolean,
      elementToAttachTo: Nullable[HTMLElement]
    ): Unit = js.native
    def attachControl(attachUp: Boolean): Unit = js.native
    def attachControl(
      attachUp: Boolean,
      attachDown: js.UndefOr[scala.Nothing],
      attachMove: js.UndefOr[scala.Nothing],
      elementToAttachTo: Nullable[HTMLElement]
    ): Unit = js.native
    def attachControl(attachUp: Boolean, attachDown: js.UndefOr[scala.Nothing], attachMove: Boolean): Unit = js.native
    def attachControl(
      attachUp: Boolean,
      attachDown: js.UndefOr[scala.Nothing],
      attachMove: Boolean,
      elementToAttachTo: Nullable[HTMLElement]
    ): Unit = js.native
    def attachControl(attachUp: Boolean, attachDown: Boolean): Unit = js.native
    def attachControl(
      attachUp: Boolean,
      attachDown: Boolean,
      attachMove: js.UndefOr[scala.Nothing],
      elementToAttachTo: Nullable[HTMLElement]
    ): Unit = js.native
    def attachControl(attachUp: Boolean, attachDown: Boolean, attachMove: Boolean): Unit = js.native
    def attachControl(
      attachUp: Boolean,
      attachDown: Boolean,
      attachMove: Boolean,
      elementToAttachTo: Nullable[HTMLElement]
    ): Unit = js.native
    
    /**
      * Detaches all event handlers
      */
    def detachControl(): Unit = js.native
    
    /**
      * When using more than one pointer (for example in XR) you can get the mesh under the specific pointer
      * @param pointerId the pointer id to use
      * @returns The mesh under this pointer id or null if not found
      */
    def getMeshUnderPointerByPointerId(pointerId: Double): Nullable[AbstractMesh] = js.native
    
    /**
      * Gets the mesh under the pointer
      * @returns a Mesh or null if no mesh is under the pointer
      */
    def getPointerOverMesh(): Nullable[AbstractMesh] = js.native
    
    /**
      * Gets a boolean indicating if the current pointer event is captured (meaning that the scene has already handled the pointer down)
      * @param pointerId defines the pointer id to use in a multi-touch scenario (0 by default)
      * @returns true if the pointer was captured
      */
    def isPointerCaptured(): Boolean = js.native
    def isPointerCaptured(pointerId: Double): Boolean = js.native
    
    /**
      * Gets the mesh that is currently under the pointer
      */
    def meshUnderPointer: Nullable[AbstractMesh] = js.native
    
    /**
      * Gets or sets the current on-screen X position of the pointer
      */
    def pointerX: Double = js.native
    def pointerX_=(value: Double): Unit = js.native
    
    /**
      * Gets or sets the current on-screen Y position of the pointer
      */
    def pointerY: Double = js.native
    def pointerY_=(value: Double): Unit = js.native
    
    /**
      * Force the value of meshUnderPointer
      * @param mesh defines the mesh to use
      * @param pointerId optional pointer id when using more than one pointer. Defaults to 0
      */
    def setPointerOverMesh(mesh: Nullable[AbstractMesh]): Unit = js.native
    def setPointerOverMesh(mesh: Nullable[AbstractMesh], pointerId: Double): Unit = js.native
    
    /**
      * Use this method to simulate a pointer down on a mesh
      * The pickResult parameter can be obtained from a scene.pick or scene.pickWithRay
      * @param pickResult pickingInfo of the object wished to simulate pointer event on
      * @param pointerEventInit pointer event state to be used when simulating the pointer event (eg. pointer id for multitouch)
      */
    def simulatePointerDown(pickResult: PickingInfo): Unit = js.native
    def simulatePointerDown(pickResult: PickingInfo, pointerEventInit: PointerEventInit): Unit = js.native
    
    /**
      * Use this method to simulate a pointer move on a mesh
      * The pickResult parameter can be obtained from a scene.pick or scene.pickWithRay
      * @param pickResult pickingInfo of the object wished to simulate pointer event on
      * @param pointerEventInit pointer event state to be used when simulating the pointer event (eg. pointer id for multitouch)
      */
    def simulatePointerMove(pickResult: PickingInfo): Unit = js.native
    def simulatePointerMove(pickResult: PickingInfo, pointerEventInit: PointerEventInit): Unit = js.native
    
    /**
      * Use this method to simulate a pointer up on a mesh
      * The pickResult parameter can be obtained from a scene.pick or scene.pickWithRay
      * @param pickResult pickingInfo of the object wished to simulate pointer event on
      * @param pointerEventInit pointer event state to be used when simulating the pointer event (eg. pointer id for multitouch)
      * @param doubleTap indicates that the pointer up event should be considered as part of a double click (false by default)
      */
    def simulatePointerUp(pickResult: PickingInfo): Unit = js.native
    def simulatePointerUp(pickResult: PickingInfo, pointerEventInit: js.UndefOr[scala.Nothing], doubleTap: Boolean): Unit = js.native
    def simulatePointerUp(pickResult: PickingInfo, pointerEventInit: PointerEventInit): Unit = js.native
    def simulatePointerUp(pickResult: PickingInfo, pointerEventInit: PointerEventInit, doubleTap: Boolean): Unit = js.native
    
    /**
      * Gets the pointer coordinates in 2D without any translation (ie. straight out of the pointer event)
      */
    def unTranslatedPointer: Vector2 = js.native
  }
  /* static members */
  object InputManager {
    
    @JSImport("babylonjs/Inputs/scene.inputManager", "InputManager")
    @js.native
    val ^ : js.Any = js.native
    
    /** Time in milliseconds with two consecutive clicks will be considered as a double click */
    @JSImport("babylonjs/Inputs/scene.inputManager", "InputManager.DoubleClickDelay")
    @js.native
    def DoubleClickDelay: Double = js.native
    @scala.inline
    def DoubleClickDelay_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DoubleClickDelay")(x.asInstanceOf[js.Any])
    
    /** The distance in pixel that you have to move to prevent some events */
    @JSImport("babylonjs/Inputs/scene.inputManager", "InputManager.DragMovementThreshold")
    @js.native
    def DragMovementThreshold: Double = js.native
    @scala.inline
    def DragMovementThreshold_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DragMovementThreshold")(x.asInstanceOf[js.Any])
    
    /** If you need to check double click without raising a single click at first click, enable this flag */
    @JSImport("babylonjs/Inputs/scene.inputManager", "InputManager.ExclusiveDoubleClickMode")
    @js.native
    def ExclusiveDoubleClickMode: Boolean = js.native
    @scala.inline
    def ExclusiveDoubleClickMode_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ExclusiveDoubleClickMode")(x.asInstanceOf[js.Any])
    
    /** Time in milliseconds to wait to raise long press events if button is still pressed */
    @JSImport("babylonjs/Inputs/scene.inputManager", "InputManager.LongPressDelay")
    @js.native
    def LongPressDelay: Double = js.native
    @scala.inline
    def LongPressDelay_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LongPressDelay")(x.asInstanceOf[js.Any])
  }
}
