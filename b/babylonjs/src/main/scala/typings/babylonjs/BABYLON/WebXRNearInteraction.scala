package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebXRNearInteraction
  extends StObject
     with WebXRAbstractFeature {
  
  /* private */ var _attachController: Any = js.native
  
  /* private */ var _attachNearInteractionMode: Any = js.native
  
  /* private */ var _attachedController: Any = js.native
  
  /* private */ var _controllerAvailablePredicate: Any = js.native
  
  /* private */ val _controllerPickRadius: Any = js.native
  
  /* private */ var _controllers: Any = js.native
  
  /* private */ var _detachController: Any = js.native
  
  /* private */ var _farInteractionFeature: Any = js.native
  
  /* private */ var _generateNewTouchPointMesh: Any = js.native
  
  /* private */ var _generateVisualCue: Any = js.native
  
  /* private */ var _handleTransitionAnimation: Any = js.native
  
  /* private */ val _hoverRadius: Any = js.native
  
  /* private */ var _isControllerReadyForNearInteraction: Any = js.native
  
  /* private */ val _nearGrabLengthScale: Any = js.native
  
  /**
    * Filter used for near interaction grab
    * @param mesh
    */
  /* private */ var _nearGrabPredicate: Any = js.native
  
  /**
    * Filter used for any near interaction
    * @param mesh
    */
  /* private */ var _nearInteractionPredicate: Any = js.native
  
  /**
    * Filter used for near interaction pick and hover
    * @param mesh
    */
  /* private */ var _nearPickPredicate: Any = js.native
  
  /* private */ val _options: Any = js.native
  
  /* private */ val _pickRadius: Any = js.native
  
  /* private */ var _pickWithSphere: Any = js.native
  
  /* private */ var _processTouchPoint: Any = js.native
  
  /* private */ var _scene: Any = js.native
  
  /* private */ var _tmpRay: Any = js.native
  
  /* private */ def _utilityLayerScene: Any = js.native
  
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
    * default color of the selection ring
    */
  var selectionMeshDefaultColor: Color3 = js.native
  
  /**
    * This color will be applied to the selection ring when selection is triggered
    */
  var selectionMeshPickedColor: Color3 = js.native
  
  /**
    * This function sets webXRControllerPointerSelection feature that will be disabled when
    * the hover range is reached for a mesh and will be reattached when not in hover range.
    * This is used to remove the selection rays when moving.
    * @param farInteractionFeature the feature to disable when finger is in hover range for a mesh
    */
  def setFarInteractionFeature(farInteractionFeature: Nullable[WebXRControllerPointerSelection]): Unit = js.native
}
