package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Renders gizmos on top of an existing scene which provide controls for position, rotation, etc.
  */
@JSGlobal("BABYLON.Gizmo")
@js.native
/**
  * Creates a gizmo
  * @param gizmoLayer The utility layer the gizmo will be added to
  */
class Gizmo () extends IDisposable {
  def this(/** The utility layer the gizmo will be added to */
  gizmoLayer: UtilityLayerRenderer) = this()
  var _attachedMesh: js.Any = js.native
  var _beforeRenderObserver: js.Any = js.native
  /**
    * If a custom mesh has been set (Default: false)
    */
  var _customMeshSet: scala.Boolean = js.native
  var _interactionsEnabled: scala.Boolean = js.native
  /**
    * The root mesh of the gizmo
    */
  var _rootMesh: Mesh = js.native
  var _tempVector: js.Any = js.native
  var _tmpMatrix: js.Any = js.native
  /**
    * When set, the gizmo will always appear the same size no matter where the camera is (default: false)
    */
  var _updateScale: scala.Boolean = js.native
  /**
    * Mesh that the gizmo will be attached to. (eg. on a drag gizmo the mesh that will be dragged)
    * * When set, interactions will be enabled
    */
  var attachedMesh: Nullable[AbstractMesh] = js.native
  /** The utility layer the gizmo will be added to */
  var gizmoLayer: UtilityLayerRenderer = js.native
  /**
    * Ratio for the scale of the gizmo (Default: 1)
    */
  var scaleRatio: scala.Double = js.native
  /**
    * If set the gizmo's position will be updated to match the attached mesh each frame (Default: true)
    */
  var updateGizmoPositionToMatchAttachedMesh: scala.Boolean = js.native
  /**
    * If set the gizmo's rotation will be updated to match the attached mesh each frame (Default: true)
    */
  var updateGizmoRotationToMatchAttachedMesh: scala.Boolean = js.native
  /* protected */ def _attachedMeshChanged(value: Nullable[AbstractMesh]): scala.Unit = js.native
  /**
    * @hidden
    * Updates the gizmo to match the attached mesh's position/rotation
    */
  /* protected */ def _update(): scala.Unit = js.native
  /**
    * Releases all held resources
    */
  /* CompleteClass */
  override def dispose(): scala.Unit = js.native
  /**
    * Disposes and replaces the current meshes in the gizmo with the specified mesh
    * @param mesh The mesh to replace the default mesh of the gizmo
    */
  def setCustomMesh(mesh: Mesh): scala.Unit = js.native
}

