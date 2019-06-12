package typings
package croppieLib.croppieMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Croppie extends js.Object {
  def bind(options: croppieLib.Anon_Orientation): js.Promise[scala.Unit] = js.native
  def destroy(): scala.Unit = js.native
  def get(): CropData = js.native
  def result(): js.Promise[stdLib.HTMLCanvasElement] = js.native
  def result(
    options: (ResultOptions with (croppieLib.Anon_Base64 | croppieLib.Anon_Blob | croppieLib.Anon_Html | croppieLib.Anon_Rawcanvas)) | ResultOptions
  ): js.Promise[java.lang.String] = js.native
  @JSName("rotate")
  def rotate_180(degrees: croppieLib.croppieLibNumbers.`-180`): scala.Unit = js.native
  @JSName("rotate")
  def rotate_180(degrees: croppieLib.croppieLibNumbers.`180`): scala.Unit = js.native
  @JSName("rotate")
  def rotate_270(degrees: croppieLib.croppieLibNumbers.`-270`): scala.Unit = js.native
  @JSName("rotate")
  def rotate_270(degrees: croppieLib.croppieLibNumbers.`270`): scala.Unit = js.native
  @JSName("rotate")
  def rotate_90(degrees: croppieLib.croppieLibNumbers.`-90`): scala.Unit = js.native
  @JSName("rotate")
  def rotate_90(degrees: croppieLib.croppieLibNumbers.`90`): scala.Unit = js.native
  def setZoom(zoom: scala.Double): scala.Unit = js.native
}

