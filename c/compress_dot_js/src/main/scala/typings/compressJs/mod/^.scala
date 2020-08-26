package typings.compressJs.mod

import typings.std.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("compress.js", JSImport.Namespace)
@js.native
class ^ () extends Compress

@JSImport("compress.js", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def convertBase64ToFile(base64: String): File = js.native
  def convertBase64ToFile(base64: String, mime: String): File = js.native
}

