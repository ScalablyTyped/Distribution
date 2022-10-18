package typings.babylonjs

import typings.babylonjs.materialsEffectMod.Effect
import typings.babylonjs.materialsMaterialMod.Material
import typings.babylonjs.mathsMathDotvectorMod.Matrix
import typings.babylonjs.meshesSubMeshMod.SubMesh
import typings.babylonjs.sceneMod.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object materialsPushMaterialMod {
  
  @JSImport("babylonjs/Materials/pushMaterial", "PushMaterial")
  @js.native
  open class PushMaterial protected () extends Material {
    def this(name: String) = this()
    def this(name: String, scene: Scene) = this()
    def this(name: String, scene: Unit, storeEffectOnSubMeshes: Boolean) = this()
    def this(name: String, scene: Scene, storeEffectOnSubMeshes: Boolean) = this()
    
    /* protected */ var _activeEffect: Effect = js.native
    
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
}
