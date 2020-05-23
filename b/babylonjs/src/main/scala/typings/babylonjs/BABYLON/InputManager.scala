package typings.babylonjs.BABYLON

import typings.std.HTMLElement
import typings.std.PointerEventInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InputManager extends js.Object {
  var _checkPrePointerObservable: js.Any = js.native
  var _currentPickResult: js.Any = js.native
  var _delayedSimpleClick: js.Any = js.native
  var _delayedSimpleClickTimeout: js.Any = js.native
  var _doubleClickOccured: js.Any = js.native
  var _initActionManager: js.Any = js.native
  var _initClickEvent: js.Any = js.native
  var _meshPickProceed: js.Any = js.native
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
  /** @hidden */
  def _isPointerSwiping(): Boolean = js.native
  /**
    * Attach events to the canvas (To handle actionManagers triggers and raise onPointerMove, onPointerDown and onPointerUp
    * @param attachUp defines if you want to attach events to pointerup
    * @param attachDown defines if you want to attach events to pointerdown
    * @param attachMove defines if you want to attach events to pointermove
    * @param elementToAttachTo defines the target DOM element to attach to (will use the canvas by default)
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
  /**
    * Detaches all event handlers
    */
  def detachControl(): Unit = js.native
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
  def pointerX(value: Double): js.Any = js.native
  /**
    * Gets or sets the current on-screen Y position of the pointer
    */
  def pointerY: Double = js.native
  def pointerY(value: Double): js.Any = js.native
  /**
    * Force the value of meshUnderPointer
    * @param mesh defines the mesh to use
    */
  def setPointerOverMesh(mesh: Nullable[AbstractMesh]): Unit = js.native
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
  def simulatePointerUp(pickResult: PickingInfo, pointerEventInit: PointerEventInit): Unit = js.native
  def simulatePointerUp(pickResult: PickingInfo, pointerEventInit: PointerEventInit, doubleTap: Boolean): Unit = js.native
  /**
    * Gets the pointer coordinates in 2D without any translation (ie. straight out of the pointer event)
    */
  def unTranslatedPointer: Vector2 = js.native
}

