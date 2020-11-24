package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PushMaterial extends Material {
  
  var _activeEffect: Effect = js.native
  
  /* protected */ def _afterBind(mesh: Mesh, effect: Nullable[Effect]): Unit = js.native
  
  /* protected */ def _isReadyForSubMesh(subMesh: SubMesh): Boolean = js.native
  
  /* protected */ def _mustRebind(scene: Scene, effect: Effect): Boolean = js.native
  /* protected */ def _mustRebind(scene: Scene, effect: Effect, visibility: Double): Boolean = js.native
  
  var _normalMatrix: Matrix = js.native
  
  /**
    * Binds the given normal matrix to the active effect
    *
    * @param normalMatrix the matrix to bind
    */
  def bindOnlyNormalMatrix(normalMatrix: Matrix): Unit = js.native
}
