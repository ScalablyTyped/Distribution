package typings
package babylonjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HeightSubdivisions extends js.Object {
  var height: js.UndefOr[scala.Double] = js.undefined
  var subdivisions: js.UndefOr[scala.Double] = js.undefined
  var subdivisionsX: js.UndefOr[scala.Double] = js.undefined
  var subdivisionsY: js.UndefOr[scala.Double] = js.undefined
  var updatable: js.UndefOr[scala.Boolean] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
}

object Anon_HeightSubdivisions {
  @scala.inline
  def apply(
    height: scala.Int | scala.Double = null,
    subdivisions: scala.Int | scala.Double = null,
    subdivisionsX: scala.Int | scala.Double = null,
    subdivisionsY: scala.Int | scala.Double = null,
    updatable: js.UndefOr[scala.Boolean] = js.undefined,
    width: scala.Int | scala.Double = null
  ): Anon_HeightSubdivisions = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (subdivisions != null) __obj.updateDynamic("subdivisions")(subdivisions.asInstanceOf[js.Any])
    if (subdivisionsX != null) __obj.updateDynamic("subdivisionsX")(subdivisionsX.asInstanceOf[js.Any])
    if (subdivisionsY != null) __obj.updateDynamic("subdivisionsY")(subdivisionsY.asInstanceOf[js.Any])
    if (!js.isUndefined(updatable)) __obj.updateDynamic("updatable")(updatable)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_HeightSubdivisions]
  }
}

