package typings
package cesiumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Image extends js.Object {
  var image: js.UndefOr[cesiumLib.cesiumMod.Property] = js.undefined
  var repeat: js.UndefOr[cesiumLib.cesiumMod.Property] = js.undefined
}

object Anon_Image {
  @scala.inline
  def apply(image: cesiumLib.cesiumMod.Property = null, repeat: cesiumLib.cesiumMod.Property = null): Anon_Image = {
    val __obj = js.Dynamic.literal()
    if (image != null) __obj.updateDynamic("image")(image)
    if (repeat != null) __obj.updateDynamic("repeat")(repeat)
    __obj.asInstanceOf[Anon_Image]
  }
}

