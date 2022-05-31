package typings.cesium.global.Cesium

import typings.cesium.mod.TileProviderError.RetryFunction
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Cesium.TileProviderError")
@js.native
class TileProviderError protected ()
  extends typings.cesium.mod.TileProviderError {
  def this(
    provider: typings.cesium.mod.ImageryProvider | typings.cesium.mod.TerrainProvider,
    message: String,
    x: js.UndefOr[Double],
    y: js.UndefOr[Double],
    level: js.UndefOr[Double],
    timesRetried: js.UndefOr[Double],
    error: js.UndefOr[Error]
  ) = this()
}
object TileProviderError {
  
  @JSGlobal("Cesium.TileProviderError")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def handleError(
    previousError: typings.cesium.mod.TileProviderError,
    provider: typings.cesium.mod.ImageryProvider,
    event: typings.cesium.mod.Event[js.Array[typings.cesium.mod.TileProviderError]],
    message: String,
    x: Double,
    y: Double,
    level: Double,
    retryFunction: RetryFunction
  ): typings.cesium.mod.TileProviderError = (^.asInstanceOf[js.Dynamic].applyDynamic("handleError")(previousError.asInstanceOf[js.Any], provider.asInstanceOf[js.Any], event.asInstanceOf[js.Any], message.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], level.asInstanceOf[js.Any], retryFunction.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.TileProviderError]
  inline def handleError(
    previousError: typings.cesium.mod.TileProviderError,
    provider: typings.cesium.mod.ImageryProvider,
    event: typings.cesium.mod.Event[js.Array[typings.cesium.mod.TileProviderError]],
    message: String,
    x: Double,
    y: Double,
    level: Double,
    retryFunction: RetryFunction,
    errorDetails: Error
  ): typings.cesium.mod.TileProviderError = (^.asInstanceOf[js.Dynamic].applyDynamic("handleError")(previousError.asInstanceOf[js.Any], provider.asInstanceOf[js.Any], event.asInstanceOf[js.Any], message.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], level.asInstanceOf[js.Any], retryFunction.asInstanceOf[js.Any], errorDetails.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.TileProviderError]
  inline def handleError(
    previousError: typings.cesium.mod.TileProviderError,
    provider: typings.cesium.mod.TerrainProvider,
    event: typings.cesium.mod.Event[js.Array[typings.cesium.mod.TileProviderError]],
    message: String,
    x: Double,
    y: Double,
    level: Double,
    retryFunction: RetryFunction
  ): typings.cesium.mod.TileProviderError = (^.asInstanceOf[js.Dynamic].applyDynamic("handleError")(previousError.asInstanceOf[js.Any], provider.asInstanceOf[js.Any], event.asInstanceOf[js.Any], message.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], level.asInstanceOf[js.Any], retryFunction.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.TileProviderError]
  inline def handleError(
    previousError: typings.cesium.mod.TileProviderError,
    provider: typings.cesium.mod.TerrainProvider,
    event: typings.cesium.mod.Event[js.Array[typings.cesium.mod.TileProviderError]],
    message: String,
    x: Double,
    y: Double,
    level: Double,
    retryFunction: RetryFunction,
    errorDetails: Error
  ): typings.cesium.mod.TileProviderError = (^.asInstanceOf[js.Dynamic].applyDynamic("handleError")(previousError.asInstanceOf[js.Any], provider.asInstanceOf[js.Any], event.asInstanceOf[js.Any], message.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], level.asInstanceOf[js.Any], retryFunction.asInstanceOf[js.Any], errorDetails.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.TileProviderError]
  
  /* static member */
  inline def handleSuccess(previousError: typings.cesium.mod.TileProviderError): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("handleSuccess")(previousError.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
