package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Bounding box gizmo
  */
@JSGlobal("BABYLON.BoundingBoxGizmo")
@js.native
/**
  * Creates an BoundingBoxGizmo
  * @param gizmoLayer The utility layer the gizmo will be added to
  * @param color The color of the gizmo
  */
class BoundingBoxGizmo () extends Gizmo {
  def this(color: Color3) = this()
  def this(color: Color3, gizmoLayer: UtilityLayerRenderer) = this()
  var _anchorMesh: js.Any = js.native
  var _boundingDimensions: js.Any = js.native
  var _existingMeshScale: js.Any = js.native
  var _lineBoundingBox: js.Any = js.native
  var _pointerObserver: js.Any = js.native
  var _renderObserver: js.Any = js.native
  var _rotateSpheresParent: js.Any = js.native
  var _scaleBoxesParent: js.Any = js.native
  var _scaleDragSpeed: js.Any = js.native
  var _selectNode: js.Any = js.native
  var _tmpQuaternion: js.Any = js.native
  var _tmpRotationMatrix: js.Any = js.native
  var _tmpVector: js.Any = js.native
  /**
    * If set, the rotation spheres and scale boxes will increase in size based on the distance away from the camera to have a consistent screen size (Default: false)
    */
  var fixedDragMeshScreenSize: scala.Boolean = js.native
  /**
    * The distance away from the object which the draggable meshes should appear world sized when fixedDragMeshScreenSize is set to true (default: 10)
    */
  var fixedDragMeshScreenSizeDistanceFactor: scala.Double = js.native
  /**
    * If child meshes should be ignored when calculating the boudning box. This should be set to true to avoid perf hits with heavily nested meshes (Default: false)
    */
  var ignoreChildren: scala.Boolean = js.native
  /**
    * Returns true if a descendant should be included when computing the bounding box. When null, all descendants are included. If ignoreChildren is set this will be ignored. (Default: null)
    */
  var includeChildPredicate: Nullable[js.Function1[/* abstractMesh */ AbstractMesh, scala.Boolean]] = js.native
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
    * The size of the rotation spheres attached to the bounding box (Default: 0.1)
    */
  var rotationSphereSize: scala.Double = js.native
  /**
    * The size of the scale boxes attached to the bounding box (Default: 0.1)
    */
  var scaleBoxSize: scala.Double = js.native
  /**
    * Relative bounding box pivot used when scaling the attached mesh. When null object with scale from the opposite corner. 0.5,0.5,0.5 for center and 0.5,0,0.5 for bottom (Default: null)
    */
  var scalePivot: Nullable[Vector3] = js.native
  /**
    * Enables rotation on the specified axis and disables rotation on the others
    * @param axis The list of axis that should be enabled (eg. "xy" or "xyz")
    */
  def setEnabledRotationAxis(axis: java.lang.String): scala.Unit = js.native
  /**
    * Updates the bounding box information for the Gizmo
    */
  def updateBoundingBox(): scala.Unit = js.native
}

/**
  * Bounding box gizmo
  */
@JSGlobal("BABYLON.BoundingBoxGizmo")
@js.native
object BoundingBoxGizmo extends js.Object {
  var _OldPivotPoint: js.Any = js.native
  var _PivotCached: js.Any = js.native
  var _PivotTmpVector: js.Any = js.native
  var _PivotTranslation: js.Any = js.native
  /**
    * Makes a mesh not pickable and wraps the mesh inside of a bounding box mesh that is pickable. (This is useful to avoid picking within complex geometry)
    * @param mesh the mesh to wrap in the bounding box mesh and make not pickable
    * @returns the bounding box mesh with the passed in mesh as a child
    */
  def MakeNotPickableAndWrapInBoundingBox(mesh: babylonjsLib.BABYLONNs.Mesh): babylonjsLib.BABYLONNs.Mesh = js.native
  /** @hidden */
  def _RemoveAndStorePivotPoint(mesh: babylonjsLib.BABYLONNs.AbstractMesh): scala.Unit = js.native
  /** @hidden */
  def _RestorePivotPoint(mesh: babylonjsLib.BABYLONNs.AbstractMesh): scala.Unit = js.native
}

