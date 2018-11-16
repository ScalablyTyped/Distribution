package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Helps setup gizmo's in the scene to rotate/scale/position meshes
     */
@JSGlobal("BABYLON.GizmoManager")
@js.native
class GizmoManager protected () extends IDisposable {
  /**
           * Instatiates a gizmo manager
           * @param scene the scene to overlay the gizmos on top of
           */
  def this(scene: Scene) = this()
  var _attachedMesh: js.Any = js.native
  var _boundingBoxColor: js.Any = js.native
  var _defaultKeepDepthUtilityLayer: js.Any = js.native
  var _defaultUtilityLayer: js.Any = js.native
  var _gizmosEnabled: js.Any = js.native
  var _pointerObserver: js.Any = js.native
  /**
           * Array of meshes which will have the gizmo attached when a pointer selected them. If null, all meshes are attachable. (Default: null)
           */
  var attachableMeshes: Nullable[js.Array[AbstractMesh]] = js.native
  /**
           * When bounding box gizmo is enabled, this can be used to track drag/end events
           */
  var boundingBoxDragBehavior: SixDofDragBehavior = js.native
  /**
           * If the boundingBox gizmo is enabled
           */
  var boundingBoxGizmoEnabled: scala.Boolean = js.native
  /**
           * Gizmo's created by the gizmo manager, gizmo will be null until gizmo has been enabled for the first time
           */
  var gizmos: babylonjsLib.Anon_PositionGizmo = js.native
  /**
           * If the position gizmo is enabled
           */
  var positionGizmoEnabled: scala.Boolean = js.native
  /**
           * If the rotation gizmo is enabled
           */
  var rotationGizmoEnabled: scala.Boolean = js.native
  /**
           * If the scale gizmo is enabled
           */
  var scaleGizmoEnabled: scala.Boolean = js.native
  var scene: js.Any = js.native
  /**
           * If pointer events should perform attaching/detaching a gizmo, if false this can be done manually via attachToMesh. (Default: true)
           */
  var usePointerToAttachGizmos: scala.Boolean = js.native
  /**
           * Attaches a set of gizmos to the specified mesh
           * @param mesh The mesh the gizmo's should be attached to
           */
  def attachToMesh(mesh: Nullable[AbstractMesh]): scala.Unit = js.native
  /**
           * Releases all held resources
           */
  /* CompleteClass */
  override def dispose(): scala.Unit = js.native
}

