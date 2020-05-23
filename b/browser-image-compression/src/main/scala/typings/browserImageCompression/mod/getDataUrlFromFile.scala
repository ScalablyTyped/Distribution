package typings.browserImageCompression.mod

import typings.std.Blob
import typings.std.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("browser-image-compression", "getDataUrlFromFile")
@js.native
object getDataUrlFromFile extends js.Object {
  def apply(file: Blob): js.Promise[String] = js.native
  def apply(file: File): js.Promise[String] = js.native
}

