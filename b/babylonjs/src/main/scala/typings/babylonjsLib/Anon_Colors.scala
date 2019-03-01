package typings
package babylonjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Colors extends js.Object {
  var colors: js.UndefOr[
    babylonjsLib.BABYLONNs.Nullable[js.Array[js.Array[babylonjsLib.BABYLONNs.Color4]]]
  ] = js.undefined
  var lines: js.Array[js.Array[babylonjsLib.BABYLONNs.Vector3]]
}

object Anon_Colors {
  @scala.inline
  def apply(
    lines: js.Array[js.Array[babylonjsLib.BABYLONNs.Vector3]],
    colors: babylonjsLib.BABYLONNs.Nullable[js.Array[js.Array[babylonjsLib.BABYLONNs.Color4]]] = null
  ): Anon_Colors = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("lines")(lines)
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Colors]
  }
}

