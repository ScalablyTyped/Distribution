package typings.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.LightGizmo")
@js.native
/**
  * Creates a LightGizmo
  * @param gizmoLayer The utility layer the gizmo will be added to
  */
class LightGizmo ()
  extends StObject
     with typings.babylonjs.BABYLON.LightGizmo {
  def this(gizmoLayer: typings.babylonjs.BABYLON.UtilityLayerRenderer) = this()
  
  /**
    * Releases all held resources
    */
  /* CompleteClass */
  override def dispose(): Unit = js.native
}
/* static members */
object LightGizmo {
  
  @JSGlobal("BABYLON.LightGizmo")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("BABYLON.LightGizmo._CreateDirectionalLightMesh")
  @js.native
  def _CreateDirectionalLightMesh: js.Any = js.native
  inline def _CreateDirectionalLightMesh_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_CreateDirectionalLightMesh")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.LightGizmo._CreateHemisphericLightMesh")
  @js.native
  def _CreateHemisphericLightMesh: js.Any = js.native
  inline def _CreateHemisphericLightMesh_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_CreateHemisphericLightMesh")(x.asInstanceOf[js.Any])
  
  /**
    * Creates the lines for a light mesh
    */
  @JSGlobal("BABYLON.LightGizmo._CreateLightLines")
  @js.native
  def _CreateLightLines: js.Any = js.native
  inline def _CreateLightLines_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_CreateLightLines")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.LightGizmo._CreatePointLightMesh")
  @js.native
  def _CreatePointLightMesh: js.Any = js.native
  inline def _CreatePointLightMesh_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_CreatePointLightMesh")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.LightGizmo._CreateSpotLightMesh")
  @js.native
  def _CreateSpotLightMesh: js.Any = js.native
  inline def _CreateSpotLightMesh_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_CreateSpotLightMesh")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.LightGizmo._Scale")
  @js.native
  def _Scale: js.Any = js.native
  inline def _Scale_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_Scale")(x.asInstanceOf[js.Any])
}
