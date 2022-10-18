package typings.babylonjs.legacyLegacyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "CameraGizmo")
@js.native
/**
  * Creates a CameraGizmo
  * @param gizmoLayer The utility layer the gizmo will be added to
  */
open class CameraGizmo ()
  extends typings.babylonjs.indexMod.CameraGizmo {
  def this(gizmoLayer: typings.babylonjs.renderingUtilityLayerRendererMod.UtilityLayerRenderer) = this()
}
/* static members */
object CameraGizmo {
  
  @JSImport("babylonjs/Legacy/legacy", "CameraGizmo")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("babylonjs/Legacy/legacy", "CameraGizmo._CreateCameraFrustum")
  @js.native
  def _CreateCameraFrustum: Any = js.native
  inline def _CreateCameraFrustum_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_CreateCameraFrustum")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/Legacy/legacy", "CameraGizmo._CreateCameraMesh")
  @js.native
  def _CreateCameraMesh: Any = js.native
  inline def _CreateCameraMesh_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_CreateCameraMesh")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/Legacy/legacy", "CameraGizmo._Scale")
  @js.native
  def _Scale: Any = js.native
  inline def _Scale_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_Scale")(x.asInstanceOf[js.Any])
}
