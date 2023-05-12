package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "TileProviderError")
@js.native
open class TileProviderError protected () extends StObject {
  def this(
    provider: ImageryProvider | TerrainProvider,
    message: String,
    x: js.UndefOr[Double],
    y: js.UndefOr[Double],
    level: js.UndefOr[Double],
    timesRetried: js.UndefOr[Double],
    error: js.UndefOr[js.Error]
  ) = this()
  
  /**
    * The error or exception that occurred, if any.
    */
  var error: js.Error = js.native
  
  /**
    * The level-of-detail of the tile that experienced the error.  If the error is not specific
    * to a particular tile, this property will be undefined.
    */
  var level: Double = js.native
  
  /**
    * The message describing the error.
    */
  var message: String = js.native
  
  /**
    * The {@link ImageryProvider} or {@link TerrainProvider} that experienced the error.
    */
  var provider: ImageryProvider | TerrainProvider = js.native
  
  /**
    * True if the failed operation should be retried; otherwise, false.  The imagery or terrain provider
    * will set the initial value of this property before raising the event, but any listeners
    * can change it.  The value after the last listener is invoked will be acted upon.
    */
  var retry: Boolean = js.native
  
  /**
    * The number of times this operation has been retried.
    */
  var timesRetried: Double = js.native
  
  /**
    * The X coordinate of the tile that experienced the error.  If the error is not specific
    * to a particular tile, this property will be undefined.
    */
  var x: Double = js.native
  
  /**
    * The Y coordinate of the tile that experienced the error.  If the error is not specific
    * to a particular tile, this property will be undefined.
    */
  var y: Double = js.native
}
/* static members */
object TileProviderError {
  
  @JSImport("cesium", "TileProviderError")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Reports an error in an {@link ImageryProvider} or {@link TerrainProvider} by raising an event if it has any listeners, or by
    * logging the error to the console if the event has no listeners.  This method also tracks the number
    * of times the operation has been retried.
    * @param previousError - The error instance returned by this function the last
    *        time it was called for this error, or undefined if this is the first time this error has
    *        occurred.
    * @param [provider] - The imagery or terrain provider that encountered the error.
    * @param [event] - The event to raise to inform listeners of the error.
    * @param [message] - The message describing the error.
    * @param [x] - The X coordinate of the tile that experienced the error, or undefined if the
    *        error is not specific to a particular tile.
    * @param [y] - The Y coordinate of the tile that experienced the error, or undefined if the
    *        error is not specific to a particular tile.
    * @param [level] - The level-of-detail of the tile that experienced the error, or undefined if the
    *        error is not specific to a particular tile.
    * @param [errorDetails] - The error or exception that occurred, if any.
    * @returns The error instance that was passed to the event listeners and that
    *          should be passed to this function the next time it is called for the same error in order
    *          to track retry counts.
    */
  inline def reportError(
    previousError: TileProviderError,
    provider: js.UndefOr[ImageryProvider | TerrainProvider],
    event: js.UndefOr[Event[js.Function1[/* repeated */ Any, Unit]]],
    message: js.UndefOr[String],
    x: js.UndefOr[Double],
    y: js.UndefOr[Double],
    level: js.UndefOr[Double],
    errorDetails: js.UndefOr[js.Error]
  ): TileProviderError = (^.asInstanceOf[js.Dynamic].applyDynamic("reportError")(previousError.asInstanceOf[js.Any], provider.asInstanceOf[js.Any], event.asInstanceOf[js.Any], message.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], level.asInstanceOf[js.Any], errorDetails.asInstanceOf[js.Any])).asInstanceOf[TileProviderError]
  
  /**
    * Reports success of an operation by resetting the retry count of a previous error, if any.  This way,
    * if the error occurs again in the future, the listeners will be informed that it has not yet been retried.
    * @param previousError - The previous error, or undefined if this operation has
    *        not previously resulted in an error.
    */
  inline def reportSuccess(previousError: TileProviderError): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("reportSuccess")(previousError.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * A function that will be called to retry the operation.
    */
  type RetryFunction = js.Function0[Unit]
}
