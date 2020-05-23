package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LightGizmo extends Gizmo {
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

