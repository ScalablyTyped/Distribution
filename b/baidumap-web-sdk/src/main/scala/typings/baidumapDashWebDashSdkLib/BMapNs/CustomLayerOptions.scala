package typings
package baidumapDashWebDashSdkLib.BMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomLayerOptions extends js.Object {
  var databoxId: js.UndefOr[java.lang.String] = js.undefined
  var filter: js.UndefOr[java.lang.String] = js.undefined
  var geotableId: js.UndefOr[java.lang.String] = js.undefined
  var pointDensityType: js.UndefOr[PointDensityType] = js.undefined
  var q: js.UndefOr[java.lang.String] = js.undefined
  var tags: js.UndefOr[java.lang.String] = js.undefined
}

object CustomLayerOptions {
  @scala.inline
  def apply(
    databoxId: java.lang.String = null,
    filter: java.lang.String = null,
    geotableId: java.lang.String = null,
    pointDensityType: js.UndefOr[PointDensityType] = js.undefined,
    q: java.lang.String = null,
    tags: java.lang.String = null
  ): CustomLayerOptions = {
    val __obj = js.Dynamic.literal()
    if (databoxId != null) __obj.updateDynamic("databoxId")(databoxId)
    if (filter != null) __obj.updateDynamic("filter")(filter)
    if (geotableId != null) __obj.updateDynamic("geotableId")(geotableId)
    if (!js.isUndefined(pointDensityType)) __obj.updateDynamic("pointDensityType")(pointDensityType)
    if (q != null) __obj.updateDynamic("q")(q)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[CustomLayerOptions]
  }
}

