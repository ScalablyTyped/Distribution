package typings.cesium.cesiumMod

import typings.cesium.Anon_ClockContextOptions
import typings.std.Element
import typings.std.HTMLCanvasElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "CesiumWidget")
@js.native
class CesiumWidget protected () extends js.Object {
  def this(container: String) = this()
  def this(container: Element) = this()
  def this(container: String, options: Anon_ClockContextOptions) = this()
  def this(container: Element, options: Anon_ClockContextOptions) = this()
  val camera: Camera = js.native
  var canvas: HTMLCanvasElement = js.native
  var clock: Clock = js.native
  var container: Element = js.native
  var creditContainer: Element = js.native
  var creditViewport: Element = js.native
  val imageryLayers: ImageryLayerCollection = js.native
  var resolutionScale: Double = js.native
  var scene: Scene = js.native
  var screenSpaceEventHandler: ScreenSpaceEventHandler = js.native
  var targetFrameRate: Double = js.native
  var terrainProvider: TerrainProvider = js.native
  var useBrowserRecommendedResolution: Boolean = js.native
  var useDefaultRenderLoop: Boolean = js.native
  def destroy(): Unit = js.native
  def isDestroyed(): Boolean = js.native
  def render(): Unit = js.native
  def resize(): Unit = js.native
  def showErrorPanel(title: String, message: String): Unit = js.native
  def showErrorPanel(title: String, message: String, error: String): Unit = js.native
}

