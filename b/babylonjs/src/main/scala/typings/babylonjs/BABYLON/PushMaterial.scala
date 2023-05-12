package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PushMaterial
  extends StObject
     with Material {
  
  /* protected */ var _activeEffect: js.UndefOr[Effect] = js.native
  
  /* protected */ def _isReadyForSubMesh(subMesh: SubMesh): Boolean = js.native
  
  /* protected */ def _mustRebind(scene: Scene, effect: Effect): Boolean = js.native
  /* protected */ def _mustRebind(scene: Scene, effect: Effect, visibility: Double): Boolean = js.native
  
  /* protected */ var _normalMatrix: Matrix = js.native
  
  /**
    * Binds the given normal matrix to the active effect
    *
    * @param normalMatrix the matrix to bind
    */
  def bindOnlyNormalMatrix(normalMatrix: Matrix): Unit = js.native
}
