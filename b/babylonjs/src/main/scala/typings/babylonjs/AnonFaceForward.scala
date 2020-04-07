package typings.babylonjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFaceForward extends js.Object {
  var faceForward: js.UndefOr[Boolean] = js.undefined
  var resolution: js.UndefOr[Double] = js.undefined
  var size: js.UndefOr[Double] = js.undefined
  var useDirectMapping: js.UndefOr[Boolean] = js.undefined
}

object AnonFaceForward {
  @scala.inline
  def apply(
    faceForward: js.UndefOr[Boolean] = js.undefined,
    resolution: Int | Double = null,
    size: Int | Double = null,
    useDirectMapping: js.UndefOr[Boolean] = js.undefined
  ): AnonFaceForward = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(faceForward)) __obj.updateDynamic("faceForward")(faceForward.asInstanceOf[js.Any])
    if (resolution != null) __obj.updateDynamic("resolution")(resolution.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (!js.isUndefined(useDirectMapping)) __obj.updateDynamic("useDirectMapping")(useDirectMapping.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFaceForward]
  }
}

