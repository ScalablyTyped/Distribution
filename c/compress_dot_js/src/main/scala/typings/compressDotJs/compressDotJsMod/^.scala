package typings.compressDotJs.compressDotJsMod

import typings.std.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("compress.js", JSImport.Namespace)
@js.native
class ^ () extends Compress {
  /* CompleteClass */
  override def attach(el: String, options: CompressOptions): js.Promise[js.Array[CompressResult]] = js.native
  /* CompleteClass */
  override def compress(files: js.Array[File], options: CompressOptions): js.Promise[js.Array[CompressResult]] = js.native
}

@JSImport("compress.js", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def convertBase64ToFile(base64: String): File = js.native
  def convertBase64ToFile(base64: String, mime: String): File = js.native
}

