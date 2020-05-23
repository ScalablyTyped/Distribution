package typings.cesium.anon

import typings.cesium.mod.Resource
import typings.cesium.mod.TileDiscardPolicy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Channel extends js.Object {
  var channel: Double
  var ellipsoid: js.UndefOr[typings.cesium.mod.Ellipsoid] = js.undefined
  var maximumLevel: js.UndefOr[Double] = js.undefined
  var path: js.UndefOr[String] = js.undefined
  var tileDiscardPolicy: js.UndefOr[TileDiscardPolicy] = js.undefined
  var url: Resource | String
}

object Channel {
  @scala.inline
  def apply(
    channel: Double,
    url: Resource | String,
    ellipsoid: typings.cesium.mod.Ellipsoid = null,
    maximumLevel: js.UndefOr[Double] = js.undefined,
    path: String = null,
    tileDiscardPolicy: TileDiscardPolicy = null
  ): Channel = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    if (ellipsoid != null) __obj.updateDynamic("ellipsoid")(ellipsoid.asInstanceOf[js.Any])
    if (!js.isUndefined(maximumLevel)) __obj.updateDynamic("maximumLevel")(maximumLevel.get.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (tileDiscardPolicy != null) __obj.updateDynamic("tileDiscardPolicy")(tileDiscardPolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[Channel]
  }
}

