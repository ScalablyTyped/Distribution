package typings.babylonjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Updatable extends js.Object {
  var flat: js.UndefOr[Boolean] = js.undefined
  var radius: js.UndefOr[Double] = js.undefined
  var sideOrientation: js.UndefOr[Double] = js.undefined
  var subdivisions: js.UndefOr[Double] = js.undefined
  var updatable: js.UndefOr[Boolean] = js.undefined
}

object Updatable {
  @scala.inline
  def apply(
    flat: js.UndefOr[Boolean] = js.undefined,
    radius: js.UndefOr[Double] = js.undefined,
    sideOrientation: js.UndefOr[Double] = js.undefined,
    subdivisions: js.UndefOr[Double] = js.undefined,
    updatable: js.UndefOr[Boolean] = js.undefined
  ): Updatable = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(flat)) __obj.updateDynamic("flat")(flat.get.asInstanceOf[js.Any])
    if (!js.isUndefined(radius)) __obj.updateDynamic("radius")(radius.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sideOrientation)) __obj.updateDynamic("sideOrientation")(sideOrientation.get.asInstanceOf[js.Any])
    if (!js.isUndefined(subdivisions)) __obj.updateDynamic("subdivisions")(subdivisions.get.asInstanceOf[js.Any])
    if (!js.isUndefined(updatable)) __obj.updateDynamic("updatable")(updatable.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Updatable]
  }
}

