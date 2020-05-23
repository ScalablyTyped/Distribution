package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebXRControllerPointerSelection extends WebXRAbstractFeature {
  var _attachController: js.Any = js.native
  var _attachGazeMode: js.Any = js.native
  var _attachScreenRayMode: js.Any = js.native
  var _attachTrackedPointerRayMode: js.Any = js.native
  var _controllers: js.Any = js.native
  var _convertNormalToDirectionOfRay: js.Any = js.native
  var _detachController: js.Any = js.native
  var _generateNewMeshPair: js.Any = js.native
  val _options: js.Any = js.native
  var _pickingMoved: js.Any = js.native
  var _scene: js.Any = js.native
  var _tmpVectorForPickCompare: js.Any = js.native
  var _updatePointerDistance: js.Any = js.native
  /**
    * Disable lighting on the laser pointer (so it will always be visible)
    */
  var disablePointerLighting: Boolean = js.native
  /**
    * Disable lighting on the selection mesh (so it will always be visible)
    */
  var disableSelectionMeshLighting: Boolean = js.native
  /**
    * Should the laser pointer be displayed
    */
  var displayLaserPointer: Boolean = js.native
  /**
    * Should the selection mesh be displayed (The ring at the end of the laser pointer)
    */
  var displaySelectionMesh: Boolean = js.native
  /**
    * This color will be set to the laser pointer when selection is triggered
    */
  var laserPointerPickedColor: Color3 = js.native
  /**
    * Default color of the laser pointer
    */
  var lasterPointerDefaultColor: Color3 = js.native
  /**
    * default color of the selection ring
    */
  var selectionMeshDefaultColor: Color3 = js.native
  /**
    * This color will be applied to the selection ring when selection is triggered
    */
  var selectionMeshPickedColor: Color3 = js.native
  /**
    * Will get the mesh under a specific pointer.
    * `scene.meshUnderPointer` will only return one mesh - either left or right.
    * @param controllerId the controllerId to check
    * @returns The mesh under pointer or null if no mesh is under the pointer
    */
  def getMeshUnderPointer(controllerId: String): Nullable[AbstractMesh] = js.native
  /**
    * Get the xr controller that correlates to the pointer id in the pointer event
    *
    * @param id the pointer id to search for
    * @returns the controller that correlates to this id or null if not found
    */
  def getXRControllerByPointerId(id: Double): Nullable[WebXRInputSource] = js.native
}

