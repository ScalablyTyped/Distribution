package typings.baconjs.typesFlatmapMod

import typings.baconjs.describeMod.Desc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlatMapParams extends js.Object {
  var desc: js.UndefOr[Desc] = js.undefined
  var firstOnly: js.UndefOr[Boolean] = js.undefined
  var limit: js.UndefOr[Double] = js.undefined
  var mapError: js.UndefOr[Boolean] = js.undefined
}

object FlatMapParams {
  @scala.inline
  def apply(
    desc: Desc = null,
    firstOnly: js.UndefOr[Boolean] = js.undefined,
    limit: js.UndefOr[Double] = js.undefined,
    mapError: js.UndefOr[Boolean] = js.undefined
  ): FlatMapParams = {
    val __obj = js.Dynamic.literal()
    if (desc != null) __obj.updateDynamic("desc")(desc.asInstanceOf[js.Any])
    if (!js.isUndefined(firstOnly)) __obj.updateDynamic("firstOnly")(firstOnly.get.asInstanceOf[js.Any])
    if (!js.isUndefined(limit)) __obj.updateDynamic("limit")(limit.get.asInstanceOf[js.Any])
    if (!js.isUndefined(mapError)) __obj.updateDynamic("mapError")(mapError.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlatMapParams]
  }
}

