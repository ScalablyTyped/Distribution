package typings.browserImageCompression.mod

import typings.std.Blob
import typings.std.File
import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import typings.std.ImageBitmap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("browser-image-compression", "drawFileInCanvas")
@js.native
object drawFileInCanvas extends js.Object {
  
  def apply(file: Blob): js.Promise[js.Tuple2[ImageBitmap | HTMLImageElement, HTMLCanvasElement]] = js.native
  def apply(file: File): js.Promise[js.Tuple2[ImageBitmap | HTMLImageElement, HTMLCanvasElement]] = js.native
}
