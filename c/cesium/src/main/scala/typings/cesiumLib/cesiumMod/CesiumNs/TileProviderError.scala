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
    val __obj = js.Dynamic.literal(error = error, level = level, message = message, provider = provider.asInstanceOf[js.Any], retry = retry, timesRetried = timesRetried, x = x, y = y)
  
    __obj.asInstanceOf[TileProviderError]
  }
}

