package typings.babylonjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "LightGizmo")
@js.native
/**
  * Creates a LightGizmo
  * @param gizmoLayer The utility layer the gizmo will be added to
  */
open class LightGizmo ()
  extends typings.babylonjs.legacyLegacyMod.LightGizmo {
  def this(gizmoLayer: typings.babylonjs.renderingUtilityLayerRendererMod.UtilityLayerRenderer) = this()
}
/* static members */
object LightGizmo {
  
  @JSImport("babylonjs", "LightGizmo")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("babylonjs", "LightGizmo._CreateDirectionalLightMesh")
  @js.native
  def _CreateDirectionalLightMesh: Any = js.native
  inline def _CreateDirectionalLightMesh_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_CreateDirectionalLightMesh")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs", "LightGizmo._CreateHemisphericLightMesh")
  @js.native
  def _CreateHemisphericLightMesh: Any = js.native
  inline def _CreateHemisphericLightMesh_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_CreateHemisphericLightMesh")(x.asInstanceOf[js.Any])
  
  /**
    * Creates the lines for a light mesh
    * @param levels
    * @param scene
    */
  @JSImport("babylonjs", "LightGizmo._CreateLightLines")
  @js.native
  def _CreateLightLines: Any = js.native
  inline def _CreateLightLines_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_CreateLightLines")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs", "LightGizmo._CreatePointLightMesh")
  @js.native
  def _CreatePointLightMesh: Any = js.native
  inline def _CreatePointLightMesh_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_CreatePointLightMesh")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs", "LightGizmo._CreateSpotLightMesh")
  @js.native
  def _CreateSpotLightMesh: Any = js.native
  inline def _CreateSpotLightMesh_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_CreateSpotLightMesh")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs", "LightGizmo._Scale")
  @js.native
  def _Scale: Any = js.native
  inline def _Scale_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_Scale")(x.asInstanceOf[js.Any])
}
