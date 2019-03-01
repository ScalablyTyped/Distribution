package typings
package babylonjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Flat extends js.Object {
  var flat: js.UndefOr[scala.Boolean] = js.undefined
  var radius: js.UndefOr[scala.Double] = js.undefined
  var sideOrientation: js.UndefOr[scala.Double] = js.undefined
  var subdivisions: js.UndefOr[scala.Double] = js.undefined
  var updatable: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_Flat {
  @scala.inline
  def apply(
    flat: js.UndefOr[scala.Boolean] = js.undefined,
    radius: scala.Int | scala.Double = null,
    sideOrientation: scala.Int | scala.Double = null,
    subdivisions: scala.Int | scala.Double = null,
    updatable: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_Flat = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(flat)) __obj.updateDynamic("flat")(flat)
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    if (sideOrientation != null) __obj.updateDynamic("sideOrientation")(sideOrientation.asInstanceOf[js.Any])
    if (subdivisions != null) __obj.updateDynamic("subdivisions")(subdivisions.asInstanceOf[js.Any])
    if (!js.isUndefined(updatable)) __obj.updateDynamic("updatable")(updatable)
    __obj.asInstanceOf[Anon_Flat]
  }
}

