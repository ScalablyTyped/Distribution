package typings
package cordovaDashPluginDashCanvascameraLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Renderer")
@js.native
class Renderer protected () extends js.Object {
  var available: scala.Boolean = js.native
  var buffer: js.Array[_] = js.native
  var context: stdLib.CanvasRenderingContext2D = js.native
  var element: stdLib.HTMLCanvasElement = js.native
  var fullscreen: scala.Boolean = js.native
  var image: stdLib.HTMLImageElement = js.native
  var orientation: cordovaDashPluginDashCanvascameraLib.cordovaDashPluginDashCanvascameraLibStrings.portrait | cordovaDashPluginDashCanvascameraLib.cordovaDashPluginDashCanvascameraLibStrings.landscape = js.native
  var parent: CanvasCamera = js.native
  var size: Anon_Height = js.native
  var `type`: cordovaDashPluginDashCanvascameraLib.cordovaDashPluginDashCanvascameraLibStrings.file | cordovaDashPluginDashCanvascameraLib.cordovaDashPluginDashCanvascameraLibStrings.data = js.native
  @JSName("bufferize")
  def bufferize_data(
    data: js.Any,
    `type`: cordovaDashPluginDashCanvascameraLib.cordovaDashPluginDashCanvascameraLibStrings.data
  ): Renderer = js.native
  @JSName("bufferize")
  def bufferize_file(
    data: js.Any,
    `type`: cordovaDashPluginDashCanvascameraLib.cordovaDashPluginDashCanvascameraLibStrings.file
  ): Renderer = js.native
  def clear(): Renderer = js.native
  def disable(): Renderer = js.native
  def disabled(): scala.Boolean = js.native
  def draw(frame: Frame): Renderer = js.native
  def enable(): Renderer = js.native
  def enabled(): scala.Boolean = js.native
  def initialize(): Renderer = js.native
  def invert(): Renderer = js.native
  def onAfterDraw(): scala.Unit = js.native
  def onAfterDraw(frame: Frame): scala.Unit = js.native
  def onBeforeDraw(): scala.Unit = js.native
  def onBeforeDraw(frame: Frame): scala.Unit = js.native
  def onOrientationChange(): scala.Unit = js.native
  @JSName("render")
  def render_data(
    data: js.Any,
    `type`: cordovaDashPluginDashCanvascameraLib.cordovaDashPluginDashCanvascameraLibStrings.data
  ): Renderer = js.native
  @JSName("render")
  def render_file(
    data: js.Any,
    `type`: cordovaDashPluginDashCanvascameraLib.cordovaDashPluginDashCanvascameraLibStrings.file
  ): Renderer = js.native
  def resize(): Renderer = js.native
  def run(): Renderer = js.native
  def setOnAfterDraw(onAfterDraw: js.Function1[/* frame */ js.UndefOr[Frame], scala.Unit]): Renderer = js.native
  def setOnBeforeDraw(onBeforeDraw: js.Function1[/* frame */ js.UndefOr[Frame], scala.Unit]): Renderer = js.native
  def setSize(size: Anon_Height): Renderer = js.native
  def setSize(size: Anon_Height, auto: scala.Boolean): Renderer = js.native
}

