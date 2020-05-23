package typings.browserImageCompression.mod

import typings.std.Blob
import typings.std.File
import typings.std.HTMLCanvasElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("browser-image-compression", "canvasToFile")
@js.native
object canvasToFile extends js.Object {
  def apply(canvas: HTMLCanvasElement, fileType: String, fileName: String, fileLastModified: Double): js.Promise[File | Blob] = js.native
  def apply(
    canvas: HTMLCanvasElement,
    fileType: String,
    fileName: String,
    fileLastModified: Double,
    quality: Double
  ): js.Promise[File | Blob] = js.native
}

