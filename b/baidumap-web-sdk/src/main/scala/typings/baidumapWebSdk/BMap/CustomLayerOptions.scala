package typings.baidumapWebSdk.BMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomLayerOptions extends js.Object {
  var databoxId: js.UndefOr[String] = js.undefined
  var filter: js.UndefOr[String] = js.undefined
  var geotableId: js.UndefOr[String] = js.undefined
  var pointDensityType: js.UndefOr[PointDensityType] = js.undefined
  var q: js.UndefOr[String] = js.undefined
  var tags: js.UndefOr[String] = js.undefined
}

object CustomLayerOptions {
  @scala.inline
  def apply(
    databoxId: String = null,
    filter: String = null,
    geotableId: String = null,
    pointDensityType: js.UndefOr[PointDensityType] = js.undefined,
    q: String = null,
    tags: String = null
  ): CustomLayerOptions = {
    val __obj = js.Dynamic.literal()
    if (databoxId != null) __obj.updateDynamic("databoxId")(databoxId.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (geotableId != null) __obj.updateDynamic("geotableId")(geotableId.asInstanceOf[js.Any])
    if (!js.isUndefined(pointDensityType)) __obj.updateDynamic("pointDensityType")(pointDensityType.get.asInstanceOf[js.Any])
    if (q != null) __obj.updateDynamic("q")(q.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomLayerOptions]
  }
}

