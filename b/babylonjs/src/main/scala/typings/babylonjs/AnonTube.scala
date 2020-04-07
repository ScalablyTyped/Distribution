package typings.babylonjs

import typings.babylonjs.BABYLON.Vector4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTube extends js.Object {
  var backUVs: js.UndefOr[Vector4] = js.undefined
  var frontUVs: js.UndefOr[Vector4] = js.undefined
  var p: js.UndefOr[Double] = js.undefined
  var q: js.UndefOr[Double] = js.undefined
  var radialSegments: js.UndefOr[Double] = js.undefined
  var radius: js.UndefOr[Double] = js.undefined
  var sideOrientation: js.UndefOr[Double] = js.undefined
  var tube: js.UndefOr[Double] = js.undefined
  var tubularSegments: js.UndefOr[Double] = js.undefined
  var updatable: js.UndefOr[Boolean] = js.undefined
}

object AnonTube {
  @scala.inline
  def apply(
    backUVs: Vector4 = null,
    frontUVs: Vector4 = null,
    p: Int | Double = null,
    q: Int | Double = null,
    radialSegments: Int | Double = null,
    radius: Int | Double = null,
    sideOrientation: Int | Double = null,
    tube: Int | Double = null,
    tubularSegments: Int | Double = null,
    updatable: js.UndefOr[Boolean] = js.undefined
  ): AnonTube = {
    val __obj = js.Dynamic.literal()
    if (backUVs != null) __obj.updateDynamic("backUVs")(backUVs.asInstanceOf[js.Any])
    if (frontUVs != null) __obj.updateDynamic("frontUVs")(frontUVs.asInstanceOf[js.Any])
    if (p != null) __obj.updateDynamic("p")(p.asInstanceOf[js.Any])
    if (q != null) __obj.updateDynamic("q")(q.asInstanceOf[js.Any])
    if (radialSegments != null) __obj.updateDynamic("radialSegments")(radialSegments.asInstanceOf[js.Any])
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    if (sideOrientation != null) __obj.updateDynamic("sideOrientation")(sideOrientation.asInstanceOf[js.Any])
    if (tube != null) __obj.updateDynamic("tube")(tube.asInstanceOf[js.Any])
    if (tubularSegments != null) __obj.updateDynamic("tubularSegments")(tubularSegments.asInstanceOf[js.Any])
    if (!js.isUndefined(updatable)) __obj.updateDynamic("updatable")(updatable.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTube]
  }
}

