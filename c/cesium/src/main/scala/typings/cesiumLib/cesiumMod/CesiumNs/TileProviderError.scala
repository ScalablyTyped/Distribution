package typings
package cesiumLib.cesiumMod.CesiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TileProviderError extends js.Object {
  var error: stdLib.Error
  var level: scala.Double
  var message: java.lang.String
  var provider: ImageryProvider | TerrainProvider
  var retry: scala.Boolean
  var timesRetried: scala.Double
  var x: scala.Double
  var y: scala.Double
}

object TileProviderError {
  @scala.inline
  def apply(
    error: stdLib.Error,
    level: scala.Double,
    message: java.lang.String,
    provider: ImageryProvider | TerrainProvider,
    retry: scala.Boolean,
    timesRetried: scala.Double,
    x: scala.Double,
    y: scala.Double
  ): TileProviderError = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("error")(error)
    __obj.updateDynamic("level")(level)
    __obj.updateDynamic("message")(message)
    __obj.updateDynamic("provider")(provider.asInstanceOf[js.Any])
    __obj.updateDynamic("retry")(retry)
    __obj.updateDynamic("timesRetried")(timesRetried)
    __obj.updateDynamic("x")(x)
    __obj.updateDynamic("y")(y)
    __obj.asInstanceOf[TileProviderError]
  }
}

