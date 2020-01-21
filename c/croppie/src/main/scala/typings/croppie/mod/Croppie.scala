package typings.croppie.mod

import typings.croppie.AnonBase64
import typings.croppie.AnonBlob
import typings.croppie.AnonHtml
import typings.croppie.AnonOrientation
import typings.croppie.AnonRawcanvas
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
  def bind(options: AnonOrientation): js.Promise[Unit] = js.native
  def destroy(): Unit = js.native
  def get(): CropData = js.native
  def result(): js.Promise[HTMLCanvasElement] = js.native
  def result(
    options: (ResultOptions with AnonBase64 with AnonHtml with AnonBlob with AnonRawcanvas) | ResultOptions
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

