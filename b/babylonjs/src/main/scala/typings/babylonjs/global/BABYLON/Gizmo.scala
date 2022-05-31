package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.GizmoAxisCache
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.Gizmo")
@js.native
/**
  * Creates a gizmo
  * @param gizmoLayer The utility layer the gizmo will be added to
  */
class Gizmo ()
  extends StObject
     with typings.babylonjs.BABYLON.Gizmo {
  def this(/** The utility layer the gizmo will be added to */
  gizmoLayer: typings.babylonjs.BABYLON.UtilityLayerRenderer) = this()
  
  /**
    * Releases all held resources
    */
  /* CompleteClass */
  override def dispose(): Unit = js.native
}
/* static members */
object Gizmo {
  
  @JSGlobal("BABYLON.Gizmo")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Subscribes to pointer up, down, and hover events. Used for responsive gizmos.
    * @param gizmoLayer The utility layer the gizmo will be added to
    * @param gizmoAxisCache Gizmo axis definition used for reactive gizmo UI
    * @returns {Observer<PointerInfo>} pointerObserver
    */
  inline def GizmoAxisPointerObserver(
    gizmoLayer: typings.babylonjs.BABYLON.UtilityLayerRenderer,
    gizmoAxisCache: Map[typings.babylonjs.BABYLON.Mesh, GizmoAxisCache]
  ): typings.babylonjs.BABYLON.Observer[typings.babylonjs.BABYLON.PointerInfo] = (^.asInstanceOf[js.Dynamic].applyDynamic("GizmoAxisPointerObserver")(gizmoLayer.asInstanceOf[js.Any], gizmoAxisCache.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Observer[typings.babylonjs.BABYLON.PointerInfo]]
}
