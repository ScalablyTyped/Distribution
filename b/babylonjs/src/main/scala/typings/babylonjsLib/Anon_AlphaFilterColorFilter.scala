package typings
package babylonjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AlphaFilterColorFilter extends js.Object {
  var alphaFilter: js.UndefOr[scala.Double] = js.undefined
  var colorFilter: js.UndefOr[babylonjsLib.BABYLONNs.Color3] = js.undefined
  var height: js.UndefOr[scala.Double] = js.undefined
  var maxHeight: js.UndefOr[scala.Double] = js.undefined
  var minHeight: js.UndefOr[scala.Double] = js.undefined
  var onReady: js.UndefOr[js.Function1[/* mesh */ babylonjsLib.BABYLONNs.GroundMesh, scala.Unit]] = js.undefined
  var subdivisions: js.UndefOr[scala.Double] = js.undefined
  var updatable: js.UndefOr[scala.Boolean] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
}

object Anon_AlphaFilterColorFilter {
  @scala.inline
  def apply(
    alphaFilter: scala.Int | scala.Double = null,
    colorFilter: babylonjsLib.BABYLONNs.Color3 = null,
    height: scala.Int | scala.Double = null,
    maxHeight: scala.Int | scala.Double = null,
    minHeight: scala.Int | scala.Double = null,
    onReady: js.Function1[/* mesh */ babylonjsLib.BABYLONNs.GroundMesh, scala.Unit] = null,
    subdivisions: scala.Int | scala.Double = null,
    updatable: js.UndefOr[scala.Boolean] = js.undefined,
    width: scala.Int | scala.Double = null
  ): Anon_AlphaFilterColorFilter = {
    val __obj = js.Dynamic.literal()
    if (alphaFilter != null) __obj.updateDynamic("alphaFilter")(alphaFilter.asInstanceOf[js.Any])
    if (colorFilter != null) __obj.updateDynamic("colorFilter")(colorFilter)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight.asInstanceOf[js.Any])
    if (minHeight != null) __obj.updateDynamic("minHeight")(minHeight.asInstanceOf[js.Any])
    if (onReady != null) __obj.updateDynamic("onReady")(onReady)
    if (subdivisions != null) __obj.updateDynamic("subdivisions")(subdivisions.asInstanceOf[js.Any])
    if (!js.isUndefined(updatable)) __obj.updateDynamic("updatable")(updatable)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AlphaFilterColorFilter]
  }
}

