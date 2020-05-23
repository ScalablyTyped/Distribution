package typings.babylonjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FaceForward extends js.Object {
  var faceForward: js.UndefOr[Boolean] = js.undefined
  var resolution: js.UndefOr[Double] = js.undefined
  var size: js.UndefOr[Double] = js.undefined
  var useDirectMapping: js.UndefOr[Boolean] = js.undefined
}

object FaceForward {
  @scala.inline
  def apply(
    faceForward: js.UndefOr[Boolean] = js.undefined,
    resolution: js.UndefOr[Double] = js.undefined,
    size: js.UndefOr[Double] = js.undefined,
    useDirectMapping: js.UndefOr[Boolean] = js.undefined
  ): FaceForward = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(faceForward)) __obj.updateDynamic("faceForward")(faceForward.get.asInstanceOf[js.Any])
    if (!js.isUndefined(resolution)) __obj.updateDynamic("resolution")(resolution.get.asInstanceOf[js.Any])
    if (!js.isUndefined(size)) __obj.updateDynamic("size")(size.get.asInstanceOf[js.Any])
    if (!js.isUndefined(useDirectMapping)) __obj.updateDynamic("useDirectMapping")(useDirectMapping.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[FaceForward]
  }
}

