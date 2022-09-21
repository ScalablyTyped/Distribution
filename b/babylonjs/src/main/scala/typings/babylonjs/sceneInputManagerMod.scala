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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sceneInputManagerMod {
  
  @JSImport("babylonjs/Inputs/scene.inputManager", "InputManager")
  @js.native
  /**
    * Creates a new InputManager
    * @param scene - defines the hosting scene
    */
  open class InputManager () extends StObject {
    def this(scene: Scene) = this()
    
    /** This is a defensive check to not allow control attachment prior to an already active one. If already attached, previous control is unattached before attaching the new one. */
    /* private */ var _alreadyAttached: Any = js.native
    
    /* private */ var _alreadyAttachedTo: Any = js.native
    
    /* private */ var _checkPrePointerObservable: Any = js.native
    
    /* private */ var _currentPickResult: Any = js.native
    
    /* private */ var _delayedSimpleClick: Any = js.native
    
    /* private */ var _delayedSimpleClickTimeout: Any = js.native
    
    /* private */ var _deviceSourceManager: Any = js.native
    
    /* private */ var _doubleClickOccured: Any = js.native
    
    /* private */ var _initActionManager: Any = js.native
    
    /* private */ var _initClickEvent: Any = js.native
    
    /**
      * @param mesh - Mesh to invalidate
      * @hidden
      */
    def _invalidateMesh(mesh: AbstractMesh): Unit = js.native
    
    /**
      * @hidden
      * @returns Boolean if delta for pointer exceeds drag movement threshold
      */
    def _isPointerSwiping(): Boolean = js.native
    
    /* private */ var _meshPickProceed: Any = js.native
    
    /* private */ var _meshUnderPointerId: Any = js.native
    
    /* private */ var _onKeyDown: Any = js.native
    
    /* private */ var _onKeyUp: Any = js.native
    
    /* private */ var _onPointerDown: Any = js.native
    
    /* private */ var _onPointerMove: Any = js.native
    
    /* private */ var _onPointerUp: Any = js.native
    
    /* private */ var _pickedDownMesh: Any = js.native
    
    /* private */ var _pickedUpMesh: Any = js.native
    
    /* private */ var _pointerCaptures: Any = js.native
    
    /* private */ var _pointerOverMesh: Any = js.native
    
    /* private */ var _pointerX: Any = js.native
    
    /* private */ var _pointerY: Any = js.native
    
    /* private */ var _previousButtonPressed: Any = js.native
    
    /* private */ var _previousDelayedSimpleClickTimeout: Any = js.native
    
    /* private */ var _previousPickResult: Any = js.native
    
    /* private */ var _previousStartingPointerPosition: Any = js.native
    
    /* private */ var _previousStartingPointerTime: Any = js.native
    
    /* private */ var _processPointerDown: Any = js.native
    
    /* private */ var _processPointerMove: Any = js.native
    
    /* private */ var _processPointerUp: Any = js.native
    
    /* private */ var _scene: Any = js.native
    
    /* private */ var _setRayOnPointerInfo: Any = js.native
    
    /* private */ var _startingPointerPosition: Any = js.native
    
    /* private */ var _startingPointerTime: Any = js.native
    
    /* private */ var _totalPointersPressed: Any = js.native
    
    /* private */ var _unTranslatedPointerX: Any = js.native
    
    /* private */ var _unTranslatedPointerY: Any = js.native
    
    /* private */ var _updatePointerPosition: Any = js.native
    
    /**
      * Attach events to the canvas (To handle actionManagers triggers and raise onPointerMove, onPointerDown and onPointerUp
      * @param attachUp - defines if you want to attach events to pointerup
      * @param attachDown - defines if you want to attach events to pointerdown
      * @param attachMove - defines if you want to attach events to pointermove
      * @param elementToAttachTo - defines the target DOM element to attach to (will use the canvas by default)
      */
    def attachControl(): Unit = js.native
    def attachControl(attachUp: Boolean): Unit = js.native
    def attachControl(attachUp: Boolean, attachDown: Boolean): Unit = js.native
    def attachControl(attachUp: Boolean, attachDown: Boolean, attachMove: Boolean): Unit = js.native
    def attachControl(
      attachUp: Boolean,
      attachDown: Boolean,
      attachMove: Boolean,
      elementToAttachTo: Nullable[HTMLElement]
    ): Unit = js.native
    def attachControl(attachUp: Boolean, attachDown: Boolean, attachMove: Unit, elementToAttachTo: Nullable[HTMLElement]): Unit = js.native
    def attachControl(attachUp: Boolean, attachDown: Unit, attachMove: Boolean): Unit = js.native
    def attachControl(attachUp: Boolean, attachDown: Unit, attachMove: Boolean, elementToAttachTo: Nullable[HTMLElement]): Unit = js.native
    def attachControl(attachUp: Boolean, attachDown: Unit, attachMove: Unit, elementToAttachTo: Nullable[HTMLElement]): Unit = js.native
    def attachControl(attachUp: Unit, attachDown: Boolean): Unit = js.native
    def attachControl(attachUp: Unit, attachDown: Boolean, attachMove: Boolean): Unit = js.native
    def attachControl(attachUp: Unit, attachDown: Boolean, attachMove: Boolean, elementToAttachTo: Nullable[HTMLElement]): Unit = js.native
    def attachControl(attachUp: Unit, attachDown: Boolean, attachMove: Unit, elementToAttachTo: Nullable[HTMLElement]): Unit = js.native
    def attachControl(attachUp: Unit, attachDown: Unit, attachMove: Boolean): Unit = js.native
    def attachControl(attachUp: Unit, attachDown: Unit, attachMove: Boolean, elementToAttachTo: Nullable[HTMLElement]): Unit = js.native
    def attachControl(attachUp: Unit, attachDown: Unit, attachMove: Unit, elementToAttachTo: Nullable[HTMLElement]): Unit = js.native
    
    /**
      * Detaches all event handlers
      */
    def detachControl(): Unit = js.native
    
    /**
      * When using more than one pointer (for example in XR) you can get the mesh under the specific pointer
      * @param pointerId - the pointer id to use
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
      * @param pointerId - defines the pointer id to use in a multi-touch scenario (0 by default)
      * @returns true if the pointer was captured
      */
    def isPointerCaptured(): Boolean = js.native
    def isPointerCaptured(pointerId: Double): Boolean = js.native
    
    /**
      * Gets the mesh that is currently under the pointer
      * @returns Mesh that the pointer is pointer is hovering over
      */
    def meshUnderPointer: Nullable[AbstractMesh] = js.native
    
    /**
      * Gets or sets the current on-screen X position of the pointer
      * @returns Translated X with respect to screen
      */
    def pointerX: Double = js.native
    def pointerX_=(value: Double): Unit = js.native
    
    /**
      * Gets or sets the current on-screen Y position of the pointer
      * @returns Translated Y with respect to screen
      */
    def pointerY: Double = js.native
    def pointerY_=(value: Double): Unit = js.native
    
    /**
      * Force the value of meshUnderPointer
      * @param mesh - defines the mesh to use
      * @param pointerId - optional pointer id when using more than one pointer. Defaults to 0
      * @param pickResult - optional pickingInfo data used to find mesh
      */
    def setPointerOverMesh(mesh: Nullable[AbstractMesh]): Unit = js.native
    def setPointerOverMesh(mesh: Nullable[AbstractMesh], pointerId: Double): Unit = js.native
    def setPointerOverMesh(mesh: Nullable[AbstractMesh], pointerId: Double, pickResult: Nullable[PickingInfo]): Unit = js.native
    def setPointerOverMesh(mesh: Nullable[AbstractMesh], pointerId: Unit, pickResult: Nullable[PickingInfo]): Unit = js.native
    
    /**
      * Use this method to simulate a pointer down on a mesh
      * The pickResult parameter can be obtained from a scene.pick or scene.pickWithRay
      * @param pickResult - pickingInfo of the object wished to simulate pointer event on
      * @param pointerEventInit - pointer event state to be used when simulating the pointer event (eg. pointer id for multitouch)
      */
    def simulatePointerDown(pickResult: PickingInfo): Unit = js.native
    def simulatePointerDown(pickResult: PickingInfo, pointerEventInit: PointerEventInit): Unit = js.native
    
    /**
      * Use this method to simulate a pointer move on a mesh
      * The pickResult parameter can be obtained from a scene.pick or scene.pickWithRay
      * @param pickResult - pickingInfo of the object wished to simulate pointer event on
      * @param pointerEventInit - pointer event state to be used when simulating the pointer event (eg. pointer id for multitouch)
      */
    def simulatePointerMove(pickResult: PickingInfo): Unit = js.native
    def simulatePointerMove(pickResult: PickingInfo, pointerEventInit: PointerEventInit): Unit = js.native
    
    /**
      * Use this method to simulate a pointer up on a mesh
      * The pickResult parameter can be obtained from a scene.pick or scene.pickWithRay
      * @param pickResult - pickingInfo of the object wished to simulate pointer event on
      * @param pointerEventInit - pointer event state to be used when simulating the pointer event (eg. pointer id for multitouch)
      * @param doubleTap - indicates that the pointer up event should be considered as part of a double click (false by default)
      */
    def simulatePointerUp(pickResult: PickingInfo): Unit = js.native
    def simulatePointerUp(pickResult: PickingInfo, pointerEventInit: Unit, doubleTap: Boolean): Unit = js.native
    def simulatePointerUp(pickResult: PickingInfo, pointerEventInit: PointerEventInit): Unit = js.native
    def simulatePointerUp(pickResult: PickingInfo, pointerEventInit: PointerEventInit, doubleTap: Boolean): Unit = js.native
    
    /**
      * Gets the pointer coordinates in 2D without any translation (ie. straight out of the pointer event)
      * @returns Vector with X/Y values directly from pointer event
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
    inline def DoubleClickDelay_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DoubleClickDelay")(x.asInstanceOf[js.Any])
    
    /** The distance in pixel that you have to move to prevent some events */
    @JSImport("babylonjs/Inputs/scene.inputManager", "InputManager.DragMovementThreshold")
    @js.native
    def DragMovementThreshold: Double = js.native
    inline def DragMovementThreshold_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DragMovementThreshold")(x.asInstanceOf[js.Any])
    
    /** If you need to check double click without raising a single click at first click, enable this flag */
    @JSImport("babylonjs/Inputs/scene.inputManager", "InputManager.ExclusiveDoubleClickMode")
    @js.native
    def ExclusiveDoubleClickMode: Boolean = js.native
    inline def ExclusiveDoubleClickMode_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ExclusiveDoubleClickMode")(x.asInstanceOf[js.Any])
    
    /** Time in milliseconds to wait to raise long press events if button is still pressed */
    @JSImport("babylonjs/Inputs/scene.inputManager", "InputManager.LongPressDelay")
    @js.native
    def LongPressDelay: Double = js.native
    inline def LongPressDelay_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LongPressDelay")(x.asInstanceOf[js.Any])
  }
}
