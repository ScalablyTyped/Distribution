package typings
package cordovaDashPluginDashCanvascameraLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CanvasCamera")
@js.native
class CanvasCamera () extends js.Object {
  @JSName("cameraPosition")
  def cameraPosition_back(
    cameraFacing: cordovaDashPluginDashCanvascameraLib.cordovaDashPluginDashCanvascameraLibStrings.back
  ): scala.Unit = js.native
  @JSName("cameraPosition")
  def cameraPosition_back(
    cameraFacing: cordovaDashPluginDashCanvascameraLib.cordovaDashPluginDashCanvascameraLibStrings.back,
    onError: js.Function1[/* error */ js.UndefOr[js.Any], scala.Unit]
  ): scala.Unit = js.native
  @JSName("cameraPosition")
  def cameraPosition_back(
    cameraFacing: cordovaDashPluginDashCanvascameraLib.cordovaDashPluginDashCanvascameraLibStrings.back,
    onError: js.Function1[/* error */ js.UndefOr[js.Any], scala.Unit],
    onSuccess: js.Function1[/* data */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  @JSName("cameraPosition")
  def cameraPosition_front(
    cameraFacing: cordovaDashPluginDashCanvascameraLib.cordovaDashPluginDashCanvascameraLibStrings.front
  ): scala.Unit = js.native
  @JSName("cameraPosition")
  def cameraPosition_front(
    cameraFacing: cordovaDashPluginDashCanvascameraLib.cordovaDashPluginDashCanvascameraLibStrings.front,
    onError: js.Function1[/* error */ js.UndefOr[js.Any], scala.Unit]
  ): scala.Unit = js.native
  @JSName("cameraPosition")
  def cameraPosition_front(
    cameraFacing: cordovaDashPluginDashCanvascameraLib.cordovaDashPluginDashCanvascameraLibStrings.front,
    onError: js.Function1[/* error */ js.UndefOr[js.Any], scala.Unit],
    onSuccess: js.Function1[/* data */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def capture(data: js.Any): scala.Unit = js.native
  def createFrame(image: stdLib.HTMLImageElement, element: stdLib.HTMLCanvasElement): Frame = js.native
  def createRenderer(element: stdLib.HTMLCanvasElement, parent: CanvasCamera): Renderer = js.native
  def disableRenderers(): scala.Unit = js.native
  def enableRenderers(): scala.Unit = js.native
  def flashMode(flashMode: scala.Boolean): scala.Unit = js.native
  def flashMode(flashMode: scala.Boolean, onError: js.Function1[/* error */ js.UndefOr[js.Any], scala.Unit]): scala.Unit = js.native
  def flashMode(
    flashMode: scala.Boolean,
    onError: js.Function1[/* error */ js.UndefOr[js.Any], scala.Unit],
    onSuccess: js.Function1[/* data */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def getUIOrientation(): cordovaDashPluginDashCanvascameraLib.cordovaDashPluginDashCanvascameraLibStrings.portrait | cordovaDashPluginDashCanvascameraLib.cordovaDashPluginDashCanvascameraLibStrings.landscape = js.native
  def getUISize(): Anon_Height = js.native
  def initialize(fcanvas: stdLib.HTMLCanvasElement, tcanvas: stdLib.HTMLCanvasElement): scala.Unit = js.native
  def setRenderersSize(size: Anon_Height): CanvasCamera = js.native
  def setRenderingPresets(): CanvasCamera = js.native
  def start(options: CanvasCameraOptions): scala.Unit = js.native
  def start(options: CanvasCameraOptions, onError: js.Function1[/* error */ js.UndefOr[js.Any], scala.Unit]): scala.Unit = js.native
  def start(
    options: CanvasCameraOptions,
    onError: js.Function1[/* error */ js.UndefOr[js.Any], scala.Unit],
    onSuccess: js.Function1[/* data */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def stop(): scala.Unit = js.native
  def stop(onError: js.Function1[/* error */ js.UndefOr[js.Any], scala.Unit]): scala.Unit = js.native
  def stop(
    onError: js.Function1[/* error */ js.UndefOr[js.Any], scala.Unit],
    onSuccess: js.Function1[/* data */ js.Any, scala.Unit]
  ): scala.Unit = js.native
}

