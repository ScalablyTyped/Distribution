package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "TileProviderError")
@js.native
class TileProviderError protected ()
  extends cesiumLib.cesiumMod.CesiumNs.TileProviderError {
  def this(provider: cesiumLib.cesiumMod.CesiumNs.ImageryProvider, message: java.lang.String) = this()
  def this(provider: cesiumLib.cesiumMod.CesiumNs.TerrainProvider, message: java.lang.String) = this()
  def this(provider: cesiumLib.cesiumMod.CesiumNs.ImageryProvider, message: java.lang.String, x: scala.Double) = this()
  def this(provider: cesiumLib.cesiumMod.CesiumNs.TerrainProvider, message: java.lang.String, x: scala.Double) = this()
  def this(provider: cesiumLib.cesiumMod.CesiumNs.ImageryProvider, message: java.lang.String, x: scala.Double, y: scala.Double) = this()
  def this(provider: cesiumLib.cesiumMod.CesiumNs.TerrainProvider, message: java.lang.String, x: scala.Double, y: scala.Double) = this()
  def this(provider: cesiumLib.cesiumMod.CesiumNs.ImageryProvider, message: java.lang.String, x: scala.Double, y: scala.Double, level: scala.Double) = this()
  def this(provider: cesiumLib.cesiumMod.CesiumNs.TerrainProvider, message: java.lang.String, x: scala.Double, y: scala.Double, level: scala.Double) = this()
  def this(provider: cesiumLib.cesiumMod.CesiumNs.ImageryProvider, message: java.lang.String, x: scala.Double, y: scala.Double, level: scala.Double, timesRetried: scala.Double) = this()
  def this(provider: cesiumLib.cesiumMod.CesiumNs.TerrainProvider, message: java.lang.String, x: scala.Double, y: scala.Double, level: scala.Double, timesRetried: scala.Double) = this()
  def this(provider: cesiumLib.cesiumMod.CesiumNs.ImageryProvider, message: java.lang.String, x: scala.Double, y: scala.Double, level: scala.Double, timesRetried: scala.Double, error: stdLib.Error) = this()
  def this(provider: cesiumLib.cesiumMod.CesiumNs.TerrainProvider, message: java.lang.String, x: scala.Double, y: scala.Double, level: scala.Double, timesRetried: scala.Double, error: stdLib.Error) = this()
  /* CompleteClass */
  override var error: stdLib.Error = js.native
  /* CompleteClass */
  override var level: scala.Double = js.native
  /* CompleteClass */
  override var message: java.lang.String = js.native
  /* CompleteClass */
  override var provider: cesiumLib.cesiumMod.CesiumNs.ImageryProvider | cesiumLib.cesiumMod.CesiumNs.TerrainProvider = js.native
  /* CompleteClass */
  override var retry: scala.Boolean = js.native
  /* CompleteClass */
  override var timesRetried: scala.Double = js.native
  /* CompleteClass */
  override var x: scala.Double = js.native
  /* CompleteClass */
  override var y: scala.Double = js.native
}

@JSImport("cesium", "TileProviderError")
@js.native
object TileProviderError extends js.Object {
  def handleError(
    previousError: cesiumLib.cesiumMod.CesiumNs.TileProviderError,
    provider: cesiumLib.cesiumMod.CesiumNs.ImageryProvider,
    event: cesiumLib.cesiumMod.CesiumNs.Event,
    message: java.lang.String,
    x: scala.Double,
    y: scala.Double,
    level: scala.Double,
    retryFunction: cesiumLib.cesiumMod.CesiumNs.TileProviderErrorNs.RetryFunction
  ): cesiumLib.cesiumMod.CesiumNs.TileProviderError = js.native
  def handleError(
    previousError: cesiumLib.cesiumMod.CesiumNs.TileProviderError,
    provider: cesiumLib.cesiumMod.CesiumNs.ImageryProvider,
    event: cesiumLib.cesiumMod.CesiumNs.Event,
    message: java.lang.String,
    x: scala.Double,
    y: scala.Double,
    level: scala.Double,
    retryFunction: cesiumLib.cesiumMod.CesiumNs.TileProviderErrorNs.RetryFunction,
    errorDetails: stdLib.Error
  ): cesiumLib.cesiumMod.CesiumNs.TileProviderError = js.native
  def handleError(
    previousError: cesiumLib.cesiumMod.CesiumNs.TileProviderError,
    provider: cesiumLib.cesiumMod.CesiumNs.TerrainProvider,
    event: cesiumLib.cesiumMod.CesiumNs.Event,
    message: java.lang.String,
    x: scala.Double,
    y: scala.Double,
    level: scala.Double,
    retryFunction: cesiumLib.cesiumMod.CesiumNs.TileProviderErrorNs.RetryFunction
  ): cesiumLib.cesiumMod.CesiumNs.TileProviderError = js.native
  def handleError(
    previousError: cesiumLib.cesiumMod.CesiumNs.TileProviderError,
    provider: cesiumLib.cesiumMod.CesiumNs.TerrainProvider,
    event: cesiumLib.cesiumMod.CesiumNs.Event,
    message: java.lang.String,
    x: scala.Double,
    y: scala.Double,
    level: scala.Double,
    retryFunction: cesiumLib.cesiumMod.CesiumNs.TileProviderErrorNs.RetryFunction,
    errorDetails: stdLib.Error
  ): cesiumLib.cesiumMod.CesiumNs.TileProviderError = js.native
  def handleSuccess(previousError: cesiumLib.cesiumMod.CesiumNs.TileProviderError): scala.Unit = js.native
}

