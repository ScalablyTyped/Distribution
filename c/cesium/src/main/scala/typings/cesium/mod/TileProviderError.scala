package typings.cesium.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "TileProviderError")
@js.native
class TileProviderError protected () extends js.Object {
  def this(provider: ImageryProvider, message: String) = this()
  def this(provider: TerrainProvider, message: String) = this()
  def this(provider: ImageryProvider, message: String, x: Double) = this()
  def this(provider: TerrainProvider, message: String, x: Double) = this()
  def this(provider: ImageryProvider, message: String, x: Double, y: Double) = this()
  def this(provider: TerrainProvider, message: String, x: Double, y: Double) = this()
  def this(provider: ImageryProvider, message: String, x: Double, y: Double, level: Double) = this()
  def this(provider: TerrainProvider, message: String, x: Double, y: Double, level: Double) = this()
  def this(
    provider: ImageryProvider,
    message: String,
    x: Double,
    y: Double,
    level: Double,
    timesRetried: Double
  ) = this()
  def this(
    provider: TerrainProvider,
    message: String,
    x: Double,
    y: Double,
    level: Double,
    timesRetried: Double
  ) = this()
  def this(
    provider: ImageryProvider,
    message: String,
    x: Double,
    y: Double,
    level: Double,
    timesRetried: Double,
    error: Error
  ) = this()
  def this(
    provider: TerrainProvider,
    message: String,
    x: Double,
    y: Double,
    level: Double,
    timesRetried: Double,
    error: Error
  ) = this()
  var error: Error = js.native
  var level: Double = js.native
  var message: String = js.native
  var provider: ImageryProvider | TerrainProvider = js.native
  var retry: Boolean = js.native
  var timesRetried: Double = js.native
  var x: Double = js.native
  var y: Double = js.native
}

/* static members */
@JSImport("cesium", "TileProviderError")
@js.native
object TileProviderError extends js.Object {
  def handleError(
    previousError: TileProviderError,
    provider: ImageryProvider,
    event: Event[js.Array[TileProviderError]],
    message: String,
    x: Double,
    y: Double,
    level: Double,
    retryFunction: RetryFunction
  ): TileProviderError = js.native
  def handleError(
    previousError: TileProviderError,
    provider: ImageryProvider,
    event: Event[js.Array[TileProviderError]],
    message: String,
    x: Double,
    y: Double,
    level: Double,
    retryFunction: RetryFunction,
    errorDetails: Error
  ): TileProviderError = js.native
  def handleError(
    previousError: TileProviderError,
    provider: TerrainProvider,
    event: Event[js.Array[TileProviderError]],
    message: String,
    x: Double,
    y: Double,
    level: Double,
    retryFunction: RetryFunction
  ): TileProviderError = js.native
  def handleError(
    previousError: TileProviderError,
    provider: TerrainProvider,
    event: Event[js.Array[TileProviderError]],
    message: String,
    x: Double,
    y: Double,
    level: Double,
    retryFunction: RetryFunction,
    errorDetails: Error
  ): TileProviderError = js.native
  def handleSuccess(previousError: TileProviderError): Unit = js.native
  type RetryFunction = js.Function0[Unit]
}

