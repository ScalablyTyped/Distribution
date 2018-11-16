package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * EffectFallbacks can be used to add fallbacks (properties to disable) to certain properties when desired to improve performance.
     * (Eg. Start at high quality with reflection and fog, if fps is low, remove reflection, if still low remove fog)
     */
@JSGlobal("BABYLON.EffectFallbacks")
@js.native
class EffectFallbacks () extends js.Object {
  var _currentRank: js.Any = js.native
  var _defines: js.Any = js.native
  var _maxRank: js.Any = js.native
  var _mesh: js.Any = js.native
  /**
           * Checks to see if more fallbacks are still availible.
           */
  val isMoreFallbacks: scala.Boolean = js.native
  /**
           * Sets the mesh to use CPU skinning when needing to fallback.
           * @param rank The rank of the fallback (Lower ranks will be fallbacked to first)
           * @param mesh The mesh to use the fallbacks.
           */
  def addCPUSkinningFallback(rank: scala.Double, mesh: AbstractMesh): scala.Unit = js.native
  /**
           * Adds a fallback on the specified property.
           * @param rank The rank of the fallback (Lower ranks will be fallbacked to first)
           * @param define The name of the define in the shader
           */
  def addFallback(rank: scala.Double, define: java.lang.String): scala.Unit = js.native
  /**
           * Removes the defines that shoould be removed when falling back.
           * @param currentDefines defines the current define statements for the shader.
           * @param effect defines the current effect we try to compile
           * @returns The resulting defines with defines of the current rank removed.
           */
  def reduce(currentDefines: java.lang.String, effect: Effect): java.lang.String = js.native
  /**
           * Removes the fallback from the bound mesh.
           */
  def unBindMesh(): scala.Unit = js.native
}

