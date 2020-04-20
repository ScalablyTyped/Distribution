package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.LightGizmo")
@js.native
/**
  * Creates a LightGizmo
  * @param gizmoLayer The utility layer the gizmo will be added to
  */
class LightGizmo () extends Gizmo {
  def this(gizmoLayer: UtilityLayerRenderer) = this()
  var _attachedMeshParent: js.Any = js.native
  var _cachedForward: js.Any = js.native
  var _cachedPosition: js.Any = js.native
  var _light: js.Any = js.native
  var _lightMesh: js.Any = js.native
  var _material: js.Any = js.native
  def light: Nullable[Light] = js.native
  /**
    * The light that the gizmo is attached to
    */
  def light(light: Nullable[Light]): js.Any = js.native
  /**
    * Gets the material used to render the light gizmo
    */
  def material: StandardMaterial = js.native
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

