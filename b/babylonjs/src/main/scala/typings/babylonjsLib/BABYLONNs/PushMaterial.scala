package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Base class of materials working in push mode in babylon JS
  * @hidden
  */
@JSGlobal("BABYLON.PushMaterial")
@js.native
class PushMaterial protected () extends Material {
  def this(name: java.lang.String, scene: Scene) = this()
  var _activeEffect: Effect = js.native
  var _normalMatrix: Matrix = js.native
  /* protected */ def _afterBind(mesh: Mesh, effect: Nullable[Effect]): scala.Unit = js.native
  /* protected */ def _mustRebind(scene: Scene, effect: Effect): scala.Boolean = js.native
  /* protected */ def _mustRebind(scene: Scene, effect: Effect, visibility: scala.Double): scala.Boolean = js.native
  /**
    * Binds the given normal matrix to the active effect
    *
    * @param normalMatrix the matrix to bind
    */
  def bindOnlyNormalMatrix(normalMatrix: Matrix): scala.Unit = js.native
}

