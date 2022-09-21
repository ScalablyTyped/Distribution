package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babylonjs.BABYLON.IDisposable because Already inherited
- typings.babylonjs.BABYLON.IGizmo because Already inherited
- typings.babylonjs.BABYLON.IBoundingBoxGizmo because var conflicts: _rootMesh, attachedMesh, attachedNode, customRotationQuaternion, gizmoLayer, isHovered, scaleRatio, updateGizmoPositionToMatchAttachedMesh, updateGizmoRotationToMatchAttachedMesh, updateScale. Inlined ignoreChildren, includeChildPredicate, rotationSphereSize, scaleBoxSize, fixedDragMeshScreenSize, fixedDragMeshBoundsSize, fixedDragMeshScreenSizeDistanceFactor, onDragStartObservable, onScaleBoxDragObservable, onScaleBoxDragEndObservable, onRotationSphereDragObservable, onRotationSphereDragEndObservable, scalePivot, axisFactor, scaleDragSpeed, setColor, getScaleBoxes, updateBoundingBox, setEnabledRotationAxis, setEnabledScaling, setEnabledScaling, enableDragBehavior */ @js.native
trait BoundingBoxGizmo
  extends StObject
     with Gizmo {
  
  /**
    * Mesh used as a pivot to rotate the attached node
    */
  /* protected */ var _anchorMesh: AbstractMesh = js.native
  
  /* protected */ def _attachedNodeChanged(value: Nullable[AbstractMesh]): Unit = js.native
  
  /**
    * Scale factor used for masking some axis
    */
  /* protected */ var _axisFactor: Vector3 = js.native
  
  /* protected */ var _boundingDimensions: Vector3 = js.native
  
  /* protected */ var _coloredMaterial: StandardMaterial = js.native
  
  /* protected */ var _dragMesh: Nullable[Mesh] = js.native
  
  /* protected */ var _existingMeshScale: Vector3 = js.native
  
  /* protected */ var _hoverColoredMaterial: StandardMaterial = js.native
  
  /* protected */ var _lineBoundingBox: AbstractMesh = js.native
  
  /* protected */ var _pointerDragBehavior: PointerDragBehavior = js.native
  
  /* protected */ var _pointerObserver: Nullable[Observer[PointerInfo]] = js.native
  
  /* protected */ var _renderObserver: Nullable[Observer[Scene]] = js.native
  
  /* protected */ var _rotateSpheresParent: AbstractMesh = js.native
  
  /* protected */ var _scaleBoxesParent: AbstractMesh = js.native
  
  /* protected */ var _scaleDragSpeed: Double = js.native
  
  /* protected */ def _selectNode(selectedMesh: Nullable[Mesh]): Unit = js.native
  
  /* private */ var _tmpQuaternion: Any = js.native
  
  /* private */ var _tmpRotationMatrix: Any = js.native
  
  /* private */ var _tmpVector: Any = js.native
  
  /* protected */ def _updateDummy(): Unit = js.native
  
  /* protected */ def _updateRotationSpheres(): Unit = js.native
  
  /* protected */ def _updateScaleBoxes(): Unit = js.native
  
  /**
    * Gets the axis factor
    * @returns the Vector3 factor value
    */
  def axisFactor: Vector3 = js.native
  /**
    * Sets the axis factor
    * @param factor the Vector3 value
    */
  def axisFactor_=(factor: Vector3): Unit = js.native
  /** Scale factor vector used for masking some axis */
  @JSName("axisFactor")
  var axisFactor_FBoundingBoxGizmo: Vector3 = js.native
  
  /**
    * Enables a pointer drag behavior on the bounding box of the gizmo
    */
  /** Enables a pointer drag behavior on the bounding box of the gizmo */
  def enableDragBehavior(): Unit = js.native
  
  /**
    * If set, the rotation spheres and scale boxes will increase in size based on the size of the bounding box
    * Note : fixedDragMeshScreenSize takes precedence over fixedDragMeshBoundsSize if both are true
    */
  var fixedDragMeshBoundsSize: Boolean = js.native
  
  /**
    * If set, the rotation spheres and scale boxes will increase in size based on the distance away from the camera to have a consistent screen size (Default: false)
    * Note : fixedDragMeshScreenSize takes precedence over fixedDragMeshBoundsSize if both are true
    */
  var fixedDragMeshScreenSize: Boolean = js.native
  
  /**
    * The distance away from the object which the draggable meshes should appear world sized when fixedDragMeshScreenSize is set to true (default: 10)
    */
  var fixedDragMeshScreenSizeDistanceFactor: Double = js.native
  
  /**
    * returns an array containing all boxes used for scaling (in increasing x, y and z orders)
    */
  /** Returns an array containing all boxes used for scaling (in increasing x, y and z orders) */
  def getScaleBoxes(): js.Array[AbstractMesh] = js.native
  
  /**
    * If child meshes should be ignored when calculating the bounding box. This should be set to true to avoid perf hits with heavily nested meshes (Default: false)
    */
  var ignoreChildren: Boolean = js.native
  
  /**
    * Returns true if a descendant should be included when computing the bounding box. When null, all descendants are included. If ignoreChildren is set this will be ignored. (Default: null)
    */
  var includeChildPredicate: Nullable[js.Function1[/* abstractMesh */ AbstractMesh, Boolean]] = js.native
  
  /**
    * Fired when a rotation sphere or scale box is dragged
    */
  var onDragStartObservable: Observable[js.Object] = js.native
  
  /**
    * Fired when a rotation sphere drag is ended
    */
  var onRotationSphereDragEndObservable: Observable[js.Object] = js.native
  
  /**
    * Fired when a rotation sphere is dragged
    */
  var onRotationSphereDragObservable: Observable[js.Object] = js.native
  
  /**
    * Fired when a scale box drag is ended
    */
  var onScaleBoxDragEndObservable: Observable[js.Object] = js.native
  
  /**
    * Fired when a scale box is dragged
    */
  var onScaleBoxDragObservable: Observable[js.Object] = js.native
  
  /**
    * Get the pointerDragBehavior
    */
  def pointerDragBehavior: PointerDragBehavior = js.native
  
  /**
    * The size of the rotation spheres attached to the bounding box (Default: 0.1)
    */
  var rotationSphereSize: Double = js.native
  
  /**
    * The size of the scale boxes attached to the bounding box (Default: 0.1)
    */
  var scaleBoxSize: Double = js.native
  
  /**
    * Gets scale drag speed
    * @returns the scale speed number
    */
  def scaleDragSpeed: Double = js.native
  /**
    * Sets scale drag speed value
    * @param value the new speed value
    */
  def scaleDragSpeed_=(value: Double): Unit = js.native
  /** Scale factor scalar affecting all axes' drag speed */
  @JSName("scaleDragSpeed")
  var scaleDragSpeed_FBoundingBoxGizmo: Double = js.native
  
  /**
    * Relative bounding box pivot used when scaling the attached node. When null object with scale from the opposite corner. 0.5,0.5,0.5 for center and 0.5,0,0.5 for bottom (Default: null)
    */
  var scalePivot: Nullable[Vector3] = js.native
  
  /**
    * Sets the color of the bounding box gizmo
    * @param color the color to set
    */
  def setColor(color: Color3): Unit = js.native
  
  /**
    * CustomMeshes are not supported by this gizmo
    */
  def setCustomMesh(): Unit = js.native
  
  /**
    * Enables rotation on the specified axis and disables rotation on the others
    * @param axis The list of axis that should be enabled (eg. "xy" or "xyz")
    */
  def setEnabledRotationAxis(axis: String): Unit = js.native
  
  /**
    * Enables/disables scaling
    * @param enable if scaling should be enabled
    * @param homogeneousScaling defines if scaling should only be homogeneous
    */
  def setEnabledScaling(enable: Boolean): Unit = js.native
  def setEnabledScaling(enable: Boolean, homogeneousScaling: Boolean): Unit = js.native
  
  /**
    * Updates the bounding box information for the Gizmo
    */
  /** Updates the bounding box information for the Gizmo */
  def updateBoundingBox(): Unit = js.native
}
