package typings.babylonjs.mod

import typings.babylonjs.gizmosGizmoMod.GizmoAxisCache
import typings.babylonjs.meshesMeshMod.Mesh
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
open class Gizmo ()
  extends typings.babylonjs.legacyLegacyMod.Gizmo {
  def this(/** The utility layer the gizmo will be added to */
  gizmoLayer: typings.babylonjs.renderingUtilityLayerRendererMod.UtilityLayerRenderer) = this()
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
    gizmoLayer: typings.babylonjs.renderingUtilityLayerRendererMod.UtilityLayerRenderer,
    gizmoAxisCache: Map[Mesh, GizmoAxisCache]
  ): typings.babylonjs.miscObservableMod.Observer[typings.babylonjs.eventsPointerEventsMod.PointerInfo] = (^.asInstanceOf[js.Dynamic].applyDynamic("GizmoAxisPointerObserver")(gizmoLayer.asInstanceOf[js.Any], gizmoAxisCache.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.miscObservableMod.Observer[typings.babylonjs.eventsPointerEventsMod.PointerInfo]]
  
  /**
    * When enabled, any gizmo operation will perserve scaling sign. Default is off.
    * Only valid for TransformNode derived classes (Mesh, AbstractMesh, ...)
    */
  @JSImport("babylonjs", "Gizmo.PreserveScaling")
  @js.native
  def PreserveScaling: Boolean = js.native
  inline def PreserveScaling_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PreserveScaling")(x.asInstanceOf[js.Any])
}
