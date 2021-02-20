package typings.babylonjs

import typings.babylonjs.effectMod.Effect
import typings.babylonjs.materialMod.Material
import typings.babylonjs.mathVectorMod.Matrix
import typings.babylonjs.meshMod.Mesh
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.subMeshMod.SubMesh
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pushMaterialMod {
  
  @JSImport("babylonjs/Materials/pushMaterial", "PushMaterial")
  @js.native
  class PushMaterial protected () extends Material {
    def this(name: String, scene: Scene) = this()
    
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
}
