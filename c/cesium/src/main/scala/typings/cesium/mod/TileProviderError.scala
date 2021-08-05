package typings.cesium.mod

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
  
  @JSImport("cesium", "TileProviderError")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def handleError(
    previousError: TileProviderError,
    provider: ImageryProvider,
    event: Event[js.Array[TileProviderError]],
    message: String,
    x: Double,
    y: Double,
    level: Double,
    retryFunction: RetryFunction
  ): TileProviderError = (^.asInstanceOf[js.Dynamic].applyDynamic("handleError")(previousError.asInstanceOf[js.Any], provider.asInstanceOf[js.Any], event.asInstanceOf[js.Any], message.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], level.asInstanceOf[js.Any], retryFunction.asInstanceOf[js.Any])).asInstanceOf[TileProviderError]
  inline def handleError(
    previousError: TileProviderError,
    provider: ImageryProvider,
    event: Event[js.Array[TileProviderError]],
    message: String,
    x: Double,
    y: Double,
    level: Double,
    retryFunction: RetryFunction,
    errorDetails: Error
  ): TileProviderError = (^.asInstanceOf[js.Dynamic].applyDynamic("handleError")(previousError.asInstanceOf[js.Any], provider.asInstanceOf[js.Any], event.asInstanceOf[js.Any], message.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], level.asInstanceOf[js.Any], retryFunction.asInstanceOf[js.Any], errorDetails.asInstanceOf[js.Any])).asInstanceOf[TileProviderError]
  inline def handleError(
    previousError: TileProviderError,
    provider: TerrainProvider,
    event: Event[js.Array[TileProviderError]],
    message: String,
    x: Double,
    y: Double,
    level: Double,
    retryFunction: RetryFunction
  ): TileProviderError = (^.asInstanceOf[js.Dynamic].applyDynamic("handleError")(previousError.asInstanceOf[js.Any], provider.asInstanceOf[js.Any], event.asInstanceOf[js.Any], message.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], level.asInstanceOf[js.Any], retryFunction.asInstanceOf[js.Any])).asInstanceOf[TileProviderError]
  inline def handleError(
    previousError: TileProviderError,
    provider: TerrainProvider,
    event: Event[js.Array[TileProviderError]],
    message: String,
    x: Double,
    y: Double,
    level: Double,
    retryFunction: RetryFunction,
    errorDetails: Error
  ): TileProviderError = (^.asInstanceOf[js.Dynamic].applyDynamic("handleError")(previousError.asInstanceOf[js.Any], provider.asInstanceOf[js.Any], event.asInstanceOf[js.Any], message.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], level.asInstanceOf[js.Any], retryFunction.asInstanceOf[js.Any], errorDetails.asInstanceOf[js.Any])).asInstanceOf[TileProviderError]
  
  /* static member */
  inline def handleSuccess(previousError: TileProviderError): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("handleSuccess")(previousError.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  type RetryFunction = js.Function0[Unit]
}
