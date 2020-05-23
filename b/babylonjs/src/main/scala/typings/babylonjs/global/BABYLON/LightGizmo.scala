package typings.babylonjs.global.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.LightGizmo")
@js.native
/**
  * Creates a LightGizmo
  * @param gizmoLayer The utility layer the gizmo will be added to
  */
class LightGizmo ()
  extends typings.babylonjs.BABYLON.LightGizmo {
  def this(gizmoLayer: typings.babylonjs.BABYLON.UtilityLayerRenderer) = this()
  /**
    * Releases all held resources
    */
  /* CompleteClass */
  override def dispose(): Unit = js.native
}

/* static members */
@JSGlobal("BABYLON.LightGizmo")
@js.native
object LightGizmo extends js.Object {
  var _CreateDirectionalLightMesh: js.Any = js.native
  var _CreateHemisphericLightMesh: js.Any = js.native
  /**
    * Creates the lines for a light mesh
    */
  var _CreateLightLines: js.Any = js.native
  var _CreatePointLightMesh: js.Any = js.native
  var _CreateSpotLightMesh: js.Any = js.native
  var _Scale: js.Any = js.native
}

