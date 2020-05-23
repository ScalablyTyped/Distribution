package typings.babylonjs.anon

import typings.babylonjs.groundMeshMod.GroundMesh
import typings.babylonjs.mathColorMod.Color3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorFilter extends js.Object {
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

object ColorFilter {
  @scala.inline
  def apply(
    alphaFilter: js.UndefOr[Double] = js.undefined,
    colorFilter: Color3 = null,
    height: js.UndefOr[Double] = js.undefined,
    maxHeight: js.UndefOr[Double] = js.undefined,
    minHeight: js.UndefOr[Double] = js.undefined,
    onReady: /* mesh */ GroundMesh => Unit = null,
    subdivisions: js.UndefOr[Double] = js.undefined,
    updatable: js.UndefOr[Boolean] = js.undefined,
    width: js.UndefOr[Double] = js.undefined
  ): ColorFilter = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(alphaFilter)) __obj.updateDynamic("alphaFilter")(alphaFilter.get.asInstanceOf[js.Any])
    if (colorFilter != null) __obj.updateDynamic("colorFilter")(colorFilter.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxHeight)) __obj.updateDynamic("maxHeight")(maxHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minHeight)) __obj.updateDynamic("minHeight")(minHeight.get.asInstanceOf[js.Any])
    if (onReady != null) __obj.updateDynamic("onReady")(js.Any.fromFunction1(onReady))
    if (!js.isUndefined(subdivisions)) __obj.updateDynamic("subdivisions")(subdivisions.get.asInstanceOf[js.Any])
    if (!js.isUndefined(updatable)) __obj.updateDynamic("updatable")(updatable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorFilter]
  }
}

