package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebXRControllerPointerSelection
  extends StObject
     with WebXRAbstractFeature {
  
  /* private */ var _attachController: Any = js.native
  
  /* private */ var _attachGazeMode: Any = js.native
  
  /* private */ var _attachScreenRayMode: Any = js.native
  
  /* private */ var _attachTrackedPointerRayMode: Any = js.native
  
  /* private */ var _attachedController: Any = js.native
  
  /* private */ var _augmentPointerInit: Any = js.native
  
  /* private */ var _controllers: Any = js.native
  
  /* private */ var _convertNormalToDirectionOfRay: Any = js.native
  
  /* private */ var _detachController: Any = js.native
  
  /* private */ var _generateNewMeshPair: Any = js.native
  
  /**
    * @internal
    */
  def _getPointerSelectionDisabledByPointerId(id: Double): Boolean = js.native
  
  /* private */ var _identityMatrix: Any = js.native
  
  /* private */ val _options: Any = js.native
  
  /* private */ var _pickingMoved: Any = js.native
  
  /* private */ var _scene: Any = js.native
  
  /* private */ var _screenCoordinatesRef: Any = js.native
  
  /**
    * @internal
    */
  def _setPointerSelectionDisabledByPointerId(id: Double, state: Boolean): Unit = js.native
  
  /* private */ var _tmpVectorForPickCompare: Any = js.native
  
  /* private */ var _updatePointerDistance: Any = js.native
  
  /* private */ def _utilityLayerScene: Any = js.native
  
  /* private */ var _viewportRef: Any = js.native
  
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
  
  /**
    * Default color of the laser pointer
    */
  var laserPointerDefaultColor: Color3 = js.native
  
  /**
    * This color will be set to the laser pointer when selection is triggered
    */
  var laserPointerPickedColor: Color3 = js.native
  
  /** @internal */
  def lasterPointerDefaultColor: Color3 = js.native
  
  /**
    * Optional filter to be used for ray selection.  This predicate shares behavior with
    * scene.pointerMovePredicate which takes priority if it is also assigned.
    */
  def raySelectionPredicate(mesh: AbstractMesh): Boolean = js.native
  
  /**
    * default color of the selection ring
    */
  var selectionMeshDefaultColor: Color3 = js.native
  
  /**
    * This color will be applied to the selection ring when selection is triggered
    */
  var selectionMeshPickedColor: Color3 = js.native
}
