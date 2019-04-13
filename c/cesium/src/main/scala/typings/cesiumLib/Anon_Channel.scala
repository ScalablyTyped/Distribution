package typings
package cesiumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Channel extends js.Object {
  var channel: scala.Double
  var ellipsoid: js.UndefOr[cesiumLib.cesiumMod.Ellipsoid] = js.undefined
  var maximumLevel: js.UndefOr[scala.Double] = js.undefined
  var path: js.UndefOr[java.lang.String] = js.undefined
  var tileDiscardPolicy: js.UndefOr[cesiumLib.cesiumMod.TileDiscardPolicy] = js.undefined
  var url: cesiumLib.cesiumMod.Resource | java.lang.String
}

object Anon_Channel {
  @scala.inline
  def apply(
    channel: scala.Double,
    url: cesiumLib.cesiumMod.Resource | java.lang.String,
    ellipsoid: cesiumLib.cesiumMod.Ellipsoid = null,
    maximumLevel: scala.Int | scala.Double = null,
    path: java.lang.String = null,
    tileDiscardPolicy: cesiumLib.cesiumMod.TileDiscardPolicy = null
  ): Anon_Channel = {
    val __obj = js.Dynamic.literal(channel = channel, url = url.asInstanceOf[js.Any])
    if (ellipsoid != null) __obj.updateDynamic("ellipsoid")(ellipsoid)
    if (maximumLevel != null) __obj.updateDynamic("maximumLevel")(maximumLevel.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path)
    if (tileDiscardPolicy != null) __obj.updateDynamic("tileDiscardPolicy")(tileDiscardPolicy)
    __obj.asInstanceOf[Anon_Channel]
  }
}

