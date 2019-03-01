package typings
package babylonjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColorsInstance extends js.Object {
  var colors: js.UndefOr[
    babylonjsLib.BABYLONNs.Nullable[js.Array[js.Array[babylonjsLib.BABYLONNs.Color4]]]
  ] = js.undefined
  var instance: js.UndefOr[babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.LinesMesh]] = js.undefined
  var lines: js.Array[js.Array[babylonjsLib.BABYLONNs.Vector3]]
  var updatable: js.UndefOr[scala.Boolean] = js.undefined
  var useVertexAlpha: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_ColorsInstance {
  @scala.inline
  def apply(
    lines: js.Array[js.Array[babylonjsLib.BABYLONNs.Vector3]],
    colors: babylonjsLib.BABYLONNs.Nullable[js.Array[js.Array[babylonjsLib.BABYLONNs.Color4]]] = null,
    instance: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.LinesMesh] = null,
    updatable: js.UndefOr[scala.Boolean] = js.undefined,
    useVertexAlpha: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_ColorsInstance = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("lines")(lines)
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (instance != null) __obj.updateDynamic("instance")(instance.asInstanceOf[js.Any])
    if (!js.isUndefined(updatable)) __obj.updateDynamic("updatable")(updatable)
    if (!js.isUndefined(useVertexAlpha)) __obj.updateDynamic("useVertexAlpha")(useVertexAlpha)
    __obj.asInstanceOf[Anon_ColorsInstance]
  }
}

