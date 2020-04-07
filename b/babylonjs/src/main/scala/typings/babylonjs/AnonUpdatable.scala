package typings.babylonjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonUpdatable extends js.Object {
  var flat: js.UndefOr[Boolean] = js.undefined
  var radius: js.UndefOr[Double] = js.undefined
  var sideOrientation: js.UndefOr[Double] = js.undefined
  var subdivisions: js.UndefOr[Double] = js.undefined
  var updatable: js.UndefOr[Boolean] = js.undefined
}

object AnonUpdatable {
  @scala.inline
  def apply(
    flat: js.UndefOr[Boolean] = js.undefined,
    radius: Int | Double = null,
    sideOrientation: Int | Double = null,
    subdivisions: Int | Double = null,
    updatable: js.UndefOr[Boolean] = js.undefined
  ): AnonUpdatable = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(flat)) __obj.updateDynamic("flat")(flat.asInstanceOf[js.Any])
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    if (sideOrientation != null) __obj.updateDynamic("sideOrientation")(sideOrientation.asInstanceOf[js.Any])
    if (subdivisions != null) __obj.updateDynamic("subdivisions")(subdivisions.asInstanceOf[js.Any])
    if (!js.isUndefined(updatable)) __obj.updateDynamic("updatable")(updatable.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonUpdatable]
  }
}

