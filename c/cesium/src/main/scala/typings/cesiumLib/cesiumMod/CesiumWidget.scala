package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "CesiumWidget")
@js.native
class CesiumWidget protected () extends js.Object {
  def this(container: java.lang.String) = this()
  def this(container: stdLib.Element) = this()
  def this(container: java.lang.String, options: cesiumLib.Anon_ClockContextOptions) = this()
  def this(container: stdLib.Element, options: cesiumLib.Anon_ClockContextOptions) = this()
  val camera: Camera = js.native
  var canvas: stdLib.HTMLCanvasElement = js.native
  var clock: Clock = js.native
  var container: stdLib.Element = js.native
  var creditContainer: stdLib.Element = js.native
  var creditViewport: stdLib.Element = js.native
  val imageryLayers: ImageryLayerCollection = js.native
  var resolutionScale: scala.Double = js.native
  var scene: Scene = js.native
  var screenSpaceEventHandler: ScreenSpaceEventHandler = js.native
  var targetFrameRate: scala.Double = js.native
  var terrainProvider: TerrainProvider = js.native
  var useDefaultRenderLoop: scala.Boolean = js.native
  def destroy(): scala.Unit = js.native
  def isDestroyed(): scala.Boolean = js.native
  def render(): scala.Unit = js.native
  def resize(): scala.Unit = js.native
  def showErrorPanel(title: java.lang.String, message: java.lang.String): scala.Unit = js.native
  def showErrorPanel(title: java.lang.String, message: java.lang.String, error: java.lang.String): scala.Unit = js.native
}

