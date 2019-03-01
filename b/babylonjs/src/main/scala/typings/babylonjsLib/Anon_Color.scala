package typings
package babylonjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Color extends js.Object {
  var color: babylonjsLib.BABYLONNs.Color4
  var texture: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.BaseTexture]
}

object Anon_Color {
  @scala.inline
  def apply(
    color: babylonjsLib.BABYLONNs.Color4,
    texture: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.BaseTexture]
  ): Anon_Color = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("color")(color)
    __obj.updateDynamic("texture")(texture.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Color]
  }
}

