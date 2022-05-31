package typings.babylonjs.mod

import typings.babylonjs.gizmoMod.GizmoAxisCache
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "Gizmo")
@js.native
/**
  * Creates a gizmo
  * @param gizmoLayer The utility layer the gizmo will be added to
  */
class Gizmo ()
  extends typings.babylonjs.legacyMod.Gizmo {
  def this(/** The utility layer the gizmo will be added to */
  gizmoLayer: typings.babylonjs.utilityLayerRendererMod.UtilityLayerRenderer) = this()
}
/* static members */
object Gizmo {
  
  @JSImport("babylonjs", "Gizmo")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Subscribes to pointer up, down, and hover events. Used for responsive gizmos.
    * @param gizmoLayer The utility layer the gizmo will be added to
    * @param gizmoAxisCache Gizmo axis definition used for reactive gizmo UI
    * @returns {Observer<PointerInfo>} pointerObserver
    */
  inline def GizmoAxisPointerObserver(
    gizmoLayer: typings.babylonjs.utilityLayerRendererMod.UtilityLayerRenderer,
    gizmoAxisCache: Map[typings.babylonjs.meshMod.Mesh, GizmoAxisCache]
  ): typings.babylonjs.observableMod.Observer[typings.babylonjs.pointerEventsMod.PointerInfo] = (^.asInstanceOf[js.Dynamic].applyDynamic("GizmoAxisPointerObserver")(gizmoLayer.asInstanceOf[js.Any], gizmoAxisCache.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.observableMod.Observer[typings.babylonjs.pointerEventsMod.PointerInfo]]
}
