package typings.croppie.croppieMod

import typings.croppie.Anon_Base64
import typings.croppie.Anon_Blob
import typings.croppie.Anon_Html
import typings.croppie.Anon_Orientation
import typings.croppie.Anon_Rawcanvas
import typings.croppie.croppieNumbers.`-180`
import typings.croppie.croppieNumbers.`-270`
import typings.croppie.croppieNumbers.`-90`
import typings.croppie.croppieNumbers.`180`
import typings.croppie.croppieNumbers.`270`
import typings.croppie.croppieNumbers.`90`
import typings.std.HTMLCanvasElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Croppie extends js.Object {
  def bind(options: Anon_Orientation): js.Promise[Unit] = js.native
  def destroy(): Unit = js.native
  def get(): CropData = js.native
  def result(): js.Promise[HTMLCanvasElement] = js.native
  def result(
    options: (ResultOptions with (Anon_Base64 | Anon_Blob | Anon_Html | Anon_Rawcanvas)) | ResultOptions
  ): js.Promise[String] = js.native
  @JSName("rotate")
  def rotate_180(degrees: `-180`): Unit = js.native
  @JSName("rotate")
  def rotate_180(degrees: `180`): Unit = js.native
  @JSName("rotate")
  def rotate_270(degrees: `-270`): Unit = js.native
  @JSName("rotate")
  def rotate_270(degrees: `270`): Unit = js.native
  @JSName("rotate")
  def rotate_90(degrees: `-90`): Unit = js.native
  @JSName("rotate")
  def rotate_90(degrees: `90`): Unit = js.native
  def setZoom(zoom: Double): Unit = js.native
}

