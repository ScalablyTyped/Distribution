package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EffectFallbacks extends IEffectFallbacks {
  var _currentRank: js.Any
  var _defines: js.Any
  var _maxRank: js.Any
  var _mesh: js.Any
  /**
    * Sets the mesh to use CPU skinning when needing to fallback.
    * @param rank The rank of the fallback (Lower ranks will be fallbacked to first)
    * @param mesh The mesh to use the fallbacks.
    */
  def addCPUSkinningFallback(rank: Double, mesh: AbstractMesh): Unit
  /**
    * Adds a fallback on the specified property.
    * @param rank The rank of the fallback (Lower ranks will be fallbacked to first)
    * @param define The name of the define in the shader
    */
  def addFallback(rank: Double, define: String): Unit
  /**
    * Checks to see if more fallbacks are still availible.
    */
  @JSName("hasMoreFallbacks")
  def hasMoreFallbacks_MEffectFallbacks: Boolean
}

object EffectFallbacks {
  @scala.inline
  def apply(
    _currentRank: js.Any,
    _defines: js.Any,
    _maxRank: js.Any,
    _mesh: js.Any,
    addCPUSkinningFallback: (Double, AbstractMesh) => Unit,
    addFallback: (Double, String) => Unit,
    hasMoreFallbacks: () => Boolean,
    reduce: (String, Effect) => String,
    unBindMesh: () => Unit
  ): EffectFallbacks = {
    val __obj = js.Dynamic.literal(_currentRank = _currentRank.asInstanceOf[js.Any], _defines = _defines.asInstanceOf[js.Any], _maxRank = _maxRank.asInstanceOf[js.Any], _mesh = _mesh.asInstanceOf[js.Any], addCPUSkinningFallback = js.Any.fromFunction2(addCPUSkinningFallback), addFallback = js.Any.fromFunction2(addFallback), hasMoreFallbacks = js.Any.fromFunction0(hasMoreFallbacks), reduce = js.Any.fromFunction2(reduce), unBindMesh = js.Any.fromFunction0(unBindMesh))
    __obj.asInstanceOf[EffectFallbacks]
  }
}

