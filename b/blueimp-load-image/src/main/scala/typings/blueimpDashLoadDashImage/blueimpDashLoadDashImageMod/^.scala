package typings.blueimpDashLoadDashImage.blueimpDashLoadDashImageMod

import typings.blueimpDashLoadDashImage.blueimpDashLoadDashImageNumbers.`false`
import typings.std.Blob
import typings.std.File
import typings.std.FileReader
import typings.std.HTMLImageElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("blueimp-load-image", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def default(file: String, callback: LoadImageCallback, options: LoadImageOptions): HTMLImageElement | FileReader | `false` = js.native
  def default(file: Blob, callback: LoadImageCallback, options: LoadImageOptions): HTMLImageElement | FileReader | `false` = js.native
  def default(file: File, callback: LoadImageCallback, options: LoadImageOptions): HTMLImageElement | FileReader | `false` = js.native
}

