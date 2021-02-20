package typings.cesium.mod

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "TileProviderError")
@js.native
class TileProviderError protected () extends StObject {
  def this(
    provider: ImageryProvider | TerrainProvider,
    message: String,
    x: js.UndefOr[Double],
    y: js.UndefOr[Double],
    level: js.UndefOr[Double],
    timesRetried: js.UndefOr[Double],
    error: js.UndefOr[Error]
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
object TileProviderError {
  
  /* static member */
  @JSImport("cesium", "TileProviderError.handleError")
  @js.native
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
  @JSImport("cesium", "TileProviderError.handleError")
  @js.native
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
  @JSImport("cesium", "TileProviderError.handleError")
  @js.native
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
  @JSImport("cesium", "TileProviderError.handleError")
  @js.native
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
  
  /* static member */
  @JSImport("cesium", "TileProviderError.handleSuccess")
  @js.native
  def handleSuccess(previousError: TileProviderError): Unit = js.native
  
  type RetryFunction = js.Function0[Unit]
}
