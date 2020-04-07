package typings.babylonjs

import typings.babylonjs.effectMod.Effect
import typings.babylonjs.materialMod.Material
import typings.babylonjs.mathVectorMod.Matrix
import typings.babylonjs.meshMod.Mesh
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Materials/pushMaterial", JSImport.Namespace)
@js.native
object pushMaterialMod extends js.Object {
  @js.native
  class PushMaterial protected () extends Material {
    def this(name: String, scene: Scene) = this()
    var _activeEffect: Effect = js.native
    var _normalMatrix: Matrix = js.native
    /**
      * Gets or sets a boolean indicating that the material is allowed to do shader hot swapping.
      * This means that the material can keep using a previous shader while a new one is being compiled.
      * This is mostly used when shader parallel compilation is supported (true by default)
      */
    var allowShaderHotSwapping: Boolean = js.native
    /* protected */ def _afterBind(mesh: Mesh, effect: Nullable[Effect]): Unit = js.native
    /* protected */ def _mustRebind(scene: Scene, effect: Effect): Boolean = js.native
    /* protected */ def _mustRebind(scene: Scene, effect: Effect, visibility: Double): Boolean = js.native
    /**
      * Binds the given normal matrix to the active effect
      *
      * @param normalMatrix the matrix to bind
      */
    def bindOnlyNormalMatrix(normalMatrix: Matrix): Unit = js.native
  }
  
}

