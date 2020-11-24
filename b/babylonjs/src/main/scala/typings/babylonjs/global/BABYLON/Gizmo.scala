package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.GizmoAxisCache
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.Gizmo")
@js.native
/**
  * Creates a gizmo
  * @param gizmoLayer The utility layer the gizmo will be added to
  */
class Gizmo ()
  extends typings.babylonjs.BABYLON.Gizmo {
  def this(/** The utility layer the gizmo will be added to */
  gizmoLayer: typings.babylonjs.BABYLON.UtilityLayerRenderer) = this()
}
/* static members */
@JSGlobal("BABYLON.Gizmo")
@js.native
object Gizmo extends js.Object {
  
  /**
    * Subscribes to pointer up, down, and hover events. Used for responsive gizmos.
    * @param gizmoLayer The utility layer the gizmo will be added to
    * @param gizmoAxisCache Gizmo axis definition used for reactive gizmo UI
    * @returns {Observer<PointerInfo>} pointerObserver
    */
  def GizmoAxisPointerObserver(
    gizmoLayer: typings.babylonjs.BABYLON.UtilityLayerRenderer,
    gizmoAxisCache: Map[typings.babylonjs.BABYLON.Mesh, GizmoAxisCache]
  ): typings.babylonjs.BABYLON.Observer[typings.babylonjs.BABYLON.PointerInfo] = js.native
}
