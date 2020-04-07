package typings.babylonjs

import typings.babylonjs.groundMeshMod.GroundMesh
import typings.babylonjs.mathColorMod.Color3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonColorFilter extends js.Object {
  var alphaFilter: js.UndefOr[Double] = js.undefined
  var colorFilter: js.UndefOr[Color3] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var maxHeight: js.UndefOr[Double] = js.undefined
  var minHeight: js.UndefOr[Double] = js.undefined
  var onReady: js.UndefOr[js.Function1[/* mesh */ GroundMesh, Unit]] = js.undefined
  var subdivisions: js.UndefOr[Double] = js.undefined
  var updatable: js.UndefOr[Boolean] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object AnonColorFilter {
  @scala.inline
  def apply(
    alphaFilter: Int | Double = null,
    colorFilter: Color3 = null,
    height: Int | Double = null,
    maxHeight: Int | Double = null,
    minHeight: Int | Double = null,
    onReady: /* mesh */ GroundMesh => Unit = null,
    subdivisions: Int | Double = null,
    updatable: js.UndefOr[Boolean] = js.undefined,
    width: Int | Double = null
  ): AnonColorFilter = {
    val __obj = js.Dynamic.literal()
    if (alphaFilter != null) __obj.updateDynamic("alphaFilter")(alphaFilter.asInstanceOf[js.Any])
    if (colorFilter != null) __obj.updateDynamic("colorFilter")(colorFilter.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight.asInstanceOf[js.Any])
    if (minHeight != null) __obj.updateDynamic("minHeight")(minHeight.asInstanceOf[js.Any])
    if (onReady != null) __obj.updateDynamic("onReady")(js.Any.fromFunction1(onReady))
    if (subdivisions != null) __obj.updateDynamic("subdivisions")(subdivisions.asInstanceOf[js.Any])
    if (!js.isUndefined(updatable)) __obj.updateDynamic("updatable")(updatable.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonColorFilter]
  }
}

