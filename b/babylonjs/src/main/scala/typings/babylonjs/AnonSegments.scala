package typings.babylonjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSegments extends js.Object {
  var diameter: js.UndefOr[Double] = js.undefined
  var segments: js.UndefOr[Double] = js.undefined
  var sideOrientation: js.UndefOr[Double] = js.undefined
}

object AnonSegments {
  @scala.inline
  def apply(diameter: Int | Double = null, segments: Int | Double = null, sideOrientation: Int | Double = null): AnonSegments = {
    val __obj = js.Dynamic.literal()
    if (diameter != null) __obj.updateDynamic("diameter")(diameter.asInstanceOf[js.Any])
    if (segments != null) __obj.updateDynamic("segments")(segments.asInstanceOf[js.Any])
    if (sideOrientation != null) __obj.updateDynamic("sideOrientation")(sideOrientation.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSegments]
  }
}

