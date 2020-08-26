package typings.cordovaPluginCanvascamera

import typings.cordovaPluginCanvascamera.anon.Width
import typings.cordovaPluginCanvascamera.cordovaPluginCanvascameraStrings.back
import typings.cordovaPluginCanvascamera.cordovaPluginCanvascameraStrings.front
import typings.cordovaPluginCanvascamera.cordovaPluginCanvascameraStrings.landscape
import typings.cordovaPluginCanvascamera.cordovaPluginCanvascameraStrings.portrait
import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CanvasCamera extends js.Object {
  @JSName("cameraPosition")
  def cameraPosition_back(cameraFacing: back): Unit = js.native
  @JSName("cameraPosition")
  def cameraPosition_back(
    cameraFacing: back,
    onError: js.UndefOr[scala.Nothing],
    onSuccess: js.Function1[/* data */ js.Any, Unit]
  ): Unit = js.native
  @JSName("cameraPosition")
  def cameraPosition_back(cameraFacing: back, onError: js.Function1[/* error */ js.UndefOr[js.Any], Unit]): Unit = js.native
  @JSName("cameraPosition")
  def cameraPosition_back(
    cameraFacing: back,
    onError: js.Function1[/* error */ js.UndefOr[js.Any], Unit],
    onSuccess: js.Function1[/* data */ js.Any, Unit]
  ): Unit = js.native
  @JSName("cameraPosition")
  def cameraPosition_front(cameraFacing: front): Unit = js.native
  @JSName("cameraPosition")
  def cameraPosition_front(
    cameraFacing: front,
    onError: js.UndefOr[scala.Nothing],
    onSuccess: js.Function1[/* data */ js.Any, Unit]
  ): Unit = js.native
  @JSName("cameraPosition")
  def cameraPosition_front(cameraFacing: front, onError: js.Function1[/* error */ js.UndefOr[js.Any], Unit]): Unit = js.native
  @JSName("cameraPosition")
  def cameraPosition_front(
    cameraFacing: front,
    onError: js.Function1[/* error */ js.UndefOr[js.Any], Unit],
    onSuccess: js.Function1[/* data */ js.Any, Unit]
  ): Unit = js.native
  def capture(data: js.Any): Unit = js.native
  def createFrame(image: HTMLImageElement, element: HTMLCanvasElement): Frame = js.native
  def createRenderer(element: HTMLCanvasElement, parent: CanvasCamera): Renderer = js.native
  def disableRenderers(): Unit = js.native
  def enableRenderers(): Unit = js.native
  def flashMode(flashMode: Boolean): Unit = js.native
  def flashMode(
    flashMode: Boolean,
    onError: js.UndefOr[scala.Nothing],
    onSuccess: js.Function1[/* data */ js.Any, Unit]
  ): Unit = js.native
  def flashMode(flashMode: Boolean, onError: js.Function1[/* error */ js.UndefOr[js.Any], Unit]): Unit = js.native
  def flashMode(
    flashMode: Boolean,
    onError: js.Function1[/* error */ js.UndefOr[js.Any], Unit],
    onSuccess: js.Function1[/* data */ js.Any, Unit]
  ): Unit = js.native
  def getUIOrientation(): portrait | landscape = js.native
  def getUISize(): Width = js.native
  def initialize(fcanvas: HTMLCanvasElement, tcanvas: HTMLCanvasElement): Unit = js.native
  def setRenderersSize(size: Width): CanvasCamera = js.native
  def setRenderingPresets(): CanvasCamera = js.native
  def start(options: CanvasCameraOptions): Unit = js.native
  def start(
    options: CanvasCameraOptions,
    onError: js.UndefOr[scala.Nothing],
    onSuccess: js.Function1[/* data */ js.Any, Unit]
  ): Unit = js.native
  def start(options: CanvasCameraOptions, onError: js.Function1[/* error */ js.UndefOr[js.Any], Unit]): Unit = js.native
  def start(
    options: CanvasCameraOptions,
    onError: js.Function1[/* error */ js.UndefOr[js.Any], Unit],
    onSuccess: js.Function1[/* data */ js.Any, Unit]
  ): Unit = js.native
  def stop(): Unit = js.native
  def stop(onError: js.UndefOr[scala.Nothing], onSuccess: js.Function1[/* data */ js.Any, Unit]): Unit = js.native
  def stop(onError: js.Function1[/* error */ js.UndefOr[js.Any], Unit]): Unit = js.native
  def stop(
    onError: js.Function1[/* error */ js.UndefOr[js.Any], Unit],
    onSuccess: js.Function1[/* data */ js.Any, Unit]
  ): Unit = js.native
}

