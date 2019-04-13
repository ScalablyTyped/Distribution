package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "TileProviderError")
@js.native
class TileProviderError protected () extends js.Object {
  def this(provider: ImageryProvider, message: java.lang.String) = this()
  def this(provider: TerrainProvider, message: java.lang.String) = this()
  def this(provider: ImageryProvider, message: java.lang.String, x: scala.Double) = this()
  def this(provider: TerrainProvider, message: java.lang.String, x: scala.Double) = this()
  def this(provider: ImageryProvider, message: java.lang.String, x: scala.Double, y: scala.Double) = this()
  def this(provider: TerrainProvider, message: java.lang.String, x: scala.Double, y: scala.Double) = this()
  def this(provider: ImageryProvider, message: java.lang.String, x: scala.Double, y: scala.Double, level: scala.Double) = this()
  def this(provider: TerrainProvider, message: java.lang.String, x: scala.Double, y: scala.Double, level: scala.Double) = this()
  def this(provider: ImageryProvider, message: java.lang.String, x: scala.Double, y: scala.Double, level: scala.Double, timesRetried: scala.Double) = this()
  def this(provider: TerrainProvider, message: java.lang.String, x: scala.Double, y: scala.Double, level: scala.Double, timesRetried: scala.Double) = this()
  def this(provider: ImageryProvider, message: java.lang.String, x: scala.Double, y: scala.Double, level: scala.Double, timesRetried: scala.Double, error: stdLib.Error) = this()
  def this(provider: TerrainProvider, message: java.lang.String, x: scala.Double, y: scala.Double, level: scala.Double, timesRetried: scala.Double, error: stdLib.Error) = this()
  var error: stdLib.Error = js.native
  var level: scala.Double = js.native
  var message: java.lang.String = js.native
  var provider: ImageryProvider | TerrainProvider = js.native
  var retry: scala.Boolean = js.native
  var timesRetried: scala.Double = js.native
  var x: scala.Double = js.native
  var y: scala.Double = js.native
}

/* static members */
@JSImport("cesium", "TileProviderError")
@js.native
object TileProviderError extends js.Object {
  def handleError(
    previousError: cesiumLib.cesiumMod.TileProviderError,
    provider: cesiumLib.cesiumMod.ImageryProvider,
    event: cesiumLib.cesiumMod.Event[js.Array[cesiumLib.cesiumMod.TileProviderError]],
    message: java.lang.String,
    x: scala.Double,
    y: scala.Double,
    level: scala.Double,
    retryFunction: cesiumLib.cesiumMod.TileProviderErrorNs.RetryFunction
  ): cesiumLib.cesiumMod.TileProviderError = js.native
  def handleError(
    previousError: cesiumLib.cesiumMod.TileProviderError,
    provider: cesiumLib.cesiumMod.ImageryProvider,
    event: cesiumLib.cesiumMod.Event[js.Array[cesiumLib.cesiumMod.TileProviderError]],
    message: java.lang.String,
    x: scala.Double,
    y: scala.Double,
    level: scala.Double,
    retryFunction: cesiumLib.cesiumMod.TileProviderErrorNs.RetryFunction,
    errorDetails: stdLib.Error
  ): cesiumLib.cesiumMod.TileProviderError = js.native
  def handleError(
    previousError: cesiumLib.cesiumMod.TileProviderError,
    provider: cesiumLib.cesiumMod.TerrainProvider,
    event: cesiumLib.cesiumMod.Event[js.Array[cesiumLib.cesiumMod.TileProviderError]],
    message: java.lang.String,
    x: scala.Double,
    y: scala.Double,
    level: scala.Double,
    retryFunction: cesiumLib.cesiumMod.TileProviderErrorNs.RetryFunction
  ): cesiumLib.cesiumMod.TileProviderError = js.native
  def handleError(
    previousError: cesiumLib.cesiumMod.TileProviderError,
    provider: cesiumLib.cesiumMod.TerrainProvider,
    event: cesiumLib.cesiumMod.Event[js.Array[cesiumLib.cesiumMod.TileProviderError]],
    message: java.lang.String,
    x: scala.Double,
    y: scala.Double,
    level: scala.Double,
    retryFunction: cesiumLib.cesiumMod.TileProviderErrorNs.RetryFunction,
    errorDetails: stdLib.Error
  ): cesiumLib.cesiumMod.TileProviderError = js.native
  def handleSuccess(previousError: cesiumLib.cesiumMod.TileProviderError): scala.Unit = js.native
}

