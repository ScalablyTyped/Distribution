package typings.babylonjs.global.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.EffectFallbacks")
@js.native
class EffectFallbacks ()
  extends typings.babylonjs.BABYLON.EffectFallbacks {
  /* CompleteClass */
  override var _currentRank: js.Any = js.native
  /* CompleteClass */
  override var _defines: js.Any = js.native
  /* CompleteClass */
  override var _maxRank: js.Any = js.native
  /* CompleteClass */
  override var _mesh: js.Any = js.native
  /**
    * Checks to see if more fallbacks are still availible.
    */
  /* CompleteClass */
  override var hasMoreFallbacks: Boolean = js.native
  /**
    * Sets the mesh to use CPU skinning when needing to fallback.
    * @param rank The rank of the fallback (Lower ranks will be fallbacked to first)
    * @param mesh The mesh to use the fallbacks.
    */
  /* CompleteClass */
  override def addCPUSkinningFallback(rank: Double, mesh: typings.babylonjs.BABYLON.AbstractMesh): Unit = js.native
  /**
    * Adds a fallback on the specified property.
    * @param rank The rank of the fallback (Lower ranks will be fallbacked to first)
    * @param define The name of the define in the shader
    */
  /* CompleteClass */
  override def addFallback(rank: Double, define: String): Unit = js.native
  /**
    * Checks to see if more fallbacks are still availible.
    */
  /* CompleteClass */
  @JSName("hasMoreFallbacks")
  override def hasMoreFallbacks_MEffectFallbacks: Boolean = js.native
  /**
    * Removes the defines that should be removed when falling back.
    * @param currentDefines defines the current define statements for the shader.
    * @param effect defines the current effect we try to compile
    * @returns The resulting defines with defines of the current rank removed.
    */
  /* CompleteClass */
  override def reduce(currentDefines: String, effect: typings.babylonjs.BABYLON.Effect): String = js.native
  /**
    * Removes the fallback from the bound mesh.
    */
  /* CompleteClass */
  override def unBindMesh(): Unit = js.native
}

