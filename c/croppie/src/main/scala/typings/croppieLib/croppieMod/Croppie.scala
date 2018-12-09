package typings
package croppieLib.croppieMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Croppie extends js.Object {
  def bind(options: croppieLib.Anon_Url): js.Promise[scala.Unit] = js.native
  def destroy(): scala.Unit = js.native
  def get(): croppieLib.croppieMod.CroppieNs.CropData = js.native
  def result(): js.Promise[stdLib.HTMLCanvasElement] = js.native
  def result(
    options: (croppieLib.croppieMod.CroppieNs.ResultOptions with (croppieLib.Anon_Type | croppieLib.Anon_TypeBlob | croppieLib.Anon_TypeHtml | croppieLib.Anon_TypeRawcanvas)) | croppieLib.croppieMod.CroppieNs.ResultOptions
  ): js.Promise[java.lang.String] = js.native
  def rotate(degrees: croppieLib.croppieLibNumbers.`-180`): scala.Unit = js.native
  def rotate(degrees: croppieLib.croppieLibNumbers.`-270`): scala.Unit = js.native
  def rotate(degrees: croppieLib.croppieLibNumbers.`-90`): scala.Unit = js.native
  def rotate(degrees: croppieLib.croppieLibNumbers.`180`): scala.Unit = js.native
  def rotate(degrees: croppieLib.croppieLibNumbers.`270`): scala.Unit = js.native
  def rotate(degrees: croppieLib.croppieLibNumbers.`90`): scala.Unit = js.native
  def setZoom(zoom: scala.Double): scala.Unit = js.native
}

