package typings.babylonjs.anon

import typings.babylonjs.BABYLON.Vector4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RadialSegments extends js.Object {
  var backUVs: js.UndefOr[Vector4] = js.undefined
  var frontUVs: js.UndefOr[Vector4] = js.undefined
  var p: js.UndefOr[Double] = js.undefined
  var q: js.UndefOr[Double] = js.undefined
  var radialSegments: js.UndefOr[Double] = js.undefined
  var radius: js.UndefOr[Double] = js.undefined
  var sideOrientation: js.UndefOr[Double] = js.undefined
  var tube: js.UndefOr[Double] = js.undefined
  var tubularSegments: js.UndefOr[Double] = js.undefined
}

object RadialSegments {
  @scala.inline
  def apply(
    backUVs: Vector4 = null,
    frontUVs: Vector4 = null,
    p: js.UndefOr[Double] = js.undefined,
    q: js.UndefOr[Double] = js.undefined,
    radialSegments: js.UndefOr[Double] = js.undefined,
    radius: js.UndefOr[Double] = js.undefined,
    sideOrientation: js.UndefOr[Double] = js.undefined,
    tube: js.UndefOr[Double] = js.undefined,
    tubularSegments: js.UndefOr[Double] = js.undefined
  ): RadialSegments = {
    val __obj = js.Dynamic.literal()
    if (backUVs != null) __obj.updateDynamic("backUVs")(backUVs.asInstanceOf[js.Any])
    if (frontUVs != null) __obj.updateDynamic("frontUVs")(frontUVs.asInstanceOf[js.Any])
    if (!js.isUndefined(p)) __obj.updateDynamic("p")(p.get.asInstanceOf[js.Any])
    if (!js.isUndefined(q)) __obj.updateDynamic("q")(q.get.asInstanceOf[js.Any])
    if (!js.isUndefined(radialSegments)) __obj.updateDynamic("radialSegments")(radialSegments.get.asInstanceOf[js.Any])
    if (!js.isUndefined(radius)) __obj.updateDynamic("radius")(radius.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sideOrientation)) __obj.updateDynamic("sideOrientation")(sideOrientation.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tube)) __obj.updateDynamic("tube")(tube.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tubularSegments)) __obj.updateDynamic("tubularSegments")(tubularSegments.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RadialSegments]
  }
}

