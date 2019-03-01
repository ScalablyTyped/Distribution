package typings
package babylonjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Height extends js.Object {
  var height: js.UndefOr[scala.Double] = js.undefined
  var subdivisions: js.UndefOr[scala.Double] = js.undefined
  var subdivisionsX: js.UndefOr[scala.Double] = js.undefined
  var subdivisionsY: js.UndefOr[scala.Double] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
}

object Anon_Height {
  @scala.inline
  def apply(
    height: scala.Int | scala.Double = null,
    subdivisions: scala.Int | scala.Double = null,
    subdivisionsX: scala.Int | scala.Double = null,
    subdivisionsY: scala.Int | scala.Double = null,
    width: scala.Int | scala.Double = null
  ): Anon_Height = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (subdivisions != null) __obj.updateDynamic("subdivisions")(subdivisions.asInstanceOf[js.Any])
    if (subdivisionsX != null) __obj.updateDynamic("subdivisionsX")(subdivisionsX.asInstanceOf[js.Any])
    if (subdivisionsY != null) __obj.updateDynamic("subdivisionsY")(subdivisionsY.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Height]
  }
}

